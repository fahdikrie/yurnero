-- Enter your code here. Read input from STDIN. Print output to STDOUT

import Data.List

removeDupes :: (Ord a) => [a] -> [a]
-- removeDupes = map head . group
removeDupes string =
    foldl (\acc char -> if char `elem` acc then acc else acc ++ [char]) [] string

main :: IO ()
main = do
    str <- getLine
    putStrLn $ removeDupes str

