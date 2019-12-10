/* Para cada conjunto de valores abaixo, escreva o código Java, usando laço(s), que
* preencha um array com os valores: c) 1 2 3 4 5 10 20 30 40 50.
* 
* Progamadores: Larissa e Hudson;
*/

package app;

//criando a classe
public class exercicio1C {

    // metodo para inserir os valores no array
    public static void main(String[] args) {
    
    //Declaração das variáveis
    int[] c = new int[10];
    int x = 0;

    System.out.println();
        //Looping para captura dos números
        for (int i = 0; i < c.length; i++) {
            //condição dos primeiros cinco números
            if (i < 5) {
                c[i] = i + 1;
                System.out.print(c[i] + " ");
            }
            //condição dos últimos cinco números
            else {
                c[i] = x;
                x += 10;
                System.out.print(x + " ");
            }
        }
    //Imprime ou números do array
    System.out.println();
    }
}