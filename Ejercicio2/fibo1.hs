fib2 n = ifibonacci n 1 1
  where ifibonacci 0 nm1 nm2 = nm2
        ifibonacci n nm1 nm2 = ifibonacci (n-1) (nm1+nm2) nm1