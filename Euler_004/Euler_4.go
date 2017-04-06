package main

import "fmt"

func main() {
	total, a, b := 0, 999, 999

	for a >= 900 {
		total = a * b
		if reverseDigits(total) {
			break
		}
		a--
		if a == 900 {
			a = 999
			b--
		}
	}
	fmt.Println(total)
}

func reverseDigits(reverseThis int) bool {
	result, initial := 0, reverseThis

	for reverseThis > 0 {
		remainder := reverseThis % 10
		reverseThis /= 10
		result = result*10 + remainder
	}

	if result == initial {
		return true
	} else {
		return false
	}
}
