/* Escreva um método que recebe um array de números e devolve a posição onde se encontra
* o maior valor do array. Se houver mais de um valor maior, devolver a posição da primeira
* ocorrência.
* 
* Progamadores: Larissa e Hudson;
*/

package app;

//Importando bibliotecas
import java.util.Scanner;

//Criando classes
public class exercicio9 {

    //Criando metodo
    public static void main(String[] args) {

        //Declaração de variaveis
        Scanner ler = new Scanner(System.in);

        //Solicita o tamanho do array
        System.out.print("Informe tamanho do array: ");
        int t = ler.nextInt();

        //Arrays com tamanho definidos pelo usuário
        int array[] = new int[t];

        //Contador para inserir os numeros no array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero:");
            array[i] = ler.nextInt();
        }

        //imprime o retorno do maior índice
		System.out.print("A posição com maior valor é: " + RetornaPosicaoMaior(array));
	}
	
	//Metodo para retornar a maior posição
	public static int RetornaPosicaoMaior(int[] array) {

        //Declarando variável
		int maior = 0;
		
		//Loop para verificar a maior posição
		for (int i = 1; i < array.length; i++) {			
	
			//verifica a a posição maior	
			if(array[maior] < array[i]) {

                //guarda o indice da maior posição	
                maior = i;			
			}	
		}
		//retorna a variável de maior valor
		return maior + 1;
	}
}