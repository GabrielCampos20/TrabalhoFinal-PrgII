package metalurgica;

public class Cliente {

	private String nome;
	private long cpf;
	private int regSis;
	
	Cliente(){
		Teclado t = new Teclado();
		nome = t.keyboardStr("Qual o seu nome?");
		cpf = t.keyboardLng("E qual o seu CPF?");
	}
	
	public boolean mostrarDados() {
		System.out.println(nome);
		System.out.println(cpf);
		return true;
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getRegSis() {
		return regSis;
	}

	public void setRegSis(int regSis) {
		this.regSis = regSis;
	}
	
	
}
