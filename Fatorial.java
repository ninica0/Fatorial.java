import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
//		declarar contador e fatorial
		int i, fat, num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Número a ser fatorado: ");
		num= sc.nextInt();
		fat = 1;
		
//		Iniciar o looping 
		for(i=1; i<=num; i++) {
		fat *=i;
		}
		System.out.println("O número fatorado é "+ fat);
		
		
	}

}