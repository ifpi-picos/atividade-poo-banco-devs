public class ContaPoupanca extends Conta {

    private double rendimento;

    public ContaPoupanca(int agencia, int numero, double saldo, Cliente nomeCliente) {
        super(agencia, numero, saldo, nomeCliente);
        this.rendimento = 0.1;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;

    }

    public double getRendimento() {
        return rendimento;
    }
    public void deposita(double valor) {
        if (valor > 0) {
            this.saldo = this.saldo + valor;
            this.saldo = this.saldo + (valor * 0.1);
            System.out.println("Deposito realizado com sucesso! Valor do deposito R$:" + valor);
            this.enviaNotificacao("Dep0sito", valor);
        } else {
            System.out.println(
                    "Nao e possivel efetuar esta operacao! So e possivel depositar valores acima deste valor: R$0.0");
        }
    }
    


    @Override
    public boolean saca(double valor) {
        if (valor > 0 && valor <= super.saldo) {
            super.saldo = this.saldo - valor;
            System.out.println("Saque realizado com sucesso! Valor do saque solicitado R$:" + valor);
            super.enviaNotificacao("Saque", valor);
            return true;
        } else {
            System.out.println("Voce nao possui saldo suficente! Valor do saque solicitado: R$" + valor);
            return false;
        }
    }
}
