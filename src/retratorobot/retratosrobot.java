package retratorobot;

import java.util.Scanner;

public class retratosrobot {

	public static String SeleccionarPelo() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Selecciona un pelo (1,2,3,4)");
		System.out.println("1. WWWWWWWWW");
		System.out.println("2. \\\\\\//////");
		System.out.println("3. \"|||||||\"");
		System.out.println("4. |||||||||");
		int n = s.nextInt();
		
		if(n == 1) {
			return "WWWWWWWWW";
		} else if(n == 2) {
			return "\\\\\\//////";
		} else if(n == 3) {
			return "\"|||||||\"";
		} else if(n == 4) {
			return "|||||||||";
		} else {
			System.out.println("el numero que has seleccionado debe ser entre 1 y 4");
			return "";
		}
		
	}
	
	public static String SeleccionarOjos() {
			
		Scanner s = new Scanner(System.in);
		System.out.println("Selecciona unos ojos (1,2,3,4)");
		System.out.println("1. | o   o |");
		System.out.println("2. |-(· ·)-|");
		System.out.println("3. |-(o o)-|");
		System.out.println("4. | \\   / |");
		int n = s.nextInt();
		
		if(n == 1) {
			return "| o   o |";
		} else if(n == 2) {
			return "|-(· ·)-|";
		} else if(n == 3) {
			return "|-(o o)-|";
		} else if(n == 4) {
			return "| \\   / |";
		} else {
			System.out.println("el numero que has seleccionado debe ser entre 1 y 4");
			return "";
		}
		
		}
	
	public static String SeleccionarOrejasNariz() {
			
		Scanner s = new Scanner(System.in);
		System.out.println("Selecciona unas orjas y una nariz (1,2,3,4)");
		System.out.println("1. @   J   @");
		System.out.println("2. {   \"   }");
		System.out.println("3. [   j   ]");
		System.out.println("4. <   -   >");
		int n = s.nextInt();
		
		if(n == 1) {
			return "@   J   @";
		} else if(n == 2) {
			return "{   \"   }";
		} else if(n == 3) {
			return "[   j   ]";
		} else if(n == 4) {
			return "<   -   >";
		} else {
			System.out.println("el numero que has seleccionado debe ser entre 1 y 4");
			return "";
		}
		}
	
	public static String SeleccionarBoca() {
			
		Scanner s = new Scanner(System.in);
		System.out.println("Selecciona una boca (1,2,3,4)");
		System.out.println("1. |  ===  |");
		System.out.println("2. |   -   |");
		System.out.println("3. |  ___  |");
		System.out.println("4. |  ---  |");
		int n = s.nextInt();
		
		if(n == 1) {
			return "|  ===  |";
		} else if(n == 2) {
			return "|   -   |";
		} else if(n == 3) {
			return "|  ___  |";
		} else if(n == 4) {
			return "|  ---  |";
		} else {
			System.out.println("el numero que has seleccionado debe ser entre 1 y 4");
			return "";
		}
		}
	
	public static String SeleccionarBarbilla() {
			
		Scanner s = new Scanner(System.in);
		System.out.println("Selecciona una barbilla (1,2,3,4)");
		System.out.println("1. \\_______/");
		System.out.println("2. \\,,,,,,,/");
		System.out.println("3. \\......./");
		System.out.println("4. \\mmmmmmm/");
		int n = s.nextInt();
		
		if(n == 1) {
			return "\\_______/";
		} else if(n == 2) {
			return "\\,,,,,,,/";
		} else if(n == 3) {
			return "\\......./";
		} else if(n == 4) {
			return "\\mmmmmmm/";
		} else {
			System.out.println("el numero que has seleccionado debe ser entre 1 y 4");
			return "";
		}
		}
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		boolean continuar = true;
		
		while (continuar) {
			String pelo = SeleccionarPelo();
			String ojos = SeleccionarOjos();
			String orejasNariz = SeleccionarOrejasNariz();
			String boca = SeleccionarBoca();
			String barbilla = SeleccionarBarbilla();
			
			System.out.println(pelo);
			System.out.println(ojos);
			System.out.println(orejasNariz);
			System.out.println(boca);
			System.out.println(barbilla);
			
			System.out.println("¿Quieres hacer otro retrato? (s/n)");
			String respuesta = s.nextLine();
			
			if(respuesta.equals("n")) {
				continuar = false;
			}
		}	
	}

}
