# Quicksort


1. The partition is done by setting the pivot(the last element in this case), this is the value which 
   we are going to compare all the rest of the elements to.
    - Starting from the first value and setting new index for the values smaller than the pivot.
      (all the values which are smaller than the pivot will be shifted to the left,
       the bigger or equal ones does not need to be moved)
2. Reaching the last element just before the pivot(bottom of the recursion) 
   we know that all smaller are on the left-hand side and the bigger on the right-hand side.
3. Moving the pivot on the position between the two groups to separate them.
4. Repeating the steps by calling the method recursively.
   - The bottom of the recursion is when the start index reach the position just before the pivot position(one element).