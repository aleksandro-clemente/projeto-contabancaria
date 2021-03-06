
public class Main {
	
	public static void main(String args[]) {
		Cliente cliente = new Cliente("Aleksandro da Silva Clemente");		
		Cliente cliente2 = new Cliente("Joao Pereira silva");
		
		Conta contaCorrente = new ContaCorrente(cliente,1200);
		Conta contaPoupanca = new ContaPoupanca(cliente2,5000);
		
		System.out.println("Valor: R$"+contaCorrente.exibirSaldo());
		System.out.println("Valor: R$"+contaPoupanca.exibirSaldo());
		contaCorrente.saque(1200);
		System.out.println("Valor: R$"+contaCorrente.exibirSaldo());
		
		contaPoupanca.transferencia(2500,contaCorrente);
		System.out.println("Valor: R$"+contaCorrente.exibirSaldo());
		System.out.println("Valor: R$"+contaPoupanca.exibirSaldo());
		
	    contaPoupanca.saque(2501);
	    contaCorrente.saque(2501);
	    System.out.println("Valor: R$"+contaCorrente.exibirSaldo());
		System.out.println("Valor: R$"+contaPoupanca.exibirSaldo());
		contaPoupanca.deposito(3000);
		contaCorrente.deposito(1500);
		System.out.println("Valor: R$"+contaCorrente.exibirSaldo());
		System.out.println("Valor: R$"+contaPoupanca.exibirSaldo());
		
		
		//Criando conta com m?todo
		Conta conta = Conta.criarConta("Marcio de souza",TipoDaConta.CORRENTE);
		conta.deposito(2000);
		System.out.println(conta.exibirSaldo());
		
		Conta conta2 = Conta.criarConta("Teste de Teste",TipoDaConta.POUPANCA);
		System.out.println(conta.exibirSaldo());
		
		conta.transferencia(1000, conta2);
		System.out.println(conta.exibirSaldo());
		System.out.println(conta2.exibirSaldo());
		
		System.out.println(contaCorrente.getNumero());
		System.out.println(contaPoupanca.getNumero());
		System.out.println(conta.getNumero());
		System.out.println(conta2.getNumero());
	}
		
}
