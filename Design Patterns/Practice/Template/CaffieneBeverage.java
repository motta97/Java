public abstract class CaffieneBeverage{
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
        
    }
    abstract void brew();//common signature only
    abstract void addCondiments();//common signature only
    void boilWater(){
        System.out.println("Boiling water...");//common signature and implementation
    }
    void pourInCup(){//common signature and implementation
        System.out.println("Pouring in cup...");
    }
    boolean customerWantsCondiments(){//this's a hook method, since subclasses
    //can override it but don't have to
        return true;
    }


}