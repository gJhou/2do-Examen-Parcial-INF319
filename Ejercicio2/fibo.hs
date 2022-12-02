fib 0 = 1
fib 1 = 1
fib n=let a (h:h':t) _=(h+h':h:h':t)
      in head $ foldl a [1,1] [2..n] 