package coding.day3;
class TicketCounter{
	int totalTickect;
	public  void   counter() {
		this.totalTickect++;
	}
}
public class Threading2 {
    public static void main(String[] args) throws Exception {
    	TicketCounter object =new TicketCounter();
    		Thread screen1 =new Thread(new Runnable() 
	    		{
		    		public void run() { 
			    		for(int i=0;i<1500;i++) {
			    			object.counter();
			    		}
		    		}
	    		},"Karnan");
    		Thread screen2 =new Thread(new Runnable() 
    		{
	    		public void run() {
		    		for(int i=0;i<4100;i++) {
		    			object.counter();
		    		}
	    		}
    		},"Doctor");
    		screen1.start();
    		screen2.start();
    		screen1.join();
    		screen2.join();
    		
    		System.out.println(object.totalTickect);
	

	
	}

}
