package main

import "fmt"

func main() {
	secret := "1807"
	guess := "7810"
	fmt.Println(getHintSimple(secret, guess))
}

func getHint(secret string, guess string) string {
	// map record if num exist
	// for position
	m := map[rune]int{}
	skip_ind := map[int]bool{}
	bull := 0
	cow := 0
	for i, char := range secret {
		if rune(guess[i]) == char { // add to bull, remove/skip this char so that it cannot be counted towards cow
			bull++
			skip_ind[i] = true
		} else {
			m[char] = m[char] + 1
		}
	}
	fmt.Println(m)
	for i, char := range guess {
		if skip_ind[i] == false && m[char] > 0 {
			cow++
			m[char] = m[char] - 1
		}
	}
	str := fmt.Sprintf("%vA%vB", bull, cow)
	return str
}

func getHintSimple(secret string, guess string) string {
	var bulls, cows int
	m := make([]int, 10)

	for i := range secret {
		a, b := secret[i]-'0', guess[i]-'0' // a: char in secret, b: char in guess
		if a == b {
			bulls++
		} else {
			fmt.Println(m)
			if m[a] < 0 { // if m[a] < 0 meaning
				cows++
			}
			if m[b] > 0 {
				cows++
			}
		}
		m[a]++
		m[b]--

	}

	return fmt.Sprintf("%d%s%d%s", bulls, "A", cows, "B")
}
