package main

import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestURLify(t *testing.T) {
	input := "Mr John Smith    "
	assert.Equal(t, "Mr%20John%20Smith", URLify(input))
	assert.Equal(t, "Mr%20John%20Smith", URLify2(input, 13))

	input = "MrJohnSmith"
	assert.Equal(t, "MrJohnSmith", URLify(input))
	assert.Equal(t, "MrJohnSmith", URLify2(input, 11))
}
