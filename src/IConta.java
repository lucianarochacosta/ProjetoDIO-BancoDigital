
public interface IConta {

	void saque(double valor);
	
	void deposito(double valor);
	
	void transferencia(double valor, IConta contaDestino);
	
	void extrato();
}