//Map data structure 
// Map of list
class Main {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int T = s.nextInt();
s.nextLine();
Map<Integer, List<String>> mp = new TreeMap<>();
for(int i = 0 i< T;i++)
{
String name = s.next();
int count = s.nextInt();
mp.putIfAbsent (count, new ArrayList<>());
mp.get(count).add(name);
}
for(int i = 0; i <= T ;i++)
{
System.out.print(i+":");
if(mp.containsKey(i))
{
for(String stud: mp.get(i))
{
System.out.print(" "+stud);
}
}
System.out.println();
}


  //Give an array of integersand target print the indices such that adding 2 numbers should be equal to the target
  public int[] solve(int[] a, int n, int k) {
Map<Integer, Integer> m =new HashMap<>();
for(int i=0;i < n;i++)
{
int cka[i];
if(m.containsKey(c))
{
int f_im.get(c);
int s_i = i;
return new int[]{Math.min(f_i,s_i), Math.max(f_i,s_i)};
}
m.put(a[i],i);
}
return new int[]{-1,-1};
  }



//give a list of words and their meanings,for each query print the meaning 

class Main {
public static void main(String[] args) {
Scanner S new Scanner(System.in);
int T = s.nextInt();
Map<String, String> d = new HashMap<>();
for(int i=0;i< T;i++)
{
String word = s.next();
String mean s.next();
d.put(word, mean);
}
int q=s.nextInt();
StringBuilder res = new StringBuilder();
for(int i=0;i<q;i++){
String qu= s.next();
res.append(d.get(qu)).append("\n");
}
System.out.println(res.toString());
}
}

  //given marks with student names ,print the culmulative marks 
  class Main {
public static void main(String[] args) {
Scanner S = 1 new Scanner(System.in);
int Ts.nextInt();
s.nextLine();
Map<String, Integer> score = new HashMap<>();
for(int i=0;i< T;i++)
{
String name= s.next();
int marks = s.nextInt();
score.put(name, score.getOrDefault(name,0)+marks);
}
int Q = s.nextInt();
s.nextLine();
StringBuilder ans = new StringBuilder();
for(int i=0;i< Q;i++)
{
String qname = s.nextLine();
ans.append(score.getOrDefault(qname, 0)).append("\n");
}
System.out.println(ans.toString().trim());
