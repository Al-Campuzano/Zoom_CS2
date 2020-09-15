> The ancient hero Achilles has an amazing power: he can cut the distance to his goal in half with only a single step. Also, he can take a normal step, which (for Achilles) covers 1 meter. Write pseudocode for a recursive function that counts how many steps Achilles will take to reach his goal, given an input distance in meters.

I'm assuming here that we're using integers only so we'll only cut the distance (d) in half if distance is an even number.

The base case here would be where distance is zero, and we would have two possible calls to the recursive function: if distance is an even number then we call the function on half the value of distance, otherwise we call the function on distance minus one. We would set up a variable to keep count of many calls to the function were made, by incrementing its value by one every time the function is called, except when the base case is reached.

Pseudo-code:

- Check for base case, returning if distance is zero.
- Set up counting variable
- If distance is even call the function on distance divided by half, saving the value in the counting variable we set up.
- If distance is odd call the function on distance minus one, saving the value in the counting variable.
- Increase the counting variable by one.
- Return the counting variable.
