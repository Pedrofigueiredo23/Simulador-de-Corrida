import java.util.Random;

public class Carro {
    static String vencedor;
    String nome; //Instância nome do carro
    int velocidade; // Instância velocidade máxima
    int tempo; // Instância de tempo 
    Carro (String nome, int velocidade){
    this.nome = nome;
    this.velocidade = velocidade;
    }


    void correr(){
        Random random = new Random();
        tempo = random.nextInt(2000) / this.velocidade; //Tempo de corrida
System.out.println(this.nome + " terminou a corrida em " + tempo + " minutos.");
    }

}
