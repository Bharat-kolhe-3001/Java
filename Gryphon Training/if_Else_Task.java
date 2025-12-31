import java.util.*;	
public class Begin {

	public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        System.out.println("Crop Form");
        System.out.println("Enter the crop you want to farm in winter season: 1 for Soybean, 2 for Maize");
        int cropchoice = sc.nextInt();
        
	    if(cropchoice == 1) {   // Soybean

	        System.out.println("Enter category of Soybean: 1 for 407 and 2 for 507");
	        int soyabinchoice = sc.nextInt();

	    	if(soyabinchoice == 1) {   // 407

	    	    System.out.println("Enter type: Hybrid = 1 or Local = 2");
	    	    int choice407 = sc.nextInt();

	    	    if(choice407 == 1) {
	    	        System.out.println("Thanks for choosing Hybrid Soybean 407.");
		        }
		        else {

		            System.out.println("Enter Local Type: 1 = Trifala, 2 = Round Leaf");
		            int gavrantypechoice = sc.nextInt();

		            if(gavrantypechoice == 1) {
		                System.out.println("Thanks for choosing Soybean 407 - Local Trifala.");
		            }
		            else {
		                System.out.println("Thanks for choosing Soybean 407 - Local Round Leaf.");
		            }
		        }
	    	}
	    	else {   // Soybean 507
	    		 
	    	    System.out.println("Enter type: Hybrid = 1 or Local = 2");
	    	    int choice507 = sc.nextInt();

	    	    if(choice507 == 1) {
	    	        System.out.println("Thanks for choosing Hybrid Soybean 507.");
	    	    }
	    	    else {

	    	        System.out.println("Enter Local Type: 1 = Yellow Seed, 2 = White Seed");
	    	        int local507 = sc.nextInt();

	    	        if(local507 == 1) {
	    	            System.out.println("Thanks for choosing Soybean 507 - Local Yellow Seed.");
	    	        }
	    	        else {
	    	            System.out.println("Thanks for choosing Soybean 507 - Local White Seed.");
	    	        }
	    	    }
	    	}
	    }
	    else {   // cropchoice == 2 → Maize 

	        System.out.println("Enter Maize Category: 1 for Hybrid, 2 for Local");
	        int makachoice = sc.nextInt();

	        if(makachoice == 1) {   // Hybrid Maize
	    		 
	            System.out.println("Enter Hybrid Type: 1 = HQPM-1, 2 = Ganga-5");
	            int hybridmaize = sc.nextInt();

	            if(hybridmaize == 1) {
	                System.out.println("Thanks for choosing Hybrid Maize HQPM-1.");
	            }
	            else {
	                 
	                System.out.println("Thanks for choosing Hybrid Maize Ganga-5.");
	            }
	        }
	        else {   // Local Maize
	    		 
	            System.out.println("Enter Local Type: 1 = Yellow Maize, 2 = White Maize");
	            int localmaize = sc.nextInt();

	            if(localmaize == 1) {
	                System.out.println("Thanks for choosing Local Yellow Maize.");
	            }
	            else {
	                System.out.println("Thanks for choosing Local White Maize.");
	            }
	        }
	    }
	}
}
