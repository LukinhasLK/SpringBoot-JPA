package projeto.nelioAlves.projeto.web.Model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Tb_product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class ProductModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String description;
    private Double price;
    private String imgURL;

    @ManyToMany
    @JoinTable(name = "tb_Product_category", joinColumns = @JoinColumn(name = "products_id"), inverseJoinColumns = @JoinColumn(name = "categorys_id"))
    private Set<CategoryModel> categorys = new HashSet<>();

}
