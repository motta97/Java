public class Rectangle {
    private double width=1,height=1;
    Rectangle(){}
    Rectangle(double width,double height){
        this.width=width;
        this.height=height;

    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){


        return Math.sqrt(Math.pow(width,2)+Math.pow(height,2));
    }

    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }




}
