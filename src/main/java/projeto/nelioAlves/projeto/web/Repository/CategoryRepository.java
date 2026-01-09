package projeto.nelioAlves.projeto.web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.nelioAlves.projeto.web.Model.CategoryModel;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryModel,Long> {
}
