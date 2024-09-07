/* Given an array arr. Your task is to find the minimum and maximum elements in the array.

Note: Return an array that contains two elements the first one will be a minimum element and the second will be a maximum of an array.
Java users need to return result in Pair class
For Example -> return new Pair(minimum,maximum)
*/

class Solution {
    public Pair<Long, Long> getMinMax(int[] arr) {
        // Code Here
        
        int n = arr.length;
        Arrays.sort(arr);
        long a = arr[0];
        long b = arr[n-1];
        return new Pair(a,b);
    }
}