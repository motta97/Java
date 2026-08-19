public class ApplicationSettings{
    private static ApplicationSettings uniqueInstance;
    private String institutionName;
    private String environment;
    private ApplicationSettings(){
        institutionName="Faculty Reporting Platform";
        environment="TEST";
    }
    public static  ApplicationSettings getInstance(){
        if(uniqueInstance==null)
            uniqueInstance=new ApplicationSettings();
        return uniqueInstance;
    } 
    public String getEnvironment(){
        return environment;
    }
    public void setEnvironment(String env){
        if(env == null || env.equals("")){
            IllegalArgumentException exception = new IllegalArgumentException();
            throw exception;
        }
        this.environment=env;
    }
    public String getInstitutionName(){
        return institutionName;
    }
}