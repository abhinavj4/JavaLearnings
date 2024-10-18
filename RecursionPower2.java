public class RecursionPower2 {
    public static int calcPow(int x, int n){
        //base case
        if(n==0){
            return 1;
        }
        int powNm1 = calcPow(x, n-1);
        int pow = x*powNm1;
        return pow;
    }
    public static void main(String[] args) {
        int x= 2, n=5;
        int ans = calcPow(x, n);
        System.out.println(ans);
        
    }
}
