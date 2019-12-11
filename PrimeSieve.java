import java.util.Arrays;

public class PrimeSieve {
    public static boolean[] sieve = new boolean [1000];
    
    public static void main(String[] args) {
        Arrays.fill(sieve, true); //sets all values to true
        sieve[0] = false;
        sieve[1] = false;
       
        //int b<=997;
        //int [] prime = new int [1000];
        //int [] prime = new int [count];
        //int a= prime.length;
        //write and implement the sieve algorithm
    
            for (int i=2;i<sieve.length; i++){ 
                for (int j= 2*i; j<sieve.length; j+=i){
                    sieve [j]=false;
          }
        }
     System.out.println(Arrays.toString(sieve));   
    //public static void collectPrimes (boolean []){
           // for (int i=2; i<= 97; i++){
                //if (int 
        //print a list of prime numbers to the console
        
    
    
    /*collectPrimes is its own method, using the info from changed universal 
     *sieve[] 
     *printPrimeFactors is then a second method, using info from collectPrimes

     */
    int[] result = collectPrimes();
    printPrimeFactors(132, result);
}
public static int[] collectPrimes(){
    if (sieve[j]= true){
    sumInt++;
}//loop that counts up all the true's in sieve =count
    int[]prime = new int [count];
    if (sieve[j]= true){
        int[]prime= {sieve[j]};
    }//loop that every time sieve has a true, the number for that position
    //becomes a prime in prime[] something like prime[m] = i
    return prime;
}
public static void printPrimeFactors(int k; int[] array){
    for (int i=0; i<array.length;i++){
        if (k% array[i] == 0){
            out.println("Prime factorization of " + i);
            System.out.println (int []prime + ":" + );
    
}
}



