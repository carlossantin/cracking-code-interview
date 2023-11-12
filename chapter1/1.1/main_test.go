package main

import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestHasUniqueChars(t *testing.T) {

	testCases := map[string]bool{
		"":      true,
		"Ab":    true,
		"Aba":   true,
		"afda":  false,
		"aba":   false,
		"abbc":  false,
		"baab":  false,
		"abab":  false,
		"abcAd": true,
		"AbcAd": false,
	}

	for key, val := range testCases {
		if val {
			assert.True(t, hasUniqueChars(key))
		} else {
			assert.False(t, hasUniqueChars(key))
		}
	}
}

func TestHasUniqueCharsBinaryOnlyLowercase(t *testing.T) {

	testCases := map[string]bool{
		"":     true,
		"abcd": true,
		"afda": false,
		"aba":  false,
		"abbc": false,
		"baab": false,
		"abab": false,
	}

	for key, val := range testCases {
		if val {
			assert.True(t, hasUniqueCharsBinaryOnlyLowercase(key))
		} else {
			assert.False(t, hasUniqueCharsBinaryOnlyLowercase(key))
		}
	}
}
