

public class ConfigurationManager{
    private static volatile ConfigurationManager uniqueInstance;

    private ConfigurationManager(){
        //load the configuration file
    }
    public  static ConfigurationManager getInstance(){
       if(uniqueInstance==null){
        synchronized (ConfigurationManager.class) { 
            if(uniqueInstance==null)
                uniqueInstance= new ConfigurationManager();   
            }
        }

        return uniqueInstance;
    }
}