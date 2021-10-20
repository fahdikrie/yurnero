f :: [Int] -> [Int]
f []       = []
f [x]      = []
f (x:y:xs) = [y] ++ f xs

fMap :: [Int] -> [Int]
fMap = map snd . filter (odd . fst) . zip [0..]

fHead :: [Int] -> [Int]
fHead (x:xs) = (head xs) : fHead (tail xs)

-- This part deals with the Input and Output and can be used as it is. Do not modify it.
main = do
	inputdata <- getContents
	mapM_ (putStrLn. show). f. map read. lines $ inputdata