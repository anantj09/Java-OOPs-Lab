

interface Function{
    public int evaluate(int param);
}
class Half implements Function{
    public int evaluate(int param){
        return param/2;
    }
}

public class L4_Q6 {
    public static int[] halfArray(int arr[]){
        int len = arr.length;
        int res[] = new int[len];
        Half half = new Half();
        for(int i = 0;i<len;i++){
            int val = half.evaluate(arr[i]);
            res[i] = val;
        }

        return res;
    }
    public static void main(String[] args) {
        int arr[] = {8,9,3,5,12,4,18,22};
        int res[] = halfArray(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = 0;i<res.length;i++){
            System.out.print(res[i] + " ");
        }
    }
}
