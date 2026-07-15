public class Main
{
	public static void main(String[] args) {
	    Light l1 = new Light("123",100);
	    Light l2 = new Light("456", 200);
	    Thermostat t1 = new Thermostat("789", 30);
	    SecurityCamera s1 = new SecurityCamera("101112","1920*2024");
	    Device [] d = new Device[4];
	    d[0]=l1;
	    d[1]=l2;
	    d[2]=t1;
	    d[3]=s1;
        for(int i =0; i<4; i++){
            System.out.println(d[i].getStatus());
            if(d[i] instanceof Switchable){
                ((Switchable)d[i]).turnOn();
            }


        }
	    
	}
}