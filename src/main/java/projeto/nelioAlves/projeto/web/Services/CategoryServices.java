package projeto.nelioAlves.projeto.web.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.nelioAlves.projeto.web.Model.CategoryModel;
import projeto.nelioAlves.projeto.web.Repository.CategoryRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServices {

    @Autowired
    private CategoryRepository CategoryRepository;

    public List<CategoryModel> findall() {
        return CategoryRepository.findAll();
    }

    public CategoryModel findById(long id) {
        Optional<CategoryModel> Category = CategoryRepository.findById(id);
        return Category.get();
    }
}
