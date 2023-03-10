package Questões;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Resolucao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		/*************Questão 1 - Soma de valores num intervalo dado***************/
		
		System.out.println("****************Questão 1******************");
		
		int indice = 13;
		int soma = 0;
		int k = 0;
		
		while(k < indice) {
			k += 1;
			soma += k;
		}
		System.out.println(soma);
		
		System.out.println();
		System.out.println("---------------------------------------------");
		
		
		
		
		/*************Questão 2 - Descobrindo se elementos existem na sequencia Fibonacci***************/
	
		
		System.out.println("****************Questão 2******************");
		
		//variaveis
		int limite = 20; //limitando a quantidade de repetições Fib para evitar bugs no compilador
		int numA = 0;
		int numB = 1;
		int somaFib = 0;
		
		
		//Criação de uma lista para armazenar a sequencia fibonacci
		List<Integer> list = new ArrayList<>();
		
		
		for(int z=0; z<limite; z++) {
			somaFib = numA + numB;
			numA = numB;
			numB = somaFib;
			System.out.println(somaFib);
			
			list.add(somaFib);
		}
		
		System.out.print("Verifique se um numero pertence a lista e sua posição, se não, ficará em branco: ");
		int n = sc.nextInt();
		
		for(Integer i : list) {
			if(n == i) {
				System.out.println("Pertence e tem posição #" + list.indexOf(i));	

			}
		}
		
		System.out.println();
		System.out.println("---------------------------------------------");
		
	
	
		
		/*************Questão 3 - Descobrindo a logica das sequencias***************/
		
		
		//Item A:
		//Respota: 9
		//Logica: numeros primos
		 
		
		//Item B:
		//Resposta: 128
		//Logica: Potenciação de 2. 2 elevado a posição(7) = 128
		 
		
		//Item C:
		//Respota: 49
		//Logica: numeros ao quadrado(Potenciação de sequencia numerica : 1,2,3,4,5,6,*7*)
		

		//Item D:
		//Reposta: 100
		//Logica: quadrado dos numeros pares.(4: 2x2), (16: 4x4), (36: 6x6), (64: 8x8), (100: 10x10)
		

		
		//Item E:
		//Resposta: 13
		//Logica: cada numero é a soma dos seus 2 antecessores. 1+1=2; 1+2=3; 2+3=5; 3+5=8; 5+8=13
		
		
		//Item F
		//Resposta: --
		
		
		
		
		
		
		/*************Questão 4 - Descobrindo distancia ***************/
		
		
		//Resposta: levando em conta a distancia no dado momento em que se cruzam, sem considerar a velocidade, os dois estariam a uma mesma distancia
		// de Ribeirão Preto
		
		//Calculos para descobrir em que momento eles se encontram:
		
		/*
		 * c1 = carro
		 * c2= caminhão
		 * 
		 * c1= v2.t
		 * c2 = 100-v2.t (o caminhão está saindo do ponto de referencia que é Ribeirão Preto, por isso a negativa na equação horaria)
		 * 
		 * **Tempo que o caminhão demora sem considerar os 2 pedagios de 5 minutos**
		 * 
		 * t=S/V2 -- t=100/80 = 1,25h
		 * 
		 *** Com pedagios : 1,42h (cada 10 minutos são 0,17h)**
		 * 
		 * V2= 100/1,42 -- V2=~ 70km/h
		 * 
		 * ** Igualando o tempo, podemos encontrar o dado momento em que os dois veiculos se cruzam**
		 * 
		 * t = c1/v1
		 * 
		 * t = c2 - 100/-v2
		 * 
		 * ** Igualando os dois veiculos:
		 * 
		 * c1 = c2 --- c/v1=c-100/-v2
		 * 
		 * -v2.c = v1.c - 100v1
		 * 
		 * v1.c +v2.c -100v1 =0
		 * 
		 * c( v1+v2) = 100v1
		 * 
		 * c = 100v1/v1+v2
		 * 
		 * c = 100 * 110 / 110 * 70,6
		 * 
		 * c = 60,9km
		 */
		 
		
		
		
		/*************Questão 5 - Retornando String invertida***************/
		 
		System.out.println("****************Questão 5******************");
		
		System.out.print("Insira a palavra que deseja inverter: ");	
		String palavra = sc.next();
		String invertida = "";
		
		//length retornaria a quantidade de strings da palavra e o "-1" retorna essa quantidade invertida
		for(int i = palavra.length()-1; i >= 0; i--){
			invertida += palavra.charAt(i); 
			} 
		System.out.println(invertida);
		

		sc.close();
		
		
	}

}
