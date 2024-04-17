public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int xor=0;
        //find xor of 1-n and array elements
        // All elements will occur twice except missing no and repeating no.
        for(int i=0;i<A.length;i++){
            xor^=A[i];
            xor^=(i+1);
        }
        int rightMostSetBitMask = xor&-xor; 
        /*
            x   = a no. of 1, b no of 0, 1, c no of 0
            x`  = a no. of 0, b no of 1, 0, c no of 1 // once compliment switch all bits
            x`` = a no. of 0, b no of 1, 0, c no of 1 + 1; //two's compliment = once compliment +1, which is -x
            x`` = a no. of 0, b no of 1, 1, c no of 0;
                        &
            x   = a no. of 1, b no of 0, 1, c no of 0;
        x&x``   = a no. of 0, b no of 0, 1, c no of 0;  
        */
        int ele1=0,ele2=0;
        for(int i=0;i<A.length;i++){
            if((rightMostSetBitMask&A[i])==0){
                ele1^=A[i];
            }else{
                ele2^=A[i];
            }
            if((rightMostSetBitMask&(i+1))==0){
                ele1^=(i+1);
            }else{
                ele2^=(i+1);
            }
        }
        int count=0;
        for(int val:A){
            if(val==ele1){
                count++;
            }
        }
        if(count==2){
            return new int[]{ele1,ele2};
        }else{
            return new int[]{ele2,ele1};
        }
    }
}
