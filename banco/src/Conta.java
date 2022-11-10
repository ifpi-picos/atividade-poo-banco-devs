public class Conta {

    private int agencia;
    private int numero;
    protected double saldo;
    private Cliente nomeCliente;

  

  
    public Conta(int agencia, int numero, double saldo, Cliente nomeCliente) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.nomeCliente = nomeCliente;
        
    }

   
    public void deposita(double valor) {
        if (valor > 0) {
            this.saldo = this.saldo + valor;
            
            System.out.println("Deposito realizado com sucesso! Valor do deposito R$:" + valor);
            this.enviaNotificacao("Dep0sito", valor);
        } else {
            System.out.println(
                    "Nao e possivel efetuar esta operacao! So e possivel depositar valores acima deste valor: R$0.0");
        }
    }

  
    public boolean saca(double valor) {
        return false;
    }

   
    public void transfere(double valor, Conta contaDestino) {
        System.out.println("Transferindo valor solicitado...");
        boolean saqueComSucesso = this.saca(valor);
        if (saqueComSucesso) {
            contaDestino.deposita(valor);
            this.saldo = this.saldo - (valor * 0.05);
            this.enviaNotificacao("Transferencia", valor);
        }
    }

    protected void enviaNotificacao(String operacao, double valor) {
        new Notificacao().enviaEmail(operacao, valor);
    }

    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getnomeCliente() {
        return nomeCliente;
    }


}