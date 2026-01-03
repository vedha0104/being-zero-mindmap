//Java Program Structure
import java.util.Scanner; // import statement 
class java_basics//class definition
  {
    public static void main(String[] args){ // main method
    Scanner s = new Scanner(System.in); //Object creation for Scanner to take input dynamically 
    int n = s.nextInt();
    int m = s.nextInt();
    int sum = n + m;
    System.out.println("sum : " +sum);
   }
}

// DataTypes in java
class DataTypesDemo {
    public static void main(String[] args) {
        byte b = 100;//sc.nextByte(); method to take input
        short s = 10000;//sc.nextShort()
        int i = 100000;//sc.nextInt()
        long l = 10000000000L;//sc.nextLong()
        float f = 10.5f;//sc.nextFloat()
        double d = 99.99;//sc.nextDouble()
        char c = 'A';
        boolean bool = true;// sc.nextBoolean()
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
    }
}
//conditional statements example
//senior citizen 
class SeniorCitizen
  {
    public static void main(String[] args)
    {
      Scanner s = new Scanner(System.in);
      String gender = s.next();
      int age = s.nextInt();
      if(gender.equalsIgnoreCase("m") && age >= 60)
        System.out.println("Senior Citizen");
      else if(gender.equalsIgnoreCase("f") && age >= 58)
        System.out.println("Senior Citizen");
      else{
        System.out.println("Not A senior Citizen");
    }
  }

//
