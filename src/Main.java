public class Main {

    public char[] nome = {'M','a','r','i','a'};
    public Main(){
        String nomeCompleto = "";

        for(int i = 0; i < nome.length; i++){
            nomeCompleto+=nome[i];
        }
        System.out.println(nomeCompleto);
    }
    
    public static void main (String args[]){
        new Main();
    }
}
