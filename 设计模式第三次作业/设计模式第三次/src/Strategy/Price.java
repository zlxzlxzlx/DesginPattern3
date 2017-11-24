package Strategy;

public class Price {
     private BookStrategy strategy;
     public void setStrategy(BookStrategy strategy){
    	 this.strategy=strategy;
     }
	public double calcPrice(double bookPrice){
    	 return this.strategy.calcPrice(bookPrice);
     }

}
