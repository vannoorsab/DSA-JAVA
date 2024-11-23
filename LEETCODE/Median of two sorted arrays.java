class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int n:nums1){
            list.add(n);
        }
        for(int num:nums2){
            list.add(num);
        }
       Collections.sort(list);
        int n=list.size();
        if(n%2==1){
            return list.get(n/2);
        }
        else{
            return (list.get(n/2-1)+list.get(n/2))/2.0;
        }
        
    }
}