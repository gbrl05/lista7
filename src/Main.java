import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double imc;

        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();
        System.out.print("Digite seu peso em quilogramas: ");
        double peso = scanner.nextDouble();
        System.out.println();

        imc = peso / (altura * altura);

        System.out.println("Seu IMC é " + imc);

        if(imc >= 40){
            System.out.println("Obesidade de Classe 3");
        }else if(imc >= 35 && imc < 40){
            System.out.println("Obesidade de Classe 2");
        }else if(imc >= 30 && imc < 35){
            System.out.println("Obesidade de Classe 1");
        }else if(imc >= 25 && imc < 30){
            System.out.println("Excesso de peso");
        }else if(imc >= 18.5 && imc < 25){
            System.out.println("Peso Normal");
        }else{
            System.out.println("Baixo peso");
        }
    }
}