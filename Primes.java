public class Primes {
    public static void main(String[] args) {
        int count = 0;
        double pre = 0;
        int n = Integer.parseInt(args[0]);
        boolean [] isprime = new boolean[n+1];
        isprime[0] = false;
        isprime[1] = false;
        int x = 2;
        for(int i = 2; i <= n; i++)
        {
            isprime[i] = true;
        }
        while (x <= Math.sqrt(n)) 
        {
            for(int j = x; j <= n; j++)
            {
                if (j % x == 0 && j != x) 
                {
                    isprime[j] = false;    
                }
            }
            for(int k = x + 1; k <= n; k++)
            {
                if (isprime[k] == true) 
                {
                    x = k; 
                    break;   
                }
            }
        }
        System.out.println("Prime numbers up to " + n + ":");
        for(int l = 0; l <= n; l++)
        {
            if (isprime[l] == true) 
            {
                System.out.println(" " + l);
                count++;
            }
        }
        pre = ((double)count/n) * 100;
        System.out.println("");
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + (int)pre + "% are primes) ");
    }
}
