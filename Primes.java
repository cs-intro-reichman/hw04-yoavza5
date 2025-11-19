public class Primes {
    public static void main(String[] args) {
        int count = 0;
        double pre = 0;
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
        System.out.print("Prime numbers up to 7:");
        for(int l = 0; l < n; l++)
        {
            if (isprime[l] == true) 
            {
                count++;
            }
        }
        pre = ((double)count/n) * 100;
        System.out.println("");
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + (int)pre + "% are primes) ");
    }
}

There are 25 primes between 2 and 100 (25%25 are primes)
Prime numbers up to 7: 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97%0AThere are 25 primes between 2 and 100 (25.0%25 are primes)