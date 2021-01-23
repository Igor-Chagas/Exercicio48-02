import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Entre com as coordenadas de x e y, respectivamente:");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if ( x != 0.0 && y != 0) {
		
			while (x != 0.0 && y != 0.0) {
				
				if (x >= 0.0 && y > 0.0) {
				System.out.println("Primeiro");
				}
				else if (x >= 0.0 && y < 0.0) {
				System.out.println("Quarto");
				}
				else if (y >= 0.0 && x < 0.0) {
				System.out.println("Segundo");
				}
				else {
				System.out.println("Terceiro");
					}
				System.out.print("Entre com as novas coordenadas de x e y, respectivamente:");
				x = sc.nextDouble();
				y = sc.nextDouble();
			}
		}
		else {
			System.out.println("Origem");
		}
		sc.close();
	}

}
