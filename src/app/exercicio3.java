/* Escreva um trecho Java que leia 10 valores double do teclado e armazene-os num array d.
*
* Progamadores: Larissa e Hudson;
*/

package app;

//importando biblioteca
import java.util.Scanner;

//criando a classe
public class exercicio3 {

    //metodo para ler 10 valores double e armazena-los num array
    public static void main(String[] args) {

        //reconhecimento de entradas
        Scanner ent = new Scanner(System.in);

        //declarando array
        double[] ex3 = new double[10];

        System.out.println();

        //criando looping
        for (int i = 0; i < ex3.length; i++) {

            //imprime no console
            System.out.print("Digite um double:");

            //armazena no array
            double armz = ent.nextDouble();

            ex3[i] = armz;
        }

        //Looping para verificação
        for (int i = 0; i < 10; i++) {
            System.out.print(ex3[i] + ", ");
        }
    }
}