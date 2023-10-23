package Extra;
class leftright {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int leftsum[]=new int[n];
        int rightsum[]=new int[n];
        int ans[]=new int[n];
        leftsum[0]=0;
        rightsum[n-1]=0;
        for(int i=1;i<n;i++)
        {
            leftsum[i]=nums[i-1]+nums[i];
        }
        for(int i=0;i<n-1;i++)
        {
            rightsum[i]=nums[i]+nums[i+1];
        }
        for(int i=0;i<n;i++)
        {
            ans[i]=leftsum[i]-rightsum[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        leftright e=new leftright();
        int[] n=new int[]{10,4,8,3};
        System.out.println(e.leftRightDifference(n));
    }
}