public class Limit_Numbers {
     static int limit = 1000;
     static void fun2(int n){
        if(n<=0)
            return;
        if(n>limit)
            return;

         System.out.println(" "+n);
         fun2(2*n);
         System.out.println(" "+n);
    }

    public static void main(String[] args) {
        fun2(100);
    }
}
//Answer: For a positive n, fun2(n) prints the values of n, 2n, 4n, 8n ... while the value is smaller than LIMIT. After printing values in increasing order, it prints same numbers again in reverse order. For example fun2(100) prints 100, 200, 400, 800, 800, 400, 200, 100.
//If n is negative, the function is returned immediately.

//The second print happens **after** the recursive call returns. That's why it appears in **reverse order**.
//
//Let's trace it.
//
//```java
//static void fun2(int n)
//{
//    if (n <= 0)
//        return;
//    if (n > LIMIT)
//        return;
//
//    System.out.print(n + " ");   // (1)
//    fun2(2 * n);                 // (2)
//    System.out.print(n + " ");   // (3)
//}
//```
//
//Suppose we call:
//
//```java
//fun2(100);
//```
//
//### Step 1: Going down the recursion
//
//The first `print` executes immediately.
//
//```
//fun2(100)
//print 100
//    fun2(200)
//    print 200
//        fun2(400)
//        print 400
//            fun2(800)
//            print 800
//                fun2(1600)  // Stops because 1600 > 1000
//```
//
//So far the output is:
//
//```
//100 200 400 800
//```
//
//### Step 2: Coming back (unwinding)
//
//`fun2(1600)` returns.
//
//Now execution resumes **after** the recursive call inside `fun2(800)`:
//
//```
//print 800
//return to fun2(400)
//print 400
//return to fun2(200)
//print 200
//return to fun2(100)
//print 100
//```
//
//This adds:
//
//```
//800 400 200 100
//```
//
//### Final output
//
//```
//100 200 400 800 800 400 200 100
//```
//
//---
//
//### Visualize it like a stack
//
//```
//fun2(100)
//│
//├─ print 100
//└─ fun2(200)
//    │
//    ├─ print 200
//    └─ fun2(400)
//        │
//        ├─ print 400
//        └─ fun2(800)
//            │
//            ├─ print 800
//            └─ fun2(1600) → returns
//            └─ print 800
//        └─ print 400
//    └─ print 200
//└─ print 100
//```
//
//Notice:
//
//* **Before recursion** → prints in the order the calls are made (`100 → 200 → 400 → 800`).
//* **After recursion** → prints in the order the calls finish (`800 → 400 → 200 → 100`).
//
//This is a key property of recursion:
//
//* Code **before** the recursive call executes while **going down** the recursion tree.
//* Code **after** the recursive call executes while **coming back up** (unwinding the call stack).
//
//That's why the second print appears in reverse order.