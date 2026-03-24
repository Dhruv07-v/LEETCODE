class Power50{
    public double myPow(double x, int n) {
        long N = n; // handle overflow

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double ans = 1;

        while (N > 0) {
            if (N % 2 == 1) {
                ans *= x;
            }
            x *= x;
            N /= 2;
        }

        return ans;
        }
    

    public static void main(String[] args) {
        double x = 2.0000;
        int n = 2;
        Power50 p = new Power50();
        System.out.print(p.myPow(x, n));
    }

}