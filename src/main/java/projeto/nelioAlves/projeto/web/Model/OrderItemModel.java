package projeto.nelioAlves.projeto.web.Model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "tb_order_item")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class OrderItemModel implements Serializable {

    @Serial
    private static final long serialVersionUID= 1L;

    @EmbeddedId
    private OrderItemPKModel id ;

    private Integer quantity;
    private Double price ;
}
