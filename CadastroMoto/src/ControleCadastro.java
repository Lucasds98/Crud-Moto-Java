import java.util.ArrayList;

public class ControleCadastro {

	private ViewCadastro viewCadastro;
	private ArrayList<CadastroMoto> dados = new ArrayList<>();

	public ControleCadastro() {
		viewCadastro = new ViewCadastro();
		trataMenu();
	}
	
		private void trataMenu() {
		boolean continuar = true;
		do {
			String opc = viewCadastro.mostraMenu();

			switch (opc) {
			case "1":
				viewCadastro.adicionar(dados);
				break;
			case "2":
				viewCadastro.listar(dados);
				break;
			case "3":
				viewCadastro.alterar(dados);
				break;
			case "4":
				viewCadastro.excluir(dados);
				break;
			case "5":
				viewCadastro.pesquisarNome(dados);
				break;
			case "6":
				viewCadastro.pesquisarCor(dados);
				break;
			case "7":
				System.out.println("Aplicação Encerrada");
				continuar = false;
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		} while (continuar);
	}
}
