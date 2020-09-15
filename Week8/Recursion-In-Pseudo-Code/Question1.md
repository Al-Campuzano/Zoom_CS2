> Suppose you are given a number n, and you want to determine the sum of all integers from 1 to n (inclusive) using recursion. Explain in English what the base case would be, and how you would reduce the problem size for the recursive call. Write pseudo-code that illustrates what the recursive function would look like, including what the inputs and output would be.

The base case would be `n == 1`, and the recursive call would be `n-1`. Here's some pseudo code:

- If base case return `1` (or `n`, same thing).
- Otherwise return `n` plus the result of calling the same recursive function on `n-1`

An example using `n = 3`:

- On the first call `n == 3` so base case is not reached, so we call the function on `n = 2`
- On the 2nd call `n == 2` so we still don't have the base case, so we call the function on `n = 1`
- On the third call we reached the base case so we return `1`
- The second call can now return `n + 1 == 3`.
- The third call can now return `n + 3 == 6`.
- The final result is `6`.
