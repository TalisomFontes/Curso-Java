
/*
Entrada de dados:

Para fazer entrada de dados, nós vamos criar um objeto do tipo
"Scanner" da seguinte forma: Scanner sc = new Scanner(System.in); 
(import java.util.Scanner;) faça sc.close() quando não precisar mais do objeto sc.


 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * char x; x = sc.next().charAt(0); //para ler uma palavra (texto sem espaços)
		 * use sc.next System.out.println("Você digitou: " + x);// se digirtar sysout e
		 * apertar Ctrl+spaço o Eclipse completa.
		 */

		// Para ler um texto ATÉ A QUEBRA DE LINHA
		int x;
		String s1, s2, s3;
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("DADOS DIGITATOS");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();

	}

}
