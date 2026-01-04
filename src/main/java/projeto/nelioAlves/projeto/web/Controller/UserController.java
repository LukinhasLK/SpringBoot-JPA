package projeto.nelioAlves.projeto.web.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projeto.nelioAlves.projeto.web.Model.UserModel;
import projeto.nelioAlves.projeto.web.Services.UserServices;

import java.util.List;

@RestController
@RequestMapping(value = "/User")
public class UserController {

    @Autowired
    private UserServices services;

    @GetMapping
    public ResponseEntity<List<UserModel>> findAll(){

        List<UserModel>list = services.findall();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<UserModel>findById( @PathVariable long id){
        UserModel user = services.findById(id);
        return ResponseEntity.ok().body(user);
    }

}
