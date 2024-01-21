package main

import (
	"fmt"
	"math"
)

func main() {
	height := []int{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}
	fmt.Println(trap(height))
}

func trap(height []int) int {
	res := 0
	// find rhs trap water: find next greater/equal element on the right, height will be curr index
	// find lhs: find next greater/equal element on the right, height will be curr index
	max_left_height := make([]int, len(height))
	max_left_height[0] = 0
	max_right_height := make([]int, len(height))
	max_right_height[len(height)-1] = 0
	water := make([]int, len(height))

	for i := 1; i < len(height)-1; i++ {
		max_left_height[i] = int(math.Max(float64(max_left_height[i-1]), float64(height[i-1])))
	}

	for j := len(height) - 2; j > 0; j-- {
		max_right_height[j] = int(math.Max(float64(max_right_height[j+1]), float64(height[j+1])))
	}

	for i, _ := range water {
		diff := int(math.Min(float64(max_left_height[i]), float64(max_right_height[i]))) - height[i]
		if diff > 0 {
			water[i] = diff
		}

		res = res + water[i]
	}

	return res
}
