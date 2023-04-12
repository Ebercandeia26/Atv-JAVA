public class Main{

     public static void main(String[] args) {
        Telefone telefone = new Telefone(81, "99898-9898");
        Cliente cliente = new Cliente("Caio", Telefone, "123.234.345-56");

        System.out.println("O telefone atual do cliente é : (" + cliente.getTelefone().getDdd + ") " + cliente.getTelefone().getNumero());
        
         // Alterar o DDD do telefone utilizando o método criado

         cliente.getTelefone().alterarDdd(12);

         // Alterar o número do telefone utilizando o método criado

         cliente.getTelefone().alterarNumero("88888-8888");
        
        
         System.out.println("Telefone atualizado do cliente: (" + cliente.getTelefone().getDdd() + ") " + cliente.getTelefone().getNumero());
    }
}