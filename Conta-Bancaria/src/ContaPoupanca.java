
public class ContaPoupanca extends Conta{
	private int agencia;
	private int numero;
	private static int SEQUENCIA = 200;
	public ContaPoupanca(Cliente cliente, double saldo) {
		super(cliente, saldo);
		super.numero = SEQUENCIA++;
	}
	@Override
	public double exibirSaldo() {
		System.out.println("---Saldo conta poupança--");
		return super.exibirSaldo();
	}
}
