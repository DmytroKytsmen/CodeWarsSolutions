public class BrakedBalance {

   public static boolean isStringBalanced(String string){
     int brackets = 0;
     for (int i = 0; i < string.length(); i++){
       if (string.charAt(i) == ')' && brackets == 0)
         return false;
       if (string.charAt(i) == ')')
         brackets--;
       if (string.charAt(i) == '(')
         brackets++;
     }
     if (brackets == 0)
     return true;
     return false;

   }

}