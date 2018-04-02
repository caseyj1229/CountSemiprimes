public class CountSemiprimes {
    public static int[] solution(int N, int[] P, int[] Q){
        //N is the largest number found in array Q
        //Array P is the starting indices
        //Array Q contains the ending indices
        int[] sieved = new int[N+1];

        for(int i = 0; i < sieved.length; i++){
            sieved[i] = 0;
        }

        for(int i = 2; i*i <= N; i++){
            //If the current number is a prime, than all of its multiples are not primes
            if(sieved[i] == 0){
                for(int j = i*i; j <= N; j += i){
                    sieved[j] = i;
                }
            }
        }

        //
        int[] semiPrimeCounts = new int[N+1];
        for(int i = 1; i <= N; i++){
            semiPrimeCounts[i] = semiPrimeCounts[i-1];
            if(isSemiPrime(i,sieved)){
                semiPrimeCounts[i] += 1;
            }
        }

        int[] ret = new int[P.length];
        for(int i = 0; i < ret.length; i++){
            ret[i] = semiPrimeCounts[Q[i]]-semiPrimeCounts[P[i]-1];
        }

        return ret;
    }

    private static boolean isSemiPrime(int i, int[] sieved) {
        if(sieved[i] == 0){
            return false;
        }
        //return the result of sieved [number/sieved[num]
        //If the result is 0, the number located is a semiprime
        return (sieved[i/sieved[i]] == 0);
    }
}
