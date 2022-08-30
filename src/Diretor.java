
public class Diretor extends FuncionariosEscola implements AutenticavelEscola {
	
	private PermitindoAcessoSistema permitindoAcesso;
	
	public Diretor() {
		this.permitindoAcesso = new PermitindoAcessoSistema();
	}
	
	@Override
	public void setName(String name) {
		super.setName(name);
	}
	@Override
	public void setCpf(String cpf) {
		super.setCpf(cpf);
	}
	@Override
	public void setProfissao(String profissao) {
		super.setProfissao(profissao);
	}
	@Override
	public void setSalario(double salario) {
		super.setSalario(salario);
	}
	@Override
	public void setSenha(int senha) {
		this.permitindoAcesso.setSenha(2222);
	}
	@Override
	public boolean acessoSistema(int senha) {
		return this.permitindoAcesso.acessoSistema(senha);
	}
}