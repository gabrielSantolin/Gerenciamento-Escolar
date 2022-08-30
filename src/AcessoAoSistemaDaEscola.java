
public class AcessoAoSistemaDaEscola {
	int senha = 2222;
	
	public void acessoSistema(AutenticavelEscola ae) {
		boolean autenticou = ae.acessoSistema(this.senha);
		if(autenticou) {
			System.out.println("Acesso permitido!");
		} else {
			System.out.println("Acesso negado!");
		}
	}
}
