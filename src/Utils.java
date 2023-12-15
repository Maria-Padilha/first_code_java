public class Utils {

    // int, double, char, String, Float
    private int idade = 26;
    public double peso = 70.5;
    public float peso2 = 70.5f;
    public String nome = "Maria";

    protected String nome2 = "João";

    public Utils(double peso, String nome){
        this.nome = nome;
        this.peso = peso;
        System.out.println(nome);
        System.out.println(this.nome);
    }

    public void printHelloWorld(String[] args){
        System.out.println("hello world!");
        idade = 26;
        printName();
    }

    public int pegarIdade(){
        return idade;
    }

    private void printName(){
        System.out.println("maria");
    }
}
