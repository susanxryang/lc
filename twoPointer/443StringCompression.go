package main

import (
	"fmt"
	"strconv"
)

func main() {
	chars := []byte{'a', 'a', 'b', 'b', 'c', 'c', 'c'}

	fmt.Println(compress(chars))
	fmt.Println(chars)
}

func compress(chars []byte) int {
	count_curr := 1
	// prev_char := chars[0]
	count_input := 0
	for i := 1; i <= len(chars); i++ {
		if i < len(chars) && chars[i] == chars[i-1] {
			count_curr++
		} else {
			chars[count_input] = chars[i-1]
			count_input++
			if count_curr > 1 {
				// chars[count_input] = byte((count_curr))
				// count_input++
				for _, ch := range strconv.Itoa(count_curr) {
					// fmt.Println("strconv.Itoa(count_curr)", strconv.Itoa(count_curr))
					// fmt.Print("ch", ch)
					chars[count_input] = byte(ch)
					count_input++
					// fmt.Println("chars", chars)
				}
			}
			count_curr = 1
		}
	}
	// chars = chars[:count_input]

	return count_input
}
