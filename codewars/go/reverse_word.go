package kata

import "strings"

func ReverseWords(str string) string {
	splitted := strings.Split(str, " ")

	for index, word := range splitted {
		splitted[index] = ReverseWord(word)
	}

	return strings.Join(splitted, " ")
}

func ReverseWord(str string) string {
	bytes := []rune(str)

	for i, j := 0, len(bytes)-1; i < j; i, j = i+1, j-1 {
		bytes[i], bytes[j] = bytes[j], bytes[i]
	}

	return string(bytes)
}
