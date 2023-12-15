public class Project extends Utils{

    public Project(double peso, String nome){
        super(peso, nome);
        System.out.println(nome2);
        new ClassePrivada();

    }

    // adicionando nova classe dentro de outra = vira uma classe privada
    class ClassePrivada{
            
    }

    public static void chamandoMain(String[] args){
        new Main();
    }

    public static void main (String[] args){
        Utils pad = new Utils(20.2, "corinthians");
        pad.printHelloWorld(args);
        System.out.println(new Utils(19.0, "Padilha").pegarIdade());

        new Main();
    }

    public static void teste(String[] args){
        Project project = new Project(70.2, "mario");
        project.printHelloWorld(args);
        System.out.println(project.nome2);

        new ClassePublica();
    }
}

// cria uma classe no mesmo arquivo que outrs, porém fora da classe principal 
// = cria uma classe publica

class ClassePublica{
    public void print(){
        System.out.println("OPA");
    }
}