package projeto.nelioAlves.projeto.web.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projeto.nelioAlves.projeto.web.Model.CategoryModel;
import projeto.nelioAlves.projeto.web.Services.CategoryServices;

import java.util.List;

@RestController
@RequestMapping(value = "/category")
public class CategoryController {

    @Autowired
    private CategoryServices services;

    @GetMapping
    public ResponseEntity<List<CategoryModel>> findall() {

        List<CategoryModel> Category = services.findall();

        return ResponseEntity.ok().body(Category);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<CategoryModel> findById(@PathVariable long id) {

        CategoryModel Category = services.findById(id);

        return ResponseEntity.ok().body(Category);

    }

}
