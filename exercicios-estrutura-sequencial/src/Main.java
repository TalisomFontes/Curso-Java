import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Exercicio8.exercicioOito(); // Chame aqui o exercício que quer executar.

	}
}

class Exercicio1 { // Cálculando a area
	public static void exercicioUm() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();

		double area = largura * comprimento;
		double preco = area * metroQuadrado;

		System.out.printf("Area = %.2f%n", area);
		System.out.printf("Preço = %.2f%n", preco);

		sc.close();
	}
}

class Exercicio2 { // Somando dois números
	public static void exercicioDois() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número:");
		int n1 = sc.nextInt();

		System.out.println("Digite outro número:");
		int n2 = sc.nextInt();

		int soma = n1 + n2;
		System.out.println("A soma dos números digitados é " + soma);

		sc.close();
	}
}

class Exercicio3 { // Valor do raio
	public static void exercicioTres() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do raio desejado:");
		double raio = sc.nextDouble();

		double pi = 3.14159;
		double area = pi * raio * raio;

		System.out.printf("O valor da area é %.4f%n", area);

		sc.close();
	}
}

class Exercicio4 { // Diferencia do produto
	public static void exercicioQuatro() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a, b, c, d, diferenca;

		System.out.println("Digite um número:");
		a = sc.nextInt();

		System.out.println("Digite outro número:");
		b = sc.nextInt();

		System.out.println("Digite mais um número:");
		c = sc.nextInt();

		System.out.println("Digite o ultimo número:");
		d = sc.nextInt();

		diferenca = a * b - c * d;
		System.out.println("A diferença dos números digitados é " + diferenca);

		sc.close();
	}
}

class Exercicio5 { // Calculando salário
	public static void exercicioCinco() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idFuncionario, horasTrabalhadas;
		double valorHora, salario;

		System.out.println("Informe o ID do funcionário:");
		idFuncionario = sc.nextInt();

		System.out.println("Informe o número de horas trabalhadas do funcionário:");
		horasTrabalhadas = sc.nextInt();

		System.out.println("Informe quanto este funcionário ganha por hora:");
		valorHora = sc.nextDouble();

		salario = valorHora * horasTrabalhadas;
		System.out.printf("Salário do funcionário [ID-%d] é U$ %.2f%n", idFuncionario, salario);
		sc.close();
	}
}

class Exercicio6 { // Valor total das peças
	public static void exercicioSeis() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod1, cod2, quantPecas1, quantPecas2;
		double valorUnitario1, valorUnitario2, valorTotal;

		System.out.println("Digite o código da peça 1 desejada:");
		cod1 = sc.nextInt();
		System.out.println("Digite a quantidade de peças:");
		quantPecas1 = sc.nextInt();
		System.out.println("Digite valor da peça 1:");
		valorUnitario1 = sc.nextDouble();

		System.out.println("Digite o código da peça 2 desejada:");
		cod2 = sc.nextInt();
		System.out.println("Digite a quantidade de peças:");
		quantPecas2 = sc.nextInt();
		System.out.println("Digite valor da peça 2:");
		valorUnitario2 = sc.nextDouble();

		valorTotal = valorUnitario1 * quantPecas1 + valorUnitario2 * quantPecas2;
		System.out.printf("O valor total das peças cod %d e cod %d é R$ %.2f%n", cod1, cod2, valorTotal);

		sc.close();
	}
}

class Exercicio7 {
	public static void exercicioSete() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

		System.out.println("Por favor digite os valores:");

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;

		System.out.printf("%nTRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);

		sc.close();

	}
}

class Exercicio8 { // Cálculando imposto
	public static void exercicioOito() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário com duas casas decimais:");
		double salario = sc.nextDouble();
		
		double imposto;

		if (salario <= 2000.0) {
			imposto = 0.0;
		} else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		} else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		} else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f%n", imposto);
		}

		sc.close();
	}
}
