package main

import "fmt"

func main() {
	nums := []int{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}
	fmt.Println(longestConsecutive(nums))
}

func longestConsecutive(nums []int) int {
	longest := 0
	exist := map[int]struct{}
	for _, v := range nums {
		exist[v] = 1 // insert all element into hash
	}

	for _, s := range nums {
		if _, ok := exist[s-1]; !ok { // look for anything smaller alreay in the map
			seqLen := 1

			for {
				if _, ok := exist[s+seqLen]; ok {
					seqLen++
					continue
				}
				if seqLen > longest {
					longest = seqLen
				}
				break
			}
			// for {
			// 	curr_length++
			// 	if _, ok := exist[curr_val+1]; !ok {
			// 		if curr_length > longest {
			// 			longest = curr_length
			// 		}
			// 		break
			// 	}
			// 	curr_val++
			// }
		}

	}
	return longest
}
