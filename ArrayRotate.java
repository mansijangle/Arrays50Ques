class Solution {
    public boolean check(int[] arr) {


         // This is the optimal approach;
         int n = arr.length;
        int count = 0;
        
        Loop through the array to check for the break in the order
        for (int i = 0; i < n; i++) {
            if (arr[i] >= arr[(i + 1) % n]) {
                count++;
            }
            // If more than one break, it's not a rotated sorted array
            if (count > 1) {
                return false;
            }
        }
        return true;



        // This is the First approach brute-force approach ; 
        // int n = arr.length;
        // int rotationIndex =-1;
        // int p = 1;
        // int a[] = new int[n];
        // int x = 0;
        // for(int i=0; i<n; i++){
        //     a[x++] = arr[i];
        // }
        // for (int i = 0; i < n; i++) {
        //     if (arr[i] > arr[(i + 1) % n]) {

        //         rotationIndex = i + 1;
        //     }
        // }

        // Arrays.sort(a);
        // while(p<=rotationIndex){
        //     int lst = arr[0];
        //     for(int i=0; i<n-1; i++){
        //         arr[i] = arr[i+1];
        //     }
        //     arr[n-1] = lst;
        //     p++;
        // }

        // if(Arrays.equals(arr,a)){
        //     return true;
        // }
        // return false;


        // the second approch to solve this problem;


         

       // This is the third approach
       
        //    int c = 0 ;
        // for(int i = 0 ; i < arr.length ; i++){
        //     if(arr[i] > arr[(i+1)%arr.length]){
        //         c++;
        //     }
        // }
        // return c < 2 ;

        // This is the fourth approach
        
        // for(int i=1; i<n; i++){
        //     if(arr[i-1] > arr[i]){
        //         count++;
        //     }
        // }
        // if(arr[n-1]>arr[0]){
        //     count++;
        // }
        // if(count<=1){
        //     return true;
        // }
        // return false;

    }
}