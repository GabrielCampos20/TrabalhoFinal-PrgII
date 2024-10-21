package metalurgica;

public class Main {
    public static void main(String[] args) {
        
        
        // Util function = new Util();
        // Funcionario funcionario = new Funcionario();
        Gerente gerente = new Gerente("Gabriel", "05088145373", "11111");
        
        System.out.println(gerente.cadastrarFuncionario());
        gerente.buscarFuncionarios();
        
        
        // System.out.println(funcionario.quantidadeMateriais());
    }
}
