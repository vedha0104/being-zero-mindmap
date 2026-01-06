//Set is an interface  which can be defined by 3 classes which are 
//HashSet
//Linked HashSet
//Tree set

//find 2 elements whose sum is equal to the target
boolean find_Sum(int[] arr,int tar)
  {
   Set<Integer> st = new HashSet<>();
  for(int i = 0;i < arr.length;i++)
    {
      int rem = tar - arr[i];
      if(st.contains(rem)
         {
        return true;
      }
      else{
        st.add(arr[i]);
      }
    }
  return false;
}



//count total number of Unique rows
public int uniqoeRows(List<List<Integer>> l,int[] ar)
  {
  SetInteger> st = new HashSet<>();
  for(int i = 0;i < ar[i].length;i++)
    {
      st.add(ar[i]);
    }
  return st.size();
}
