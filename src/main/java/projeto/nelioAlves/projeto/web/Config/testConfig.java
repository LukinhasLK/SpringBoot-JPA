package projeto.nelioAlves.projeto.web.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import projeto.nelioAlves.projeto.web.Model.OrderModel;
import projeto.nelioAlves.projeto.web.Model.UserModel;
import projeto.nelioAlves.projeto.web.Repository.OrderRepository;
import projeto.nelioAlves.projeto.web.Repository.UserRepository;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class testConfig  implements CommandLineRunner {

    @Autowired
    private UserRepository UserRepository;

    @Autowired
    private OrderRepository OrderRepository;

    @Override
    public void run(String... args) throws Exception {

        UserModel User1 = new UserModel();
        User1.setName("Lucas Rodrigues");
        User1.setEmail("lucasrodrigues@gmail.com");
        User1.setPhone("11976167310");
        User1.setPassword("123456");

        UserModel User2 = new UserModel();
        User2.setName("Pedro Rodrigues");
        User2.setEmail("pedrorodrigues@gmail.com");
        User2.setPhone("1191213313");
        User2.setPassword("123456");

        UserRepository.saveAll(Arrays.asList(User1,User2));


        OrderModel Order1 = new OrderModel();
        Order1.setMoment(Instant.now());
        Order1.setClient(User1);

        OrderModel Order2 = new OrderModel();
        Order1.setMoment(Instant.now());
        Order1.setClient(User2);


        OrderRepository.saveAll(Arrays.asList(Order1,Order2));
    }
}
