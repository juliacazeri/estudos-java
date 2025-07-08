package Aula03.validator;

import Aula03.exception.ValidatorException;
import Aula03.model.UserModel;

public class UserValidator {
    private UserValidator() {
    }

    public static void verifyModel(final UserModel model) throws ValidatorException {
        if (stringIsBlank(model.getNome()))
            throw new ValidatorException("Informe um nome válido.");
        if (model.getNome().length() <= 1)
            throw new ValidatorException("O nome deve ter mais que 1 carácter.");
        if (stringIsBlank(model.getEmail()))
            throw new ValidatorException("Informe um e-mail válido.");
        if ((!model.getEmail().contains("@")) || (!model.getEmail().contains(".")))
            throw new ValidatorException("Informe um e-mail válido.");
    }
    private static boolean stringIsBlank(final String valor) {
        return valor == null || valor.isBlank();
    }
}