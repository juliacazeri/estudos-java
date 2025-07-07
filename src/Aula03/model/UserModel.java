package Aula03.model;

import java.time.OffsetDateTime;
import java.util.Objects;

public class UserModel{
    private long id;
    private String nome;
    private String email;
    private OffsetDateTime aniversario;

    public UserModel(final long id, final String nome, final String email, final OffsetDateTime aniversario) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }

    public UserModel(){
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public OffsetDateTime getAniversario(){
        return aniversario;
    }

    public void setAniversario(OffsetDateTime aniversario){
        this.aniversario = aniversario;
    }

    @Override
    public boolean equals(Object o){
        if (o == null || getClass() != o.getClass()) return false;
        UserModel userModel = (UserModel) o;
        return id == userModel.id && Objects.equals(nome, userModel.nome) && Objects.equals(email, userModel.email) && Objects.equals(aniversario, userModel.aniversario);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, nome, email, aniversario);
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", aniversario=" + aniversario +
                '}';
    }
}