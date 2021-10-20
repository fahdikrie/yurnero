-- Enter your code here. Read input from STDIN. Print output to STDOUT

fib :: Integer -> Integer
fib n = fibacc n 0 1
    where
        fibacc 0 f1 f2 = f1
        fibacc n f1 f2 = fibacc (n-1) f2 (f1+f2) 

fibMod :: Integer -> Integer
fibMod n = fib n `mod` 100000007

printResult :: Integer -> IO()
printResult 0 = return ()
printResult t = do
    n <- getLine
    print $ fibMod (read n :: Integer)
    printResult (t-1)

main :: IO()
main = do
    t <- getLine
    printResult (read t :: Integer)

