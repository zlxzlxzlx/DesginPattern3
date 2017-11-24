package Strategy;

public class LanguageBook implements BookStrategy{
	

	@Override
	public double calcPrice(double bookPrice) {
		 System.out.println("LanguageBook-2.0 discount."); 
		return bookPrice-2.0;
	}

}
