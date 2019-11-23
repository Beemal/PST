// Complete the minimumBribes function below.

/* 
Print an integer denoting the minimum number of bribes needed to get the queue into its final state. Print Too chaotic if the state is invalid, i.e. it requires a person to have bribed more than  people.

Sample Input
2           // t = number of test cases
5           // n = numbers in array
2 1 5 3 4   // a[] = array inputs
5
2 5 1 3 4


Sample Output
3              // optput for test #1
Too chaotic   // output for test #2

*/
    
    static void minimumBribes(int[] a) {
        int shift = 0;
        for (int i = 0; i < q.length; i++) {
            int val = i + 1;         // expectedValue = 1 2 3 4 5 ....
            if (a[i] > val+2) {         // if the given arrayItem exceed by 2 
                System.out.println("Too chaotic");
                return;
            } 
            
            for (int j = 0; j < i; j++){
                if (a[i] < a[j]) {        //if arrayItem is smaller than any of the value before itself.  
                    shift++;
                }
            }
        }
        System.out.println(shift);
    }
