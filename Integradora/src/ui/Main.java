package ui;
import model.*;
import java.util.Scanner;

public class Main{
	
	/**
	* get the number of the Arrays
	* <b>Pre: </b> Scanner must be initialized <br>
	* The number has to be greater than (1) <br>
	* <b>Post: </b> get the number for the length of the arrays 
	*/
	public static int lengthArray(){
		int cont = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Digita la cantidad de productos que pondras: ");
		cont = in.nextInt();
		
		return cont;
	}
	
	
	/**
	* <b>Pre:</b> Arrays must be initialized <br>
	* The user must enter a valid name != "" <br>
	* The user must enter an amount greater than zero <br>
	* The user must type utilization < 4 and utilization > 0 <br>
	* <b>Post: </b> save the name of the material, quantity and use <br>
	*/
	public static void data(String[] nameMaterial, double[] amount,int[] utilization){
		
		Scanner in = new Scanner(System.in);

		for(int i = 0; i < nameMaterial.length; i++){
			
			System.out.print("Digita el nombre del " + (i + 1) + " material: ");
			nameMaterial[i] = in.nextLine();
			
			System.out.print("Digita la cantidad del producto " + (i + 1) + ": ");
			amount[i] = in.nextDouble();
			in.nextLine();
			
			System.out.println("Digita un numero segun la utilizacion que le daras a este material:");
			System.out.println("Obra negra (1)");
			System.out.println("Obra blanca (2)");
			System.out.println("pintura (3)");
			utilization[i] = in.nextInt();
			in.nextLine();
			
			if(utilization[i] < 1 || utilization[i] > 3){
				System.out.println("Error, este numero no es valido, por favor vuelve a intentarlo ");
				i--;
			}
			
		}
		
		System.out.println("");
	}
	
	
	/**
	* <b>Pre: </b> Arrays must be initialized <br>
	* <b>Post: </b> indicates the best place to buy the materials <br>
	* @param nameMaterial != ""
	*/
	public static void bestStore(double[] costHomecenter, double[] costFerreteriaCentro, double[] costFerreteriaBarrio, String[] nameMaterial, double[] homeCenter,
	double[] ferreteriaCentro, double[] ferreteriaBarrio, int domicilio){
		

		for(int i = 0; i < nameMaterial.length; i++){
			
			if((costHomecenter[i] < costFerreteriaBarrio[i]) && (costHomecenter[i] < costFerreteriaCentro[i])){
				System.out.println("El material " + nameMaterial[i] + " es mejor comprarlo en Homecenter con un precio de " +(int) homeCenter[i] + " por producto, un domicilio de "+
				domicilio + " y finalmente pagar un total de " + (costHomecenter[i] + domicilio));
				
				
			} else if((costFerreteriaBarrio[i] < costFerreteriaCentro[i]) && (costFerreteriaBarrio[i] < costHomecenter[i])){
				System.out.println("El material " + nameMaterial[i] + " es mejor comprarlo en la ferreteria del barrio con un precio de " +(int) ferreteriaBarrio[i] + " por producto, un domicilio de "+
				domicilio + " y finalmente pagar un total de " + (costFerreteriaBarrio[i] + domicilio));
				
				
			} else if((costFerreteriaCentro[i] < costHomecenter[i]) && (costFerreteriaCentro[i] < costFerreteriaBarrio[i])){
				System.out.println("El material " + nameMaterial[i] + " es mejor comprarlo en la ferreteria del centro con un precio de " +(int) ferreteriaCentro[i] + " por producto, un domicilio de "+
				domicilio + " y finalmente pagar un total de " + (costFerreteriaCentro[i] + domicilio));
				
				
			} else if((costHomecenter[i] == costFerreteriaBarrio[i]) && (costHomecenter[i] == costFerreteriaCentro[i])){
				System.out.println("Los precios del material " + nameMaterial[i] + " es el mismo en los tres establecimientos y se debe pagar " + domicilio +
				" de domicilio, para un total de " + (domicilio + costHomecenter[i]));
				
				
			} else if(costHomecenter[i] == costFerreteriaCentro[i]){
				System.out.println("Los precios del material " + nameMaterial[i] + " es el mismo en Homecenter y en la ferrtereia del centro (" + homeCenter +
				") y se debe pagar " + domicilio + " de domicilio para un total de " + (costHomecenter[i] + domicilio));
				
				
			} else if(costFerreteriaBarrio[i] == costFerreteriaCentro[i]){
				System.out.println("Los precios del material " + nameMaterial[i] + " es el mismo en la ferreteria del barrio y en la ferreteria del centro (" + ferreteriaBarrio +
				") y se debe pagar " + domicilio + " de domicilio para un total de " + (domicilio + costFerreteriaBarrio[i]));
				
				
			} else if((costHomecenter[i] == costFerreteriaBarrio[i])){
				System.out.println("El material " + nameMaterial[i] + " tiene el mismo precio en Homecenter y la ferreteria del barrio (" + homeCenter +
				")  y se debe pagar " + domicilio + " de domicilio para un total de " + (domicilio + costHomecenter[i]));
			}
			
		}
		
		
		System.out.println("");
	}
	
	
	/**
	* <b>Pre: </b> Arrays must be initialized <br>
	* The user must enter a number > 0 <br>
	* <b>Post: </b> Save the prices of each establishment <br>
	* @param nameMaterial != ""
	*/
	public static void price(String[] nameMaterial, double[] homeCenter, double[] ferreteriaCentro, double[] ferreteriaBarrio){
		
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < nameMaterial.length ; i++){
			

			System.out.print("Por favor digita el precio de *" + nameMaterial[i] +"* que tiene en HomeCenter: ");
			homeCenter[i] = in.nextDouble();

			System.out.print("Por favor digita el precio de *" + nameMaterial[i] + "* que tiene en la ferreteria del centro: ");
			ferreteriaCentro[i] = in.nextDouble();

			System.out.print("Por favor digita el precio de *" + nameMaterial[i] + "* que tiene en la ferreteria del barrio: ");
			ferreteriaBarrio[i] = in.nextDouble();
			System.out.println("");

		}

	
		System.out.println("");
		
	}
	
	
	/**
	* <b>Pre: </b> Arrays must be initialized <br>
	* The user must type a number < 5 and  > 0 <br>
	* <b>Post: </b> Show materials by category as indicated by the user <br>
	* @param nameMaterial != ""
	*/
	public static void showUsage(int[] utilization, String[] nameMaterial){
		
		Scanner in = new Scanner(System.in);
		int type = 0;
		
		do{
			System.out.println("Digita que productos deseas ver por tipo de utilidad segun lo indicado o si quieres terminar de ver: ");
			System.out.println("Obra negra (1)");
			System.out.println("Obra blanca (2)");
			System.out.println("Pintura (3)");
			System.out.println("Para terminar (4)");
			type = in.nextInt();
			System.out.println("");
		
			for(int i = 0; i < utilization.length; i++){
				
				if(utilization[i] == type){
					System.out.println(nameMaterial[i]);
				}
		
			}
		
		} while(type != 4);
	}
	
	
	/**
	* <b>Pre: </b> Arrays must be initialized <br>
	* int must be initialized <br> 
	* <b>Post: </b> Show the total to pay
	*/
	public static void toPrint(int totalHC, int totalFB, int totalFC, int roughConstruction, int finalConstruction, int paiting ,
	double[] costHomecenter, double[] costFerreteriaBarrio, double[] costFerreteriaCentro, int domicilio){
		
		for(int i = 0; i < costHomecenter.length; i++){
			totalHC += costHomecenter[i];
		}
		
		for(int i = 0; i < costFerreteriaBarrio.length; i++){
			totalFB += costFerreteriaBarrio[i];
		}
		
		for(int i = 0; i < costFerreteriaCentro.length; i++){
			totalFC += costFerreteriaCentro[i];
		}
		
		System.out.println("Si compras todos los materiales en Homecenter el total a pagar por todo sería: " +
		(int)(totalHC + roughConstruction + finalConstruction + paiting + domicilio));
		
		System.out.println("Si compras todos los materiales en la ferreteria del barrio el total a pagar por todo sería: " +
		(int)(totalFB + roughConstruction + finalConstruction + paiting + domicilio));
		
		System.out.println("Si compras todos los materiales en la ferreteria del centro el total a pagar por todo sería: " +
		(int)(totalFC + roughConstruction + finalConstruction + paiting + domicilio));
		
		System.out.println("");
	}
	

	public static void main(String[] args){
		
		int roughConstruction = 1300000, finalConstruction = 2600000, paiting = 980000, totalHC = 0, totalFB = 0, totalFC = 0;
		int cont = lengthArray(); //To know the length of the arrangements

		double[] homeCenter = new double[cont]; //save the price of the items in homeCenter
		double[] ferreteriaCentro = new double[cont];//save the price of the items in ferreteria del centro
		double[] ferreteriaBarrio = new double[cont];//save the price of the items in ferreteria del barrio
		int[] costDomicilie = new int[cont];
		
		String[] nameMaterial = new String[cont]; //Save the name of material
		double[] amount = new double[cont]; //Save the amount of the materials
		int[] utilization = new int[cont];//Save what each material is used for
		
		data(nameMaterial, amount, utilization);
		price( nameMaterial, homeCenter, ferreteriaCentro, ferreteriaBarrio);
		
		double[] costHomecenter = new double[cont];//The total cost between price and quantity
		double[] costFerreteriaCentro = new double[cont];//The total cost between price and quantity
		double[] costFerreteriaBarrio = new double[cont];//The total cost between price and quantity
		
		Operations.costMaterials(costHomecenter, costFerreteriaCentro, costFerreteriaBarrio, ferreteriaCentro, homeCenter, ferreteriaBarrio, amount);
		int domicilio = Operations.costDomicilie( totalHC, totalFB, totalFC );
		
		toPrint(totalHC, totalFB, totalFC, roughConstruction, finalConstruction, paiting , costHomecenter, costFerreteriaBarrio, costFerreteriaCentro, domicilio);
		
		bestStore(costHomecenter, costFerreteriaCentro, costFerreteriaBarrio, nameMaterial, homeCenter, ferreteriaCentro, ferreteriaCentro, domicilio);
		showUsage(utilization, nameMaterial);
		
	}
}