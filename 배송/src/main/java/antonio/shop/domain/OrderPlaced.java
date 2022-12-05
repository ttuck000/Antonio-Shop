package antonio.shop.domain;

import antonio.shop.domain.*;
import antonio.shop.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
}


