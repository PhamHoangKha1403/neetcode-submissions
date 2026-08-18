class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int left=1;
        int right = Arrays.stream(piles).max().getAsInt();;
        while(left<right)
        {
            int mid=left+(right-left)/2;
            int time=0;
            for(int pile:piles)
            {
                time+=((mid+pile-1)/mid);
            }
            
            if(time<=h) right=mid;
            else left=mid+1;
        }
        return left;

    }
}
