package main

import "fmt"

func main() {
	counter := 0
	for i := 3; i <= 999; i++ {
		if i%3 == 0 || i%5 == 0 {
			counter += i
		}
	}
	fmt.Println(counter)
}
