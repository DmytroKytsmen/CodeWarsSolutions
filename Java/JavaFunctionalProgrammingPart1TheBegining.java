import java.util.function.Function;

public class FunctionalProgramming {
  public static Function<Student, Boolean> f = p -> p.getFullName().equals("John Smith") && p.studentNumber.equals("js123");//Make me a function; remember to set the types!
}