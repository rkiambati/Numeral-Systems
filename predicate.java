// This code proves that there is no number that can satisfy the following predicate: (𝑥 is prime) ∧ (𝑥 + 1337 is prime)
//In the main is a loop that goes through 100,000 numbers and checks through predicator to see if there are any matches
//Since nothing is printed to the console, it is hard to say if there is any value that satisfies the predicator
public class predicate {
    private static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=num/2;i++)
        {
            if((num%i)==0)
                return  false;
        }
        return true;
    }
    public static boolean predicator(int n){
        if(isPrime(n) && isPrime(n + 1337)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Statement: (x is prime) ∧ (x + 1337 is prime)");
        predicate n = new predicate();
        for(int i = 0; i < 1000000 ;i++){
            if(predicator(i) == true){
                System.out.println(i);
            }
        }


    }
}
