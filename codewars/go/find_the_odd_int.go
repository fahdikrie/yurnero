package kata

func FindOdd(seq []int) int {
	// TODO: UNSOLVED

	maps := map[int]int{}

	for _, num := range seq {
		if _, ok := maps[num]; ok {
			maps[num] += 1
		} else {
			maps[num] = 1
		}
	}

	for _, num := range maps {
		if maps[num] % 2 != 0 {
			return maps[num]
		}
	}

	return 0
}
