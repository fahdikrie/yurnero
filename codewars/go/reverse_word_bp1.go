package kata

func ReverseWords(str string) string {
  var rev string
  var word string
  
  for _, i := range str {
    if i == ' ' {
      rev = rev + word + " " // Adds word and space to result
      word = "" // Empties word variable
    } else {
      word = string(i) + word // Adds letter to temporary word variable
    } 
  }
  
  return rev + word// reverse those words
  }
