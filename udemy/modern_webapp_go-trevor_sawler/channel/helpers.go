package helpers

import (
	"math/rand"
	"time"
)

func RandomNumber(n int) int {
	// Seed is necessary so that rand.Intn will always
	// return a different number each time.
	rand.Seed(time.Now().UnixNano())

	value := rand.Intn(n)
	return value
}
