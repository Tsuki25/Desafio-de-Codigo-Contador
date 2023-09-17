import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try{
            System.out.print("Informe o primeiro valor: ");
            int num1 = scan.nextInt();
            System.out.print("Informe o segundo valor: ");
            int num2 = scan.nextInt();

            contar(num1, num2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
    }

    static void contar(int num1, int num2) throws ParametrosInvalidosException{
        if (num1 > num2){
            throw new ParametrosInvalidosException();
        }else{
            for (int i=0; i<num2-num1; i++){
                System.out.println("Imprimindo o numero: " + (i+1));
            }
        }
    }
}