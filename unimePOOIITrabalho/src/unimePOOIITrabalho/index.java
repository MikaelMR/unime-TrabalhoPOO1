package unimePOOIITrabalho;

import java.text.DecimalFormat; 
import java.util.Scanner;
import java.util.ArrayList;

public class index {

	public static void main (String[] args) {
		/*
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
		}*/
		
		
		
		System.out.println("1 - Cadastrar participante\r\n"
						 + "2 - Remover por posição\r\n"
						 + "3 - Remover por nome\r\n"
						 + "4 - Listar participantes\r\n"
						 + "5 - Pesquisar participante\r\n"
						 + "6 - Ordenar lista alfabeticamente\r\n"
						 + "7 - Limpar lista\r\n"
						 + "8 - Encerrar");
		
		Scanner menuInput = new Scanner(System.in);
		for (; true;) {
			System.out.print("\n\nEscolha o menu: ");
			switch (menuInput.nextInt()) {
				case 1: System.out.print("Digite o nome do/a participante: "); break;
				case 2: System.out.print("Digite a posição do/a participante para ser removido/a: "); break;
				case 3: System.out.print("Digite o nome do/a participante para ser removido/a: "); break;
				case 4: System.out.println(); break;
				case 5: System.out.println(); break;
				case 6: System.out.println(); break;
				case 7: System.out.println(); break;
				case 8: System.out.println("\nSaindo do menu..."); System.exit(0); break;
				default: System.out.println("Menu não registrado."); break;
			}
		}
		
		
		
	} 
	
}
