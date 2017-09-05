# What is Functional Programming

- ## Programs using only *`pure functions`*
	- *Pure functions* have no side effects

- ### What is a side effect?
	- Reassigning a variable
	- Modifying a data structure in place
	- Setting a field on an object
	- Throwing an exception or halting with an error
	- Printing to the console or reading a user input
	- Reading from or writing to a file	
---
# Exactly what is a pure function?


- ## *```f: A => B```* is a computation which relates every value a of type **A** to exaclty one value b of type **B** 
	- *```def intToString(n: Int): String```*

- ### A pure function has no effect on the execution of the program other than to compute a result given its inputs
- ### Pure functions can be proved by using the *referential transparency* expression property

---
# Exactly what is a pure function?

- An *expression*  **e** is ***referentially transparent*** if it can be replaced with its corresponding values without changing the program's behavior
 
 -		The Scottish Parliament meets in the capital of Scotland
 means the same as
 -		The Scottish Parliament meets in Edinburgh
 
- A function **f** is *pure* if the expression *f(x)*  is referentially transparent for all *x*

---
# Why Functional Programming?

- ### More modularity
	- components can be reused indipendetly
	
- Pure function is modular and composable
- We can reuse the logic wherever we want
- We don't care about state changes may occure before or after the function's execution
		
 
 
---

# Example of scala program

```
object MyModule {
  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  def main(args: Array[String]): Unit =
    println(formatAbs(-42))
}
```
	
 
 
---
