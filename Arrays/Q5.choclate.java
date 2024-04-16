import java.util.Arrays;

class choclate{
    public static int min(int arr[],int m){
        int n=arr.length;
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i+m-1<n;i++){
            int temp=arr[i+m-1]-arr[i];
            if(temp<min){
                min=temp;
            }
        }
        return min;

    }
    public static void main(String[] args){
        int arr[]={3, 4, 1, 9, 56, 7, 9, 12} , m = 5;
        System.out.println(min(arr,5));


    }
}