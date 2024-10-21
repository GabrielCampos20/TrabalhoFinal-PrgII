package metalurgica;

public class Funcionario {

    private String nome;
    private String cpf;
    private String id;

    public Funcionario(String nome, String cpf, String id) {
        this.nome = nome;
        this.cpf = cpf;
        this.id = id;
    }

    Util functions = new Util();

    String[] opcoes = { "ADICIONAR MATERIAIS", "REMOVER MATERIAIS" };
    String[] materiais = { "METALON", "ROLDANAS", "DOBRADIÇAS", "ELETRODOS", "TINTA", "FECHADURAS" };
    int[] quantidade = { 0, 0, 0, 0, 0, 0 };

    public int gerenciarMateriais() {
        functions.menu(opcoes.length, opcoes);
        int option = functions.keyboardInt("INFORME A OPÇÃO DESEJADA:");

        switch (option) {
            case 1:
                functions.menu(materiais.length, materiais);
                int adicionar = functions.keyboardInt("INFORME A OPÇÃO DESEJADA:");
                for (int i = 0; i <= materiais.length; i++) {
                    if (i == adicionar - 1) {
                        int qtd = functions.keyboardInt("INFORME A QUANTIDADE:");
                        quantidade[i] = quantidade[i] + qtd;
                        System.out.println("ITEMS ADICIONADOS");
                        return quantidade[i];
                    }
                }
                break;
            case 2:
                functions.menu(materiais.length, materiais);
                int remover = functions.keyboardInt("INFORME A OPÇÃO DESEJADA:");
                for (int i = 0; i <= materiais.length; i++) {
                    if (i == remover - 1) {
                        if (quantidade[i] >= remover) {
                            int qtd = functions.keyboardInt("INFORME A QUANTIDADE:");
                            quantidade[i] = quantidade[i] - qtd;
                            System.out.println("ITEM REMOVIDOS.");
                            System.out.println("RESTANTE: " + quantidade[i]);
                            return quantidade[i];
                        } else {
                            System.out.println("VALOR INVÁLIDO.");
                            System.out.println("RESTANTE: " + quantidade[i]);
                            return quantidade[i];
                        }
                    }
                }
                break;
            default:
                break;
        }
        return 0;
    }

    public int verificarEstoque() {

        functions.menu(materiais.length, materiais);
        int verificar = functions.keyboardInt("INFORME A OPÇÃO DESEJADA:");
        for (int i = 0; i <= materiais.length; i++) {
            if (i == verificar - 1) {
                System.out.println("ITEM:" + materiais[i] + " QUATIDADE:" + quantidade[i]);
                return quantidade[i];
            }
        }
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getId() {
        return id;

    }
}