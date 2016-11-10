package main

import "fmt"

func main() {
	n, factor := 600851475143, 2

	for n > factor {
		if n%factor == 0 {
			n /= factor
			factor = 2
		} else {
			factor++
		}
	}
	fmt.Println(n)
	fmt.Println(factor)
}
