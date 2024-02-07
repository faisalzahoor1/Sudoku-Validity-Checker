# Sudoku Solver

This is a Java program for solving Sudoku puzzles. It uses a backtracking algorithm to fill in the Sudoku grid with the correct numbers.

## Usage

To use this Sudoku solver:

1. Ensure you have Java installed on your system.
2. Compile the `SudokoSolver.java` file using `javac SudokoSolver.java`.
3. Run the compiled program using `java SudokoSolver`.

The program will print the solved Sudoku puzzle if a solution exists, or it will indicate that no solution exists for the given puzzle.

## Code Structure

- `SudokoSolver.java`: Contains the main class `SudokoSolver` which implements the Sudoku solving algorithm.
  - `isSafe`: Method to check if it's safe to place a number in a particular position on the Sudoku board.
  - `helper`: Recursive helper method to solve the Sudoku puzzle.
  - `sudoko`: Method to initiate the solving process and print the result.
  - `printBoard`: Utility method to print the Sudoku board.
  - `main`: Entry point of the program where a sample Sudoku puzzle is provided and solved.

## Sample Input

The sample input provided in the `main` method is a 9x9 Sudoku puzzle represented as a 2D array of characters. Empty cells are represented by periods (`.`), and filled cells contain the digits from 1 to 9.

## Sample Output

The program outputs the solved Sudoku puzzle if a solution exists, otherwise, it indicates that no solution exists for the given puzzle.

## Contributing

Feel free to contribute to this Sudoku Solver by submitting bug reports, feature requests, or pull requests.

## License

This project is licensed under the [MIT License](LICENSE).
