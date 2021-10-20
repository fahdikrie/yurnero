{- References
    - tugas 5 pascalInfinite
    - https://stackoverflow.com/questions/27233133/pascal-triangle-in-haskell
    - https://stackoverflow.com/questions/36895974/printing-pascals-triangle-in-haskell
-}

import Data.List

pascalInfinite :: [[Integer]]
pascalInfinite = [1] : map (\l -> zipWith (+) (l ++ [0]) (0:l)) pascalInfinite

printPascal :: [[Integer]] -> IO()
printPascal = mapM_ (putStrLn . unwords . map show)

main :: IO()
main = do
    input <- getLine
    let pascalList = take (read input :: Int) pascalInfinite
    printPascal $ pascalList