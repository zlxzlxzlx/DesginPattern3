package Iterator;

public class client {

	public static void main(String[] args) {
	abstructIterator iterator;
	abstructProduct product =new Product();
	iterator=product.createIterator();
	while (!iterator.isLast()) {  
        System.out.print(iterator.getNext());  
        System.out.print(" "); 
        iterator.next();  
       }  
	System.out.println();
	 while (!iterator.isFirst()) {  
         System.out.print(iterator.getPrevious());  
         System.out.print(" "); 
         iterator.previous();  
     }  
	}

}
