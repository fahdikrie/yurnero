package kata

import "strings"

func duplicate_count(s string) (c int) {
    h := map[rune]int{}
    for _, r := range strings.ToLower(s) {
      if h[r]++; h[r] == 2 { c++ }
    }
    return
}
