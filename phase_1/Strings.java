//unlike other datatypes ,String is a class 
//Count all the vowels:(function version)
public int countVowels(String s)
  {
     int cnt = 0;
     int len = s.length();
for(int i = 0;i < len;i++)
  {
    char ch = s.charAt(i);
    if(isVowel(ch))
      cnt++;
  }
return cnt;
}
 public boolean isVowel(char ch)
   {
   if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
     return true;
   else
     return false;
 }

//Given 2 Strings S & T count the occurence of T in S.
public int countSub(String S, String T)
  {
  int sl = S.length();
  int tl = S.length();
  int c = 0;
  for(int i = 0;i <= sl + 1;i++)
    {
      String sub = S.substring(i,i + tl);
      c++;
      if(sub.equals(T))
      {
        c++;
      }
    }
  return c;
}

//return the sum of the DOB
int sum(String s)
  {
  int sum = 0;
String[] sa = s.split(" ");
for(String st : sa)
  {
    sum += Integer.parseInt(st);
  }
return sum;
}
