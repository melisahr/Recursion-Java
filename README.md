# Recursion-Java

Overview:
Following along a YouTube video, I made a recursion method to simulate someone walking. 
Recursion is the process of a method to call itself continuously.
It's a method calling a method. 
Without a condition, or a base case, it'll cause an infinity loop and a Stack Overflow error. 
In addition to a recursion method, I used a scanner, if-else loop, and a static void method. 
The scanner allows the user to input the amount of meter/s that they would like walk.
The methods are name as takeAStep. 

How?

There a two methods, one inside the main and the other method is outside of it.
The main's method is the recurse method. The recurse method will have two arguements.
Zero will be the start and the distance will be the variable. 
Create the second method, the static void and the recursive call. Inside the
parameters it has an integer assigning it to "i" and the distance as an integer.  
Add the base case with a if statement. If the "i", the starting point, is less than
the distance, the amount of steps taken. Then increment the counter, "i", by one. Add a println 
message for the user in the amount of the step they took and include the index next to it.
Then call the method with two argument, the counter and the distance. 
In the else statement, add a println message of reaching to the finish line. 

