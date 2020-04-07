## CS 254  Program 7  Spring 2020
##
## Compute (8x^2-3x+12) / (3x^2+2x-16)
##
## Register use table:
## $10 base register, address of x
## $11 -- x
## $12 value of the rational function
## $13 temporary
## $14 temporary
## $15 temporary
##
## Programmer: Benjamin Carlson
## Date: April 6th, 2020

        .text
        .globl main

main:
        lui   $10,0x1000     #  Init base register
        lw    $11,0($10)     #  Load x
                             # left side
        ori   $12,$0,12      # Initialize 12 during load delay slot 
        ori   $13,$0,3       # place 3 in temporary
        mult  $11,$13        # 3x
        mflo  $13            # Assume 32 bit result
        subu  $12,$12,$13    # -3x + 12
        mult  $11,$11        # x^2
        mflo  $13            # Assume 32 bit result
        ori   $14,$0,8       # place 8 in temporary
        mult  $13,$14        # 8x^2
        mflo  $13            # Assume 32 bit result
        addu  $12,$13,$12    # 8x^2-3x+12
                             # right side
        ori   $13,$0,16      # Initialize 16
        ori   $14,$0,2       # place 2 in temporary
        mult  $11,$14        # 2x
        mflo  $14            # Assume 32 bit result
        subu  $15,$14,$13    # 2x - 16
        ori   $13,$0,3       # place 3 in temporary
        mult  $11,$11        # x^2
        mflo  $14            # Assume 32 bit result
        mult  $13,$14        # 3x^2
        mflo  $13            # Assume 32 bit result
        addu  $13,$13,$15    # 3x^2 + 2x - 16

if:     beq   $13,$0,yes     # is  $13 == 0                 
                             # false block 
        div   $12,$13        # (8x^2 - 3x + 12) / (3x^2 + 2x -16)
        mflo  $14            # $14 = quotient
        mfhi  $15            # $15 = remainder
        sw    $14,8($10)     # store quotient in memory 2 words away from x at error 
        sw    $15,12($10)    # store remainder in memory 3 words away from x at remain 
                             
        j     endif
        sll   $0,$0,0        # jump delay slot
yes:                         # true block
        ori   $15,$0,1       # place 1 in $15     
        sw    $15,4($10)     # store 1 in memory 1 word away from x at error 

endif:  sll    $0,$0,0       # nop to end program



        .data

x:      .word  2
error:  .word  0
ratio:  .word  0
remain: .word  0

## End of file