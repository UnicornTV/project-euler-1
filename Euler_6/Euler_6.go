package main

import (
	"fmt"
	"time"
)

func main() {
	fmt.Println(difference(100))
	defer timeTrack(time.Now(), "Euler_6")
}
func difference(n int) int {
	sum, square, diff := 0, 0, 0

	for i := 1; i <= n; i++ {
		sum += (i * i)
		square += i
	}
	square *= square

	diff = square - sum

	return diff
}

func timeTrack(start time.Time, name string) {
	elapsed := time.Since(start)
	fmt.Printf("%s took %s\n", name, elapsed)
}
