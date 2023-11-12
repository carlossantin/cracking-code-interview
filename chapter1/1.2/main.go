package main

import (
	"fmt"
	"os"
	"sort"
)

func main() {
	args := os.Args[1:]
	fmt.Printf("String %s is permutation of %s? %t\n", args[0], args[1], isPermutation(args[0], args[1]))
}

type sortRunes []rune

func (s sortRunes) Less(i, j int) bool {
	return s[i] < s[j]
}

func (s sortRunes) Swap(i, j int) {
	s[i], s[j] = s[j], s[i]
}

func (s sortRunes) Len() int {
	return len(s)
}

func sortString(s string) string {
	r := []rune(s)
	sort.Sort(sortRunes(r))
	return string(r)
}

func isPermutation(s1, s2 string) bool {
	s1Ordered := sortString(s1)
	s2Ordered := sortString(s2)

	return s1Ordered == s2Ordered
}

func isPermutation2(s1, s2 string) bool {
	if len(s1) != len(s2) {
		return false
	}

	letters := [128]int{}
	for _, char := range s1 {
		letters[int(char)]++
	}

	for _, char := range s2 {
		letters[int(char)]--
		if letters[int(char)] < 0 {
			return false
		}
	}

	return true
}
