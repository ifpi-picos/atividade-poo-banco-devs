
public class App {
    private String Conta;
    private String Cliente;
    
    public static void main(String[] args) throws Exception {
<<<<<<< HEAD
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       
        Cliente c1 = new Cliente("Ezequias","12312312323",sdf.parse("20/06/2000"), "rua 12");
        Conta conta1 = new Conta(1, 1, 1);
=======
        Endereco endereco1 = new Endereco("joao felix", "64535000", 2, "centro", "picos", "pi");
        Cliente c1 = new Cliente("Jose", "2345234532", null, endereco1);
        Conta conta1 = new Conta(121212, 232323, 600, c1);


        

>>>>>>> f78fd7b1be85a30c15afc4b21ff9ca51ab47d7a4
      
    }
}
