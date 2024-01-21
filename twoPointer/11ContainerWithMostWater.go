package main

import (
	"fmt"
	"math"
)

func main() {
	height := []int{1, 8, 6, 2, 5, 4, 8, 3, 7}
	fmt.Println(maxArea(height))
}

func maxArea(height []int) int {
	left, right := 0, len(height)-1
	area := 0
	for left < right {
		width := right - left
		new_area := float64(width) * math.Min(float64(height[right]), float64(height[left]))
		area = int(math.Max(float64(area), float64(new_area)))

		if height[left] < height[right] {
			left++
		} else {
			right--
		}
	}

	return area
}
