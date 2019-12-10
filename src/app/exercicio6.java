/* Escreva um método que recebe um array de inteiros a e devolve um array de boolean onde,
* cada posição indique true se o elemento da posição correspondente de a é positivo e false
* caso seja negativo ou zero.
* 
* Progamadores: Larissa e Hudson;
*/

package app;

//Importando bibliotecas
import java.util.Scanner;
import java.lang.reflect.Array;

//Criando classes
public class exercicio6 {

    // Criando método
    public static void main(String[] args) {

        // Chamada do metodo
        converteBoolean();
    }

    // Metodo que vai receber
    public static Integer converteBoolean() {

        // declaração de variaveis
        Scanner ler = new Scanner(System.in);

        // solicita o tamanho do array
        System.out.print("Informe o tamanho do array: ");
        int t = ler.nextInt();

        // Arrays com tamanho definidos pelo usuário
        int array[] = new int[t];
        boolean arrayBol[] = new boolean[t];

        // contador para inserir os numeros no array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero: ");
            array[i] = ler.nextInt();
        }

        // Percorre o array verificando se o numero é positivo ou negativo
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 0) {
                // Condição para falso
                Array.setBoolean(arrayBol, i, false);
            }

            // Condição para verdadeiro
            else {
                Array.setBoolean(arrayBol, i, true);
            }
        }

        // Looping para verificação
        for (int i = 0; i < array.length; i++) {
            System.out.println(arrayBol[i] + " ");
        }

        // saida do metodo
        return 0;
    }
}