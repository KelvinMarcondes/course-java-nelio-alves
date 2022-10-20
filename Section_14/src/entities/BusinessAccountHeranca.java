package entities;

public class BusinessAccountHeranca extends AccountHeranca{
	private Double limiteEmprestimo;
	
	public BusinessAccountHeranca(){
		super();
	}

	public BusinessAccountHeranca(Integer numero, String proprietario, Double saldo, Double limiteEmprestimo) {
		super(numero, proprietario, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	
	public void emprestimo(double valor) {
		if (valor <= limiteEmprestimo) {
		saldo += valor - 10.0;
		}
	}
}
