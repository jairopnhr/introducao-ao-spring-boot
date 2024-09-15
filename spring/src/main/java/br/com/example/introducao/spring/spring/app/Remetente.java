package br.com.example.introducao.spring.spring.app;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "remetente")
public class Remetente {
    public String nome;
    public String email;
    public List<String> telefones;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<String> getTelefones() {
        return telefones;
    }
    public void setTelefones(List<String> telefones) {
        this.telefones = telefones;
    } 


}
