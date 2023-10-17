public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                index = i;
            }
            else
            {
                if(target>nums[i])
                {
                    
                }
                else
                {
                    index=i;
                }
            }
        }
        return index;
    }
    public static void main(String[] args)
    {
        SearchInsert s=new SearchInsert();
    }
}
