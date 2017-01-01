package br.com.utils.Alt;
import java.util.Random;
/**
 * Created by felipe on 30/12/16.
 */

public class numRandom {
        public static void main(String[] args) {
            String letras[] = {"a","b","c","d","e","f","g"};
            int nrAleatorio;
            Random ramdom = new Random(3);
            for(int i = 0; i < 20; i++){
                //escolhe uma posição de 0 a 6
                nrAleatorio = 0 + ramdom.nextInt(6);
                if(i % 5 == 0)
                    System.out.println();
                //imprime um resultado aleatório
                System.out.print(nrAleatorio + letras[nrAleatorio]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  );
            }
        }
    }

