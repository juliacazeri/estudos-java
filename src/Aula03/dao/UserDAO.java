package Aula03.dao;

import Aula03.exception.EmptyStorageExcetion;
import Aula03.exception.UserNotFoundException;
import Aula03.model.UserModel;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private long nextId = 1L;

    private final List<UserModel> models = new ArrayList<>();

    public UserModel salvar(final UserModel model) {
        model.setId(nextId++);
        models.add(model);
        return model;
    }

    public UserModel atualizar(final UserModel model) {
        var paraAtualizar = procuraPorId(model.getId());
        models.remove(paraAtualizar);
        models.add(model);
        return model;
    }

    public void deletar(final long id) {
        var paraDeletar = procuraPorId(id);
        models.remove(paraDeletar);
    }

    public UserModel procuraPorId(final long id) {
        var message = String.format("Não existe usuário com o id %d cadastrado.", id);
        return models.stream()
                .filter(u -> u.getId() == id).
                findFirst().
                orElseThrow(() -> new UserNotFoundException(message));
    }

    public List<UserModel> encontraTudo() {
        List<UserModel> resultado;
        try {
            verificaArmazenamento();
            resultado = models;
        } catch(EmptyStorageExcetion ex) {
            ex.printStackTrace();
            resultado = new ArrayList<>();
        }
        return resultado;
    }

    private void verificaArmazenamento() {
        if(models.isEmpty()) throw new EmptyStorageExcetion("O armazenamento está vazio");
    }
}