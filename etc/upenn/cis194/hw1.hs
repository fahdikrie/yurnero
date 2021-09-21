{-# OPTIONS_GHC -Wall #-}
-- Ref: https://www.seas.upenn.edu/~cis194/spring13/hw/01-intro.pdf

{- Problem A — Validating Credit Card Numbers -}

-- Exercise 1 — Find the digits of a number
toDigits :: Integer -> [Integer]
toDigits 0 = []
toDigits num = toDigits (num `div` 10) ++ [num `mod` 10]

toDigitsRev :: Integer -> [Integer]
toDigitsRev = reverse . toDigits

-- Exercise 2 — Double every 2s indexes
doubleEveryOther :: [Integer] -> [Integer]
doubleEveryOther [] = []
doubleEveryOther (x:[]) = [x]
doubleEveryOther (x:y:xs)
    | (length (x:y:xs)) `mod` 2 /= 0 = x : y+y : doubleEveryOther xs
    | otherwise                      = x+x : y : doubleEveryOther xs

-- Exercise 3 — Sum all digits
sumDigits :: [Integer] -> Integer
sumDigits = sum . map (sum . toDigits)

-- Exercise 4 — Validate CC
validate :: Integer -> Bool
validate num = (sumDigits . doubleEveryOther . toDigits) num `mod` 10 == 0

{- Problem B — Tower of Hanoi -}

-- Exercise 5 — Solve Tower of Hanoi Puzzle
type Peg = String
type Move = (Peg, Peg)
hanoi :: Integer -> Peg -> Peg -> Peg -> [Move]
hanoi 0 _ _ _ = []
-- To move n disc from a to b using c as temp,
hanoi n a b c = hanoi (n - 1) a c b ++  -- Move n - 1 disc from a to c using b as temp
                [(a, b)] ++             -- Move the top disc from a to b
                hanoi (n - 1) c b a     -- Move n - 1 disc from c to b using a as temp

-- Some solutions are taken from https://github.com/evansb/cis194-hw/blob/master/spring_2013/hw1/hw1.hs
