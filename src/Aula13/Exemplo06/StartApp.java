package Aula13.Exemplo06;

// Spring Data JPA, Conexão com PostGres, JPA Repository
/*
package dio.aula;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner{

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception{
        List<User> users = repository.findByNameContaining("Julia");
        for(User u : users){
            System.out.println(u);
        }
    }

    private void insertUser(){
        User user = new User();
        user.setName("Julia Cazeri");
        user.setUsername("julia");
        user.setPassword("cazeri");
        repository.save(user);

        for(User u : repository.findAll()){
            System.out.println(u);
        }
    }
}
 */