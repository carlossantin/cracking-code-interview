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

// Example: afda
// 'a'
// checker = 0
// val = 0      97 - 97
// if = (0000 & 0001) > 0000 => 0000 > 0000 => false
// checker = 0000 | 0001 => 0001
// 'f'
// val = 5      102 - 97
// if = (00 0001 & 10 0000) => 00 0000 > 00 0000 => false
// checker = 00 0001 | 10 0000 => 10 0001
// 'd'
// val = 3      100 - 97
// if = (10 0001 & 00 1000) => 00 0000 > 00 0000 = false
// checker = 10 0001 | 00 1000 => 10 1001
// 'a'
// val = 0
// if = (10 1001 & 00 0001) => 00 0001 > 00 0000 => true
func hasUniqueCharsBinaryOnlyLowercase(s string) bool {
	checker := 0
	for i := 0; i < len(s); i++ {
		val := int(s[i]) - 'a'
		if (checker & (1 << val)) > 0 {
			return false
		}
		checker = checker | (1 << val)
	}
	return true
}
