public class App {

    public static void main(String[] args) throws Exception {
        Endereco endereco1 = new Endereco("joao felix", "64535000", 2, "centro", "picos", "pi");
        Cliente c1 = new Cliente("Jose", "2345234532", null, endereco1);
        Conta conta1 = new Conta(121212, 232323, 600, c1);
    }
}