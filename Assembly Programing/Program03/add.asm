## CS 254  Program 3  Spring 2020
##
## Compute 45 + 89 + 76 + 17
##
## Register use table:
## $13 = 45
## $14 = 89
## $8 = 76
## $9 = 17
## $11 = $13 + $14
## $12 = $ 8 + $9
## $10 = result ($11 + $12)
##
## Programmer: Benjamin Carlson
## Date: Feb 19, 2020
        .text
        .globl  main

main:
        ori     $13,$0,0x2D      # put two's comp. 45 into register 13
        ori     $14,$0,0x59      # put two's comp. 89 into register 14
        ori     $8,$0,0x4C       # put two's comp. 76 into register 8
        ori     $9,$0,0x11       # put two's comp. 17 into register 9
        addu    $11,$13,$14      # add register 13 and 14, put result in 11
        addu    $12,$8,$9        # add register 8 and 9, put result in 12
        addu    $10,$11,$12      # add register 11 and 12, put result in 10

## End of file