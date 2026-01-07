package projeto.nelioAlves.projeto.web.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Tb_user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class UserModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L ;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;

    private String name ;
    private String email ;
    private String phone ;
    private String password ;

    @JsonIgnore
    @OneToMany(mappedBy = "client")
    private List<OrderModel> orders = new ArrayList<>();
}
