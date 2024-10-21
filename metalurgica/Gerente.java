package metalurgica;

import java.time.LocalDate;
import java.util.ArrayList;

public class Gerente extends Funcionario {
    public Gerente(String nome, String cpf, String id) {
        super(nome, cpf, id);
        // TODO Auto-generated constructor stub
    }

    Util functions = new Util();
    ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public String cadastrarFuncionario() {
        String nome = functions.keyboardString("NOME DO NOVO FUNCIONÁRIO:");
        String cpf = functions.keyboardString("CPF DO NOVO FUNCIONÁRIO:");
        String id = gerarID(cpf, nome);

        Funcionario novoFuncionario = new Funcionario(nome, cpf, id);
        funcionarios.add(novoFuncionario);

        return id;

    }

    public static String gerarID(String cpf, String nome) {

        LocalDate dataAtual = LocalDate.now();
        String anoAdmissao = String.valueOf(dataAtual.getYear());
        String mesAdmissao = String.format("%02d", dataAtual.getMonthValue());

        // Extrai os últimos 5 dígitos do CPF
        String ultimos5CPF = cpf.substring(cpf.length() - 5);

        // Combina ano, mês e os últimos 5 dígitos do CPF para formar o ID
        String id = anoAdmissao + mesAdmissao + ultimos5CPF;

        return id;
    }

    public void buscarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            for (Funcionario funcionario : funcionarios) {
                System.out.println("Nome: " + funcionario.getNome() + ", CPF: " + funcionario.getCpf() + ", ID: "
                        + funcionario.getId());
            }
        }
    }

}
