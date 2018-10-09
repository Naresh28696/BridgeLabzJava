# BridgeLabzJava
Functional Programs
User Input and Replace String Template “Hello <<UserName>>, How are you?” 
I/P -> Take User Name as Input. Ensure UserName has min 3 char
Logic -> Replace <<UserName>> with the proper name
O/P -> Print the String with User Name 
Flip Coin and print percentage of Heads and Tails
I/P -> The number of times to Flip Coin. Ensure it is positive integer.
Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
O/P -> Percentage of Head vs Tails
Leap Year
I/P -> Year, ensure it is a 4 digit number.
Logic -> Determine if it is a Leap Year.
O/P -> Print the year is a Leap Year or not.
Power of 2 
Desc -> This program takes a command-line argument N and prints a table of the powers of 2 that are less than or equal to 2^N.
I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
Logic -> repeat until i equals N.
O/P -> Print the year is a Leap Year or not.
Harmonic Number 
Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N (http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
I/P -> The Harmonic Value N. Ensure N != 0
Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
O/P -> Print the Nth Harmonic Value.
Factors
Desc -> Computes the prime factorization of N using brute force.
I/P -> Number to find the prime factors
Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
O/P -> Print the prime factors of number N.
Gambler
Desc -> Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke (i.e. has no money) or reach $goal. Keeps track of the number of times he/she wins and the number of bets he/she makes. Run the experiment N times, averages the results, and prints them out.
I/P -> $Stake, $Goal and Number of times
Logic -> Play till the gambler is broke or has won
O/P -> Print Number of Wins and Percentage of Win and Loss.
Coupon Numbers
Desc -> Given N distinct Coupon Numbers, how many random numbers do you need to generate distinct coupon number? This program simulates this random process.
I/P -> N Distinct Coupon Number
Logic -> repeatedly choose a random number and check whether it's a new one.
O/P -> total random number needed to have all distinct numbers.
Functions => Write Class Static Functions to generate random number and to process distinct coupons.
 2D Array
Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from standard input and printing them out to standard output.
I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
Logic -> create 2 dimensional array in memory to read in M rows and N cols 
O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with OutputStreamWriter to print the output to the screen.
Sum of three Integer adds to ZERO
Desc -> A program with cubic running time. Read in N integers and counts the   number of triples that sum to exactly 0.
I/P -> N number of integer, and N integer input array
Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
O/P -> One Output is number of distinct triplets as well as the second output is to print the distinct triplets.
Write a program Distance.java that takes two integer command-line arguments x and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
Write static functions to return all permutation of a String using iterative method and Recursion method. Check if the arrays returned by two string functions are equal. 
Simulate Stopwatch Program
Desc -> Write a Stopwatch Program for measuring the time that elapses between the start and end clicks
I/P -> Start the Stopwatch and End the Stopwatch
Logic -> Measure the elapsed time between start and end
O/P -> Print the elapsed time.
Cross Game or Tic-Tac-Toe Game 
Desc -> Write a Program to play a Cross Game or Tic-Tac-Toe Game. Player 1 is the Computer and the Player 2 is the user. Player 1 take Random Cell that is the Column and Row. 
I/P -> Take User Input for the Cell i.e. Col and Row to Mark the ‘X’
Logic -> The User or the Computer can only take the unoccupied cell. The Game is played till either wins or till draw...
O/P -> Print the Col and the Cell after every step.
Hint -> The Hints is provided in the Logic. Use Functions for the Logic…
Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c. Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be found using a formula 
delta = b*b - 4*a*c
Root 1 of x = (-b + sqrt(delta))/(2*a)
Root 2 of x = (-b - sqrt(delta))/(2*a)
Take a, b and c as input values to find the roots of x.
Write a program WindChill.java that takes two double command-line arguments t and v and prints the wind chill. Use Math.pow(a, b) to compute ab. 
Given the temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the National Weather Service defines the effective temperature (the wind chill) to be:

Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger than 120 or less than 3 (you may assume that the values you get are in that range).



Algorithm Programs
IMPORTANT NOTE - Create a Util Class and write the Anagram, Palindrome, Prime Numbers, Search Algos, Sort Algos, etc  as a static function
An Anagram Detection Example
Desc -> One string is an anagram of another if the second is simply a rearrangement of the first. For example, 'heart' and 'earth' are anagrams...
I/P -> Take 2 Strings as Input such abcd and dcba and Check for Anagrams
O/P -> The Two Strings are Anagram or not....
Take a range of 0 - 1000 Numbers and find the Prime numbers in that range. 
Extend the above program to find the prime numbers that are Anagram and Palindrome 
To the Utility Class write the following static methods
Desc -> Create Utility Class having following static methods
binarySearch method for integer
binarySearch method for String
insertionSort method for integer
insertionSort method for String
bubbleSort method for integer
bubbleSort method for String
I/P -> Write main function to call the utility function
Logic -> Check using Stopwatch the Elapsed Time for every method call
O/P -> Output the Search and Sorted List. More importantly print elapsed time performance in descending order
Question to find your number
Desc -> takes a command-line argument N, asks you to think of a number between 0 and N-1, where N = 2^n, and always guesses the answer with n questions.
I/P -> the Number N and then recursively ask true/false if the number is between a high and low value
Logic -> Use Binary Search to find the number
O/P -> Print the intermediary number and the final answer


Binary Search the Word from Word List
Desc -> Read in a list of words from File. Then prompt the user to enter a word to search the list. The program reports if the search word is found in the list.
I/P -> read in the list words comma separated from a File and then enter the word to be searched
Logic -> Use Arrays to sort the word list and then do the binary search
O/P -> Print the result if the word is found or not
Insertion Sort 
Desc -> Reads in strings from standard input and prints them in sorted order.
Uses insertion sort.
I/P -> read in the list words
Logic -> Use Insertion Sort to sort the words in the String array
O/P -> Print the Sorted List
Bubble Sort 
Desc -> Reads in integers prints them in sorted order using Bubble Sort
I/P -> read in the list ints
O/P -> Print the Sorted List 
Merge Sort  - Write a program with Static Functions to do Merge Sort of list of Strings. 
Logic -> To Merge Sort an array, we divide it into two halves, sort the two halves independently, and then merge the results to sort the full array. To sort a[lo, hi), we use the following recursive strategy:
Base case: If the subarray length is 0 or 1, it is already sorted.
Reduction step: Otherwise, compute mid = lo + (hi - lo) / 2, recursively sort the two subarrays a[lo, mid) and a[mid, hi), and merge them to produce a sorted result.
Find the Fewest Notes to be returned for Vending Machine
Desc -> There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be returned by Vending Machine. Write a Program to calculate the minimum number of Notes as well as the Notes to be returned by the Vending Machine as a Change
I/P -> read the Change in Rs to be returned by the Vending Machine
Logic -> Use Recursion and check for largest value of the Note to return change to get to minimum number of Notes. 
O/P -> Two Outputs - one the number of minimum Note needed to give the change and second list of Rs Notes that would given in the Change
To the Util Class add dayOfWeek static function that takes a date as input and prints the day of the week that date falls on. Your program should take three command-line arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the following formulas, for the Gregorian calendar (where / denotes integer division):
y0 = y − (14 − m) / 12
x = y0 + y0/4 − y0/100 + y0/400
m0 = m + 12 × ((14 − m) / 12) − 2
d0 = (d + x + 31m0 / 12) mod 7
To the Util Class add temperaturConversion static function, given the temperature in fahrenheit as input outputs the temperature in Celsius or viceversa using the formula
Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F
Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C
Write a Util Static Function to calculate monthlyPayment that reads in three command-line arguments P, Y, and R and calculates the monthly payments you would have to make over Y years to pay off a P principal loan amount at R per cent interest compounded monthly. The formula is The formula is



Write a static function sqrt  to compute the square root of a nonnegative number c given in the input using Newton's method:
- initialize t = c
- replace t with the average of c/t and t
- repeat until desired accuracy reached using condition Math.abs(t - c/t) > epsilon*t where epsilon = 1e-15;
Write a static function toBinary that outputs the binary (base 2) representation of the decimal number typed as the input. It is based on decomposing the number into a sum of powers of 2. For example, the binary representation of 106 is 11010102, which is the same as saying that 106 = 64 + 32 + 8 + 2. Ensure necessary padding to represent 4 Byte String.
To compute the binary representation of n, we consider the powers of 2 less than or equal to n in decreasing order to determine which belong in the binary decomposition (and therefore correspond to a 1 bit in the binary representation).
Write Binary.java to read an integer as an Input, convert to Binary using toBinary function and perform the following functions.
i. Swap nibbles and find the new number.
ii. Find the resultant number is the number is a power of 2.
A nibble is a four-bit aggregation, or half an octet. There are two nibbles in a byte.
Given a byte, swap the two nibbles in it. For example 100 is to be represented as 01100100 in a byte (or 8 bits). The two nibbles are (0110) and (0100). If we swap the two nibbles, we get 01000110 which is 70 in decimal.
You have a long list of tasks that you need to do today. To accomplish task  you need M minutes, and the deadline for this task is D . You need not complete a task at a stretch. You can complete a part of it, switch to another task, and then switch back.You've realized that it might not be possible to complete all the tasks by their deadline. So you decide to do them in such a manner that the maximum amount by which a task's completion time overshoots its deadline is minimized.
Input Format 
The first line contains the number of tasks, . Each of the next  lines contains two integers,D  and M .
Output Format 
Output T lines. The ith line contains the value of the maximum amount by which a task's completion time overshoots its deadline, when the first  tasks on your list are scheduled optimally.

Data Structure Programs
IMPORTANT NOTE - Use Generics to Solve all the Data Structure Programs
UnOrdered List
Desc -> Read the Text from a file, split it into words and arrange it as Linked List. Take a user input to search a Word in the List. If the Word is not found then add it to the list, and if it found then remove the word from the List. In the end save the list into a file
I/P -> Read from file the list of Words and take user input to search a Text
Logic -> Create a Unordered Linked List. The Basic Building Block is the Node Object. Each node object must hold at least two pieces of information. One ref to the data field and  second the ref to the next node object.
O/P -> The List of Words to a File.


Ordered List
Desc -> Read .a List of Numbers from a file and arrange it ascending Order in a Linked List. Take user input for a number, if found then pop the number out of the list else insert the number in appropriate position
I/P -> Read from file the list of Numbers and take user input for a new number
Logic -> Create a Ordered Linked List having Numbers in ascending order. 
O/P -> The List of Numbers to a File.

Simple Balanced Parentheses
Desc -> Take an Arithmetic Expression such as (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3) where parentheses are used to order the performance of operations. Ensure parentheses must appear in a balanced fashion.
I/P -> read in Arithmetic Expression such as (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3) 
Logic -> Write a Stack Class to push open parenthesis “(“ and pop closed parenthesis “)”. At the End of the Expression if the Stack is Empty then the Arithmetic Expression is Balanced. Stack Class Methods are Stack(), push(), pop(), peak(), isEmpty(), size()
O/P -> True or False to Show Arithmetic Expression is balanced or not.

Simulate Banking Cash Counter
Desc -> Create a Program which creates Banking Cash Counter where people come in to deposit Cash and withdraw Cash. Have an input panel to add people to Queue to either deposit or withdraw money and dequeue the people. Maintain the Cash Balance.
I/P -> Panel to add People to Queue to Deposit or Withdraw Money and dequeue 
Logic -> Write a Queue Class to enqueue and dequeue people to either deposit or withdraw money and maintain the cash balance
O/P -> True or False to Show Arithmetic Expression is balanced or not.

Palindrome-Checker
Desc -> A palindrome is a string that reads the same forward and backward, for example, radar, toot, and madam. We would like to construct an algorithm to input a string of characters and check whether it is a palindrome.
I/P -> Take a String as an Input 
Logic -> The solution to this problem will use a deque to store the characters of the string. We will process the string from left to right and add each character to the rear of the deque. 
O/P -> True or False to Show if the String is Palindrome or not.

Hashing Function to search a Number in a slot
Desc -> Create a Slot of 10 to store Chain of Numbers that belong to each Slot to efficiently search a number from a given set of number
I/P -> read a set of numbers from a file and take user input to search a number
Logic -> Firstly store the numbers in the Slot. Since there are 10 Numbers divide each number by 11 and the reminder put in the appropriate slot. Create a Chain for each Slot to avoid Collision. If a number searched is found then pop it or else push it. Use Map of Slot Numbers and Ordered LinkedList to solve the problem. In the Figure Below, you can see number 77/11 reminder is 0 hence sits in the 0 slot while 26/11 remainder is 4 hence sits in slot 4
O/P -> Save the numbers in a file


Number of Binary Search Tree
Solve the Problem in the following link https://www.hackerrank.com/challenges/number-of-binary-search-tree.
Write a program Calendar.java that takes the month and year as command-line arguments and prints the Calendar of the month. Store the Calendar in an 2D Array, the first dimension the week of the month and the second dimension stores the day of the week. Print the result as following.

Create the Week Object having a list of WeekDay objects each storing the day (i.e S,M,T,W,Th,..) and the Date (1,2,3..) . The WeekDay objects are stored in a Queue implemented using Linked List. Further maintain also a Week Object in a Queue to finally display the Calendar
Note - If a particular day has no date then the date is set as empty string and add it to queue. 
Modify the above program to store the Queue in two Stacks. Stack here is also implemented using Linked List and not from Collection Library
Take a range of 0 - 1000 Numbers and find the Prime numbers in that range. Store the prime numbers in a 2D Array, the first dimension represents the range 0-100, 100-200, and so on. While the second dimension represents the prime numbers in that range
Extend the Prime Number Program and store only the numbers in that range that are Anagrams. For e.g. 17 and 71 are both Prime and Anagrams in the 0 to 1000 range. Further store in a 2D Array the numbers that are Anagram and numbers that are not Anagram
Add the Prime Numbers that are Anagram in the Range of 0 - 1000 in a Stack using the Linked List and Print the Anagrams in the Reverse Order. Note no Collection Library can be used.
Add the Prime Numbers that are Anagram in the Range of 0 - 1000 in a Queue using the Linked List and Print the Anagrams from the Queue. Note no Collection Library can be used.
