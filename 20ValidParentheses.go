package main

import "fmt"

func main() {
	s := "{}"
	fmt.Print(isValid(s))
}

var m = map[rune]rune{
	'(': ')',
	'[': ']',
	'{': '}',
}

func isValid(s string) bool {
	stack := []rune{}
	for _, char := range s {
		if _, ok := m[char]; ok {
			stack = append(stack, char)
		} else if len(stack) == 0 || m[stack[len(stack)-1]] != char {
			return false
		} else {
			stack = stack[:len(stack)-1]
		}
	}

	return len(stack) == 0
}
