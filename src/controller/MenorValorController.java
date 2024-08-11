package controller;

public class MenorValorController {

	public MenorValorController() {
		super();
	}
	
	public int encontrarMenorValor(int[] vetor, int tamanho, int menorValor) {
		// Condição de parada: quando o tamanho do vetor for igual a 0, retorna o menor valor,
		//pois todos os números já foram verificados
		if(tamanho == 0) {
			return menorValor;
		} 
		
		// Relação de chamada dos passos: compara o menor número atual com o número da última posição do vetor
		// e chama a função encontrarMenorValor para percorrer todas as posição do vetor e verificar se 
		// existe outro número menor.
		
		if(vetor[tamanho - 1] < menorValor) {
			menorValor = vetor[tamanho - 1];
		}
		
		return encontrarMenorValor(vetor, tamanho - 1, menorValor);			
	}
}
