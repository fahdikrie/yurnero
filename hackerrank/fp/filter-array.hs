f :: Int -> [Int] -> [Int]
f n arr = --Fill up this function
    [num | num <- arr, num < n]

-- Using filter function
fFilter :: Int -> [Int] -> [Int]
fFilter n arr = filter (< n) arr

-- The Input/Output section. You do not need to change or modify this part
main = do 
    n <- readLn :: IO Int 
    inputdata <- getContents 
    let 
        numbers = map read (lines inputdata) :: [Int] 
    putStrLn . unlines $ (map show . f n) numbers