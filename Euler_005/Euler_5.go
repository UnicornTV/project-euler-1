package main

import (
	"fmt"
	"time"
)

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
	defer timeTrack(time.Now(), "Euler_6")
}

func timeTrack(start time.Time, name string) {
	elapsed := time.Since(start)
	fmt.Printf("%s took %s\n", name, elapsed)
}
