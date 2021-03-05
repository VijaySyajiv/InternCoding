package coding.day3;
import java.util.Formatter;
import java.util.logging.ConsoleHandler;//file Handler,Custom Handler
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

//logging package
//java- util-logging-logger-level
public class LoggerEg {
	
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(LoggerEg.class.getName());
		System.out.println(LoggerEg.class.getName());
		logger.setLevel(Level.FINE);
		/*The logs will be generated for all the levels equal to or greater than the logger level. 
		 * For example if logger level is set to INFO, logs will be generated 
		 * for INFO, WARNING and SEVERE logging messages 
		 */
		Handler formater=new  ConsoleHandler();
		logger.addHandler(formater);
		//formater.setFormatter(new Formatter() {
			
	//	});
		for(int i=0; i<1000; i++){
            //logging messages
            logger.log(Level.INFO, "Msg"+i);
        }
	}

}
