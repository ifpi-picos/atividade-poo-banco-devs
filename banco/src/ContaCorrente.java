public class ContaCorrente {
    private String nome;
    private String cpf;
    private String NumAgencia;
    private String NumConta;
    private String saldo;

public ContaCorrente(String nome, String cpf, String NumAgencia, String NumConta, String saldo){
    this.nome = nome;
    this.cpf = cpf;
    this.NumAgencia = NumAgencia;
    this.NumConta = NumConta;
    this.saldo = saldo;
}    
public String getNome( ){
    return nome;
}
public void setNome(String nome){
    this.nome = nome;
}
public String getCpf( ){
    return cpf;
}
public void setCpf(String cpf){
    this.cpf = cpf;
}
public String getNumAgenciaString( ){
    return NumAgencia;
}
public void setNumAgencia( ){
    this.NumAgencia = NumAgencia;
}
public String getNumConta ( ){
    return NumConta;
}
public void setNumConta ( ){
    this.NumConta = NumConta;
}
public String getSaldo ( ){
    return saldo;
}
public void setSaldo ( ){
    this.saldo = saldo;
}





}
