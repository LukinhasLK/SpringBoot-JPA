package projeto.nelioAlves.projeto.web.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.nelioAlves.projeto.web.Model.ProductModel;
import projeto.nelioAlves.projeto.web.Repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServices {

    @Autowired
    private ProductRepository ProductRepository;

    public List<ProductModel> findall(){
        return ProductRepository.findAll();
    }

    public ProductModel findById(long id ){

        Optional<ProductModel>Product = ProductRepository.findById(id);

        return Product.get();
    }
}
