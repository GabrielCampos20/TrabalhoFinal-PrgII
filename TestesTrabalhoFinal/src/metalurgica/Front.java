package metalurgica;

public class Front {
	public static void main(String[] args) {

		do{

			Empresa e = new Empresa();
			Estoque es = new Estoque();
			Teclado t = new Teclado();

			System.out.println("1 - Acessar Estoque.");
			System.out.println("2 - Gerenciar Gastos.");
			long opc1 = t.keyboardLng("O que deseja fazer?");
			if (opc1 == 1) {
				System.out.println("1 - Adicionar ou remover itens.");
				System.out.println("2 - Verificar itens no estoque.");
				long opc2 = t.keyboardLng("O que deseja fazer?");
				if (opc2 == 1) {
					es.quantidade();
				}else if (opc2 == 2){
					System.out.println(es.verificarEstoque());
				}
			} else if (opc1 == 2) {
				System.out.println("1 - Cadastrar Gastos");
				System.out.println("2 - Verificar Gastos");
				long opc2 = t.keyboardLng("O que deseja fazer?");
				if (opc2 == 1) {
					e.cadastrarGastos();
				} else if (opc2 == 2) {
					
				}

			}
		}while(1>0);
	}
}
