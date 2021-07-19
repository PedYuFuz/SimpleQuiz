import java.util.Scanner;

public class MemeQuiz {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int numeroDePerguntas = 10;
        int cont=0;

        String[] perguntas = {"Quantos planetas Terra cabem dentro do Sol?",
                            "Em que lugar vivem mais cangurus do que pessoas?",
                            "Quantos olhos a maior parte das aranhas têm?",
                            "O que mede a Escala Mercalli?",
                            "Qual das alternativas contém apenas nomes de rios?",
                            "Quanto mede uma girafa?",
                            "Qual a ciência que estuda a atmosfera da Terra e a climatologia?",
                            "Quantos braços tem um polvo?",
                            "Qual das alternativas contém apenas animais cujos esqueletos são externos?",
                            "Qual das alternativas traz apenas nomes de grandes inventores?"};
        String[] alternativas = {"a)Um milhão    |    b)Cem\nc)Seicentos    |    d)Cento e cinquenta",
                                "a)Indonésia    |    b)Nova Zelândia\nc)Austrália    |    d)Cento e cinquenta",
                                "a)Dois    |    b)Quatro\nc)Quatro pares    |    d)Seis",
                                "a)A intensidade dos ventos    |    b)A intensidade sísmica de acordo com os danos provocados\nc)A resistência dos minerais    |    d)Eletronegatividade",
                                "a)São Francisco, Douro, Antártico    |    b)Nilo, Amazonas, Mississipi\nc)Cáspio, Vermelho, Reno    |    d)Tocantins, Bering, Ganges",
                                "a)Entre 4,8 e 5,5 metros    |    b)2 metros\nc)Entre 5 e 6 metros    |    d)2,5 metros",
                                "a)Astronomia    |    b)Metereologia\nc)Dispersão atmosférica    |    d)Meteorologia",
                                "a)Seis    |    b)Oito\nc)Dez    |    d)Sete",
                                "a)Caracóis, caranguejos e lagostas    |    b)Besouros, peixes e formigas\nc)Caracóis, lulas e aranhas    |    d)Borboletas, caranguejos e peixes",
                                "a)Alfred Nobel, José Bonifácio, Leonardo da Vinci    |    b)Machado de Assis, Oscar Niemeyer e Dmitri Mendeleiev\nc)Evangelista Torricelli, Thomas Edison, Pablo Picasso    |    d)Alexander Graham Bell, Bartolomeu de Gusmão, Galileu Galilei" };
        char[] gabarito = {'a','c','c','b','b','a','d','b','a','d'};
        char[] respostas = new char[numeroDePerguntas];



        for(cont=0;cont<numeroDePerguntas;cont++){
            System.out.println("------------------------------------------------");
            System.out.printf("Questão %d\n%s\n%s\n", (cont+1), perguntas[cont], alternativas[cont]);
            respostas[cont] = scan.nextLine().charAt(0);
            if(respostas[cont]=='s'|| respostas[cont]=='S'){
                break;
            }
            if(respostas[cont]!=gabarito[cont]){
                cont=-1;
                System.out.println("\n\nERROUUU\n\n");
                
            }
        }
        System.out.println("\n-------------------------------------\nFim do quiz\n-------------------------------------\n");
    }
}
