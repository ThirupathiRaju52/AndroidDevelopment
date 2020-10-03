# AndroidDevelopment

## Lab -1 Review 

Here I am going to explain how to caluculate grades for user

**Step 1**:
  User needs to enter his name 
  
**Step 2**:
  User needs to enter his grade 

**Step 3**:
  User get letter grade what he/she got.
  
~Note~: User also get additional message how much score he/she needs to get get brade grade, 
If suppose he/she got 77 grade the lette rgrade is B but still he/she needs to get 2 more points inorder to get Good grade ( A grade).


## Code Explanation 

Used to implement this grading program

  DecimalFormat --> In order keep only 2 decimal places
  Scanner --> Why I choose because scanner has less little buffer compared to buffer reader
  Swith --> well, we do have other posssible scenarios with if condition, for loop, e.t.c.. Because Switch is mostly faster then other cases.
  
## Rules :
  1. User needs to enter his candidate name and grade.
  2. User can enter only 0-100
  3. User needs to enter one string (candidate name) and another one is double (grade)
  
## Code flow 
  1. written code to read two values from console , one is string another is grade.
  2. When receives both , depends upon the grade written code according to the rules .
  3. check all the conditions to check whether member got letter grade or not 
  4. If member got letter grade check it he got A grade or not if he got A grade no need to improce, 
  If suppose candidate got 65 like that, candidate wuill get C grade as well and how much grade needs to get Good Grade.
  
  
# LAB 2 Review

Covered three programs in this LAB 2.

Program 1: Sum of array of integers 
Rules:
	user needs to take the size of the array from the console 
	code needs to create array of integers according to the above size
	sum of all integers and return to the output 
    
Code Explanation:

    1. Read the values form the console used scanner, because scanner has less little buffer compared to buffer reader.
    
    2. While create thee array of integers used for loop and random function to create random integers.
    
    3. And added all those integers to myArray object. And call the sum fucntion, passed parameters as size o array and array of inetegers.
    
    4. In sum, initially printed into the console to see the random integers.
    
    5. Later used *for* condition to take each integer in that array and summarize the beofore value and current value
    
    6. Returned the sum of the integers.
    
 Program 2: Search value contained in array of integers or no
 
     1. read the search value from the console to identify available in that array of integers
     
     2. And call the *arrayContains* fucntion, passed parameters as search value and array of ineteger
     
     3. in *arrayContains* function default returning boolean as false , used iteration to check search value found in array or not . 
     
     If found returning boolean value true. And also added two comments. When found value, search value found , if not , search vaue not found.

Program 3: Encrypt and Decrypt Methods
      Intially they are two pop-ups comes in console, wrriten code like that to choose option encrypt or decrypt
      Encryption 
        1. If user choose encryption, 
        2. User needs to enter the string, which is needs to to encrypt
        3. And the value also requesting from the console 
        4. once received both and calling the method encryption method
        5. Before encrypting that string, printing the string 
        6. Next converting that string to charater Array
        7. Next iterating each and every value character in that array and with multiplaying with helpedValue. 
        8. After that adding exist vchar to previous character
        9. substracting uncessary values 
        10. Used StringBuilder to append encrypted string and reversed the string.
        This is how I written encrypted method.
        
      Deryption
        1. If user choose decryption
        2. User needs to enter the string, which is needs to to decrypt
        3. And the value also requesting from the console 
        4. once received both th values and calling the method decrypt method
        5. Before decrypting that string, printing the string for additional purpose
        6. Next reverting the string, and converted in tothat character Array.
        7. Next iterating each and every value character in that array and with diviion with helpedValue.
        8. After that decrypting the value 
        

If user enters wrong input , printing invalid input.












