package metalurgica;

public class Funcionario extends Gerente{
    private String nome;
    private long cpf;
    private long cad;
    
	@Override
	protected boolean login() {
		String nome = t.keyboardStr("Informe seu nome");
		long cpf = t.keyboardLng("Informe seu CPF");
		if (nome.equals(this.nome) && cpf == this.cpf){
			System.out.println("Login efeituado com sucesso!");
			return true;
		}else{
			return false;
		}
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
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public long getCad() {
		return cad;
	}
	public void setCad(long cad) {
		this.cad = cad;
	}
    
    
    
    
    
    
    
    
}
