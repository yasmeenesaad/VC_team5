
public class Algos {
    public Algos(){
        System.out.println("hello in Algos constructor");
    }

    public void convertFeetCm(int x){

        System.out.println(x+" cm = "+ x*30.48+" inches");
	x= (int)( x*30.48);

    }

    public void convertInchCm(int x){

    }

    public void convertMileCm(int x){
        long res= (long) (160934.4*x);
        System.out.println("convert from Mile to Cm"+res);

    }

    public void convertKMCm(int x){
		return x*1000*1000;
    }
    
    public void convertMeterCm(int x){

    }

}