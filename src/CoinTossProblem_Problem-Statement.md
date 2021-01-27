# PROBLEM STATEMENT

Rathi and Neha are playing an interesting game. There is a stack of N coins in front of them. They take turns in picking up coins from the stack. One may take any number of coins from the stack in one go that is a finite power of 2. The one who picks up the last coin wins! Given the number of coins in the stack, find out who wins the game assuming both play their best game assuming Rathi plays the game first!

<b>Input</b>:
An input contains the only positive integer number N

<b>Output</b>:
Print 1 if Rathi wins and 2 if Neha wins. Also if Rathi wins then print the minimum number of coins he should pick at the first move in order to guarantee his victory.

<b>Constraints</b>:
N ≤ 10^250  

<br/>

<b>SAMPLE INPUT</b>  
8

<b>SAMPLE OUTPUT</b>  
1  
2

## Explanation
For 8 coins in the stack when both play optimally, Rathi wins. Hence the first output line contains 1.
He should remove 2 stones from the stack in the first move. Hence the second output line contains 2.  

<br/>

<b>Time Limit</b>: 1.0 sec(s) for each input file.  
<b>Memory Limit</b>: 256 MB  
<b>Source Limit</b>: 1024 KB  
<b>Marking Scheme</b>: Score is assigned if any testcase passes.  
<b>Allowed Languages</b>: Bash, C, C++, C++14, C++17, Clojure, C#, D, Erlang, F#, Go, Groovy, Haskell, Java, Java 8, Java 14, JavaScript(Rhino), JavaScript(Node.js), Julia, Kotlin, Lisp, Lisp (SBCL), Lua, Objective-C, OCaml, Octave, Pascal, Perl, PHP, Python, Python 3, Python 3.8, R(RScript), Racket, Ruby, Rust, Scala, Swift-4.1, Swift, TypeScript, Visual Basic