import java.text.SimpleDateFormat;
public class App {
    
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       

        Cliente c1 = new Cliente("Ezequias","12312312323",sdf.parse("20/06/2000"), "rua 12");
        Conta conta1 = new Conta(1, 1, 1);
      
    }
}
