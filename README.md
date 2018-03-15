# Team_Jokes
James Huang, Shafali Gupta, Kevin Feng


**Hypothesis**
For QuickSort, we think that in the majority of situations(aka a random, unsorted list of numbers), the runtime will be close to O(n)

**Analysis of our data**
![chart](QuickSort.png)
![WCS chart](WCS.png)

**Our Assessment**
Best case: The best case for QuickSort is O(nlogn) and that occurs when the pivot point is in the middle of the array. This results in the array being partitioned into two parts, which is logn operations. Then because our algorithm passes through each element in the array, which is n operations, we can combine the 2 operations
get a runtime of O(nlogn). Although the graph may look linear, this data set may be too small to notice the difference between nlogn and n. 

The average case: The most likely case for QuickSort is O(nlogn). This is because we randomize our pivot point each runthrough, decreasing the chance of us having the pivot at the ends of the array.

worst case: The worst case for QuickSort is O(n^2) and that occurs when the pivot point is on the
edges of the array. This results in the algorithm passing through each element twice (n*n) and when combined becomes n^2.

**Our Methodology**
What we did was use Shafali's quicksort algorithm and then modify it so that we could measure the runtime of the algorithm. We used the QuickSortTester.java function to make it more clear what we were doing. First, we used a function that printed out a file in csv format. WE timed the function starting from when we ran it, and we had a middle case, with random numbers, which ment our list was randomly unsorted. WE then did a worst case scenario, with the pivot point being on the edge of the array. This was much slower.
