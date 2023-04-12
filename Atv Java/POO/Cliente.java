public class Cliente{

    private String nome;
    private Telefone telefone;
    private String cpf;

    Cliente(String nome, Telefone telefone, String cpf){
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }

    public Telefone getTelefone(){
        return telefone;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTelefone(Telefone telefone){
        this.telefone = telefone;
    }
}