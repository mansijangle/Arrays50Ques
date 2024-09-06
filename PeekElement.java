*/ Given an 0-indexed array of integers arr[] of size n, find its peak element and return it's index. An element is considered to be peak if it's value is greater than or equal to the values of its adjacent elements (if they exist).

Note: The output will be 1 if the index returned by your function is correct; otherwise, it will be 0.*/





class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       //add code here.
       
    int low = 0;
    int high = n - 1;

    while (low <= high) {
        int mid = low + (high-low) / 2;

        if((mid==0 || arr[mid] >=arr[mid-1]) && (mid == n-1  || arr[mid] >= arr[mid+1])){
            return mid;
        }
        if(mid >0 && arr[mid-1] > arr[mid]){
            high = mid -1;
        }else{
           
             low = mid + 1;
        }
    }
    
    return -1; 
    }
}