package main

import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestIsPermutation(t *testing.T) {
	permutationCases := map[string][]string{
		"":     {""},
		"test": {"estt"},
		"ABC":  {"ACB", "BAC", "BCA", "CBA", "CAB"},
	}

	for key, valArr := range permutationCases {
		for _, val := range valArr {
			assert.True(t, isPermutation(key, val))
			assert.True(t, isPermutation2(key, val))
		}
	}

	nonPermutationCases := map[string][]string{
		"test": {"astt"},
		"ABC":  {"BDAC", "CBB", "DAS", "QWE"},
		"DBC":  {"ACB"},
	}

	for key, valArr := range nonPermutationCases {
		for _, val := range valArr {
			assert.False(t, isPermutation(key, val))
			assert.False(t, isPermutation2(key, val))
		}
	}

}
