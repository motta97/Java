public class ComplexNumber {
    // write code here
    private double real, imaginary;


    public ComplexNumber(double real, double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    public double getReal(){
        return real;

    }
    public double getImaginary(){
        return imaginary;
    }

    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary+=imaginary;
    }
    public void add (ComplexNumber CN){
        this.real+=CN.getReal();
        this.imaginary+=CN.getImaginary();
    }
    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary-=imaginary;
    }
    public void subtract (ComplexNumber CN){
        this.real-=CN.getReal();
        this.imaginary-=CN.getImaginary();
    }
}
