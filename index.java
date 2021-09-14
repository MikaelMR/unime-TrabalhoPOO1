package unimePOOIITrabalho;

import java.text.DecimalFormat; 
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

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
		System.out.println("\nA m�dia final do aluno �: " + doubleShort.format(x));
		if (x >= 7 && x <= 10) {
			System.out.println("Aprovado.\n");
		} else if (x >= 4 && x < 7) {
			System.out.println("Eleg�vel a recupera��o.\n");
		} else if (x >= 0 && x < 4) {
			System.out.println("Reprovado.\n");
		}
		
		// Cria��o do ArrayList.
		ArrayList <String> listaP = new ArrayList<>();
		
		// PS: Prefiri deixar as op��es do menu fora do for loop para n�o ficar spammando a tela.
		System.out.println("1 - Cadastrar participante\r\n"
						 + "2 - Remover por posi��o\r\n"
						 + "3 - Remover por nome\r\n"
						 + "4 - Listar participantes\r\n"
						 + "5 - Pesquisar participante\r\n"
						 + "6 - Ordenar lista alfabeticamente\r\n"
						 + "7 - Limpar lista\r\n"
						 + "8 - Encerrar");
		
		// Navega��o completa do menu.
		for (; true;) {
			Scanner menuInput = new Scanner(System.in);
			Scanner listaInput = new Scanner(System.in);
			System.out.print("\n\nEscolha o menu: ");
			switch (menuInput.nextInt()) {
				case 1: System.out.println("\n1 - Cadastrar participante"); // Cadastra a String como nome do participante dentro do ArrayList.
						System.out.print("Digite o nome do/a participante: "); 
						listaP.add(listaInput.nextLine());
						break;
				case 2: System.out.println("\n2 - Remover por posi��o"); // Usa uma vari�vel para deixar a posi��o do nome como a posi��o do Array.
						System.out.print("Digite a posi��o do/a participante para ser removido/a: "); 
						int i = listaInput.nextInt();
						i = i - 1;
						System.out.println("Participante " + listaP.get(i) + " foi removido/a da lista.");
						listaP.remove(i);
						break;
				case 3: System.out.println("\n3 - Remover por nome"); // Praticamente a mesma coisa do case 5 mas com o remove(); no final.
						System.out.print("Digite o nome do/a participante para ser removido/a: "); 
						String a = listaInput.nextLine();
						if (listaP.contains(a) == true) {
							System.out.println("Participante " + a + " foi removido/a da lista.");
						} if (listaP.contains(a) == false) {
							System.out.println("O nome " + a + " n�o est� na lista ou foi digitado incorretamente.");
						}
						listaP.remove(a);
						break;
				case 4: System.out.println("\n4 - Listar participantes"); // Usa um for loop pra numerar e listar os nomes cadastrados no ArrayList.
						System.out.println("Nome dos participantes cadastrados: "); 
						int numP = 1;
						for(String nomeP: listaP) {
							System.out.println(numP + " - " + nomeP);
							++numP;
						}
						break;
				case 5: System.out.println("\n5 - Pesquisar participante"); // Usa uma vari�vel para verificar se a String digitada j� foi usada ou n�o.
						System.out.print("Digite o nome do participante para ser procurado/a: "); 
						String nomeCa = listaInput.nextLine();
						if (listaP.contains(nomeCa) == true) {
							System.out.println("O nome " + nomeCa + " j� est� cadastrado/a.");
						} if (listaP.contains(nomeCa) == false) {
							System.out.println("O nome " + nomeCa + " ainda n�o est� cadastrado/a.");
						}
						break;
				case 6: System.out.println("\n6 - Ordenar lista alfabeticamente"); // Sinceramente eu ia numerar essa lista tbm mas eu fiquei com medo de quebrar alguma coisa, n�o se mexe com oq ta funcionando kkk.
						System.out.println("Nome dos participantes cadastrados em ordem alfabetica: "); 
						Collections.sort(listaP);
						for(String nomeP: listaP) {
							System.out.println(nomeP);
						}
						break;
				case 7: System.out.println("\n7 - Limpar lista"); // Limpa o ArrayList todo usando o clear();
						System.out.println("\nLimpando lista..."); 
						listaP.clear(); 
						break;
				case 8: System.out.println("\n8 - Encerrar"); // Encerra o programa...e rapaz o medo q eu tava de usar um for loop infinito que isso daq foi o primeiro case que eu fiz desse programa.
						System.out.println("\nSaindo do menu..."); 
						System.exit(0); 
						break;
				default: System.out.println("Menu n�o registrado."); break;
			}
		}
		
		
		
	} 
	
}
