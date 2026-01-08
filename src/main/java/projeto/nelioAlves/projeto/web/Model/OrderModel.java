package projeto.nelioAlves.projeto.web.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import projeto.nelioAlves.projeto.web.ModelEnum.OrdemStatusModel;
import tools.jackson.databind.annotation.EnumNaming;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;



    private Instant moment;
   
    private Integer OrderStatus ;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private UserModel client;

}
