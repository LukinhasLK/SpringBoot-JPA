package projeto.nelioAlves.projeto.web.Model;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
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
}
