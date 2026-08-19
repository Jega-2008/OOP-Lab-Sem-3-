import java.util.Scanner;
class convert{
void celsiustoothers(double c){
double f=(c*9/5)+32;
double k=c+273.15;
System.out.println("Celsius:"+c);
System.out.println("Fahrenheit:"+f);
System.out.println("Kelvin:"+k);
}
}
public class two{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
convert obj=new convert();
System.out.println("enter temperature in celsius:");
double temp=sc.nextDouble();
obj.celsiustoothers(temp);
sc.close();
}
}
