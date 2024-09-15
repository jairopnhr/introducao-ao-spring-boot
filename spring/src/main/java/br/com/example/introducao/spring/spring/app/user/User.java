package br.com.example.introducao.spring.spring.app.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "table_user")
public class User {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    @Column(name = "user_id")
    private Integer id;
    @Column(length = 50 ,name = "user_nome")
    private String nome;
    @Column(length = 20  ,name = "user_username")
    private String username;
    @Column(length =100,  name = "user_password")
    private String password;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", nome=" + nome + ", username=" + username + ", password=" + password + "]";
    }
}
