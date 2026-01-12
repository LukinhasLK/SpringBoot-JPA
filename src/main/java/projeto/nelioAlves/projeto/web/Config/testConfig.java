package projeto.nelioAlves.projeto.web.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import projeto.nelioAlves.projeto.web.Model.CategoryModel;
import projeto.nelioAlves.projeto.web.Model.OrderModel;
import projeto.nelioAlves.projeto.web.Model.ProductModel;
import projeto.nelioAlves.projeto.web.Model.UserModel;
import projeto.nelioAlves.projeto.web.Repository.CategoryRepository;
import projeto.nelioAlves.projeto.web.Repository.OrderRepository;
import projeto.nelioAlves.projeto.web.Repository.ProductRepository;
import projeto.nelioAlves.projeto.web.Repository.UserRepository;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class testConfig implements CommandLineRunner {


    @Autowired
    private ProductRepository ProductRepository;

    @Autowired
    private UserRepository UserRepository;

    @Autowired
    private OrderRepository OrderRepository;

    @Autowired
    private CategoryRepository CategoryRepository;

    @Override
    public void run(String... args) throws Exception {

        UserModel User1 = new UserModel();
        User1.setName("Lucas Rodrigues Alves");
        User1.setEmail("lucasrodrigues@gmail.com");
        User1.setPhone("99999999");
        User1.setPassword("1234567");

        UserModel User2 = new UserModel();
        User2.setName("Pedro Rodrigues");
        User2.setEmail("pedrorodrigues@gmail.com");
        User2.setPhone("1191213313");
        User2.setPassword("123456");

        UserRepository.saveAll(Arrays.asList(User1, User2));


        OrderModel Order1 = new OrderModel();
        Order1.setMoment(Instant.now());
        Order1.setOrderStatus(2);
        Order1.setClient(User1);

        OrderModel Order2 = new OrderModel();
        Order1.setMoment(Instant.now());
        Order1.setOrderStatus(3);
        Order1.setClient(User2);
        OrderRepository.saveAll(Arrays.asList(Order1, Order2));

        CategoryModel category1 = new CategoryModel();
        CategoryModel category2 = new CategoryModel();
        CategoryModel category3 = new CategoryModel();
        CategoryModel category4 = new CategoryModel();

        category1.setName("Eletronic");
        category2.setName("Books");
        category3.setName("Computers");
        category4.setName("Product clear");



        CategoryRepository.saveAll(Arrays.asList(category1, category2, category3));


        ProductModel product1 = new ProductModel();

        product1.setName("48 leis do poder");
        product1.setDescription("um livor para voce entender o mundo");
        product1.setPrice(30.00);
        product1.getCategory().add(category2);


        ProductModel product2= new ProductModel();

        product2.setName("capinha da pitaka");
        product2.setDescription("capa de alta Resistencia do mercado");
        product2.setPrice(70.00);
        product2.getCategory().add(category1);

        ProductModel product3 = new ProductModel();

        product3.setName("Vonix lavarapido");
        product3.setDescription("Produto de alta eficacia para lavar o seu carro");
        product3.setPrice(50.00);

        product3.getCategory().add(category4);


        ProductModel product4 = new ProductModel();

        product4.setName("Maquina de cabelo");
        product4.setDescription("uma maquina de alta precisao para corta o seu cabelo");
        product4.setPrice(100.00);
        product4.getCategory().add(category1);


        ProductModel product5= new ProductModel();

        product5.setName("Macbook");
        product5.setDescription("Um notebook de alta qualidade ");
        product5.setPrice(400.00);
        product5.getCategory().add(category3);


    }

}
