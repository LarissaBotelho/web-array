/* Escreva um método que recebe um array de números e devolve a posição onde se encontra o
* maior valor do array. Se houver mais de um valor maior, devolver a posição da primeira
* ocorrência.
* 
* Progamadores: Larissa e Hudson;
*/

package app;

//Importando biblioteca
import java.util.Scanner;

//Criando classe
public class exercicio7 {

    //Criando método    
    public static void main(String[] args) {

        //Scanner usado para receber entradas dos usuários
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o quantidade de números do array:");
        int tamanhoArray = leitor.nextInt();

        //Variável para armazenar o maior valor do array
        int maior = 0;

        //Variável para armazenar a posição do maior número encontrado
        int posicaoDoMaior = -1;

        //Declara e instancia array
        float array[] = new float[tamanhoArray];

        //Recebe os valores do array
        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite o valor da posição " + (i+1));
            array[i] = leitor.nextFloat();
        }

        //Encontra valor do maior valor no array
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maior) {
                maior = (int) array[i];
                posicaoDoMaior = i--;
            }
        }
        System.out.println("O maior valor encontrado foi " + maior + " na posição " + posicaoDoMaior);
    }
}