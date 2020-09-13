package ui;
import model.*;
import java.util.Scanner;

public class Main{
	
	
	public static int lengthArray(){
		int cont = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Digita la cantidda de productos que pondras: ");
		cont = in.nextInt();
		
		return cont;
	}
	
	
	public static void data(String[] nameMaterial, double[] amount,int[] utilization){
		
		Scanner in = new Scanner(System.in);

		for(int i = 0; i < nameMaterial.length; i++){
			
			System.out.print("Digita el nombre del " + (i + 1) + " material: ");
			nameMaterial[i] = in.nextLine();
			
			System.out.print("Digita la cantidad del producto " + (i + 1) + ": ");
			amount[i] = in.nextDouble();
			in.nextLine();
			
			System.out.println("Si este producto es para obra negra digita el numero (1), si es para obra blanca digita el numero (2)" + 
			", si es para pintura (3)");
			utilization[i] = in.nextInt();
			in.nextLine();
			
			if(utilization[i] < 1 || utilization[i] > 3){
				System.out.println("Error, este numero no es valido, por favor vuelve a intentarlo ");
				i--;
			}
			
		}
	}
	
	public static void price(String[] nameMaterial, double[] homeCenter, double[] ferreteriaCentro, double[] ferreteriaBarrio){
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < nameMaterial.length ; i++){
			System.out.print("Por favor digita el precio de " + nameMaterial[i] + " que tiene en HomeCenter: ");
			homeCenter[i] = in.nextDouble();
			System.out.println("");
			
			System.out.print("Por favor digita el precio de " + nameMaterial[i] + " que tiene en la ferreteria del centro: ");
			ferreteriaCentro[i] = in.nextDouble();
			System.out.println("");
			
			System.out.print("Por favor digita el precio de " + nameMaterial[i] + " que tiene en la ferreteria del barrio: ");
			ferreteriaBarrio[i] = in.nextDouble();
			System.out.println("");
		}
		
		
	}
	
	
	public static void main(String[] args){
		
		int cont = lengthArray();
		
		double[] homeCenter = new double[cont];
		double[] ferreteriaCentro = new double[cont];
		double[] ferreteriaBarrio = new double[cont];
		
		
		String[] nameMaterial = new String[cont];
		double[] amount = new double[cont];
		int[] utilization = new int[cont];
		
		data(nameMaterial, amount, utilization);
		System.out.print("");
		price( nameMaterial, homeCenter, ferreteriaCentro, ferreteriaBarrio);
		
	}
}