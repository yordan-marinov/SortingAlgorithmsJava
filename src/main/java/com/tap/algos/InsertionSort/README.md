# Insertion Sort Algorithm

1. Iterating the array all the way through.
2. Dividing the array of two[sorted/unsorted] arrays, where first division point is index 1++.
    - The element on this index needs to be sorted and inserted into the sorted array.
3. Iterating the sorted array backwards till new element is smaller than the element 
on current index in sorted array.
   - On every iteration the bigger elements needs to be shifted by one index to the right
   - In case the new element is bigger than the curren one it is breaking out of the loop. 
