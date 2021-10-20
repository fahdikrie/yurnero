-- Enter your code here. Read input from STDIN. Print output to STDOUT

zipWord :: String -> String -> [[Char]]
zipWord word1 word2 =
    [[m, n] | (m, n) <- zip word1 word2]

printWord :: [[Char]] -> IO()
printWord zipped = putStr $ concat zipped

main :: IO()
main = do
    word1 <- getLine
    word2 <- getLine
    let zipped = zipWord word1 word2
    printWord zipped
