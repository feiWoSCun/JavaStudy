public class PaiXu {
    public static void main(String[] args) {
        int[] arr={1,8,7,6,4,3,9};
        Process(arr,0,6);
        for(int a=0;a<arr.length;a++)
            System.out.print(arr[a]);
        System.out.println();
    }
    /*public static int getMax(int[] arr) {
        return Process(arr, 0, arr.length - 1);*/

    public static void Process(int[] arr, int L, int R) {
        if (L == R)
            return;
        int mid = L + ((R - L)>> 1);
        Process(arr, L, mid);
        Process(arr, mid + 1, R);
        merge(arr,L,mid,R);
    }
    public static void merge(int[] arr, int L, int M, int R) {
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = M + 1;
        while (p1 <= M && p2 <= R) {
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= M)
            help[i++] = arr[p1++];
        while (p2 <= R)
            help[i++] = arr[p2++];
        for (i = 0; i < help.length; i++) {
            arr[L + i] = help[i];
        }
    }
}