package projeto.nelioAlves.projeto.web.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.nelioAlves.projeto.web.Model.OrderModel;
import projeto.nelioAlves.projeto.web.Repository.OrderRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServices {

    @Autowired
    private OrderRepository repository;

    public List<OrderModel> findall() {

        return repository.findAll();
    }

    public OrderModel findById(long id) {

        Optional<OrderModel> order = repository.findById(id);
        return order.get();
    }
}
