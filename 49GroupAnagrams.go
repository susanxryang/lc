package main

import (
	"fmt"
)

func main() {
	strs := []string{"eat", "tea", "bat", "nat", "tan"}
	fmt.Println(groupAnagrams(strs))
}

func strKey(str string) [26]byte { // maps a string to its byte array representation
	res := [26]byte{}
	for _, c := range str {
		res[c-'a']++
	}
	return res
}

func groupAnagrams(strs []string) [][]string {
	m := map[[26]byte][]string{} // make a map mapping sorted char to all anagram strings
	for _, s := range strs {
		key := strKey(s)
		m[key] = append(m[key], s)
	}

	result := make([][]string, 0, len(m))
	for _, v := range m {
		result = append(result, v)
	}
	return result

	// return maps.Values(m) cannot use Values for now
}
