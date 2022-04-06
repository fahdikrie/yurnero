package kata

import "strings"

func duplicate_count(s1 string) int {
	runes := []rune(strings.ToLower(s1))
	maps := make(map[rune]int)

	for _, char := range runes {
		if _, ok := maps[char]; ok {
			maps[char] += 1
		} else {
			maps[char] = 1
		}
	}

	var count int = 0

	for _, val := range maps {
		if val > 1 {
			count += 1
		}
	}

	return count
}
