import java.util.*;

public class GenericFunction
{
      Properties props = new Properties();
      
      public void loadConfig()
      {
        File file = new File("Config/config.properties");
        FileReader reader = new FileReader();
        props.load(reader);             
      }
      
      public void loadChromeDriver()
      {
            
      }
      
}
