/* Para cada conjunto de valores abaixo, escreva o código Java, usando laço(s), que
* preencha um array com os valores: b) 0 1 4 9 16 25 36 49 64 81 100.
* 
* Progamadores: Larissa e Hudson;
*/

package app;

//criando a classe
public class exercicio1B {

    //metodo para inserir os valores no array
    public static void main(String[] args) {

        //criado um array
        int[] array = new int[11];

        //looping para gerar os quadrados dos numeros de 1 a 10
        for (int i = 0; i <= 10; i++) {

            //armazenar os numeros no array
            array[i] = i * i;

            //imprimir no console
            System.out.println(array[i]);
        }
    }
}