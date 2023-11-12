package main

import (
	"fmt"
	"time"
)

func URLify(s string) string {
	start := time.Now()
	chars := []rune(s)
	for i, char := range chars {
		if char == 32 {
			chars[i] = rune('%')
			for j := len(chars) - 1; j > i+1; j-- {
				chars[j-1] = chars[j-2]
				chars[j] = chars[j-1]
			}
			chars[i+1] = rune('2')
			chars[i+2] = rune('0')
		}
	}
	fmt.Printf("URLify Took %s\n", time.Since(start))
	return string(chars)
}

func URLify2(s string, trueLength int) string {
	start := time.Now()
	spaceCount, index, i := 0, 0, 0
	chars := []rune(s)
	for i = 0; i < trueLength; i++ {
		if chars[i] == 32 {
			spaceCount++
		}
	}

	index = trueLength + spaceCount*2
	for i = trueLength - 1; i >= 0; i-- {
		if chars[i] == 32 {
			chars[index-1] = rune('0')
			chars[index-2] = rune('2')
			chars[index-3] = rune('%')
			index = index - 3
		} else {
			chars[index-1] = chars[i]
			index--
		}
	}

	fmt.Printf("URLify2 Took %s\n", time.Since(start))
	return string(chars)
}
