package Iterator;

public class Product implements abstructProduct{
	private  Object[] obj={"Æ»¹û","Àæ","³È×Ó","Ïã½¶"};

	@Override
	public abstructIterator createIterator() {
		return new MyIterator();
	}
	private class MyIterator implements abstructIterator{
		 private int index1;  
		 private int index2; 
		 
		 public MyIterator() {  
		        index1 = 0;  
		        index2 = obj.length - 1;  
		    }  
		 
		@Override
		public void next() {
			  if(index1<obj.length){  
		            index1++;  
		        }  
			
		}

		@Override
		public boolean isLast() {
		 return (index1 == obj.length);
		}

		@Override
		public void previous() {
			 if (index2>-1) {  
		            index2--;  
		        }
		}

		@Override
		public boolean isFirst() {
			  return index2==-1;
		}

		@Override
		public String getNext() {
			return (String) obj[index1];
		}

		@Override
		public String getPrevious() {
			return  (String) obj[index2];
		}	
	}

	
}
