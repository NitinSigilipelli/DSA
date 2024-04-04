class Solution {
    void reverse(int[] nums,int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public int[] nextPermutation(int[] nums) {
        //step 1 : finding the break point 
        //Break point -> ind
        int ind =-1;
        int n = nums.length;
        for(int i = n-2 ; i>=0;i--){
            if(nums[i] < nums[i+1]){
                ind = i;
                System.out.println(ind);
                break;
            }  
        }
        if(ind == -1){
            reverse(nums,0);
            return nums;
        }
        //step -2 :find > ind but the smallest one so that you stay close
        for(int i = n-1;i>=ind;i--){
            if(nums[i] > nums[ind]){
                swap(nums,i,ind);
                break;
            }
        }
        System.out.println(Arrays.toString(nums));
        //step-3: inorder to get the after element of ind to get too close permutation reverse them
        reverse(nums,ind+1);

        return nums;
        
    }
}
