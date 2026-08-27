public abstract class DesignFlow{
    public final void process(String design){
        compile(design);
        synthesis(design);
        tapeOut(design);
    }
    public void compile(String design){
        System.out.println("Compiling "+design+" ...");
    }
    public void synthesis(String design){
        System.out.println("Synthesizing "+design+" ...");
    }
    public abstract void tapeOut(String desing);
    

}