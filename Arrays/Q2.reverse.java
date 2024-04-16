

public class reverse {

    public static void func(int[] arr,int start,int end){
         int N=arr.length;
        // int[] a=new int[N];
        // for(int i=0; i<N; i++){
        //     a[i]=arr[N-i-1];
        // }
        // for(int j:a){
        //     System.out.print(j+" ");
        // }

        //two pointer

        // int start=arr[0];
        // int end =arr[N-1];
        int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int j:arr){
            System.out.print(j+" ");
        }

    }
    public static void main(String[] args){
        int [] arr ={1,2,3,4,5,5,3,6,8,4,2,5,7,3,7,5,3,4};
        func(arr,0,arr.length-1);

    }
}
