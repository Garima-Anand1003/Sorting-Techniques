#Merge Sort -> Recursive Way
class Solution {
    public int[] sortArray(int[] nums) {
     mergeSort(nums,0,nums.length-1);
     return nums;  
    }
    void mergeSort(int nums[],int low,int high)
    {
        if(low >= high)
           return ;

        int mid=low+(high-low)/2;
         mergeSort(nums,low,mid);
         mergeSort(nums,mid+1,high);
        //Backtracking
        merge(nums,low,mid,high);
    }
    void merge(int nums[],int low,int mid,int high)
    {
        List<Integer> res=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high)
        {
            if(nums[left] <= nums[right]){
               res.add(nums[left]);
               left++;
            }
            else{
                 res.add(nums[right]);
               right++;
            }
        }
        while(left<=mid)
        {
            res.add(nums[left]);
            left++;
        }
          while(right <=high)
        {
            res.add(nums[right]);
            right++;
        }
        for(int i=low;i<=high;i++)
        {
          nums[i]=res.get(i-low);
        }
    }

}