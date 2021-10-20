-- Enter your code here. Read input from STDIN. Print output to STDOUT

permuteWord :: String -> [[Char]]
permuteWord []       = ["\n"]
permuteWord (x:y:xs) = [[y, x]] ++ permuteWord xs

printWord :: [[Char]] -> IO()
printWord zipped = putStr $ concat zipped

printTestCases :: Int -> IO()
printTestCases 0 = return ()
printTestCases n = do
    word <- getLine
    let permuted = permuteWord word
    printWord permuted
    printTestCases (n-1)

main :: IO()
main = do
    t <- getLine
    printTestCases (read t :: Int)