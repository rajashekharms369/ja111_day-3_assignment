# ja111_day-3_assignment

Q3) Define Wrapper Classes in Java.
Ans: The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.




Q4) Q4) Explain why the following block of code will give a compile time error?
public class Main {
public static void main(String[] args) {
float f=3.3;
System.out.println(f);
}
}
Ans: Mismatch data type. declared with double instead float
public class Main {
public static void main(String[] args) {
double f=3.3;
System.out.println(f);
}
}
