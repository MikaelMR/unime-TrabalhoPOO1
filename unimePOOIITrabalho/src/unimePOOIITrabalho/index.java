package unimePOOIITrabalho;

import java.text.DecimalFormat;
import java.util.Scanner;

public class index {

	public static void main (String[] args) {
		
		// Criação dos scanners, variáveis e formatação do double em duas casas decimais.
		Scanner notaInput = new Scanner(System.in);
		double nota1, nota2, nota3, x;
		DecimalFormat doubleShort = new DecimalFormat("#.##");
		
		// Input das notas.
		System.out.print("Insira a 1ª nota do aluno: ");
		nota1 = notaInput.nextDouble();
		System.out.print("Insira a 2ª nota do aluno: ");
		nota2 = notaInput.nextDouble();
		System.out.print("Insira a 3ª nota do aluno: ");
		nota3 = notaInput.nextDouble();
		
		// Cálculo da média aritmética e condições do valor final.
		x = (nota1 + nota2 + nota3) / 3;
		System.out.println("\nSua média final é: " + doubleShort.format(x));
		if (x >= 7 && x <= 10) {
			System.out.println("Aprovado.\n");
		} else if (x >= 4 && x < 7) {
			System.out.println("Elegível a recuperação.\n");
		} else if (x >= 0 && x < 4) {
			System.out.println("Reprovado.\n");
		}
		
		
		
		
	} 
	
}
