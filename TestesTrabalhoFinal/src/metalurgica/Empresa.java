package metalurgica;

public class Empresa {
	private float gastos;
	private long cnpj;

	private float gstJan;
	private float gstFev;
	private float gstMar;
	private float gstAbr;
	private float gstMai;
	private float gstJun;
	private float gstJul;
	private float gstSet;
	private float gstAgo;
	private float gstOut;
	private float gstNov;
	private float gstDez;

	
	
	Teclado t = new Teclado();
	
	public float cadastrarGastos() {
		long mes = t.keyboardLng("Digite o número do mês");
			if (mes == 1) {
				float gstJanMet = t.keyboardFlt("Informe os gastos de janeiro");
				this.gstJan = gstJan + gstJanMet;
				this.gastos = gastos + gstJan; 
				return gstJan;
			}else if (mes == 2){
				float gstFev = t.keyboardFlt("Informe os gastos de janeiro");
				this.gastos = gastos + gstFev;
				return gstFev;
			}else if (mes == 3){
				float gstMar = t.keyboardFlt("Informe os gastos de janeiro");
				this.gastos = gastos + gstMar;
				return gastos;
			}else if (mes == 4){
				float gstAbr = t.keyboardFlt("Informe os gastos de janeiro");
				this.gastos = gastos + gstAbr;
				return gastos;
			}else if (mes == 5){
				float gstMai = t.keyboardFlt("Informe os gastos de janeiro");
				this.gastos = gastos + gstMai;
				return gastos;
			}else if (mes == 6){
				float gstJun = t.keyboardFlt("Informe os gastos de janeiro");
				this.gastos = gastos + gstJun;
				return gastos;
			}else if (mes == 7){
				float gstJul = t.keyboardFlt("Informe os gastos de janeiro");
				this.gastos = gastos + gstJul;
				return gastos;
			}else if (mes == 8){
				float gstSet = t.keyboardFlt("Informe os gastos de janeiro");
				this.gastos = gastos + gstSet;
				return gastos;
			}else if (mes == 9){
				float gstAgo = t.keyboardFlt("Informe os gastos de janeiro");
				this.gastos = gastos + gstAgo;
				return gastos;
			}else if (mes == 10){
				float gstOut = t.keyboardFlt("Informe os gastos de janeiro");
				this.gastos = gastos + gstOut;
				return gastos;
			}else if (mes == 11){
				float gstNov = t.keyboardFlt("Informe os gastos de janeiro");
				this.gastos = gastos + gstNov;
				return gastos;
			}else if (mes == 12){
				float gstDez = t.keyboardFlt("Informe os gastos de janeiro");
				this.gastos = gastos + gstDez;
				return gastos;
			}
		return gastos;
		}
	public float mostrarGastos(){
		long act1 = t.keyboardLng("Informe o número do mês que deseja ver os gastos:");
		if(act1 == 1){
			System.out.println("Foram gastos "+this.gastos+"R$ em janeiro");
			return this.gstJan;
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