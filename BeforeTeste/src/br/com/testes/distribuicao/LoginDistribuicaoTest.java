package br.com.testes.distribuicao;

import br.com.apps.sun.distribuicao.LoginDistribuicao;
import org.junit.After;
import org.junit.Test;

import javax.swing.*;

import static javax.swing.JOptionPane.ERROR_MESSAGE;


public class LoginDistribuicaoTest {

    private LoginDistribuicao login;

    @Test
    public void init() {
        try {
            login = new LoginDistribuicao();
            login.logar();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Não foi possível prosseguir com o teste: \n" + e.getMessage(),
                    "Erro", ERROR_MESSAGE);
        }}
    @After
    public void tearDown() throws Exception {
        login.fecharNavegador();
    }
}
