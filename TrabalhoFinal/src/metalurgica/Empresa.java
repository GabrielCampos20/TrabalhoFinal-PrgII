package metalurgica;

public class Empresa {
	private float gastos;
	private long cnpj;
	
	Empresa(){
		Estoque es = new Estoque();
	}
	
	Teclado t = new Teclado();
	
	public float cadastrarGastos() {
		long mes = t.keyboardLng("Digite o numero do mes");
			if (mes == 1) {
				float gstJan = t.keyboardFlt("Informe os gastos de janeiro");
				return gstJan;
			}else if (mes == 2){
					float gstJan = t.keyboardFlt("Informe os gastos de janeiro");
					return gstJan;
			}else if (mes == 3){
				float gstJan = t.keyboardFlt("Informe os gastos de janeiro");
				return gstJan;
			}else if (mes == 4){
				float gstJan = t.keyboardFlt("Informe os gastos de janeiro");
				return gstJan;
			}else if (mes == 5){
				float gstJan = t.keyboardFlt("Informe os gastos de janeiro");
				return gstJan;
			}else if (mes == 6){
				float gstJan = t.keyboardFlt("Informe os gastos de janeiro");
				return gstJan;
			}else if (mes == 7){
				float gstJan = t.keyboardFlt("Informe os gastos de janeiro");
				return gstJan;
			}else if (mes == 8){
				float gstJan = t.keyboardFlt("Informe os gastos de janeiro");
				return gstJan;
			}else if (mes == 9){
				float gstJan = t.keyboardFlt("Informe os gastos de janeiro");
				return gstJan;
			}else if (mes == 10){
				float gstJan = t.keyboardFlt("Informe os gastos de janeiro");
				return gstJan;
			}else if (mes == 11){
				float gstJan = t.keyboardFlt("Informe os gastos de janeiro");
				return gstJan;
			}else if (mes == 12){
				float gstJan = t.keyboardFlt("Informe os gastos de janeiro");
				return gstJan;
			}
			return gastos;
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