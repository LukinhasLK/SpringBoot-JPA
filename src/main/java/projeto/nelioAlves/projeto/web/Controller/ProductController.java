package projeto.nelioAlves.projeto.web.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projeto.nelioAlves.projeto.web.Model.ProductModel;
import projeto.nelioAlves.projeto.web.Services.ProductServices;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductServices services ;

    public ResponseEntity<List<ProductModel>> findall(){
        List<ProductModel>product = services.findall();
        return ResponseEntity.ok(product);
    }

    public ResponseEntity<ProductModel>findByid( @PathVariable long id){
        ProductModel product = services.findById(id);

        return ResponseEntity.ok(product);
    }
}
