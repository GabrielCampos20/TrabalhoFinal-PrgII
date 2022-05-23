package metalurgica;

public class TesteMeta {
	public static void main(String[] args) throws InterruptedException {
		
		Empresa e = new Empresa();
		Teclado t = new Teclado();
		Estoque es = new Estoque();
		Gerente g = new Gerente();
		Funcionario f = new Funcionario();
		
		do {
			
			System.out.println("1 - Acessar como gerente");
			System.out.println("2 - Acessar como funcionário");
			System.out.println("3 - Encerrar o sistema");
			long act1 = t.keyboardLng("O que deseja fazer?");
			if (act1 == 1) {
				if (g.login() == true) {
					
					for (long n = 0; n <= 100000000; n++) {
						System.out.println("Olá " + g.getNome() + "!");
						System.out.println("O que deseja fazer?");
						System.out.println("1 - Gerenciar funcionário");
						System.out.println("2 - Gerenciar gastos");
						System.out.println("3 - Acessar estoque");
						System.out.println("4 - Gerenciar cadastro");
						System.out.println("5 - Encerrar sessão");
						
						long act2 = t.keyboardLng("Informe a opção desejada;");
						if (act2 == 1) {
							System.out.println("1 - Atualizar ou cadastrar funcionário");
							System.out.println("2 - Exibir dados do funcionário");
							long act3 = t.keyboardLng("O que deseja fazer?");
							if (act3 == 1){
								g.gerenciarFuncionario();
							}else if (act3 == 2){
								g.mostrarFuncionario();
							}
						} else if (act2 == 2) {
							System.out.println("1 - Cadastrar gastos");
							System.out.println("2 - Verificar gastos");
							System.out.println("3 - Corrigir gastos cadastrados");
							long act3 = t.keyboardLng("O que deseja fazer?");
							if (act3 == 1){
								e.cadastrarGastos();
							}else if (act3 == 2){
								e.verificarGastos();
							}else if (act3 == 3){
								e.corrigirGastos();
							}
						} else if (act2 == 3) {
							System.out.println("Certo, o que deseja fazer no estoque?");
							System.out.println("1 - Adicionar ou remover itens");
							System.out.println("2 - Verificar itens");
							long act3 = t.keyboardLng("Informe a opção desejada;");
							if (act3 == 1) {
								es.quantidade();
							} else if (act3 == 2) {
								System.out.println(es.verificarEstoque());
							}
						} else if (act2 == 4) {
							System.out.println("1 - Verificar dados cadastrados");
							System.out.println("2 - Alterar dados de login");
							long act3 = t.keyboardLng("O que deseja fazer?");
							if (act3 == 1){
								g.mostrarDados();
							}else if (act3 == 2){
								g.alterarDados();
							}
						} else if (act2 == 5) {
							break;
						}
					}
				} else {
					System.out.println("Credênciais inválidas.");
				}
			} else if (act1 == 2) {
				if (e.funCad == 0) {
					System.out.println("Não Existem funcionários cadastrados na empresa atualmente.");
				} else if (e.funCad >= 1) {
					if (f.login() == true){
						for (long n = 0; n <= 100000000; n++){
							System.out.println("Olá "+f.getNome()+" !");
							System.out.println("O que deseja fazer?");
							System.out.println("1 - Acessar Estoque");
							System.out.println("2 - Registrar pedido");
							long act2 = t.keyboardLng("Informe a opção desejada");
							if (act2 == 1){
								System.out.println("Certo, o que deseja fazer no estoque?");
								System.out.println("1 - Adicionar ou remover itens");
								System.out.println("2 - Verificar itens");
								long act3 = t.keyboardLng("Informe a opção desejada;");
								if (act3 == 1) {
									es.quantidade();
							} else if (act3 == 2) {
								System.out.println(es.verificarEstoque());
							}
							}else if (act2 == 2){
								e.registrarPedido();
							}
						}
					}else{
						System.out.println("Credênciais inválidas.");
					}
				}
			} else if (act1 == 3) {
				System.out.println("Certo, encerrando  o sistema....");
				Thread.sleep(700);
				System.out.println(".");
				Thread.sleep(700);
				System.out.println(".");
				Thread.sleep(700);
				System.out.println(".");
				Thread.sleep(1000);
				System.out.println("All components off.");
				break;
			}
		} while (1 > 0);
	}
}