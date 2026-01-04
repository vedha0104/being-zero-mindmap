//Array is a linear Data structure,where size is fixed.
//Default value is 0 and can only store homogeneous elements.

//Read an Array of size n and print max value.
class main
  {
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      int t = s.nextInt();
      while(t-- != 0)
        {
          int n = s.nextInt();
          int arr[] = new int[n];
          for(int i = 0;i < n;i++)
            {
              arr[i] = s.nextInt();
            }
          int ans = arr[0];
          for(int i= 1;i < n;i++)
            {
              if(arr[i] > ans)
              {
                ans = arr[i];
              }
            }
          System.out.println(ans);
        }
    }
  }

//3 Idiot - count total number of 3 idiots in the array(3 idiot - 3 values where the difference between the consecutive vales is 1)
// function
int total_idiot(int a[])
  {
  int c = 0;
  for(int i = 0;i <= a.length;i++)
    {
      if(a[i + 2] - 1 == a[i + 1] && a[i+1] -1 == a[i])
      {
        c++;
      }
    }
  return c;

  //Find where array is palindrome or not

  boolean find_palin(int[] a)
    {
    int n = a.length;
    int i = 0;
    int j = n - 1;
    while(i <= j)
      {
        if(a[i] != a[j])
        {
          return false;
        }
        i++;
        j--;
      }
    return true;

  //Prefix Array
  long[] prefix(int[] arr)
    {
    long pre[] = new long[arr.length];
    pre[0] = arr[0];
    for(int i = 1;i < n;i++)
      {
        pre[i] = pre[i  -1] +arr[i];
      }
    return pre;
  }
    
