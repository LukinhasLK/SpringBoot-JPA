package projeto.nelioAlves.projeto.web.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import projeto.nelioAlves.projeto.web.Model.UserModel;
import projeto.nelioAlves.projeto.web.Repository.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServices {

    @Autowired
    private UserRepository repository;


    public List<UserModel> findall() {
        return repository.findAll();
    }



    public UserModel findById(long id) {
        Optional<UserModel> user = repository.findById(id);

        return user.get();

    }

}
