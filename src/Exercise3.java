import java.util.Scanner;

public class Exercise3 {
    
    public int[] numeros = {1,2,3};

    public static void main(String[] args){
        Scanner escreva = new Scanner(System.in);
        int pontos = 0; 

        System.out.println("Olá, digite o seu nome: "); 
        String nome = escreva.nextLine();
        System.out.println("Seja bem vindo(a) " + nome);
        System.out.println("Tecle 'S' para iniciar");
        String yes = escreva.nextLine();

        if(yes.equals("s") || yes.equals("S")){
            System.out.println("Qual time você torce?");
            yes = escreva.nextLine();

            if(yes.equals("corinthians")){
                pontos++;
                System.out.println("Você tem bom gosto, merece pontuação!");
                System.out.println("Deseja continuar? sim (s) / não (n)");
                yes = escreva.nextLine();
                
                if(yes.equals("s") || yes.equals("S")){
                    System.out.println("Em que ano o corinthians foi fundado?");
                    yes = escreva.nextLine();

                    if(yes.equals("1910")){
                        pontos++;
                        System.out.println("Parabéns! Você pontuou.");
                        System.out.println("Deseja continuar? sim (s) / não (n)");
                        yes = escreva.nextLine();

                        if(yes.equals("s") || yes.equals("S")){
                            System.out.println("Ufa, última pergunta!");
                            System.out.println("Quem deve deixar o time no ano de 2024?");
                            yes = escreva.nextLine();

                            if(yes.equals("fagner")){
                                pontos++;
                                System.out.println("Parabéns! Você pontuou.");
                                System.out.println("Final de jogo, sua pontuação foi de: "+pontos);

                            }else{
                                System.out.println("Que pena, você errou! Obrigada por participar "+nome);
                                System.out.println("Pontuação: "+pontos);
                            }
                        }else{
                            System.out.println("Jogo encerrado. Obrigada por participar "+nome);
                            System.out.println("Pontuação: "+pontos);
                        }

                    }else{
                        System.out.println("Que pena, você errou! Obrigada por participar "+nome);
                        System.out.println("Pontuação: "+pontos);
                    }
                }else{
                    System.out.println("Jogo encerrado. Obrigada por participar "+nome);
                    System.out.println("Pontuação: "+pontos);
                }
                

            }else{
                System.out.println("O jogo acabou! Vira gente.");
                System.out.println("Sua pontuação: "+pontos);
            }

        }else{
            System.out.println("Ok! Jogo finalizado!");
            System.out.println("Pontos: "+pontos);
        }
        
    }
}