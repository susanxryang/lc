package main

import (
	"fmt"
	"math"
)

func main() {
	s := "babad"
	fmt.Println(longestPalindrome(s))
}

func longestPalindrome(s string) string {
	if s == "" {
		return ""
	}
	start, end := 0, 0
	for i := 0; i < len(s)-1; i++ {
		len1 := expandAroundCenter(i, i, s)
		len2 := expandAroundCenter(i, i+1, s)
		maxLen := int(math.Max(float64(len1), float64(len2)))
		if maxLen > end-start {
			start = i - (maxLen-1)/2
			end = i + maxLen/2
		}
	}
	return s[start : end+1]
}

func expandAroundCenter(left int, right int, s string) int {
	l := left
	r := right
	for l >= 0 && r < len(s) && s[l] == s[r] {
		l--
		r++
	}
	return r - l - 1
}
