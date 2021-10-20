f :: [Int] -> Int
f arr = -- Fill up this function body
    sum [num | num <- arr, odd num]

fFilter :: [Int] -> Int
fFilter arr = sum (filter odd arr)

fFilter2 :: [Int] -> Int
fFilter2 = sum . filter odd

-- This part handles the Input/Output and can be used as it is. Do not change or modify it.
main = do
	inputdata <- getContents
	putStrLn $ show $ f $ map (read :: String -> Int) $ lines inputdata