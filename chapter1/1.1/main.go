package main

import (
	"fmt"
	"os"
)

func main() {
	args := os.Args[1:]
	fmt.Printf("String %s has unique characters? %t\n", args[0], hasUniqueChars(args[0]))
}

func hasUniqueChars(s string) bool {
	charsInt := [128]int{}
	for _, c := range s {
		ascii := int(c)
		charsInt[ascii] = charsInt[ascii] + 1
		if charsInt[ascii] > 1 {
			return false
		}
	}

	return true
}
