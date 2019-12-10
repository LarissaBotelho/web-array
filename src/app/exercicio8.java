/*Faça um método que devolve um array de números lidos do teclado.
* 
* Progamadores: Larissa e Hudson;
*/

package app;

//Importando biblioteca
import java.util.Scanner;

//Criando classe
public class exercicio8 {

    //Criando método
    public static void main(String[] args) {

        //Chama o método criado abaixo;
        retornaNum();
    }

    //Metodo para contar os numeros negativos de um array
    public static Integer retornaNum() {

        Scanner ler = new Scanner(System.in);

        //Declaração do array
        int array[] = new int[10];

        //Contador para inserir os 10 numeros
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero:");
            array[i] = ler.nextInt();
        }

        //Looping para verificação
        for (int i = 0; i < 10; i++) {
            //Imprime o valor do array
            System.out.print(array[i] + " ");
        }

        //Saida do método
        return 0;
    }
}