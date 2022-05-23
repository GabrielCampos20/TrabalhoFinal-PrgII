package metalurgica;

public class Gerente extends Empresa {
	private String nome = "Gabriel";
	private long cpf;
	private long cel;
	private String user = "Gabriel";
	private long pass = 1234;
	
	Teclado t = new Teclado();
	//Funcionario f = new Funcionario();
	
	public boolean gerenciarFuncionario() {
		System.out.println("1 - Cadastrar funcionário.");
		System.out.println("2 - Atualizar cadastro de funcionário");
		long act = t.keyboardLng("O que deseja fazer?");
		if (act == 1) {
			String name = t.keyboardStr("Qual o nome do funcionário?");
			long cpf = t.keyboardLng("Qual o CPF do funcionário?");
			Funcionario f = new Funcionario();
			f.setNome(name);
			f.setCpf(cpf);
			f.setCad(+1);
			this.funCad = +1;
			System.out.println("O funcionário foi cadastrado com sucesso!");
			return true;
		} else if (act == 2) {
			if (funCad == 1) {
				String name = t.keyboardStr("Informe o novo nome do funcionário");
				long cpf = t.keyboardLng("Informe o novo CPF do funcionário");
				//f.setNome(name);
				//f.setCpf(cpf);
				return true;
			}else{
				System.out.println("Ainda não existem funcionários cadastrados no sistema.");
				return false;
			}
		} else {
			return false;
		}
	}
	
	
	
	protected boolean login() {
		String usr = t.keyboardStr("Qual o seu nome de usuário?");
		long pss = t.keyboardLng("Qual a sua senha?");
		if (usr.equals(user) && pss == pass) {
			System.out.println("Login efeituado com sucesso.");
			return true;
		} else {
			return false;
		}
	}
	
	public void mostrarDados() {
		System.out.println(this.nome);
		System.out.println(this.cpf);
		System.out.println(this.cel);
		
	}
	
	public boolean alterarDados() {
		System.out.println("1 - Usuário");
		System.out.println("2 - Senha");
		long opc = t.keyboardLng("O que deseja alterar?");
		if (opc == 1) {
			String nUser = t.keyboardStr("Informe seu novo usuário\n*utilize apenas letras");
			if (nUser != user) {
				this.user = nUser;
				System.out.println("Usuário foi atualizado.");
				return true;
			} else {
				System.out.println("O novo usuário não pode ser igual ao antigo.");
				return false;
			}
		} else if (opc == 2) {
			long nPass = t.keyboardLng("Informe sua nova senha\n*utilize apenas números");
			if (nPass != pass) {
				this.pass = nPass;
				System.out.println("Senha foi atualizada.");
				return true;
			} else {
				System.out.println("A nova senha não pode ser igual a antiga senha.");
				return false;
			}
		} else {
			return false;
		}
		
	}
	
	public void mostrarFuncionario() {
		System.out.print("O nome do funcinário é: ");
		//f.getNome();
		System.out.println("O CPF do funcionário é: ");
		//f.getCpf();
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
	
	public long getCel() {
		return cel;
	}
	
	public void setCel(long cel) {
		this.cel = cel;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public long getPass() {
		return pass;
	}
	
	public void setPass(long pass) {
		this.pass = pass;
	}
	
	public Teclado getT() {
		return t;
	}
	
	public void setT(Teclado t) {
		this.t = t;
	}
	
	//public Funcionario getF() {
	//return f;
	//}
	
	//public void setF(Funcionario f) {
	//this.f = f;
	//}
}