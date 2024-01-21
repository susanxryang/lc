package main

import "fmt"

func main() {
	neg := adder()
	for i := 0; i < 4; i++ {
		fmt.Println(neg(-2 * i))
	}
}

func adder() func(int) int {
	sum := 0
	return func(x int) int {
		fmt.Println("sum: ", sum)
		fmt.Println("x: ", x)
		sum += x
		return sum
	}
}
