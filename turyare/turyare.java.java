import java.util.Scanner;
public class abdi {
public static void main(String[] args) {
Scanner abdi = new Scanner(System.in);

System.out.print("Enter the first value (without decimal points): ");
int firstValue = abdi.nextInt();
System.out.print("Enter the second value (without decimal points): ");
int secondValue = abdi.nextInt();
if (secondValue < firstValue) {
System.out.println("Programming is Logic");
} 
else
{
           
 int divisionResult = firstValue / 2;
int multiplicationResult = divisionResult * secondValue;
System.out.println("The result is: " + multiplicationResult);
}
abdi.close();
}
}
