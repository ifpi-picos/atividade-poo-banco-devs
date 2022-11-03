public class Conta{
    private int numAgencia;
    private int numConta;
    private double saldo;
    private Cliente cpf;

    public Conta(int numAgencia, int numConta, double saldo, Cliente cpf){
        this.numAgencia = numAgencia;
        this.numConta = numConta;
        this.saldo = saldo;
        this.cpf = cpf;
    }


    public Cliente getCpf() {
        return cpf;
    }
    public void setCpf(Cliente cpf) {
        this.cpf = cpf;
    }
    public Conta(int i, int j, int k) {
    }
    public int getNumAgencia() {
        return numAgencia;
    }
    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void depositar(Double valor){
		saldo += valor;
	}
    public void verificaSaldo(){
		System.out.println("Valor do Saldo conta1: "+getSaldo());
	}



}
