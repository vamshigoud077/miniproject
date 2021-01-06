package burgerapp.burgerapp;

import java.util.Scanner;

import burgerapp.burgerapp.Location.LocationFunctionality;
import burgerapp.burgerapp.Menu.MenuFunctionality;
import burgerapp.burgerapp.Reservations.ReservationFunctionality;


public class App 
{
   

	public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);
    	
        System.out.println( "Welcome to KC Burgers! " );
        MenuFunctionality menuFunction = new MenuFunctionality();
        LocationFunctionality locationFunction = new LocationFunctionality();
        ReservationFunctionality reservationFunction  = new ReservationFunctionality();
        
        while(true) {
        	System.out.println( "Kindly select your course of action by choosing an appropriate number :  1. Location, 2. Menu, 3. Reservations " );
        	Integer actionperformed = scan.nextInt();
	        switch(actionperformed) {
	        
	        case 1: 
		        	System.out.println( "Kindly select your course of action by choosing an appropriate number :  101. Update Location, 102. Delete Location, 103. Add Location, 104. Show all locations ,105. Search nearest restuarant" );
		            Integer locationvalue = scan.nextInt();
		            
			            switch(locationvalue) {
			            
			            case 11:
			            	locationFunction.updateLoc();
			            	break;
			            case 12: 
			            	locationFunction.removeLoc();
			            	break;
			            case 13: 
			            	locationFunction.addLoc();
			            	break;
			            case 14:
			            	locationFunction.showAllLoc();
			            	break;
			            case 15:
			            	locationFunction.searchNearestStore();
			            	break;
			            default:
			            	System.out.print(" Incorrect input entered ");
			            }	
			            
			  break;
			  
	        case 2:
		        	System.out.println( " Kindly select your course of action by choosing an appropriate number :  21. Add Item, 22. Edit Item, 23. Remove Item, 24. Show all Items" );
		            Integer menuitem = scan.nextInt();
		            
			            switch(menuitem) {
			            
			            case 21:
			            	menuFunction.addingtheItem();;
			            	break;
			            case 22: 
			            	menuFunction.editingtheItem();
			            	break;
			            case 23: 
			            	menuFunction.removingtheItem();;
			            	break;
			            case 24:
			            	menuFunction.showtheItems();
			            	break;
			            default:
			            	System.out.print(" Incorrect input given ");
			            }
			  break;
			  
	        case 3:
	        	
	        	System.out.println( "Please select your course of action by entering an appropriate aplhabet:  31. Add Reservation, 32. Edit Reservation, 33. Remove Reservation, 34. Show all Reservations" );
	            Integer reservationnumber = scan.nextInt();
	            
		            switch(reservationnumber) {
		            
		            case 31:
		            	reservationFunction .addingtheReservation();
		            	break;
		            case 32: 
		            	reservationFunction .editingtheReservation();
		            	break;
		            case 33: 
		            	reservationFunction .removingtheReservation();
		            	break;
		            case 34:
		            	reservationFunction .showtheReservations();
		            	break;
		            default:
		            	System.out.print(" Incorrect input given ");
		            }       
		        break;
	        }
        }
    }
}