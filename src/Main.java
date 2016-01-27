import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
	
	 public static void main(String [] args) {
	        Logger logger = Logger.getLogger("sgg");
	        try {
	            LoggerUtil.setLogingProperties(logger);
	            logger.log(Level.ALL, "----ȫ��----");
	            logger.log(Level.CONFIG, "----����----");
	            logger.log(Level.FINE, "----��ϸ----");
	            logger.log(Level.FINER, "----����ϸ----");
	            logger.log(Level.FINEST, "----�ǳ���ϸ----");
	            logger.log(Level.INFO, "----��Ϣ----");
	            logger.log(Level.SEVERE, "----����----");
	            logger.log(Level.WARNING, "----����----");
	            
	        } catch (SecurityException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        
	    }
}
