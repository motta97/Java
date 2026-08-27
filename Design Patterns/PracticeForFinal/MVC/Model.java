public class Model{
    public int verify(String design){
        int bugsCount=0;
        if(design.toLowerCase().contains("error"))
            return -1;
        design = design.toLowerCase();
        for(int i = 0; i<design.length()-2;i++){
            if(design.charAt(i)=='b'){
                if(design.charAt(i+1)=='u'){
                    if(design.charAt(i+2)=='g'){
                        bugsCount++;
                        i+=1;
                    }
                }
            }
        }
        return bugsCount;
    }
}