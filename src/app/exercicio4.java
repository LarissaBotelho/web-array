/*
* Crie um metodo que recebe um array de inteiros 
* e retorna a quantidade de elementos do array 
* que sao numeros negativos 
*
* Programador: Larissa e Hudson
*/

package app;

//Importando biblioteca
import java.util.Scanner;

//Criando classe
public class exercicio4 {

    // metodo para receber array de inteiros e informar os negativos
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        //Declarando variáeis
        int[] array = new int[5];
        int contador = 0;

        //looping para armazenar os valores inseridos no array
        for (int i = 0; i < array.length; i++) {

            //imprime no console
            System.out.println("Insira um número: ");

            array[i] = ent.nextInt();
        }

        //looping para contar a quantidade de numeros negativos
        for (int i = 0; i < array.length; i++) {

            if (array[i] < 0) {

                contador++;
            }
        }

        //imprime o resultado no console
        System.out.println();
        System.out.println("Seu array possui " + contador + " números negativos");
    }
}