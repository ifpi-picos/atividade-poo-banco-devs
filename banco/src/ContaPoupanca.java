public class ContaPoupanca {
    private String nome;
    private String cpf;
    private String numAgencia;
    private String numConta;
    private String saldo;

    public ContaPoupanca(String nome, String cpf, String numAgencia, String numConta, String saldo ) {
        this.nome = nome;
        this.cpf = cpf;
        this.numAgencia = numAgencia;
        this.numConta = numConta;
    }
    public String getNome( ){
        return nome; 
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf ){
        this.cpf = cpf;
    }
    public String getnumAgencia( ){
        return numAgencia;
    }
    public void setnumAgencia (String numAgencia){
        this.numAgencia = numAgencia;
    }
    public String getnumConta(){
        return numConta;
    }
    public void setnumConta (String numConta){
        this.numConta = numConta;
    }
    public String getsaldo( ){
        return saldo;
    }
    public void setsaldo(String saldo){
        this.saldo = saldo;
    }




    
}

