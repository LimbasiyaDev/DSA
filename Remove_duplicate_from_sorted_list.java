class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Remove_duplicate_from_sorted_list {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode result = sol.deleteDuplicates(head);
        while (result != null) {
            System.out.print(result.val + " "); // Output: 1 2
            result = result.next;
        }
    }
}
