package main

import "fmt"

func main() {
	s := "III"
	fmt.Print(romanToInt(s))
}

func romanToInt(s string) int {
	m := map[byte]int{
		'I': 1,
		'V': 5,
		'X': 10,
		'L': 50,
		'C': 100,
		'D': 500,
		'M': 1000,
	}
	result := 0
	for i := 0; i < len(s)-1; i++ {
		char := s[i]
		next_char := s[i+1]
		if m[char] < m[next_char] {
			result += -m[char]
			continue
		}
		result += m[char]
	}
	result += m[s[len(s)-1]]
	return result
}
