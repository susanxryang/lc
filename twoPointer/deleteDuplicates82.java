public class deleteDuplicates82 {
    public static void main(String[] args){
        // int[] nums = {0,0,1,1,1,2,2,3,3,4};
        // System.out.print(removeDuplicates(nums) + " " + nums);
        // for (int i=0; i<nums.length; i++) 
        // System.out.print(nums[i]+" "); 
    }   

    public static int deleteDuplicates(ListNode head) {  
        if(head == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy, cur = head;

        boolean repeat = false;
        while(cur.next != null){
            if(cur.val == cur.next.val){
                repeat = true;
                cur = cur.next;
            } else {
                cur = cur.next;
                if(!repeat){
                    pre = pre.next;
                }
                pre.next = cur;
                repeat = false;
            }
        }

        if(repeat) pre.next = null;
        return dummy.next;
    }
}
