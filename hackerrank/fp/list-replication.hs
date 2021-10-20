f :: Int -> [Int] -> [Int]
f n arr =
    concat $ map (\x -> take n (repeat x)) arr

fReplicate :: Int -> [Int] -> [Int]
fReplicate n arr =
    concat $ map (replicate n) arr

fMonad :: Int -> [Int] -> [Int]
fMonad n arr =
    arr >>= replicate n

-- Utilizing cartesian product (only returns num, not a)
fListComprehension :: Int -> [Int] -> [Int]
fListComprehension n arr =
    [num | num <- arr , a <- [1..n]]

-- This part handles the Input and Output and can be used as it is. Do not modify this part.
main :: IO ()
main = getContents >>=
       mapM_ print. (\(n:arr) -> f n arr). map read. words