package view;

import controller.MenorValorController;

public class Principal {

	public static void main(String[] args) {
		MenorValorController menorValorController = new MenorValorController();
		int[] vetor = {9, 27, 6, 40, 18};
		int tamanho = vetor.length;
		int menorValor = menorValorController.encontrarMenorValor(vetor, tamanho, vetor[tamanho - 1]);
		
		System.out.println("O menor valor do vetor é: " + menorValor);
	}
}
