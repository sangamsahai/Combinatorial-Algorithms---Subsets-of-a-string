This application prints all the subsets of a string using the concept of Recursive Backtracking.

Basically ,in this code,I maintain an array which holds all the possible combinations of 0 and 1 .
And the length of the array is equal to the length of the string.
Now, considering the fact that for subsets, either a letter will be selected , or it would not be selected.
If 0  represents not selected and 1 means selected , then printing the string
on the basis of the array of 0 and 1 will give us all the possible subsets of the given string.

Since every letter can either be selected or rejected, so there are 2 possibilities for every letter.
Hence the complexity if this algorithm is O(2^n).