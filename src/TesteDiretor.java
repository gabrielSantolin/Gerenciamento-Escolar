
public class TesteDiretor {

	public static void main(String[] args) {
		Diretor diretor = new Diretor();
		
		diretor.setName("Gabriel Luiz Santolin");
		diretor.setCpf("095.549.154-33");
		diretor.setProfissao("Diretor");
		diretor.setSalario(4000.0);
		
		System.out.println(diretor.getName());
		System.out.println(diretor.getCpf());
		System.out.println(diretor.getProfissao());
		System.out.println(diretor.getSalario());
		
		boolean autenticou = diretor.acessoSistema(2222);		
		System.out.println(autenticou);
	}
}