package main

import "fmt"

func main() {
	nums1 := []int{1, 2, 2, 2, 1}
	nums2 := []int{2}
	fmt.Println(intersect(nums1, nums2))
}

func intersect(nums1 []int, nums2 []int) []int {
	var count = map[int]int{}
	var result = []int{}
	for _, num := range nums1 {
		count[num]++
	}
	for _, num := range nums2 {
		if count[num] > 0 {
			result = append(result, num)
			count[num]--
		}
	}
	return result
}
