package Strategy;

public class client {

	public static void main(String[] args) {
		
		Price price1=new Price();
		BookStrategy strategy1=new ComputerBook();
		price1.setStrategy(strategy1);
		double p1=123;
		System.out.println("计算机类图书原价"+p1+"计算机类图书折扣后:"+price1.calcPrice(p1));
		
		Price price2=new Price();
		BookStrategy strategy2=new LanguageBook();
		price2.setStrategy(strategy2);
		double p2=456;
		System.out.println("语言类图书原价"+p2+"语言类图书折扣后:"+price2.calcPrice(p2));
		
		Price price3=new Price();
		BookStrategy strategy3=new NovelBook();
		price3.setStrategy(strategy3);
		double p3=789;
		System.out.println("小说类图书"+p3+"小说类图书折扣后:"+price3.calcPrice(p3));
		
	}

}
