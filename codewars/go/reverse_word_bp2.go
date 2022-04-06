package kata

import "strings"

func Reverse(str string) (result string) {
  for _, v := range str{
    result = string(v) + result
  }
  return result
}

func ReverseWords(str string) (result string) {
  words := strings.Split(str, " ")
  for i, v := range words{
    words[i] = Reverse(string(v))
  }

  return strings.Join(words, " ") // reverse those words
}
