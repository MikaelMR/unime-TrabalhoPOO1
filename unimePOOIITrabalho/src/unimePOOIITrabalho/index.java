package unimePOOIITrabalho;

import java.text.DecimalFormat;
import java.util.Scanner;

public class index {

	public static void main (String[] args) {
		
		// Cria��o dos scanners, vari�veis e formata��o do double em duas casas decimais.
		Scanner notaInput = new Scanner(System.in);
		double nota1, nota2, nota3, x;
		DecimalFormat doubleShort = new DecimalFormat("#.##");
		
		// Input das notas.
		System.out.print("Insira a 1� nota do aluno: ");
		nota1 = notaInput.nextDouble();
		System.out.print("Insira a 2� nota do aluno: ");
		nota2 = notaInput.nextDouble();
		System.out.print("Insira a 3� nota do aluno: ");
		nota3 = notaInput.nextDouble();
		
		// C�lculo da m�dia aritm�tica e condi��es do valor final.
		x = (nota1 + nota2 + nota3) / 3;
		System.out.println("\nSua m�dia final �: " + doubleShort.format(x));
		if (x >= 7 && x <= 10) {
			System.out.println("Aprovado.\n");
		} else if (x >= 4 && x < 7) {
			System.out.println("Eleg�vel a recupera��o.\n");
		} else if (x >= 0 && x < 4) {
			System.out.println("Reprovado.\n");
		}
		
		
		
		
	} 
	
}
