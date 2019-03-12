# COP4331_Project2_TTT
Tic-Tac-Toe From command line

HOW TO COMPILE AND RUN
1. Locate location of java "jdk\bin" in system files.
2. Add to path variable through command prompt if not already done. Use following command: 
  - `set "PATH=%PATH%;Location_of_jdk\bin"`  (example: `set "PATH=%PATH%;C:\Program Files\Java\jdk1.8.0_191\bin"`)
3. Unzip folder and navigate to location of unzipped files
4. Navigate to inside using:
  - `cd COP4331_Project2_TTT-master\TicTacToe\src`
5. Compile all files using the following command
  - `javac "course\oop\classes\TTTAI.java" "course\oop\classes\TTTGame.java" "course\oop\classes\TTTPlayer.java" "course\oop\controller\TTTControllerImpl.java" "course\oop\controller\TTTControllerInterface.java" "course\oop\main\TTTDriver.java"`
6. Run the Driver file using the following command
  - `java course.oop.main.TTTDriver`

ADDITIONAL NOTES
- Program will initially ask for user input for the answers to "how many players?" and their corresponding username(s) and marker(s).
- AI is default as Player 2 with the username "computer" and a marker of "O".
- GUI is interactable through inputting corresponding integers according to the menu options that appear.
- the board is displayed and formatted to only fit one character markers even though markers are strings.

- My "Game", "Player", and "AI" classes are slightly different from the UML diagrams as a few methods were added to accomodate the methods in the interface.
- As <other> directory was renamed to "classes" to accomodate Game, Player, and AI classes.
  
