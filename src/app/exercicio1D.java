/* Para cada conjunto de valores abaixo, escreva o código Java, usando laço(s), que
* preencha um array com os valores: d) 3 4 7 12 19 28 39 52 67 84.
* 
* Progamadores: Larissa e Hudson;
*/

package app;

//criando a classe
public class exercicio1D {

	//metodo para inserir os valores no array
	public static void main(String[] args) {
		//Declaração de variáveis
		int[] d = new int[10];

		System.out.println();
		
		//Looping para captura dos números
		for (int i = 0; i < d.length; i++) {
			
			//indica a razão das somas
			d[i] = (i * i) + 3;
			System.out.print(d[i] + " ");
		}

		//Imprime os números do array
		System.out.println();
	}
}