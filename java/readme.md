#### java data structure used
1.  HashSet: Contain_Duplicate.java

2.  StringBuilder: Count_and_say.java
     - toString()

#### algorithm improvements
1. First_unique_character_in_string:
   - don't find the min of the hashmap, try to scan the String again.
   - don't use the hashmap since the string only contains lowercase english letters.

2. Delete_node_in_a_linked_list:
    - move val and node.next = node.next.next

2. String_to_integer:
    - the only possible position that the symbol will appear is the first non-zero character, if not, any '+' or '-' after that position will be regard as normal character. So, we need to test the symbol at that place, don't combine the test of symbol and digit together, which will complicate the testing.


#### auxiliary function
1. String:
    - Character.isDigit(c)
    - Character.isLetter(c)

2. Integer:
    - Integer.MAX_VALUE
    - Integer.MIN_VALUE


#### take care:
1. First_unique_character_in_string:
    - check if index == -1 before using charAt(index).
    - check if input String s.length() < 1 to avoid s = "".
    - when use letter[26] to represent the frequency of letter appears in the String, the index of letter should be c-'a'.

2. Reverse Integer:
    - the max and min range of integer respectively.
    - check before update reserve and remain.


3. Valid Palindrome:
   - when facing the String, please check if index beyond the range of the string.

4. Remove Nth Node From End:
    - when ListNode curr points to the node, we can't end the list by assignning curr = null. The correct is to make prev.next = null. 

5. TreeNode.java:
    - return an anonymous array: return new int[] {1, 2, 3};
    - if(i < nums.length && nums[i] != null) then in the else if, we still need to check if i < nums.length:
    if(i < nums.length && nums[i] != null){
          statement1;
    }
    else if(i < nums.length && nums[i] == null){
          statement2;
    }

#### summary
1. For String
    - letter[26] or character[256] need to use when concerning about frequency.

2. For ListNode:
    - remove one node, Delete_node_in_a_linked_list.java