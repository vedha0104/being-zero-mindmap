//Logic building is includes relating Mathematics to the programming.
//Print n natural numbers for n-times
import java.util.*;
class Main{
  void display(int n)
  {
    for(int i = 0;i<= n;i++)
      {
        for(int j = 0;j <= n;j++)
          {
            System.out.print(j);
            System.out.print(" ");
          }
          System.out.println();
      }
}

//Printing pattern
//*
//**
//***
//****
//*****

 class Printing_pattern
 {
void print()
   {
     for(int i = 1;i <= 4;i++)
     {
      for(int j = 2;j <= i;j++)
      {
        System.out.println("*");
        System.out.println(" ");
      }
       System.out.println();
     }
   }
 }



//FACTORIAL of n where n is 0<= n<=10
  class finding_fact
    {
      public static void main(String a[])
      {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0)
          {
            int n = s.nextInt();
            BeingZero bz = new BeingZero();
            int ans = bz.fact(n);
            System.out.print(ans);
          }
      }
    }
class BeingZero 
{
   int fact  (int n)
   {
      int ans = 1;
     for(int i =  2;i<= n;i++){
      ans += i - 1;
       }
    }
}


//Modulo Arithmetic
//(a*b)% m = ((a %m) *(b%m)) * m
//(a+b)%m= ((a %m)+(b%m)) % m
//(a - b) %m = ((a % m)-(b%m) + m)%m






