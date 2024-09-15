package br.com.example.introducao.spring.spring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.example.introducao.spring.spring.app.user.User;
import br.com.example.introducao.spring.spring.app.user.UserRepository;


@Component
public class StartApp implements CommandLineRunner  {
    @Autowired
    private UserRepository user;
    
    @Override
    public void run(String... args) throws Exception {
        User jairo = new User();
        jairo = user.procurarPeloUsuario("Jairo Pinheiro");
        System.out.println(jairo);
    }
    
}
