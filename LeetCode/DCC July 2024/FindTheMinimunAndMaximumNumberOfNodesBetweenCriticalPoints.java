// A critical point in a linked list is defined as either a local maxima or a local minima.

// A node is a local maxima if the current node has a value strictly greater than the previous node and the next node.

// A node is a local minima if the current node has a value strictly smaller than the previous node and the next node.

// Note that a node can only be a local maxima/minima if there exists both a previous node and a next node.

// Given a linked list head, return an array of length 2 containing [minDistance, maxDistance] where minDistance is the minimum distance between any two distinct critical points and maxDistance is the maximum distance between any two distinct critical points. If there are fewer than two critical points, return [-1, -1].

 
// Example 1:


// Input: head = [3,1]
// Output: [-1,-1]
// Explanation: There are no critical points in [3,1].


class FindTheMinimunAndMaximumNumberOfNodesBetweenCriticalPoints{
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode pre = head;
        ListNode cur = head.next;
        int[] ans = {-1, -1};
        int prePosition = -1, curPosition = -1, firstPosition = -1, position = 0;
        while (cur.next != null) {
            if ((cur.val < pre.val && cur.val < cur.next.val) || (cur.val > pre.val && cur.val > cur.next.val)) {
                // local
                prePosition = curPosition;
                curPosition = position;
                if (firstPosition == -1) {
                    firstPosition = position;
                }
                if (prePosition != -1) {
                    if (ans[0] == -1) ans[0] = curPosition - prePosition;
                    else ans[0] = Math.min(ans[0], curPosition - prePosition);
                    ans[1] = position - firstPosition;
                }
            }
            position++;
            pre = cur;
            cur = cur.next;
        }
        return ans;
    }
}