import java.util.ArrayList;
import java.util.Scanner;

public class ViewCadastro {
	private Scanner input;

	public ViewCadastro() {
		input = new Scanner(System.in);

	}

	public String mostraMenu() {
		System.out.println("Concecionaria");
		System.out.println("1 - Adicionar");
		System.out.println("2 - Listar");
		System.out.println("3 - Alterar");
		System.out.println("4 - Excluir");
		System.out.println("5 - Pesquisar por nome");
		System.out.println("6 - Pesquisar por cor");
		System.out.println("7 - Sair");
		System.out.println("Opção: ");
		return input.nextLine();
	}

	public CadastroMoto adicionar(ArrayList<CadastroMoto> dados) {

		CadastroMoto moto = new CadastroMoto(); 

		System.out.println("Nome: ");
		moto.setNome(input.nextLine());

		System.out.println("Marca: ");
		moto.setMarca(input.nextLine());

		System.out.println("Ano:  ");
		moto.setAno(input.nextLine());

		System.out.println("Cor: ");
		moto.setCor(input.nextLine());

		dados.add(moto);

		return moto;
	}

	public void listar(ArrayList<CadastroMoto> dados) {
		for (int i = 0; i < dados.size(); i++) {
			System.out.println(dados.get(i).toString() + "Posição: " + i + "\n");
		}
	}
	
	public void alterar(ArrayList<CadastroMoto> dados) {
		listar(dados);
		boolean continuar = true;
		int i = 0;
		do {
			System.out.println("Digite a posição do registro para alterar: ");
			try {
				i = Integer.parseInt(input.nextLine());
				if (i >= 0 & i < dados.size()) {
					continuar = false;
				} else {
					System.out.println("Digite um valor válido!");
				}
			} catch (Exception e) {
				System.out.println("Valor digitado inválido!!!");
			}
		} while (continuar);

		System.out.println("Nome (" + dados.get(i).getNome() + "): ");
		dados.get(i).setNome(input.nextLine());

		System.out.println("Marca(" + dados.get(i).getMarca() + "): ");
		dados.get(i).setMarca(input.nextLine());

		System.out.println("Ano (" + dados.get(i).getAno() + "): ");
		dados.get(i).setAno(input.nextLine());

		System.out.println("Cor (" + dados.get(i).getCor() + "): ");
		dados.get(i).setCor(input.nextLine());

	}

	public void excluir(ArrayList<CadastroMoto> dados) {
		listar(dados);
		int i = 0;
		System.out.println("Digite a posição do registro para deletar");
		i = Integer.parseInt(input.nextLine());
		dados.remove(i);
	}

	public void pesquisarNome(ArrayList<CadastroMoto> dados) {
		boolean flag = true;
		CadastroMoto moto = new CadastroMoto();
		System.out.println("Digite o nome que deseja pesquisar: ");
		moto.setNome(input.nextLine());

		for (int i = 0; i < dados.size(); i++) {
			if (dados.get(i).getNome().equals(moto.getNome()) == true) {
				System.out.println("Nome: " + dados.get(i).getNome());
				System.out.println("Marca: " + dados.get(i).getMarca());
				System.out.println("Ano: " + dados.get(i).getAno());
				System.out.println("Cor: " + dados.get(i).getCor());
			}
		}

		if (flag == false) {
			System.out.println("Sua pesquisa!");
		}
	}
	public void pesquisarCor(ArrayList<CadastroMoto> dados) {
		boolean flag = true;
		CadastroMoto moto = new CadastroMoto();
		System.out.println("Digite a cor que deseja pesquisar ?");
		moto.setCor(input.nextLine());
		
		for (int i = 0; i < dados.size(); i++) {
			if (dados.get(i).getCor().equals(moto.getCor()) == true) {
				System.out.println("Cor: " + dados.get(i).getCor());
				System.out.println("Nome: " + dados.get(i).getNome());
				System.out.println("Marca: " + dados.get(i).getMarca());
				System.out.println("Ano: " + dados.get(i).getAno());
			}
			if (flag == false) {
				System.out.println("Sua pesquisa!");
			}
		}
	}
}


