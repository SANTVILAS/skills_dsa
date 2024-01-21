package binary_search_problems;

public class Sqrt_Of_Number {
	

	 public static int mySqrt(long x) {
		    long res= 0;
		    long l =1;
		    long h= x;
		    while(l<=h){
		    long m=l + (h - l)/2;
		      if(m*m==x){
		          res = (int)m;
		          break;
		      }
		      else if(m*m<x){
		       l=m+1;
		       res = m;
		      }else
		       h=m-1;
		     }
		  return (int)res;
		}
	
	public static void main(String[] args) {
	int ans = mySqrt(64);
	System.out.println(ans);
		
	}

}
