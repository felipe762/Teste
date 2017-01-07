package br.com.testes.pap;

import br.com.apps.sun.pappaginas.LoginSun;
import org.junit.After;
import org.junit.Test;

import javax.swing.*;

import static javax.swing.JOptionPane.ERROR_MESSAGE;


public class LoginSunTest {

    private LoginSun login;
   // private ClientesPage clientes;

    @Test
    public void init() {
      //  class LoginSunTest clientes;
        try {
            login = new LoginSun();
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
