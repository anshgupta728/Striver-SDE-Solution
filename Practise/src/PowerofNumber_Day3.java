public class PowerofNumber_Day3 {
    static double myPow(double x, int n) {
        double ans=1.0; long nn=n;
        if(nn<0)
            nn=-nn;
        while(nn!=0){
            if(nn%2==0){
                x*=x;
                nn/=2;
            }
            else{
                ans=ans*x;
                nn-=1;
            }
        }
        if(n<0)
            ans= (double)1.0/ans;
        return ans;
    }
    public static void main(String args[]){
        System.out.println(myPow(2.0, 10));
        System.out.println(myPow(3.0, 5));
    }
}
