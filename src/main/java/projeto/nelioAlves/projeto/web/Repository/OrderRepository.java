package projeto.nelioAlves.projeto.web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.nelioAlves.projeto.web.Model.OrderModel;

@Repository
public interface OrderRepository extends JpaRepository<OrderModel,Long> {
}
