//Team Jokes--James Huang, Shafali Gupta, Kevin Feng
/*
*OUR ALGORITHM:
the goal:
Test our QuickSort class, specifically the quicksort function, and find out the generalized runtime of our sorting algorithm
what we did:
We initialized a new QuickSort instance, and we added a function to the QuickSort class that allowed us to utilize the System
timer to time the runtime of the quicksort algorithm. WE achieved this by finding the UTC from before running the function, and the UTC
after. We then subtracted the before from the after to get the runtime in nanoseconds.  This is very similar to the printToCSV function in the
MatrixFinder lab, and in fact is the same function call. This function outputs data in spreadsheet ready format. WE tested lengths from 2000- 40000,
all of which are large lists
*/
public class QuickSortTester {
  public static void main(String[] args) {
    QuickSort g=new QuickSort();
    int j=2000;
    System.out.println("length of array, time");
  for(;j<40000; j+=100) {
    // arrays of randomly generated ints
    int[] arrMatey = new int[j];
    for( int i = 0; i < arrMatey.length; i++ ) {
      arrMatey[i] = (int)( j* Math.random() );
    }
    g.printToCSV(arrMatey);
  }
  }
}
