package Aula14.repository;

/*
import dio.web.api.handler.CampoObrigatorioException;
import dio.web.api.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository{
    public void save(User user){
        if(user.getLogin() == null){
            throw new CampoObrigatorioException("login");
        }
        if(user.getLogin() == null){
            throw new CampoObrigatorioException("password");
        }
        if(user.getId() == null){
            System.out.println("Salvo - Recebendo um usuário na camada de repositório.");
        } else{
            System.out.println("Atualizar - Recebendo o usuário na camada de repositório.");
        }
        System.out.println(user);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("Deletar por Id - Recebendo o id: %d para excluir um usuário.", id));
        System.out.println(id);
    }

    public List<User> findAll(){
        System.out.println("===== Listando todos os usuários do sistema =====");

        List<User> users = new ArrayList<>();
        users.add(new User("julia", "1234"));
        users.add(new User("duda", "5678"));
        return users;
    }

    public User findById(Integer id){
        System.out.println(String.format("Procurar por Id - Recebendo o id: %d para localizar um usuário.", id));
        return new User("julia", "1234");
    }

    public User findByUsername(String username){
        System.out.println(String.format("Procurar por username - Recebendo o username: %s para localizar um usuário.", username));
        return new User("duda", "3456");
    }
}
 */