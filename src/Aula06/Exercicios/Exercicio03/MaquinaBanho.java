package Aula06.Exercicios.Exercicio03;

public class MaquinaBanho{

    private boolean limpo = true;
    private int agua = 30;
    private int shampoo = 10;
    private Animal animal;


    public void darBanho(){
        if(this.animal == null){
            System.out.println("Coloque o animal na máquina para iniciar o banho.");
            return;
        }
        this.agua -= 10;
        this.shampoo -= 2;

        animal.setLimpo(true);
        System.out.println("O pet " + animal.getNome() + " está limpo.");
    }

    public void adicionarAgua(){
        if(agua == 30){
            System.out.println("A capacidade de água da máquina está no máximo!");
            return;
        }
        agua += 2;
    }

    public void adicionarShampoo(){
        if(shampoo == 10){
            System.out.println("A capacidade do shampoo na máquina está no máximo!");
            return;
        }
        shampoo += 2;
    }

    public int getAgua(){
        return agua;
    }

    public int getShampoo(){
        return shampoo;
    }

    public boolean temAnimal(){
        return animal !=null;
    }

    public void setAnimal(Animal animal){
        if(!this.limpo){
            System.out.println("A máquina está suja, para colocar um animal é necessário limpa-lá!");
        }
        if(this.temAnimal()){
            System.out.println("O animal " + this.animal.getNome() + " está na máquina nesse momento.");
            return;
        }
        this.animal = animal;
        System.out.println("O animal " + animal.getNome() + " foi colocado na máquina.");
    }

    public void tirarAnimal(){
        this.limpo = this.animal.isLimpo();
        System.out.println("O animal " + this.animal.getNome() + " foi tirado da máquina.");
        this.animal = null;
    }

    public void limparMaquina(){
        this.agua -= 10;
        this.shampoo -= 2;
        this.limpo = true;
        System.out.println("A máquina foi limpa.");
    }
}