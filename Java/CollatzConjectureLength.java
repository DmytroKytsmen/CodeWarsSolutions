public class Collatz {
  public static long conjecture(long n) {
    long counter = 0;
    while (n != 1){
    if (n % 2 == 0){
    n /= 2;
    counter++;
    }
    else{
    n = n * 3 + 1;
    counter++;
    }
    }
    return counter + 1;
  }
}