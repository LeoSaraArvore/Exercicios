package AnimalSom;

public class Animal {
    private String nome;

    public void fazerSom(){
        System.out.println("Som generico de animal");
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public String getNome() {
        return nome;
    }
}
