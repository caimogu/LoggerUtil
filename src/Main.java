import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
	
	 public static void main(String [] args) {
	        Logger logger = Logger.getLogger("sgg");
	        try {
	            LoggerUtil.setLogingProperties(logger);
	            logger.log(Level.ALL, "----全部----");
	            logger.log(Level.CONFIG, "----配置----");
	            logger.log(Level.FINE, "----详细----");
	            logger.log(Level.FINER, "----较详细----");
	            logger.log(Level.FINEST, "----非常详细----");
	            logger.log(Level.INFO, "----信息----");
	            logger.log(Level.SEVERE, "----严重----");
	            logger.log(Level.WARNING, "----警告----");
	            
	        } catch (SecurityException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        
	    }
}
