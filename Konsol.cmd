echo off
title HaCkErTiMe
cd C:\Users\marcu\OneDrive\Gym -------\Programmering\Java

:start
cls

javac Konsol.java
set /p id=What number to search for? 
java Konsol %id%

pause
goto start