import java.util.Scanner;
import java.io.*;

public class sistemaNomina{
	public static void main(String args[])throws IOException {
		Scanner lectura = new Scanner (System.in);
		int opcionSelec = 9;
		String datosLeidos = "";
     	String nombreArchivo = "hojaSistema.csv";
		FileReader lector = new FileReader(nombreArchivo);
		BufferedReader br = new BufferedReader(lector);	
        String datos[] = new String[12];
		String nomina[][] = new String[21][12];	

		System.out.println("Bienvenido al sistema de nomina");
		
		Menu();

		while(opcionSelec!=1 || opcionSelec!=2 || opcionSelec!=3 || opcionSelec!=4 ||opcionSelec!=5|| opcionSelec!=6 || opcionSelec!=7 || opcionSelec!=8){
			System.out.print("Por favor selecciona una opcion: ");
			opcionSelec = lectura.nextInt();
			
			switch(opcionSelec){
			case 1: //imprmir tabla
				

        		System.out.println();
        		//guarda datos del csv en un arreglo
        		while ((datosLeidos = br.readLine()) != null) {
            		datos = datosLeidos.split(",");
            		for (int c = 0; c < 12; c++) {
                		System.out.print("|" + datos[c] + "|\t");
            		}
            		System.out.println("\n");
            	}

    			lector.close();

            	System.out.println();				
			break;
			
			case 2: //agregar empleado
				System.out.println("AGREGAR UN EMPLEADO NUEVO");
				String name = "";
				String apePat = "";
				String apeMat = "";
				String cargo = "";
				String sueldo = "";
				String fIngreso = "";
				String nominaIng = "";

				System.out.print("\nNOMINA: ");
				nominaIng = lectura.next();

				System.out.print("NOMBRE: ");
				name = lectura.next();

				System.out.print("APELLIDO PATERNO: ");
				apePat = lectura.next();

				System.out.print("APELLIDO MATERNO: ");
				apeMat = lectura.next();

				System.out.print("CARGO: ");
				cargo = lectura.next();

				System.out.print("SUELDO: ");
				sueldo = lectura.next();

				System.out.print("FECHA DE INGRESO: ");
				fIngreso = lectura.next();

				agregarEmpleado(nombreArchivo,name,apePat,apeMat,cargo,sueldo,fIngreso,nominaIng);
				Menu();
			break;
		
			case 3: //eliminar empleado
				System.out.println("c");
			break;
		
			case 4: //modificar info
				System.out.println("d");
			break;
		
			case 5:// dias trabajados
				System.out.println("e");
			break;
		
			case 6: //agregar asignaciones
				System.out.println("f");
			break;
		
			case 7: //agregar deducciones
				System.out.println("g");
			break;
		
			case 8: //imprimir recibo de pagos
				System.out.println("g");
			break;

			case 9: //salir del programa
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

	public static void agregarEmpleado(String nombreArchivo, String name, String apePat, String apeMat, String cargo, String sueldo, String fIngreso, String nominaIng){
		try{
			//Para agregar datos
			FileWriter fw = new FileWriter(nombreArchivo, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);

			pw.println(nominaIng+","+name+","+apePat+","+apeMat+","+cargo+","+sueldo+","+fIngreso);
			pw.flush();
			pw.close();

			System.out.println("Nuevo empleado GUARDADO");
		}
		catch(Exception E){
			System.out.println("Error al guardar nuevo empleado");	
		}
	}//agregar empleado
}//class
