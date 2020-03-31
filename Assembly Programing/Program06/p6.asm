## CS 254  Program 6  Spring 2020
##
## Compute (25xy - 10x - 6y + 28)/7
##
## Register use table:
## $10 -- base register, address of x
## $11 -- x
## $12 -- base register, address of x
## $13 -- y
## $14 -- value of polynomial
## $15 -- temporary
##
## Programmer: Benjamin Carlson
## Date: March 19, 2020

        .text
        .globl main

main:
        lui   $10,0x1000     # Init base register
        lw    $11,0($10)     # Load x
        lui   $12,0x1000     # Init base register
        lw    $13,0($12)     # Load y
        ori   $14,$0,28      # Initialize the accumulator during the load delay slot
        
        ori   $15,$0,6       # Evaluate second term
        mult  $15,$13        # 6y
        mflo  $15            # Assume 32 bit result
        subu  $14,$14,$15    # Accumulator = -6y + 28

                             # Evaluate third term
        addi  $15,$0,-10     # $15 = -10
        mult  $11,$15        # -10x
        mflo  $15            # Assume 32 bit result
        addu  $14,$14,$15    # Accumulator  -10x - 6y + 28

                             # Evaluate fourth term
        ori   $15,$0,25      # $15 = 25
        mult  $15,$11        # 15x
        mflo  $15            # Assume 32 bit result
        mult  $15,$13        # 15xy
        mflo  $15            # Assume 32 bit result
        addu  $14,$14,$15    # 25xy - 10x - 6y + 28

        ori   $15,$0,7       # $15 = 7
        div   $14,$15        # (25xy - 10x - 6y + 28) / 7
        mflo  $14            # $14 = quotient
        mfhi  $15            # $15 = remainder

        sw    $14,8($10)     # store result (quotient)
        sw    $15,12($10)    # store remainder

                .data
x:              .word   1    # Edit this line to change x   
y:              .word   1    # Edit this line to change y
answer:         .word   0    # Answer is placed here
remainder:      .word   0    # Remainder is placed here

## End of file