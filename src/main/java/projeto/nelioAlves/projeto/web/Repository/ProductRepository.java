package projeto.nelioAlves.projeto.web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.nelioAlves.projeto.web.Model.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel,Long> {
}
