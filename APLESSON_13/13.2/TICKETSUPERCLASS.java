public abstract class TICKETSUPERCLASS  
 { 
 	private int serialNo; 
 
 
 	public TICKETSUPERCLASS() 
 	{ 
 		this.serialNo = 0; 
 	} 
 	 
	 
	 
 	public int getSerialNo() 
 	{ 
 		return (int) (Math.random() * 10000000) + 1; 
 	} 
	
	
 	 
 	public abstract double getPrice(); 
 	 
 	public String toString() 
 	{ 
 		return "Serial #: " + getSerialNo() + "\n" 
 			  + "Price: " + getPrice() + "\n";   
 	} 
 }



 
