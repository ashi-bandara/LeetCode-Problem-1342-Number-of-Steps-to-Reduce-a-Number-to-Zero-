class Solution {
    public int numberOfSteps(int num) {
        int numCopy = num; //to avoid mutating the original number we obtain a copy
        int steps = 0; // to count the number of steps encountered

        while(numCopy!=0){ // we continue the process until the number is 0
            if(numCopy%2 == 0){ // if numCopy is even
                numCopy = numCopy/2 ;
                steps++;
            }
            else{ // if numCopy is odd
                numCopy = numCopy - 1;
                steps++;
            }
        }
        return steps;
    }
}