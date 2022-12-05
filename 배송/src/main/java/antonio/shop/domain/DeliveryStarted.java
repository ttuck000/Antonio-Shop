package antonio.shop.domain;

import antonio.shop.domain.*;
import antonio.shop.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;

    public DeliveryStarted(){
        super();
    }
}
