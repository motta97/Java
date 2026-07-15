public class floor {
    // write code here
    private double width, length;
    public floor (double width, double length){
        if(width<0)this.width=0;
        else
        this.width=width;
        if(length<0)this.length=0;
        else this.length=length;
    }
    public double getArea(){
        return length*width;
    }
}
