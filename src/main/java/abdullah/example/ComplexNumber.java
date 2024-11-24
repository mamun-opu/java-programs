package abdullah.example;

public class ComplexNumber {
    private int real, imaginary;
    private String n;
    ComplexNumber(int r, int i){
        this.real = r;
        this.imaginary = i;
        this.n = r + "+i" + i;
    }
    public void show(){
        System.out.println(n);
    }
    public int getReal(){
        return real;
    }
    public int getImaginary(){
        return imaginary;
    }


}
