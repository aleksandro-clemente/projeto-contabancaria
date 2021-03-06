import javax.swing.JOptionPane;

public abstract class Conta implements InterConta{
	private final int SEQUENCIA = 1;
	private double saldo;
	private Cliente cliente;
	protected int agencia;
	protected int numero;
	public Conta(Cliente cliente,double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
		this.agencia = SEQUENCIA;
		
	}
	public void saque(double valor) {
		if(saldo >=valor) {
			this.saldo-=valor;
			System.out.println("Saque realizado com sucesso");
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
	public void deposito(double valor) {
		this.saldo+=valor;
	}
	public void transferencia(double valor,Conta contaDestino) {
		if(valor <= this.saldo) {
			this.saque(valor);
			contaDestino.deposito(valor);
			System.out.println("Transferência realizada com sucesso");
		}else {
			System.out.println("Saldo insuficiente");
		}

	}
	
	public static Conta criarConta(String nomeCliente,TipoDaConta tipo) {
		Cliente cliente = new Cliente(nomeCliente);
		Conta conta = null;
		if(tipo.equals(TipoDaConta.POUPANCA)) {
			 conta = new ContaPoupanca(cliente,0.0);
		}else if(tipo.equals(TipoDaConta.CORRENTE)){
			 conta = new ContaCorrente(cliente,0.0);
		}
		System.out.println("Titular: "+cliente.getNome());
		System.out.println("Tipo da Conta: "+tipo);
		System.out.println("Conta criada com sucesso!");
		return conta;
	}
	public double exibirSaldo() {
		System.out.println("Titular da Conta: "+cliente.getNome());
		return this.getSaldo();
	}
	public double getSaldo() {
		return saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getAgencia() {
		return agencia;
	}	
	public int getNumero() {
		return numero;
	}
	
}
