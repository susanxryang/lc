package main

import "fmt"

func main() {
	nums := []int{6, 5, 5}
	fmt.Println(majorityElement(nums))
}

func majorityElement(nums []int) int {
	m := map[int]int{}
	for _, num := range nums {
		m[num] = m[num] + 1
	}
	fmt.Println(m)
	for num, count := range m {
		if float64(count) >= float64(len(nums))/2.0 {
			return num
		}
	}
	return -1
}
