/*
	DUDAS
	si lo imprimo sin 	BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(nombreArchivo), "UTF-16")); me imprime
	todas las letras con espacios, parece que el error viene desde el UTF a pesar de que lo cambie al guardar el archivo?
*/

import java.io.*;
import java.util.*;

public class sistNomina {

    public static void main(String[] args) throws IOException {
        int nTrabajadores;
        Scanner lectura = new Scanner(System.in);
        Random crearNominas = new Random();
        String datosLeidos = "";
        String nombreArchivo = "hojaSistema.csv";
        FileReader lector = new FileReader(nombreArchivo);
        BufferedReader br = new BufferedReader(lector);
        int i, nomina;

        System.out.println("Bienvenido al sistema de nominas");
        System.out.println("A continuacion, llenarmos la base de datos de los trabajadores");
        System.out.print("Numero de trabajadores en la empresa: ");
        nTrabajadores = lectura.nextInt();
        String datos[] = new String[12];
        String arreglo[][] = new String[nTrabajadores+1][12];

        System.out.println("\nLa tabla a llenar se vera de la siguiente manera, favor de llenar los espacios correspondientes en el orden designado\n");
        //csv
        while ((datosLeidos = br.readLine()) != null) {
            datos = datosLeidos.split(",");
            for (int c = 0; c < 12; c++) {
                System.out.print("|" + datos[c] + "|\t");
            	}
            
        }

        for (int cont = 0; cont< 12 ; cont++){
        	arreglo[0][cont] = datos[cont];
    	}
    	
        //imprime no. nomina
        System.out.println("\n");
        nomina = 0;
        for (int cont = 1; cont <= nTrabajadores; cont++) {
            nomina = crearNominas.nextInt(10000) + 100;
            String nominaS = String.valueOf(nomina);
            arreglo[cont][0] = nominaS;
            System.out.println("El numero de nomina para el trabajador " + (cont + 1) + " es: " + arreglo[cont][0]);           
        }

        for (int trab = 1; trab < nTrabajadores; trab++) {
            for (int row = 1; row <= nTrabajadores; row++) {
            	System.out.println("\nTrabajador con nomina: " + arreglo[trab+1][0]);
                for (int col = 0; col < 12	; col++) {
                    switch (col) {
                        case 0:
                            //System.out.println(arreglo[row][0]);
                            break;
                        case 1:
                            System.out.print("NOMBRE: ");
                            String nombre = lectura.next();
                           	arreglo[row][1] = nombre;
                            break;
                        case 2:
                            System.out.print("APELLIDO PATERNO: ");
                            String apPat = lectura.next();
                            arreglo[row][2] = apPat;
                            break;
                        case 3:
                            System.out.print("APELLIDO MATERNO: ");
                            String apMat = lectura.next();
                            arreglo[row][3] = apMat;
                            break;
                        case 4:
                            System.out.print("CARGO: ");
                            String cargo = lectura.next();
                            arreglo[row][4] = cargo;
                            break;
                        case 5:
                            System.out.print("SUELDO BASE: ");
                            String sueldoB = lectura.next();
                            arreglo[row][5] = sueldoB;
                            break;
                        case 6:
                            System.out.print("FECHA DE INGRESO (311212): ");
                            String fechaIng = lectura.next();
                            arreglo[row][6] = fechaIng;
                            break;
                        case 7:
                            System.out.print("No. de DIAS TRABAJADOS: ");
                            String daysWorked = lectura.next();
                            arreglo[row][7] = daysWorked;
                            break;
                        case 8:
                            System.out.print("BONOS: ");
                            String bonos = lectura.next();
                            arreglo[row][8] = bonos;
                            break;
                        case 9:
                            System.out.print("DIAS FERIADOS: ");
                            String feriados = lectura.next();
                            arreglo[row][9] = feriados;
                            break;
                        case 10:
                            System.out.print("HORAS EXTRAS TRABAJADAS: ");
                            String horasExtras = lectura.next();
                            arreglo[row][10] = horasExtras;
                            break;
                        case 11:
                            System.out.print("DEDUCCIONES: ");
                            String deduc = lectura.next();
                            arreglo[row][11] = deduc;
                            break;
                        default:
                            break;
                    } //switch
                }
            }
        }

        //impresion arreglo
        for(int row = 0; row <= nTrabajadores; row++){
        	for(int column = 0; column < 12 ; column ++){
        		System.out.print("|" +arreglo[row][column]+ "|\t       \t");
        	}
        	System.out.println();
        }

        lector.close();
    } //main
} //clase