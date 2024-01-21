package main

import (
	"fmt"
)

func main() {
	nums := []int{1, 2, 3, 4, 5, 6, 7}
	k := 3
	rotate(nums, k)
	fmt.Println(nums)
}

func rotate2(nums []int, k int) {
	k = k % len(nums)
	if k == 0 {
		return
	}

	temp := make([]int, 0, len(nums))
	temp = append(temp, nums[len(nums)-k:]...)
	temp = append(temp, nums[:len(nums)-k]...)

	copy(nums, temp)
}

func rotate(nums []int, k int) {
	n := len(nums)
	k %= n
	reverse(nums, 0, n-1)
	reverse(nums, 0, k-1)
	reverse(nums, k, n-1)
}

func reverse(nums []int, start int, end int) {
	for start < end {
		nums[start], nums[end] = nums[end], nums[start]
		start++
		end--
	}
}
