package Strategy;

public class ComputerBook implements BookStrategy{


	@Override
	public double calcPrice(double bookPrice) {
		 System.out.println("ComputerBook 10% discount. "); 
			return bookPrice*0.9;
	}

}
