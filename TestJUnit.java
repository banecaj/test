
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
	
   String message = "Hello Worl1";	
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {	  
      assertEquals(message,messageUtil.printMessage());
   }
}