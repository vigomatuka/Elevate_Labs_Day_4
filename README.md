# Day_4 Notes Program

This is a simple Java program that lets users interact with a text file (`notes.txt`) through a console menu. 

## Features
- **Add text**: Append new notes to the file.
- **Read file**: Display all saved notes.
- **Clear file**: Delete all content in the file.
- **Exit**: Quit the program.

## Notes
- The program uses a single static `Scanner` for input and a static filename.
- Proper handling ensures that input after numbers works correctly (`scanner.nextLine()` consumes leftover newlines).
