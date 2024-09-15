package br.com.example.introducao.spring.spring.app.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    
    @Query("SELECT u FROM User u WHERE u.nome LIKE %:name%")
    User procurarPeloUsuario(@Param("name") String name);
}
