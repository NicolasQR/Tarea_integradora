package model;
import ui.*;

public class Operations{
	
	
	/**
	* <b>Pre: </b> Arrays must be initialized <br>
	* <b>Post: </b> Will give the total cost of the materials 
	*/
	public static void costMaterials(double[] costHomecenter, double[] costFerreteriaCentro, double[] costFerreteriaBarrio, double[] ferreteriaCentro,
	double[] homeCenter, double[] ferreteriaBarrio, double[] amount){
		
		
		for(int i = 0; i < costFerreteriaCentro.length; i++){
			costFerreteriaCentro[i] = ferreteriaCentro[i] * amount[i];
		}	
		
		for(int i = 0; i < costHomecenter.length; i++){
			costHomecenter[i] = homeCenter[i] * amount[i];
		}
		
		for(int i = 0; i < costFerreteriaBarrio.length; i++){
			costFerreteriaBarrio[i] = ferreteriaBarrio[i] * amount [i];
		}
		
	}


	/**
	* <b>Pre: </b> int must be initialized <br>
	* <b>Post: </b> This will give the cost of the domicilie
	*/
	public static int costDomicilie(int totalHC, int totalFB, int totalFC ){
		
		int costDomicilie = 0;
		
		if((totalHC + totalFB + totalFC) < 80000){	
			costDomicilie = 120000;
			
		} else if(totalHC < 300000){
			costDomicilie = 28000;
			
		} 

		return costDomicilie;
	}
	
}






