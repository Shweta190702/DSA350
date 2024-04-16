class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        // //code here
        // /*Arrays.sort(A);
        // int sum=A[0]+A[N-1];
        // return sum;*/
        
        int min=Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            if(A[i]<min){
                min=A[i];
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            if(A[i]>max){
                max=A[i];
            }
        }
        return min+max;
    }
}