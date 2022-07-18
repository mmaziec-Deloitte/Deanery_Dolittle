Deanery 

Task description:

	- There are following students: full-time and part-time
Each student can be served by the deanery, but in different rooms 

There are rooms defined for serving students. Each has a starting and finishing hour specified:
A123 (8 - 16)
B123 (9 - 17)
C124 (9 - 13)
D124 (17 - 20)

Full time students can be served in rooms A123, B123
Part time students can be served in rooms C124 and D124

Each student can be served by calling a serve(...) method on those students. The parameters provided should be a room number as String and an hour - an integer value. 
The method should throw a custom exception when a student goes to the incorrect room and another custom exception when a student tries to visit the deanery during the closed hours. 

	- The serve(...) method should return the student raport as a String in the following format: ("<test> - this is only the description, should not appear in the raport)

	*-samemu sobie zerknac na String format, spacje, odstepy itp

--------------------------------------------------------------------
		 STUDENT 234544<student id> 
		
First Name           	|   Mark<first name>            |
Second Name      		|   Darcy<second name>      	|


Raport generated on 08.07.2022 13:45<current date and time> 
Room number: A123      
		
--------------------------------------------------------------------

The report should be "nicely" formatted.

	- Write unit tests for the job (kto chce i umie)

	- How to present the solution:
		○ Create a few sample students: full time and part time with short and long names/surnames
		○ Serve those students in the main method using a loop 
	


A few points worth mentioning:
	- There can be more than a one implementation solution for this task - try to choose the best data structures and Java features though
	- Think about classes, methods etc. naming - they should be appropriate
	- Helper methods are a good practice 


Part 2:
Instead of providing the room and hour parameters in code, take those inputs from the user. 

Example:

Enter the room number:
	> A123

Enter the hour:
	> 8


Enter the student ID?
	> 234566


<report output>

OR

<exception message>

Think about what data structure to use to hold the collection of students. 
(klasa Scanner)
