package projeto.nelioAlves.projeto.web.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projeto.nelioAlves.projeto.web.Model.UserModel;

@RestController
@RequestMapping(value = "/User")
public class UserController {

    @GetMapping
    public ResponseEntity<UserModel> findAll(){

        UserModel User = new UserModel(1L,"maria","maria@gmail.com","23232344","12345");

        return ResponseEntity.ok().body(User);
    }
}
