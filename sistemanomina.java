import java.util.Scanner;
import java.io.*;

public class sistemaNomina{
	public static void main(String args[])throws IOException {
		Scanner lectura = new Scanner (System.in);
		int opcionSelec = 9;

		System.out.println("Bienvenido al sistema de nomina");
		
		Menu();

		while(opcionSelec!=1 || opcionSelec!=2 || opcionSelec!=3 || opcionSelec!=4 ||opcionSelec!=5|| opcionSelec!=6 || opcionSelec!=7 || opcionSelec!=8){
			System.out.print("Por favor selecciona una opcion: ");
			opcionSelec = lectura.nextInt();
			
			switch(opcionSelec){
			case 1: 
				String datosLeidos = "";
        		String nombreArchivo = "hojaSistema.csv";
		        FileReader lector = new FileReader(nombreArchivo);
		        BufferedReader br = new BufferedReader(lector);	
        		String datos[] = new String[12];
		        String nomina[][] = new String[21][12];	

        		System.out.println();
        		while ((datosLeidos = br.readLine()) != null) {
            		datos = datosLeidos.split(",");
            		for (int c = 0; c < 12; c++) {
            			System.out.print("     |" + datos[c] + "|\t     ");
            		}
            		System.out.println();
            	}



            	System.out.println();				
			break;
			
			case 2:
				System.out.println("b");
			break;
		
			case 3:
				System.out.println("c");
			break;
		
			case 4:
				System.out.println("d");
			break;
		
			case 5:
				System.out.println("e");
			break;
		
			case 6:
				System.out.println("f");
			break;
		
			case 7:
				System.out.println("g");
			break;
		
			case 8: 
				System.out.println("g");
			break;

			case 9:
				System.out.println("Gracias por usarnos");
				System.exit(0);
			break;
		
			default: 
				System.out.println("Por favor selecciona una opcion valida");
			break;
		}//cierre switch

		}

	}//main

    public static void Menu(){
        System.out.println("Selecciona una opcion");
    	System.out.println(" 1. Imprimir nomina de empleados\n 2. Agregar un empleado nuevo\n 3. Quitar un empleado \n 4. Modificar la informacion de un empleado \n 5.Agregar dias trabajados\n 6. Agregar asignaciones (bonos, feriados, horas extras\n 7. Agregar deducciones (IVA, ISR, prestamos\n 8. Imprimir recibo de pagos\n 9. Salir del programa");
	}//menu



}//class