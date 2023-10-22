package aplicação;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import controle.EntradaEstoque;
import controle.SaidaEstoque;
import entidades.Componente;
import entidades.Solicitante;

public class Principal {
	public static void main(String[] args) {
		List<EntradaEstoque> entradas = new LinkedList<EntradaEstoque>();
		List<SaidaEstoque> saidas = new LinkedList<SaidaEstoque>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu");
		int opcao;
		System.out.println("0- Sair");
		System.out.println("1- Entrada de Componente");
		System.out.println("2- Saida de Componente");
		System.out.println("3- Lista de Emprestimo");
		System.out.println("4- Lista de Componente");

		opcao = sc.nextInt();

		while (opcao != 0) {

			if (opcao == 1) {
				sc.nextLine();
				System.out.println("Digite o nome do componente: ");
				String nome = sc.nextLine();
				System.out.println("Informe a quantidade: ");
				int quantidade = sc.nextInt();
				sc.nextLine();
				System.out.println("Descrição do componente: ");
				String descricao = sc.nextLine();
				EntradaEstoque estoque = new EntradaEstoque();

				Componente componente = new Componente();
				componente.setNome(nome);
				componente.setQuantidade(quantidade);
				componente.setDescricao(descricao);
				componente.setId(0);

				estoque.setComponente(componente);
				Date data = new Date();
				String dataFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(data);
				estoque.setData(dataFormatada);
				entradas.add(estoque);
			} else {
				if (opcao == 2) {
					sc.nextLine();
					System.out.println("Informe o nome do solicitante: ");
					String nomeSolicitante = sc.nextLine();
					System.out.println("Informe a matricula: ");
					int matricula = sc.nextInt();
					System.out.println("Informe o nome do componente: ");
					sc.nextLine();
					String nomeComponente = sc.nextLine();
					System.out.println("informe a quantidade de componente: ");
					int quantidade = sc.nextInt();
					System.out.println("Informe a descrição do componente: ");
					sc.nextLine();
					String descricao = sc.nextLine();
					System.out.println("Informe a justificativa: ");
					String justificativa = sc.nextLine();

					Componente componente = new Componente();
					componente.setNome(nomeComponente);
					componente.setQuantidade(quantidade);
					componente.setDescricao(descricao);
					componente.setId(1);
					Solicitante solicitante = new Solicitante();
					solicitante.setNome(nomeSolicitante);
					solicitante.setMatricula(matricula);
					SaidaEstoque saidaEstoque = new SaidaEstoque();
					saidaEstoque.setComponente(componente);
					saidaEstoque.setJustificativa(justificativa);
					saidaEstoque.setSolicitante(solicitante);
					saidas.add(saidaEstoque);
				} else {
					if (opcao == 3) {
						sc.nextLine();
						System.out.println("Lista de empréstimo");
						for (SaidaEstoque saida : saidas) {
							System.out.println("Nome do solicitante: " + saida.getSolicitante().getNome());
							System.out.println("Matricula do solicitante: " + saida.getSolicitante().getMatricula());

							System.out.println("nome do componente: " + saida.getComponentes().getNome());
							System.out.println("Quantiddade de componente: " + saida.getComponentes().getQuantidade());
							System.out.println("Descrição do componente: " + saida.getComponentes().getDescricao());
							

						}
					}else {
						if(opcao == 4) {
							System.out.println("Lista de Componente");
							for(EntradaEstoque entrada : entradas) {
								System.out.println("Nome do componente: " + entrada.getComponente().getNome());
								System.out.println("Quantidade de componente: " + entrada.getComponente().getQuantidade());
								System.out.println("Descrição do componente: " + entrada.getComponente().getDescricao());
							}
						}
					}
				}
			}

			System.out.println("0- Sair");
			System.out.println("1- Entrada de Componente");
			System.out.println("2- Saida de Componente");
			System.out.println("3- Lista de Emprestimo");
			System.out.println("4- Lista de Componente");

			opcao = sc.nextInt();
		}
		sc.close();
	}
}
