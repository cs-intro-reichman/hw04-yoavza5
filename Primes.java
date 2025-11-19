public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean [] isprime = new boolean[n+1];
        isprime[0] = false;
        isprime[1] = false;
        int x = 2;
        for(int i = 2; i < n; i++)
        {
            isprime[i] = true;
        }
        while (x <= Math.sqrt(n)) 
        {
            for(int j = x; j < n; j++)
            {
                if (j % x == 0 && j != x) 
                {
                    isprime[j] = false;    
                }
            }
            for(int k = x + 1; k < n; k++)
            {
                if (isprime[k] == true) 
                {
                    x = k; 
                    break;   
                }
            }
        }
    }
}