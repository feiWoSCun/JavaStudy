package LanQiao;

import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class XinYunShu2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[] nums = new int[n+1];
        for (int i = 1; i <= n; i++){
            nums[i] = 2*i-1;
        }
        int cur = 2;
        int res = 0;
        while (nums[cur] <= n){
            int tmp = cur;
            for (int j = cur; j < n; j++){
                if (j % nums[cur] != 0){
                    nums[tmp++] = nums[j];
                }
            }
            if (nums[cur] > m){
                res++;
            }
            cur++;
        }
        for(int a=0;a<nums.length;a++) {
            System.out.print(nums[a]+" ");
        }
        System.out.println(res);
        scan.close();
    }
}