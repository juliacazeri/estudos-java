package Aula13.Exemplo06;

// Spring Data JPA, Conexão com PostGres, JPA Repository
/*
package dio.aula.repository;

import dio.aula.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer>{
    List<User> findByNameContaining(String name);

    User findByUsername(String username);

    @Query("SELECT u FROM User u WHERE u u.name LIKE %:name%")
    List<User> filtrarPorNome(@Param("name") String name);
}
 */