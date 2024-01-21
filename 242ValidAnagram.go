package main

import "fmt"

func main() {
	s := "anagram"
	t := "nngaram"
	fmt.Println(isAnagram(s, t))
}

func isAnagram(s string, t string) bool {
	if len(s) != len(t) {
		return false
	}
	m := map[rune]int{}
	for _, char := range s {
		m[char] = m[char] + 1
	}
	for _, char := range t {
		m[char] = m[char] - 1
		if m[char] < 0 {
			return false
		}
	}
	return true
}
