/* Para cada conjunto de valores abaixo, escreva o código Java, usando laço(s), que
* preencha um array com os valores: a) 10 9 8 7 6 5 4 3 2 1.
* 
* Progamadores: Larissa e Hudson;
*/

package app;

//criando a classe
public class exercicio1A {

    // metodo para inserir numeros de 10 a 1 em um array
    public static void main(String[] args) {

        // criado um array
        int[] array = new int[11];

        // looping para gerar os numeros de 10 a 1
        for (int i = 10; i > 0; i--) {

            // armazenar os numeros no array
            array[i] = i;

            // imprimir no console
            System.out.println(array[i]);

        }
    }
}
