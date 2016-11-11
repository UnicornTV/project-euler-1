package main

import (
	"fmt"
	"math"
)

func main() {
	for a := 1; a < 500; a++ {
		for b := a; b < 500; b++ {
			result, c := isSquare(a*a + b*b)
			if result && a+b+c == 1000 {
				fmt.Println(a * b * c)
				break
			}
		}
	}
}

func isSquare(n int) (bool, int) {
	root := int(math.Sqrt(float64(n)))
	if root*root == n {
		return true, root
	}
	return false, -1
}
