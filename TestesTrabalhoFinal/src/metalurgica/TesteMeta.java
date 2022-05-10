package metalurgica;

public class TesteMeta {
	public static void main(String[] args) {
		
		Empresa e = new Empresa();
		Teclado t = new Teclado();
		Estoque es = new Estoque();

		es.quantidade();
		System.out.println(es.verificarEstoque());
		
	}
}