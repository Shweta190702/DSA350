public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int [] a= new int[]{1,3};
        int n= a.length;
        int sum=3;
        int smallestIndex=0;
        int low=0,high=n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(a[low]<=a[mid]){
                if(a[low]<a[smallestIndex]){
                    smallestIndex=low;
                }
                low= mid+1;
            }else{
                if(a[mid]<a[smallestIndex]){
                    smallestIndex=mid;
                }
                high= mid-1;
            }
        }
        low=smallestIndex;
        high= (smallestIndex+n-1)%n;
        
        while((low+(n-smallestIndex))%n<=(high+(n-smallestIndex))%n){
            if(a[low]+a[high]==sum){
                System.out.println(" true ");
                break;
            }else if(a[low]+a[high]<sum){
                low = (low+1)%n;
            }else{
                high = (high+n-1)%n;
            }
        }
        System.out.println(" false ");
    }
}