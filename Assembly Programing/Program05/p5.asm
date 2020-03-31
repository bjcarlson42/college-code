## CS 254  Program 5  Spring 2020
##
## Compute 47x^4 + 2x^3 + 10x^2 - 3x + 17
##
## Register use table:
## $9  -- x
## $10 -- result and accumulator
##
## Programmer: Benjamin Carlson
## Date: March 5, 2020

        .text
        .globl main

main:
        addiu   $9,$0,-2        # put x into $10
        addiu   $10,$0,7        # $10 = 7
        mult    $10,$9          # lo = 7x
        mflo    $10             # $10 = 7x
        addiu   $10,$10,2       # $10 = 7x + 2
        mult    $10,$9          # lo = 7x^2 + 2x
        mflo    $10             # $10 = 7x^2 + 2x
        addiu   $10,$10,10      # $10 = 7x^2 + 2x + 10
        mult    $10,$9          # lo = 7x^3 + 2x^2 + 10x
        mflo    $10             # $10 = 7x^3 + 2x^2 + 10x
        addiu   $10,$10,-3      # $10 = 7x^3 + 2x^2 + 10x - 3
        mult    $10,$9          # lo = 7x^4 +2x^3 +10x^2 -3x
        mflo    $10             # $10 = 7x^4 +2x^3 +10x^2 -3x
        addiu   $10,$10,17      # $10 = 7x^4 +2x^3 +10x^2 -3x + 17

## End of file