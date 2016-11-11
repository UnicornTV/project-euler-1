package main

import "fmt"

func main() {
	start, finish, lcm := 1, 20, 1
	sum := lcm

	for i := start; i <= finish; i++ {
		for sum%i != 0 {
			sum += lcm
		}
		lcm = sum
	}
	fmt.Println(sum)
}
