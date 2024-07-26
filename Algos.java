
public class Algos {
    public Algos(){
        System.out.println("hello in Algos constructor");
    }

    public void convertFeetCm(int x){

        System.out.println(x+" cm = "+ x*30.48+" inches");
	x= (int)( x*30.48);

    }

    public void convertInchCm(int x){

			float result = x * 2.54f;
			
			System.out.println(x + " Inches are equal to " + result + " centimeters";
    }

    public void convertMileCm(int x){
        long res= (long) (160934.4*x);
        System.out.println("convert from Mile to Cm"+res);

    }

    public void convertKMCm(int x){

        int result = 1000 * 100 * x;
        System.out.println(x + "kilo meters = " + result + "cm");

    }
    
    public void convertMeterCm(int x){
        int result = x * 100 ;
        System.out.println(x + "meters = " + result + "cm");
    }

}