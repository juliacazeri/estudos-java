package Aula06.Exercicios.Exercicio02;

public class Carro{
    private int marcha;
    private int velocidade;
    private boolean ligado;

    public Carro(){
        this.marcha = 0;
        this.velocidade = 0;
        this.ligado = false;
    }

    public void ligar(){
        if(!ligado){
            ligado = true;
            System.out.println("Você ligou o carro.");
        } else{
            System.out.println("O carro já está ligado!");
        }
    }

    public void desligar(){
        if(marcha == 0 && velocidade == 0){
            ligado = false;
            System.out.println("Você desligou o carro.");
        } else{
            System.out.println("Não é possível desligar o carro! Coloque a marcha no 0 e pare o carro!");
        }
    }

    public void acelerar(){
        if(!ligado){
            System.out.println("Você não ligou o carro.");
            return;
        }
        if(velocidade >= 120){
            System.out.println("Você atingiu a velocidade máxima!");
            return;
        }
        if(!marchaCompativelComVelocidade(velocidade + 1)){
            System.out.println("A marcha que você colocou não é compativel com a velocidade " + (velocidade + 1) + "km/h.");
            return;
        }
        velocidade++;
        System.out.println("Você está acelerando. Velocidade atual: " + velocidade + "km/h.");
    }

    private boolean marchaCompativelComVelocidade(int velocidade){
        if(marcha == 0) return velocidade == 0;
        if(marcha == 1) return velocidade >= 1 && velocidade <= 20;
        if(marcha == 2) return velocidade >= 15 && velocidade <= 40;
        if(marcha == 3) return velocidade >= 30 && velocidade <= 60;
        if(marcha == 4) return velocidade >= 45 && velocidade <= 80;
        if(marcha == 5) return velocidade >= 60 && velocidade <= 100;
        if(marcha == 6) return velocidade >= 80 && velocidade <= 120;
        return false;
    }

    public void diminuirVelocidade(){
        if(velocidade > 0){
            velocidade--;
            System.out.println("Você está reduzindo. Velocidade atual: " + velocidade + "km/h.");
        } else{
            System.out.println("Você já está com o carro parado.");
        }
    }

    public void trocarMarcha(int novaMarcha){
        if(novaMarcha < 0 || novaMarcha > 6){
            System.out.println("Marcha inválida!");
            return;
        }
        if(Math.abs(novaMarcha - marcha) == 1){
            marcha = novaMarcha;
            System.out.println("Você alterou para a marcha " + marcha + ".");
        } else{
            System.out.println("Só é permitido trocar uma marcha por vez.");
        }
    }

    public void verificarVelocidade(){
        System.out.println("Sua velocidade atual: " + velocidade + "km/h.");
    }
    public void virar(String direcao){
        if(!direcao.equalsIgnoreCase("esquerda") && !direcao.equalsIgnoreCase("direita")){
            System.out.println("A direção que você indicou é inválida!");
            return;
        }
        if(velocidade >= 1 && velocidade <= 40){
            System.out.println("Você está virando para a " + direcao + ".");
        } else{
            System.out.println("Não é possível virar com está velocidade! Reduza para 40km/h.");
        }
    }
}