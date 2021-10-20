-- Enter your code here. Read input from STDIN. Print output to STDOUT

import Data.List

strReduction :: [Char] -> [Char]
strReduction [] = []
strReduction [c] = [c]
strReduction (x:xs)
    | elem x xs = strReduction xs
    | otherwise = x:strReduction xs

main = do
    str <- getLine
    putStrLn $ reverse $ strReduction $ reverse str

-- Alternate solution
-- main = interact nub
