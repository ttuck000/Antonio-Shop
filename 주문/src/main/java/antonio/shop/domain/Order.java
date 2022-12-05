package antonio.shop.domain;

import antonio.shop.domain.OrderPlaced;
import antonio.shop.주문Application;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Order_table")
@Data

public class Order  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String productid;
    
    
    
    
    
    private Integer qty;

    @PostPersist
    public void onPostPersist(){


        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();

    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = 주문Application.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }






}
