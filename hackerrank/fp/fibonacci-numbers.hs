--Contributed by Ron Watkins
module Main where

-- Enter your code here to complete this function
fib 0 = 1
fib 1 = 0
fib n = fib (n-1) + fib (n-2)

-- With Lazy Evaluation
fibLazy :: Int -> Int
fibLazy n = last $ take n fibs
    where fibs = 0 : 1 : zipWith (+) fibs (tail fibs)

-- This part is related to the Input/Output and can be used as it is
-- Do not modify it
main = do
    input <- getLine
    print . fib . (read :: String -> Int) $ input