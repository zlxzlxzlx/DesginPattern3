package Strategy;

public class NovelBook implements BookStrategy{

	@Override
	public double calcPrice(double bookPrice) {
		  System.out.println("NovelBook100.00-15.00");         
		  int bp = (int)bookPrice;          
		  return bookPrice - (double)(bp / 100 * 15);
	}

}
