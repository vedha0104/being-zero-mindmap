//Sorting 
//given an array find the largest permutation
public int[] solve(int a[], int n, int b) {
int[] ans = Arrays.copyOf(a, n);
if(b = 0) return a;
Map<Integer, Integer> in = new HashMap<>();
for(int i=0;i<n;i++)
{
in.put(ans[i],i);
}
for(int i=0;i< n && b> 0;i++)
{
int m = n-i;
if(ans[i] == m) continue;
int m_iin.get(m);
in.put(ans[i],m_i);
int temp ans[i];
ans[i] = ans[m_i];
ans[m_i] = temp;
b-;
}
return ans;
}
