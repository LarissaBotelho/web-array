/*Crie um método que recebe um array de inteiros a 
* e um valor inteiro x e retorna a
* quantidade de vezes que x aparece no array a.
* 
* Progamadores: Larissa e Hudson;
*/

package app;

//Importando biblioteca
import java.util.Scanner;

//Criando classe
public class exercicio5 {

    // Criando método
    public static void main(String[] args) {

        // declaração de variaveis
        Scanner ler = new Scanner(System.in);
        int numero = 0;

        // solicita o tamanho do array
        System.out.print("Informe o tamanho do array: ");
        int t = ler.nextInt();

        // array com tamanho t definido pelo usuario
        int array[] = new int[t];

        // contador para inserir 10 numeros
        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero: ");
            array[i] = ler.nextInt();
        }

        // Solicita ao usuario numero a ser verificado no array
        System.out.print("Digite número a ser verificado: ");
        numero = ler.nextInt();

        // Chama o metodo de contagem de negativos
        System.out.println("Você digitou " + comparaNum(array, numero) + " vezes o numero " + numero);
    }

    // Metodo para contar os numeros negativos de um array
    public static Integer comparaNum(int[] arr, int num) {

        // contador de negativos
        int cont = 0;

        // varre o vetor do inicio até a ultima posição do vetor
        for (int i = 0; i < arr.length; i++) {

            // caso o numero do vetor seja igual ao numero solicitado, soma 1 ao contador
            if (arr[i] == num) {
                cont++;
            }
        }

        // retorna a quantidade de numeros negativos
        return cont;
    }
}