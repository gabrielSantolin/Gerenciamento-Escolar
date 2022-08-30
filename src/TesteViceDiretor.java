
public class TesteViceDiretor {

	public static void main(String[] args) {
		
		ViceDiretor viceDiretor = new ViceDiretor();
		
		viceDiretor.setName("Bianca de Abreu");
		viceDiretor.setCpf("155.487.874-87");
		viceDiretor.setProfissao("Vice-Diretora");
		viceDiretor.setSalario(4000.0);
		
		System.out.println(viceDiretor.getName());
		System.out.println(viceDiretor.getCpf());
		System.out.println(viceDiretor.getProfissao());
		System.out.println(viceDiretor.getSalario());
	}

}
