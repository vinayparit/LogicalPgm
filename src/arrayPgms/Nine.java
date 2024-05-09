package arrayPgms;

public class Nine {

	public static void main(String[] args) {
		
		 int[] a={9,1,3,5,9,6,1,9,9,2,9,1,1};
	        int sum =0;
	        for(int i=0;i<a.length;i++){
	        if((a[i]==9)  )
	        	
	        {
	            i++;
	            // break;
	        }
	       
	        else {
	        	sum+=a[1];
	        }
	        }
	        System.out.print(sum);
	}
}
