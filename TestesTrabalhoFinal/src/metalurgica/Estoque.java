package metalurgica;

public class Estoque {
	private long metalon30x50;
	private long metalon30x40;
	private long metalon20x40;
	private long perfilRigecido;
	private long chapaLambril;
	private long roldanas;
	private long dobradicas;
	private long eletrodos;
	private long tinta;
	private long discoDeCorte;
	private long fechaduras;

	
	Teclado t = new Teclado();
	
	public long quantidade() {
		System.out.println("1 - Adicionar itens");
		System.out.println("2 - Remover Itens");
		long act1 = t.keyboardLng("O que deseja fazer?");
		if (act1 == 1){
			System.out.println("1 - Metalon 30x50\n2 - Metalon 30x40\n3 - Metalon 30x40");
			System.out.println("4 - Perfil Rigecido\n5 - Chapa Lambril\n6 - Roldanas");
			System.out.println("7 - Dobradiças\n8 - Eletrodos\n9 - Tinta");
			System.out.println("10 - Disco de Corte\n11 - Fechaduras");
			long act2 = t.keyboardLng("Qual item deseja adicionar ao estoque?");
			if (act2 == 1) {
				long act3 = t.keyboardLng("Quantos Metalon 30x50 deseja adicionar ao estoque?");
				System.out.println("Certo, foram adicionados "+act3+ " Metalon 30x50 ao estoque.");
				this.metalon30x50 = act3 + metalon30x50;
				return metalon30x50;
			}else if (act2 == 2){
				long act3 = t.keyboardLng("Quantos Metalon 30x40 deseja adicionar ao estoque?");
				System.out.println("Certo, foram adicionados "+act3+ " Metalon 30x40 ao estoque.");
				this.metalon30x40 = act3 + metalon30x40;
				return metalon30x40;
			}else if (act2 == 3){
				long act3 = t.keyboardLng("Quantos Metalon 20x40 deseja adicionar ao estoque?");
				System.out.println("Certo, foram adicionados "+act3+ " Metalon 20x40 ao estoque.");
				this.metalon20x40 = act3 + metalon20x40;
				return metalon20x40;
			}else if (act2 == 4){
				long act3 = t.keyboardLng("Quantos Perfil Rigecido deseja adicionar ao estoque?");
				System.out.println("Certo, foram adicionados "+act3+ " Perfil Rigecido ao estoque.");
				this.perfilRigecido = act3 + perfilRigecido;
				return perfilRigecido;
			}else if (act2 == 5){
				long act3 = t.keyboardLng("Quantos Chapa Lambril deseja adicionar ao estoque?");
				System.out.println("Certo, foram adicionados "+act3+ " Chapa Lambril ao estoque.");
				this.chapaLambril = act3 + chapaLambril;
				return chapaLambril;
			}else if (act2 == 6){
				long act3 = t.keyboardLng("Quantos Roldanas deseja adicionar ao estoque?");
				System.out.println("Certo, foram adicionados "+act3+ " Roldanas ao estoque.");
				this.roldanas = act3 + roldanas;
				return roldanas;
			}else if (act2 == 7){
				long act3 = t.keyboardLng("Quantos Dobradiças deseja adicionar ao estoque?");
				System.out.println("Certo, foram adicionados "+act3+ " Dobradiças ao estoque.");
				this.dobradicas = act3 + dobradicas;
				return dobradicas;
			}else if (act2 == 8){
				long act3 = t.keyboardLng("Quantos eletrodos deseja adicionar ao estoque?");
				System.out.println("Certo, foram adicionados "+act3+ " eletrodos ao estoque.");
				this.eletrodos = act3 + eletrodos;
				return eletrodos;
			}else if (act2 == 9){
				long act3 = t.keyboardLng("Quantas latas de tinta deseja adicionar ao estoque?");
				System.out.println("Certo, foram adicionadas "+act3+ " latas de tinta ao estoque.");
				this.tinta = act3 + tinta;
				return tinta;
			}else if (act2 == 10){
				long act3 = t.keyboardLng("Quantos discos de corte deseja adicionar ao estoque?");
				System.out.println("Certo, foram adicionados "+act3+ " discos de corte ao estoque.");
				this.discoDeCorte = act3 + discoDeCorte;
				return discoDeCorte;
			}else if (act2 == 11){
				long act3 = t.keyboardLng("Quantas fechaduras deseja adicionar ao estoque?");
				System.out.println("Certo, foram adicionados "+act3+ " fechaduras ao estoque.");
				this.fechaduras = act3 + fechaduras;
				return fechaduras;
			}

		}else if(act1 == 2){

		}
	return metalon30x50;
	}
	
	public long verificarEstoque() {
		System.out.println("1 - Metalon");
		long act1 = t.keyboardLng("Qual item deseja verificar?");
		if (act1 == 1){
			return metalon30x50;
		}
	return metalon20x40;
	}
}