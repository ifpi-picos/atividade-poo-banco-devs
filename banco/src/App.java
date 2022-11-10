import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        System.out.println("Página inicial Banco Maut" + "\n");

        
        Cliente cliente1 = new Cliente("Ezequias", "086.321.654-98", LocalDate.of(1945, 2, 8),
        new Endereco("Dr. Abel B Araujo", 150, "Junco ", "Picos"));
        System.out.println("Cliente Cadastrado \nNome do cliente:" +  cliente1.getNome());
        

        Conta cc1 = new ContaCorrente(5678, 1234567, 0, cliente1);
        System.out.println("O cliente " + cliente1.getNome() + " criou uma conta corrente!\n");
        

        Conta cp1 = new ContaPoupanca(4321, 6654456, 0, cliente1);
        System.out.println("O cliente " + cliente1.getNome() + "criou uma conta poupanca!\n");


        Cliente cliente2 = new Cliente("joao", "086.321.654-98", LocalDate.of(1945, 2, 8),
        new Endereco("Dr. B Araujo", 150, "Junco ", "Picos"));
        System.out.println("Cliente Cadastrado \nNome do cliente:" +  cliente2.getNome());

        Conta cc2 = new ContaCorrente(5678, 1234567, 0, cliente2);
        System.out.println("O cliente " + cliente2.getNome() + " criou uma conta corrente! \n");

        Conta cp2 = new ContaPoupanca(4321, 6654456, 0, cliente2);
        System.out.println("O cliente " + cliente2.getNome() + " criou uma conta poupanca! \n");
        


        System.out.println("Cliente " + cliente1.getNome());
        cc1.deposita(50);
        System.out.println("Deposito realizado com sucesso!\n saldo atual da conta: R$" + cc1.getSaldo() + "\n");


        System.out.println("Cliente " + cliente1.getNome());
        cp1.deposita(50);
        System.out.println("Deposito realizado com sucesso!\n saldo atual da conta: R$" + cp1.getSaldo()+ "\n");


        System.out.println("Cliente " + cliente2.getNome());
        cc2.deposita(50);
        System.out.println("Deposito realizado com sucesso!\n saldo atual da conta: R$" + cc2.getSaldo()+ "\n");


        System.out.println("Cliente " + cliente2.getNome());
        cp2.deposita(50);
        System.out.println("Deposito realizado com sucesso!\n saldo atual da conta: R$" + cp2.getSaldo()+ "\n");

        System.out.println("Cliente" + cliente1.getNome());
        cc1.transfere(10, cc2);
        System.out.println("O novo saldo e " + cc1.getSaldo());


        cc1.saca(40);
        System.out.println("saldo" + cc1.getSaldo());






      

    }

}