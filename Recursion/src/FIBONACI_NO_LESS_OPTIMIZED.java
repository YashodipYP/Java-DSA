public class FIBONACI_NO_LESS_OPTIMIZED {

    public static int fib(int n) {
            if(n==1)return 1;
            if(n==0)return 0;

            return fib(n-2)+fib(n-1);
        }

    public static void main(String[] args) {
        System.out.println(fib(3));
    }

}
//The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
//
//F(0) = 0, F(1) = 1
//F(n) = F(n - 1) + F(n - 2), for n > 1.
//Given n, calculate F(n).
//
//
//
//Example 1:
//
//Input: n = 2
//Output: 1
//Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
//Example 2:
//
//Input: n = 3
//Output: 2
//Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.



//Not Optimal Bcoz
//This is your **LeetCode submission result**. Here's what each part means:
//
//### ⏱ Runtime
//
//* **10 ms** → Your solution took **10 milliseconds** to execute.
//* **Beats 26.22%** → Your solution was **faster than 26.22%** of accepted Java submissions.
//
//  * It also means **73.78%** of accepted Java solutions were faster.
//
//So your runtime is **correct, but not particularly fast**.
//
//---
//
//### 💾 Memory
//
//* **41.86 MB** → Your program used **41.86 MB** of memory.
//* **Beats 85.86%** → Your solution used **less memory than 85.86%** of accepted Java submissions.
//
//This is **very good memory usage**. 👍
//
//---
//
//### 📊 The Graph
//
//The blue bars show how many accepted solutions fall into each runtime bucket.
//
//The blue person icon marks **your solution**.
//
//Since your icon is near the **10 ms** bar, it means your runtime is around **10 ms**.
//
//---
//
//### Why is the runtime not very good?
//
//You solved Fibonacci using **plain recursion**:
//
//```text
//fib(5)
//├── fib(4)
//│   ├── fib(3)
//│   │   ├── fib(2)
//│   │   └── fib(1)
//│   └── fib(2)
//└── fib(3)
//    ├── fib(2)
//    └── fib(1)
//```
//
//Notice that `fib(3)` and `fib(2)` are computed **multiple times**. This repeated work makes the recursive solution slower.
//
//Later, when you learn **memoization** and **dynamic programming**, you'll reduce the runtime dramatically.
//
//---
//
//### Overall
//
