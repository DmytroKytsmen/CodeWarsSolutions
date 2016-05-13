public class PerfectPower {
  public static int[] isPerfectPower(int n) {
    // ...
    if (n <= 1){
    return null;}
    for (int i = 1; i * i <= n; i++){
    if (n % i == 0){
    for (int j = 1;j <=  31 - Integer.numberOfLeadingZeros(n) ;j++){
      if (Math.pow(i,j) == n)
      return new int[]{i,j};
    }
    }

    }
    return null;
  }
}