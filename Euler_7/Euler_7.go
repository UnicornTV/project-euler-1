package main

import (
	"fmt"
	"math"
	"time"
)

func main() {
	count, check := 6, 14
	for check < 2e5 {
		if isPrime(check) {
			count++
		}
		if count == 10001 {
			break
		}
		check++
	}
	fmt.Println(check)
	defer timeTrack(time.Now(), "Euler 7")
}

func isPrime(n int) bool {
	if n%2 == 0 {
		return false
	}
	max := math.Sqrt(float64(n))

	for divisor := 3; float64(divisor) <= max; divisor += 2 {
		if n%divisor == 0 {
			return false
		}
	}
	return true
}

func timeTrack(start time.Time, name string) {
	elapsed := time.Since(start)
	fmt.Printf("%s took %s \n", name, elapsed)
}
