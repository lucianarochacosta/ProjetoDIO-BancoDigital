
public class Main {

	public static void main(String[] args) {
		Cliente luciana = new Cliente();
		luciana.setNome("Luciana Rocha Costa");
		
		Conta cc = new ContaCorrente(luciana);
		Conta poupanca = new ContaPoupanca(luciana);

		cc.deposito(100);
		cc.transferencia(100, poupanca);
		
		cc.extrato();
		poupanca.extrato();
	}

}