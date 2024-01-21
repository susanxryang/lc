package main

import "fmt"

func main() {
	nums := []int{1, 5, 0, 3, 5}
	fmt.Print(minimumOperations(nums))
}

func minimumOperations(nums []int) int {
	res := map[int]bool{}
	for _, v := range nums {
		if v != 0 {
			res[v] = true
		}
	}
	return len(res)
}
