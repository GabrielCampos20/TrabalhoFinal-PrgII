package metalurgica;

public class Estoque {
	protected long metalon30x50;
	protected long metalon30x40;
	protected long metalon20x40;
	protected long perfilRigecido;
	protected long chapaLambril;
	protected long roldanas;
	protected long dobradicas;
	protected long eletrodos;
	protected long tinta;
	protected long discoDeCorte;
	protected long fechaduras;

	long[] materiais = {metalon30x50, metalon30x40, metalon20x40, perfilRigecido, chapaLambril, roldanas, dobradicas, eletrodos, tinta, discoDeCorte, fechaduras};

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
		System.out.println("1 - Metalon30x50");
		System.out.println("2 - Metalon30x40");
		System.out.println("3 - Metalon20x40");
		System.out.println("4 - Perfil Rigecido");
		System.out.println("5 - Chapa Lambril");
		System.out.println("6 - Roldanas");
		System.out.println("7 - Dobradicas");
		System.out.println("8 - Eletrodos");
		System.out.println("9 - Tinta");
		System.out.println("10 - Disco De Corte");
		System.out.println("11 - Fechaduras");
		long act1 = t.keyboardLng("Qual item deseja verificar?");
		if (act1 == 1){
			System.out.println("Existem "+this.metalon30x50+" metalon 30x50 no estoque.");
			return metalon30x50;
		}else if(act1 == 2){
			System.out.println("Existem "+this.metalon30x40+" metalon 30x40 no estoque.");
			return metalon30x40;
		}else if(act1 == 3){
			System.out.println("Existem "+this.metalon20x40+" metalon 20x40 no estoque.");
			return metalon20x40;
		}else if(act1 == 4){
			System.out.println("Existem "+this.perfilRigecido+" perfil rigecido no estoque.");
			return perfilRigecido;
		}else if(act1 == 5){
			System.out.println("Existem "+this.chapaLambril+" chapa lambril no estoque.");
			return chapaLambril;
		}else if(act1 == 6){
			System.out.println("Existem "+this.roldanas+" roldanas no estoque.");
			return roldanas;
		}else if(act1 == 7){
			System.out.println("Existem "+this.dobradicas+" dobradiças no estoque.");
			return dobradicas;
		}else if(act1 == 8){
			System.out.println("Existem "+this.eletrodos+" eletrodos no estoque.");
			return eletrodos;
		}else if(act1 == 9){
			System.out.println("Existem "+this.tinta+" latas de tinta no estoque.");
			return tinta;
		}else if(act1 == 10){
			System.out.println("Existem "+this.discoDeCorte+" discos de corte no estoque.");
			return discoDeCorte;
		}else if(act1 == 11){
			System.out.println("Existem "+this.fechaduras+" fechaduras no estoque.");
			return fechaduras;
		}
	return 0; 
	}

}