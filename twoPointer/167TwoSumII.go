package main

import (
	"fmt"
)

func main() {
	numbers := []int{2, 7, 11, 15}
	target := 9

	fmt.Println(twoSum(numbers, target))
}

func twoSum(numbers []int, target int) []int {
	res := []int{}

	start := 0
	end := len(numbers) - 1
	for start < end {
		if numbers[start]+numbers[end] == target {
			res = []int{start + 1, end + 1}
			return res
		} else if numbers[start]+numbers[end] < target {
			start++
		} else {
			end--
		}
	}

	return res
}
