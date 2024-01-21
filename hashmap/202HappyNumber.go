package main

import "fmt"

func main() {
	n := 19
	fmt.Println(isHappy(n))
}

func isHappy(n int) bool {
	if n < 10 {
		// If 7, the number will also be happy:
		// 7^2 = 49
		// 4^2 + 9^2 = 97
		// 9^2 + 7^2 = 130
		// 2^2 + 3^2 + 0^2 = 13
		// 1^2 + 3^2 = 10
		// 1^2 + 0^2 = 1 <- Happy!
		return n == 1 || n == 7
	}
	sum := 0 // sum is reset to 0 on each run

	for n > 0 {
		fmt.Println("sum now is ", sum)
		sum += (n % 10) * (n % 10)
		n /= 10
	}

	fmt.Println("sum after adding is ", sum)
	if sum == 1 {
		return true
	}

	return isHappy(sum)
}
