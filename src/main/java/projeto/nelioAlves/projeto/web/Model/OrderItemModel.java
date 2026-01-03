package projeto.nelioAlves.projeto.web.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Integer Quantity;
    private Double Price;


    public Double subTotal() {

        return getQuantity() * getPrice();


    }
}
