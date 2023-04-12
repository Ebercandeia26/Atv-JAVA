public class Telefone{
    
    private int ddd;
    private String numero;

    Telefone(int ddd, String numero){
        this.ddd = ddd;
        this.numero = numero
    }

    public int getDdd(){
        return ddd:
    }

    public int getNumero(){
        return numero;
    }

    public void setDdd(int ddd){
        this.ddd = ddd;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public void alterarDdd(int novoDdd){
        this.ddd = novoDdd;
    }

    public void alterarNumero(String novoNumero){
        this.numero = novoNumero;
    }
}