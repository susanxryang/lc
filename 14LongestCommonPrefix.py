from typing import List


# class Solution:

def longestCommonPrefix(strs: List[str]) -> str:
    result = ""
    for chars in range(0, len(strs[0])):
        check_char = strs[0][chars]
        curr_char = strs[0][0]
        for curr_str in range(1, len(strs)):
            if chars >= len(strs[curr_str]) or strs[curr_str][chars] != check_char:
                return result
            else:
                curr_char = strs[curr_str][chars]
        result += curr_char

    return result


# strs = ["flower", "flow", "flight"]
strs = ["dog","racecar","car"]
# strs = ["a"]
print(longestCommonPrefix(strs))
