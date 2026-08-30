package leetcode.Questions;

//2091
class MinMaxDelete {
    public static void main(String[] args) {
        int[] arr = {2,10,7,5,4,1,8,6};
        int result = minimumDeletions(arr);
        System.out.println(result);
    }
    public static int minimumDeletions(int[] nums) {
        int n = nums.length;
        if(n == 1) return 1;

        int min = 0;
        int max = 0;

       //find indices of min and max
        for(int i=0; i<n; i++){
            if(nums[i] < nums[min]){
                min = i;
            }
            if(nums[i] > nums[max]){
                max = i;
            }
        }

        // i->left index and j-> right index = normal order 
        int i = Math.min(min, max);
        int j = Math.max(min, max);

        int front = j + 1; // op1: Delete from front
        int back = n - i; // op2: delete from back

        int bothSide = (i+1)+(n-j); // delete from left right bothSides

        return Math.min(front, Math.min(back, bothSide)); // return min of all three
    }
}