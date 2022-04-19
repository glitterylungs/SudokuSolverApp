# SudokuSolverApp

### 1.Program description
##### 1.1 Theme of the project
SUDOKU SOLVER MOBILE APP
Project Sudoku Solver is a mobile application that allows you to solve sudoku boards. This application is intended for Android users. The program was written in Java using the Android Studio IDE.

The main task of the program is to retrieve the numbers that the user has placed on the board, and then find the solution and list it on the sudoku board. The application also comes with a menu and user manual.

Sudoku Solver is an application characterized by readability and clarity. It allows you to find solutions to even the most difficult sudoku boards!

The program responsible for solving Sudoku boards:
• Retrieves the numbers that have been entered on the board by the user.
• Determines the value of numbers on empty board fields using the backtracking algorithm. 
• He puts the found numbers on the board.

##### 1.2 Description of data downloaded by the program
The data collected by the program to find a solution is placed by the user on a graphic board. The user enters the numbers by selecting a place on the board, and then the corresponding numerical value. The number of values transferred is arbitrary. The user may not pass any data to the program, it will generate any board. The program has been secured against entering the same value by the user in a given column, row or box.

##### 1.3 Description of the results obtained
When the program finds a sudoku solution, it prints the missing values on the board. These values differ in color from those entered by the user.

##### 1.4 Operating instructions
Sudoku Solver can be launched from the Android Studio IDE. We can use our real device or emulator to run the application.
After starting the application, the user's eyes see a menu showing the title and 3 buttons. Each button corresponds to one program function. The user selects by clicking on the appropriate button.

<img width="300" alt="test1" src="https://user-images.githubusercontent.com/72377506/149019087-7772555f-bf65-464a-a595-dd07522a54f8.png">
 
1. Start
After clicking the Start button, a new, main application window will open. It shows an empty sudoku board, buttons with numbers numbered from 1 to 9, a button with the word Solve and an upper bar with an arrow that returns to the menu.
 
After clicking on the selected place on the board, it will be highlighted. The user can put an appropriate value in this place by selecting one of the 9 buttons under the board. These buttons are numbered from 1 to 9. In order to remove a value from the board, click on the place where the value is and on the button representing this value.
 
After filling the board with appropriate numerical values, click on the Solve button. After this operation, the board will be filled with the result values. They will be displayed in a different color to distinguish them from the values entered by the user.
Additionally, the Clear button will appear in place of the Solve button, which will allow you to clear the sudoku board.
Figure 4: Application screen after finding the solution to the sudoku board

<img width="500" alt="test1" src="https://user-images.githubusercontent.com/72377506/149019104-bfef906d-b000-40e3-a1d7-0c745780b156.png">
 
2. Information
When the user selects the About option, he will be redirected to a new window where he will find the user manual and information about the application author. This window also has a top bar with an arrow allowing you to return to the menu window.
Figure 5: Application screen after selecting About.
 
3. Exit
After selecting the Exit option, the application is exited and the program is terminated.


### 2. Used algorithm 
In order to find a solution to the sudoku board, the backtracking algorithm is used. The program uses two methods responsible for the operation of this algorithm.

##### 2.1 Description of the algorithm's operation
The recurrence algorithm is a general search algorithm for all solutions to some computational problems. Backtracking uses recursion. He gradually generates candidates for a solution, but when he finds that the found candidate cannot be a correct solution, he returns to the point where he can make a different decision related to its construction.
An example of such an algorithm is the method of searching for the exit from the labyrinth. In this case, it is assumed that the transition from a given point to the next point is made in a fixed order of possible points to pass (e.g. from left to right) and when there is no possibility of going further, then we go back (i.e. we make a recurrence) ) to the point we came from. This is how the mythical Theseus moved through the labyrinth in search of the Minotaur monster.




