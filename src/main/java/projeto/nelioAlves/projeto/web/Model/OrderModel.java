package projeto.nelioAlves.projeto.web.Model;

import jakarta.persistence.*;
import lombok.*;
import projeto.nelioAlves.projeto.web.ModelEnum.OrdemStatusModel;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;


@Entity
@Table(name = "Tb_Order")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class OrderModel implements Serializable {

    @Serial
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id ;
    private Date moment;
    private OrdemStatusModel OrdemStatus ;

}
