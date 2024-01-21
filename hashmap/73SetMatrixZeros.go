package main

import (
	"fmt"
)

func main() {
	matrix := [][]int{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}}
	setZeroes(matrix)
	fmt.Println(matrix)
}

func setZeroes(matrix [][]int) {
	updated := make([][]bool, len(matrix)) // make matrix with same number of rows
	for row := range updated {
		updated[row] = make([]bool, len(matrix[0])) // fill each row with 0
	}

	for row := range matrix {
		for col := range matrix[0] {
			if matrix[row][col] == 0 && updated[row][col] == false {
				for i, _ := range updated[row] {
					if matrix[row][i] != 0 {
						updated[row][i] = true
					}
				}
				matrix[row] = make([]int, len(matrix[0])) // update the whole row to be 0

				for update_row := range matrix {
					if matrix[update_row][col] != 0 {
						updated[update_row][col] = true
					}
					matrix[update_row][col] = 0 // update col to be 0

				}
			}
		}
	}
}
