
public class Algos {
    public Algos(){
        System.out.println("hello in Algos constructor");
    }

    public void convertFeetCm(int x){

    }

    public void convertInchCm(int x){

			float result = x * 2.54f;
			
			System.out.println(x + " Inches are equal to " + result + " cm ";
    }

    public void convertMileCm(int x){
        long res= (long) (160934.4*x);
        System.out.println("convert from Mile to Cm"+res);

    }

    public void convertKMCm(int x){

    }
    
    public void convertMeterCm(int x){

    }

}