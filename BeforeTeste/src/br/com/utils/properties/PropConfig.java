package br.com.utils.properties;


import javax.swing.*;
import java.io.InputStream;
import java.util.Properties;

public class PropConfig {

    private  Properties propsVivoGo = new Properties();
    private  Properties propsSun = new Properties();

    public Properties getPropVivoGo(){
        try {
            InputStream in = getClass().getResourceAsStream("./vivogo/VivoGoProp.properties");
            propsVivoGo.load(in);
            in.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Não foi possível carregar o arquivo de properties: \n" + e.getMessage() , "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return propsVivoGo;
    }

    public Properties getPropSun(){
        try {
            InputStream in = this.getClass().getResourceAsStream("./sun/Sun.properties");
            propsSun.load(in);
            in.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Não foi possível carregar o arquivo de properties: \n" + e.getMessage() , "Erro", JOptionPane.ERROR_MESSAGE);
       }
        return propsSun;
    }

}
