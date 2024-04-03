
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Exercicio7.exercicioSete(); // Chame aqui o exercício que quer executar.

	}

}

class Exercicio1 { // positivo ou negativo?
	public static void exercicioUm() {
		Scanner sc = new Scanner(System.in);

		int numero;

		System.out.println("Digite um número positivo ou negativo:");
		numero = sc.nextInt();

		if (numero < 0) {
			System.out.println("Este número é NEGATIVO!");
		} else {
			System.out.println("Este número é POSITIVO!");

		}
		sc.close();

	}
}

class Exercicio2 { // Par ou Ímpar ?
	public static void exercicioDois() {
		Scanner sc = new Scanner(System.in);

		int numero;

		System.out.println("Digite um número:");
		numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("Número PAR!");
		} else {
			System.out.println("Número ÍMPAR!");
			sc.close();
		}
	}
}

class Exercicio3 { // São Multiplos?
	public static void exercicioTres() {
		Scanner sc = new Scanner(System.in);

		int A, B;

		System.out.println("Digite o primeiro número:");
		A = sc.nextInt();

		System.out.println("Digite o segundo número:");
		B = sc.nextInt();

		if (A % B == 0 || B % A == 0) { // || operador lógico OU
			System.out.println("São Multiplos!");
		} else {
			System.out.println("Não são Multiplos!");
		}
		sc.close();
	}
}

class Exercicio4 { // Tempo de Jogo!
	public static void exercicioQuatro() {

		Scanner sc = new Scanner(System.in);

		int horaInicial, horaFinal;
		int duracao;

		System.out.println("Digite a hora inicial: (ex: 7, 8, 9...)");
		horaInicial = sc.nextInt();

		System.out.println("Digite a hora final:");
		horaFinal = sc.nextInt();

		if (horaInicial < horaFinal) { // hora inicial for menor que a hora final
			duracao = horaFinal - horaInicial; // A duração é a diferença entre a hora final e a hora inicial
		} else {
			duracao = 24 - horaInicial + horaFinal; // A duração é a diferença entre 24 horas e a hora inicial, somada à
													// hora final
		}

		System.out.printf("O jogo durou %d hora(s)", duracao);
		sc.close();
	}
}

class Exercicio5 { // produto e quantidade
	public static void exercicioCinco() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do produto:");
		int cod = sc.nextInt();

		System.out.println("Digite a quantidade de produtos:");
		int quantidade = sc.nextInt();

		double total;
		if (cod == 1) {
			total = quantidade * 4.0;
		} else if (cod == 2) {
			total = quantidade * 4.5;
		} else if (cod == 3) {
			total = quantidade * 5.0;
		} else if (cod == 4) {
			total = quantidade * 2.0;
		} else {
			total = quantidade * 1.5;
		}

		System.out.printf("Valor total a pagar é de R$ %.2f%n", total);
		sc.close();
	}
}

class Exercicio6 { // Intervalos dos números
	public static void exercicioSeis() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número com duas casas decimais:");
		double numero = sc.nextDouble();

		if (numero < 0.0 || numero > 100.0) {
			System.out.println("Fora do intevalo");
		} else if (numero <= 25.0) {
			System.out.println("Intervalo [0,25]");
		} else if (numero <= 50.0) {
			System.out.println("Intervalo [25,50]");
		} else if (numero <= 70.0) {
			System.out.println("Intervalo [50,75]");
		} else {
			System.out.println("Intervalo [75,100]");
		}
		sc.close();
	}
}

class Exercicio7 { // Quadrante 
	public static void exercicioSete() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois valores com uma casa decimal:");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}
		else if (x == 0.0) {
			System.out.println("Eixo Y");
		}
		else if (y == 0.0) {
			System.out.println("Eixo X");
		}
		else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}
		else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		
		sc.close();
	}
}