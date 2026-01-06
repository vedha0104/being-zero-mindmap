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
    

  //Diagonal Traversal of the Matrix:
  List<Integer> diagonalTraversal(int[][] mat)
    {
    List<Integer> ans = new ArrayList<>();
    int n = mat.length;
    for(int c = 1;c < n;c++)
      {
        int j =0;
        int i = 0;
        int sum = 0;
        while(i < n)
          {
            sum += mat[i][j];
            i++;
            j++;
          }
            ans.add(sum);
      }
    for(int r = n - 1;r <= 0;r--)
      {
        int i = 0;
        int j = r;
        int sum = 0;
        while(j < n)
          {
            sum += mat[i][j];
            i++;
            j++;
          }
        ans.add(sum);
      }
    return ans;
  }


  //prefix sum on a 2d array
  int[]  sum_2d(int mat[][])
    {
    int r = mat.length;
    int c = mat[0].length;
    for(int i = 0;i < r;i++)
      {
        for(int j = 0;j < c;j++)
          {
            if(i == 0 && j > 0)
            {
              mat[i][j] += mat[i][j - 1];
            }
            else if(j == 0 && i > 0)
            {
              mat[i][j] += mat[i - 1][j];
            }
            else if(i > 0 && j > 0)
            {
              mat[i][j] += mat[i - 1][j] + mat[i][j - 1] + mat[i - 1][j - 1];
            }
            else{
              
              return mat;
            }
            return mat;
          }
      }
    return mat;
  }

  //given a data of 1 billion people sort them based on their age
  public int[] ageSort(int[] age)
    {
    int[] fre = new int[209];
    for(int ele : age)
      {
        freq[ele]++;
      }
    int[] ans = new int[age.length];
    int k = 0;
    for(int i =0;i < freq.length;i++)
      {
        int t = freq[i];
        while(f-- != 0)
          {
            ans[k++] = i;
          }
        return ans;
      }
  }
    
