package Aula21.Exemplo02;

/*
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class ConsultarDadosDePessoaTeste{

    @BeforeAll
    static void configuraConexao(){
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste(){
        BancoDeDados.insereDados(new Pessoa("Joao", LocalDateTime.of(2000,1,1, 13, 00)));
    }

    @AfterEach
    void removeDadosDoTeste(){
        BancoDeDados.removeDados(new Pessoa("Joao", LocalDateTime.of(2000,1,1, 13, 00)));
    }

    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2(){
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
    }
}
 */