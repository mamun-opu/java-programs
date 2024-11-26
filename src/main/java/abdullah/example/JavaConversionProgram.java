package abdullah.example;

public class JavaConversionProgram {
    public static void main(String[] args){
        stringToDouble();
        
    }

    public static void booleanToString(){

        boolean b = false;

        String bs = Boolean.toString(b);
        System.out.println(bs);

    }

    //Convert String to Double in Java
    public static void stringToDouble(){
        String s = "323.23";
        double d = Double.parseDouble(s);
        System.out.println(((Object) d).getClass().getName());
        String ss = Double.toString(d);
        System.out.println(((Object) ss).getClass().getName() );
    }
}
