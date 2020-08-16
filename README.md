# javaAssignment_16Aug2020
 Repository for the javaAssignment_16Aug2020 project

A#1.a. A new unit test class has been created to perform the unit testing for the walk, fly and sing methods.
 #1.b. Code has been modified for the better maintainability.

<<::Console Output::>>
<<<<<<<<<***Starts here ***>>>>>>>>>
 
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.jpworks.assignment.test.modal.BirdTest
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.051 sec

Results :

Tests run: 3, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ assignment ---
[INFO] Building jar: D:\eclipse-workspace\javaAssignment_16Aug2020\javaAssignment_16Aug2020\target\assignment-0.0.1-SNAPSHOT.jar
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ assignment ---
[INFO] Installing D:\eclipse-workspace\javaAssignment_16Aug2020\javaAssignment_16Aug2020\target\assignment-0.0.1-SNAPSHOT.jar to C:\Users\JP\.m2\repository\com\jpworks\assignment\0.0.1-SNAPSHOT\assignment-0.0.1-SNAPSHOT.jar
[INFO] Installing D:\eclipse-workspace\javaAssignment_16Aug2020\javaAssignment_16Aug2020\pom.xml to C:\Users\JP\.m2\repository\com\jpworks\assignment\0.0.1-SNAPSHOT\assignment-0.0.1-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------

<<<<<<<<<***Ends here ***>>>>>>>>>

 #2 #3 #4 Required Modal classes has been created as per the requirements provided.
 #3.c Rooster class has been created without inheritance concept.
 #4.d. Necessary implementation provided to the Parrot class with the flexibility to get the Parrot sound,
 		based on the animal it is living with automatically.
 	
 		
B#1. #2 #3 Required Modal classes has been created as per the requirements provided.
 #3.a. Dolphin modal has been implemented as requested.
 
 
D#1 #2 Modal Butterfly has been created with the required implementation with metamorphosis feature support.

E#1 A new class has been created to print the animals count as requested.



/******* Console output of Solution class *******/
/******* Starts here***********/
 		
		#######class com.jpworks.assignment.modal.Bird#########
		I am Walking
		I am Flying
		I cannot Swim
		I am Singing
		
		
		#######class com.jpworks.assignment.modal.Duck#########
		I am Walking
		I am Flying
		I am Swimming
		I am Singing makes special sound as Quack, quack
		
		
		#######class com.jpworks.assignment.modal.Chicken#########
		I am Walking
		I cannot Fly
		I cannot Swim
		I am Singing makes special sound as Cluck, cluck
		
		
		#######class com.jpworks.assignment.modal.Chicken#########
		I am Walking
		I cannot Fly
		I cannot Swim
		I am Singing makes special sound as Cock-a-doodle-doo
		
		
		#######class com.jpworks.assignment.modal.Parrot#########
		I am Walking
		I am Flying
		I cannot Swim
		>>>Parrot living with Rooster::I am Singing makes special sound as Cock-a-doodle-doo
		>>>Parrot living with Dog::I am Singing makes special sound as Woof, woof
		>>>Parrot living with Cat::I am Singing makes special sound as Meow
		
		
		#######class com.jpworks.assignment.modal.Fish#########
		I cannot Walk
		I cannot Fly
		I am Swimming
		I cannot Sing
		
		
		#######class com.jpworks.assignment.modal.Shark#########
		I cannot Walk
		I cannot Fly
		I am Swimming
		I cannot Sing
		Sharks are large and grey & eat other fish
		
		
		#######class com.jpworks.assignment.modal.Clownfish#########
		I cannot Walk
		I cannot Fly
		I am Swimming
		I cannot Sing
		Clownfish are small and colourful(Orange) & makes jokes
		
		
		#######class com.jpworks.assignment.modal.Dolphin#########
		I cannot Walk
		I cannot Fly
		I am Swimming
		I cannot Sing
		
		
		#######class com.jpworks.assignment.modal.Butterfly#########
		I cannot Walk
		I am Flying
		I cannot Swim
		I cannot Sing
		
		
		#######class com.jpworks.assignment.modal.Butterfly#########
		I am Walking (Crawl)
		I cannot Fly
		I cannot Swim
		I cannot Sing
		 		
 /*******Ends here***********/
 
 /******* Console output for the counting animals ********/
		Total Animals Can Fly are::4
		Total Animals Can Walk are::8
		Total Animals Can Sing are::7
		Total Animals Can Swim are::8
 