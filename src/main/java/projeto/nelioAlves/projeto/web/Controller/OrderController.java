package projeto.nelioAlves.projeto.web.Controller;

import jakarta.persistence.criteria.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projeto.nelioAlves.projeto.web.Model.OrderModel;
import projeto.nelioAlves.projeto.web.Services.OrderServices;


import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

    @Autowired
    private OrderServices services;

    @GetMapping
    public ResponseEntity<List<OrderModel>> findAll(){

        List<OrderModel>order= services.findall();
        return ResponseEntity.ok().body(order);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<OrderModel>findById( @PathVariable long id){
        OrderModel order = services.findById(id);
        return ResponseEntity.ok().body(order);
    }
}
