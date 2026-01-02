package projeto.nelioAlves.projeto.web.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class UserModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L ;

    @Id
    private Long id ;

    private String name ;
    private String email ;
    private String phone ;
    private String password ;
}
