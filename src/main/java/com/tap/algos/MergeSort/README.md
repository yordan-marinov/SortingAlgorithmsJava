# Merge Sort

1. Beginning to split the array by half recursively.
2. Each new array(firstArray / secondArray) is been filled with all elements, 
   and these are saved into the callstack before we split them again till the bottom of the recursion.
    - The bottom of the recursion is when elements in the new array are less than two (one or zero if the array length is odd number).
3. After the array is split to a single element this means is sorted we need to start collecting all the elements back to one array.
4. Every single element is sorted by itself, but we need to sort between them by value.
5. Going up the callstack iterating the two arrays we compare the two elements starting from index 0,
   because we are sure that there are sorted.
6. Getting the smallest between them two and putting into the new array.
   
