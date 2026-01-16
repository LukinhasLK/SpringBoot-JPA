package projeto.nelioAlves.projeto.web.Model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class OrderItemPKModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "orders_id")
    private OrderModel orderModel ;

    @ManyToOne
    @JoinColumn(name = "products_id")
    private ProductModel productModel;




}
