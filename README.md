# File-Copier
It is a programming challenge given in internship period in PromactInfotect.
Approach-
1.	First we create class File Copier
2.	Declare main method. With exception handling .
(throws FileNotFoundException, IOException This exception will be thrown by the FileInputStream, FileOutputStream, and RandomAccessFile constructors when a file with the specified pathname does not exist. It will also be thrown by these constructors if the file does exist but for some reason is inaccessible, for example when an attempt is made to open a read-only file for writing.)

3.	Then we take paths of source and destination directory and file 
For this we have to use exception handling (IOException is the base class for exceptions thrown while accessing information using streams, files and directories.)
4.	Then we use a class file inputStream for read the file.
In this step we create a class for output file . then use file reader for reading the file.
5.	Check if input file exists or not 
If yes the go to step 6. If no the print file does not exists.
6.	Create integer s;
Take while loop for read file. We use read method. If read will return value -1 then means our total data has been done.
If condition returns false while loop will terminate.
Then it read the data character by character and return ascii value so we store it in to integer s and return the copied file in destination directory.
7.	After that if we put the file name again and it will check the file and for printing it second time copy the second time and add copy in name. 
8.	For writing the file name we have to strip the name into parts and used substring()
And indexOf()  function.



