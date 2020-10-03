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


##Code Explanation 

Used to implement this grading program

  DecimalFormat --> In order keep only 2 decimal places
  Scanner --> Why I choose because scanner has less little buffer compared to buffer reader
  Swith --> well, we do have other posssible scenarios with if condition, for loop, e.t.c.. Because Switch is mostly faster then other cases.
  
##Rules :
  1. User needs to enter his candidate name and grade.
  2. User can enter only 0-100
  3. User needs to enter one string (candidate name) and another one is double (grade)
  
##Code flow 
  1. written code to read two values from console , one is string another is grade.
  2. When receives both , depends upon the grade written code according to the rules .
  3. check all the conditions to check whether member got letter grade or not 
  4. If member got letter grade check it he got A grade or not if he got A grade no need to improce, 
  If suppose candidate got 65 like that, candidate wuill get C grade as well and how much grade needs to get Good Grade.
  
