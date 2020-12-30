#### java data structure used
1.  HashSet: Contain_Duplicate.java

#### algorithm improvements
1. First_unique_character_in_string:
   - don't find the min of the hashmap, try to scan the String again.
   - don't use the hashmap since the string only contains lowercase english letters.


#### take care:
1. First_unique_character_in_string:
    -check if index == -1 before using charAt(index).
    -check if input String s.length() < 1 to avoid s = "".
    -when use letter[26] to represent the frequency of letter appears in the String, the index of letter should be c-'a'.

2. Reverse Integer:
    -the max and min range of integer respectively.
    -check before update reserve and remain.


3. Valid Palindrome:
   -when facing the String, please check if index beyond the range of the string.


#### summary
1. For String
    -letter[26] or character[256] need to use when concerning about frequency.