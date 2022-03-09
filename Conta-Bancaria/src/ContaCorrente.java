
public class ContaCorrente extends Conta{
	private static int SEQUENCIA = 100;
	public ContaCorrente(Cliente cliente, double saldo) {
		super(cliente, saldo);
		super.numero = SEQUENCIA++;
	}
	@Override
	public double exibirSaldo() {
		System.out.println("---Saldo conta Corrente--");
		return super.exibirSaldo();
	}
	
}
