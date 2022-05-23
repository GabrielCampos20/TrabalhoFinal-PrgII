package metalurgica;

public class Empresa extends Estoque {
	private float gastos;
	private long cnpj;
	protected long funCad;

	protected Float gstJan;
	protected Float gstFev;
	protected Float gstMar;
	protected Float gstAbr;
	protected Float gstMai;
	protected Float gstJun;
	protected Float gstJul;
	protected Float gstAgo;
	protected Float gstSet;
	protected Float gstOut;
	protected Float gstNov;
	protected Float gstDez;

	protected long pedidos;

	public  Empresa(){
		this.pedidos = 0;
	}

	Teclado t = new Teclado();

	public Float cadastrarGastos() {
		long mes = t.keyboardLng("Digite o numero do mes");
		if (mes == 1) {
			Float gstJan = t.keyboardFlt("Informe os gastos de janeiro;");
			if (gstJan >= 1) {
				this.gstJan = gstJan + this.gstJan;
				this.gastos = this.gstJan + this.gastos;
				System.out.println("O valor foi cadastrado com sucesso!");
				return gstJan;
			} else {
				System.out.println("Valor inválido.");
			}
		} else if (mes == 2) {
			float gstFev = t.keyboardFlt("Informe os gastos de fevereiro;");
			if (gstFev >= 1) {
				this.gstFev = gstFev + this.gstFev;
				this.gastos = this.gstFev + this.gastos;
				System.out.println("O valor foi cadastrado com sucesso!");
				return gstFev;
			} else {
				System.out.println("Valor inválido.");
			}
		} else if (mes == 3) {
			float gstMar = t.keyboardFlt("Informe os gastos de março;");
			if (gstMar >= 1) {
				this.gstMar = gstMar + this.gstMar;
				this.gastos = this.gstMar + this.gastos;
				System.out.println("O valor foi cadastrado com sucesso!");
				return gstMar;
			} else {
				System.out.println("Valor inválido.");
			}
		} else if (mes == 4) {
			float gstAbr = t.keyboardFlt("Informe os gastos de abril;");
			if (gstAbr >= 1) {
				this.gstAbr = gstAbr + this.gstAbr;
				this.gastos = this.gstAbr + this.gastos;
				System.out.println("O valor foi cadastrado com sucesso!");
				return gstAbr;
			} else {
				System.out.println("Valor inválido.");
			}
		} else if (mes == 5) {
			float gstMai = t.keyboardFlt("Informe os gastos de maio;");
			if (gstMai >= 1) {
				this.gstMai = gstMai + this.gstMai;
				this.gastos = this.gstMai + this.gastos;
				System.out.println("O valor foi cadastrado com sucesso!");
				return gstMai;
			} else {
				System.out.println("Valor inválido.");
			}
		} else if (mes == 6) {
			float gstJun = t.keyboardFlt("Informe os gastos de junho;");
			if (gstJun >= 1) {
				this.gstJun = gstJun + this.gstJun;
				this.gastos = this.gstJun + this.gastos;
				System.out.println("O valor foi cadastrado com sucesso!");
				return gstJun;
			} else {
				System.out.println("Valor inválido.");
			}
		} else if (mes == 7) {
			float gstJul = t.keyboardFlt("Informe os gastos de julho;");
			if (gstJul >= 1) {
				this.gstJul = gstJul + this.gstJul;
				this.gastos = this.gstJul + this.gastos;
				System.out.println("O valor foi cadastrado com sucesso!");
				return gstJul;
			} else {
				System.out.println("Valor inválido.");
			}
		} else if (mes == 8) {
			float gstAgo = t.keyboardFlt("Informe os gastos de setembro;");
			if (gstAgo >= 1) {
				this.gstAgo = gstAgo + this.gstAgo;
				this.gastos = this.gstAgo + this.gastos;
				System.out.println("O valor foi cadastrado com sucesso!");
				return gstAgo;
			} else {
				System.out.println("Valor inválido.");
			}
		} else if (mes == 9) {
			float gstSet = t.keyboardFlt("Informe os gastos de agosto;");
			if (gstSet >= 1) {
				this.gstSet = gstSet + this.gstSet;
				this.gastos = this.gstSet + this.gastos;
				System.out.println("O valor foi cadastrado com sucesso!");
				return gstSet;
			} else {
				System.out.println("Valor inválido.");
			}
		} else if (mes == 10) {
			float gstOut = t.keyboardFlt("Informe os gastos de outubro;");
			if (gstOut >= 1) {
				this.gstOut = gstOut + this.gstOut;
				this.gastos = this.gstOut + this.gastos;
				System.out.println("O valor foi cadastrado com sucesso!");
				return gstOut;
			} else {
				System.out.println("Valor inválido.");
			}
		} else if (mes == 11) {
			float gstNov = t.keyboardFlt("Informe os gastos de novembro;");
			if (gstNov >= 1) {
				this.gstNov = gstNov + this.gstNov;
				this.gastos = this.gstNov + this.gastos;
				System.out.println("O valor foi cadastrado com sucesso!");
				return gstNov;
			} else {
				System.out.println("Valor inválido.");
			}
		} else if (mes == 12) {
			float gstDez = t.keyboardFlt("Informe os gastos de dezembro;");
			if (gstDez >= 1) {
				this.gstDez = gstDez + this.gstDez;
				this.gastos = this.gstDez + this.gastos;
				System.out.println("O valor foi cadastrado com sucesso!");
				return gstDez;
			} else {
				System.out.println("Valor inválido.");
			}
		}
	return gastos;
	}

	public float verificarGastos(){
		long mes = t.keyboardLng("Informe o número do mês que deseja verificar os gastos");
		if (mes == 1){
			System.out.println("Foram gastos "+this.gstJan+"R$ em janeiro.");
			return gstJan;
		}else if (mes == 2){
			System.out.println("Foram gastos "+this.gstFev+"R$ em favereiro.");
			return gstFev;
		}else if (mes == 3){
			System.out.println("Foram gastos "+this.gstMar+"R$ em março.");
			return gstMar;
		}else if (mes == 4){
			System.out.println("Foram gastos "+this.gstAbr+"R$ em abril.");
			return gstAbr;
		}else if (mes == 5){
			System.out.println("Foram gastos "+this.gstMai+"R$ em maio.");
			return gstMai;
		}else if (mes == 6){
			System.out.println("Foram gastos "+this.gstJun+"R$ em jungo.");
			return gstJun;
		}else if (mes == 7){
			System.out.println("Foram gastos "+this.gstJul+"R$ em julho.");
			return gstJul;
		}else if (mes == 8){
			System.out.println("Foram gastos "+this.gstSet+"R$ em setembro.");
			return gstSet;
		}else if (mes == 9){
			System.out.println("Foram gastos "+this.gstAgo+"R$ em agosto.");
			return gstAgo;
		}else if (mes == 10){
			System.out.println("Foram gastos "+this.gstOut+"R$ em outubro.");
			return gstOut;
		}else if (mes == 11){
			System.out.println("Foram gastos "+this.gstNov+"R$ em novembro.");
			return gstNov;
		}else if (mes == 12){
			System.out.println("Foram gastos "+this.gstDez+"R$ em dezembro.");
			return gstDez;
		}else{
			return this.gastos;
		}
	}


	public float corrigirGastos(){
		long mes = t.keyboardLng("Informe o número do mês que deseja alterar os gastos");
		if (mes == 1){
			float nGstJan = t.keyboardFlt("Informe o valor corrigido dos gastos de janeiro.");
			this.gstJan = nGstJan;
			return nGstJan;
		}else if (mes == 2){
			float nGstFev = t.keyboardFlt("Informe o valor corrigido dos gastos de fevereiro.");
			this.gstFev = nGstFev;
			return nGstFev;
		}else if (mes == 3){
			float nGstMar = t.keyboardFlt("Informe o valor corrigido dos gastos de março.");
			this.gstMar = nGstMar;
			return nGstMar;
		}else if (mes == 4){
			float nGstAbr = t.keyboardFlt("Informe o valor corrigido dos gastos de abril.");
			this.gstAbr = nGstAbr;
			return nGstAbr;
		}else if (mes == 5){
			float nGstMai = t.keyboardFlt("Informe o valor corrigido dos gastos de maio.");
			this.gstMai = nGstMai;
			return nGstMai;
		}else if (mes == 6){
			float nGstJun = t.keyboardFlt("Informe o valor corrigido dos gastos de junho.");
			this.gstJun = nGstJun;
			return nGstJun;
		}else if (mes == 7){
			float nGstJul = t.keyboardFlt("Informe o valor corrigido dos gastos de julho.");
			this.gstJul = nGstJul;
			return nGstJul;
		}else if (mes == 8){
			float nGstSet = t.keyboardFlt("Informe o valor corrigido dos gastos de setembro.");
			this.gstSet = nGstSet;
			return nGstSet;
		}else if (mes == 9){
			float nGstAgo = t.keyboardFlt("Informe o valor corrigido dos gastos de agosto.");
			this.gstAgo = nGstAgo;
			return nGstAgo;
		}else if (mes == 10){
			float nGstOut = t.keyboardFlt("Informe o valor corrigido dos gastos de outubro.");
			this.gstOut = nGstOut;
			return nGstOut;
		}else if (mes == 11){
			float nGstNov = t.keyboardFlt("Informe o valor corrigido dos gastos de novembro.");
			this.gstNov = nGstNov;
			return nGstNov;
		}else if (mes == 12){
			float nGstDez = t.keyboardFlt("Informe o valor corrigido dos gastos de dezembro.");
			this.gstDez = nGstDez;
			return nGstDez;
		}else{
			return this.gastos;
		}
	}




	public void registrarPedido() throws InterruptedException {
		System.out.println("1 - Portão completo");
		System.out.println("2 - Grade para janela");
		System.out.println("3 - Grade para sacada");
		long act1 = t.keyboardLng("Qual item será fabricado?");
		if (act1 == 1) {
			System.out.println("Certo, irei verificar a disponibilidade de itens no estoque.");
			if (metalon30x50 == 3 && discoDeCorte == 2 && roldanas == 2){
				new Thread();
				Thread.sleep(1000);
				System.out.println("Todos os itens estão disponíveis, pedido adicionado na lista.");
				this.pedidos =+ 1;
			}else{
				System.out.println("Materiaís em falta, verifique o estoque.");
			}
		} else if (act1 == 2) {
			System.out.println("Certo, irei verificar a disponibilidade de itens no estoque.");
			if (metalon30x40 == 3 && discoDeCorte == 2 && eletrodos == 2){
				new Thread();
				Thread.sleep(1000);
				System.out.println("Todos os itens estão disponíveis, pedido adicionado na lista.");
				this.pedidos =+ 1;
			}else{
				System.out.println("Materiaís em falta, verifique o estoque.");
			}
		} else if (act1 == 3) {
			System.out.println("Certo, irei verificar a disponibilidade de itens no estoque.");
			if (metalon20x40 == 3 && tinta == 1 && eletrodos == 3){
				new Thread();
				Thread.sleep(1000);
				System.out.println("Todos os itens estão disponíveis, pedido adicionado na lista.");
				this.pedidos =+ 1;
			}else{
				System.out.println("Materiaís em falta, verifique o estoque.");
			}
		}

	}

	public float getGastos() {
		return gastos;
	}

	public void setGastos(float gastos) {
		this.gastos = gastos;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
}