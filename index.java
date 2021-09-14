package unimePOOIITrabalho;

import java.text.DecimalFormat; 
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

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
		System.out.println("\nA média final do aluno é: " + doubleShort.format(x));
		if (x >= 7 && x <= 10) {
			System.out.println("Aprovado.\n");
		} else if (x >= 4 && x < 7) {
			System.out.println("Elegível a recuperação.\n");
		} else if (x >= 0 && x < 4) {
			System.out.println("Reprovado.\n");
		}
		
		// Criação do ArrayList.
		ArrayList <String> listaP = new ArrayList<>();
		
		// PS: Prefiri deixar as opções do menu fora do for loop para não ficar spammando a tela.
		System.out.println("1 - Cadastrar participante\r\n"
						 + "2 - Remover por posição\r\n"
						 + "3 - Remover por nome\r\n"
						 + "4 - Listar participantes\r\n"
						 + "5 - Pesquisar participante\r\n"
						 + "6 - Ordenar lista alfabeticamente\r\n"
						 + "7 - Limpar lista\r\n"
						 + "8 - Encerrar");
		
		// Navegação completa do menu.
		for (; true;) {
			Scanner menuInput = new Scanner(System.in);
			Scanner listaInput = new Scanner(System.in);
			System.out.print("\n\nEscolha o menu: ");
			switch (menuInput.nextInt()) {
				case 1: System.out.println("\n1 - Cadastrar participante"); // Cadastra a String como nome do participante dentro do ArrayList.
						System.out.print("Digite o nome do/a participante: "); 
						listaP.add(listaInput.nextLine());
						break;
				case 2: System.out.println("\n2 - Remover por posição"); // Usa uma variável para deixar a posição do nome como a posição do Array.
						System.out.print("Digite a posição do/a participante para ser removido/a: "); 
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
							System.out.println("O nome " + a + " não está na lista ou foi digitado incorretamente.");
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
				case 5: System.out.println("\n5 - Pesquisar participante"); // Usa uma variável para verificar se a String digitada já foi usada ou não.
						System.out.print("Digite o nome do participante para ser procurado/a: "); 
						String nomeCa = listaInput.nextLine();
						if (listaP.contains(nomeCa) == true) {
							System.out.println("O nome " + nomeCa + " já está cadastrado/a.");
						} if (listaP.contains(nomeCa) == false) {
							System.out.println("O nome " + nomeCa + " ainda não está cadastrado/a.");
						}
						break;
				case 6: System.out.println("\n6 - Ordenar lista alfabeticamente"); // Sinceramente eu ia numerar essa lista tbm mas eu fiquei com medo de quebrar alguma coisa, não se mexe com oq ta funcionando kkk.
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
				default: System.out.println("Menu não registrado."); break;
			}
		}
		
		
		
	} 
	
}
