package desafio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Libro {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int opcion;
		boolean busqueda = false;
		String busqueda_libro;
		String Salida;
		boolean desicion = false;

		String[] titulo_libro = { "harry potter", "Sombra y Hueso" };
		String[] Autor_libro = { "J.K Rowling", "Leight Bardugo" };
		int[] Número_páginas = { 2022, 416 };
		try {
			while (desicion == false) {

				System.out.println("Seleccione la opcion: ");
				System.out.println("1. Lista de libros");
				System.out.println("2. Buscar libros");
				System.out.println("3. Salir del programa");

				opcion = entrada.nextInt();

				switch (opcion) {

				case 1:

					for (int i = 0; i < 2; i++) {

						System.out.println("Nombre del libro: " + titulo_libro[i]);
						System.out.println("Autor del libro: " + Autor_libro[i]);
						System.out.println("Número de paginas: " + Número_páginas[i]);

					}

					break;

				case 2:
					System.out.println("Ingrese el titulo del libro que desea buscar: ");
					entrada.nextLine();// limpia el bufer de la memoria
					busqueda_libro = entrada.nextLine();// guarda toda la frase incluido los espacios

					for (int i = 0; i < titulo_libro.length; i++) {

						if (titulo_libro[i].equalsIgnoreCase(busqueda_libro)) {
							System.out.println("Libro encontrado");
							busqueda = true;
						}
					}
					break;

				case 3:

					System.out.println("desea salir? S/N");
					Salida = entrada.next().toLowerCase();
					
					if(Salida != "s" && Salida != "n") {
						throw new InputMismatchException();
		
						
					}
					
					if (Salida.equals("s")) {
						System.out.println("Hasta la proxima");
						desicion = true;
					}
					break;
					
				default: 
					System.out.println("Opcion no valida, intente devuelta");
					break;
				}
				
			}
		} catch (InputMismatchException e) {
			System.out.println("Error: Debes ingresar un dato valido.");

		}
//caca
	}
}