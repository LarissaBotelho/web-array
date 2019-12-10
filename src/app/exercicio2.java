/* 
* Escreva um trecho Java que exiba os valores de 
* um array a double numa mesma linha
*/

package app;

//criando a classe

public class exercicio2 {

    //metodo para exibir os valores de um array a double
    public static void main(String[] args) {

        //declarando array
        double[] ex2 = { 1.4, 4.3, 6.5, 0.7, -0.3 };

        System.out.println();

        //executa looping
        for (Double num : ex2) {

            //imprime resultado no console
            System.out.print(num + " ");
        }

        //Imprime o resultado
        System.out.println();
    }
}