package array;

class Solution
{
    public static void main(String[] args) {
        long[] a = {4,5,12,67,46,98,45,80};
        long min = getMin(a,a.length);
        System.out.println("Min" +min);
        long max = getMin(a,a.length);
        System.out.println("Max" +max);
    }
    
    public static long getMin(long a[], long n){
        long min = a[0];
        for(int i=1; i< n; i++){
            min = Math.min(min,a[i]);
        }
        return min;
    }
    public static long getMax(long a[], long n){
        long max = a[0];
        for(int i=1; i< n; i++){
            max = Math.max(max, a[i]);
        }
        return max;
    }
}
