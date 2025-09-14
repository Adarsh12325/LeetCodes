class Solution {
    public int[] plusOne(int[] digits) {
            // for(int i=digits.length-1;i>=0;i--){
            //     if(digits[i]<9){
            //         digits[i]++;
            //         return digits;
            //     }
            //     digits[i]=0;
            // }
            // int[] x=new int[digits.length+1];
            // x[0]=1;
            // return x;
            int Sum = (1+digits[digits.length-1])%10;
            int carry=(1+digits[digits.length-1])/10;
            digits[digits.length-1]=Sum;
           System.out.println(Sum);
            for(int i=digits.length-2;i>=0;i--){
                int x=digits[i];
               digits[i]=(x+carry)%10;
               carry=(x+carry)/10;
               System.out.println(digits[i]);
    }
    if(digits[0]==0){
        int[] arr=new int[digits.length+1];
        arr[0]=1;
        return arr;
    }
    return digits;
}
}