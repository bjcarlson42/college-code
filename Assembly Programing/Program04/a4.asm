## CS 254 Program 4
##
## This program computes 23*x by shifting and adding
##
## Register use table:
## $10 -- result
## $7  -- x
##
## Programmer: Benjamin Carlson
## Date: Feb 25, 2020
        .text
        .globl  main

main:
        ori    $7,$0,2       # put x into $7
        addu   $10,$0,$7     # $10 = x
        sll    $7,$7,1       # $7 = 2x
        addu   $10,$10,$7    # $10 = 3x
        sll    $7,$7,1       # $7 = 4x
        addu   $10,$10,$7    # $10 = 7x
        sll    $7,$7,1       # $7 = 8x
        addu   $10,$10,$7    # $10 = 15x
        addu   $10,$10,$7    # $10 = 23x

## End of file
