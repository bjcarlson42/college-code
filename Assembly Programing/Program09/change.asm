## CS 254 Program 9 Spring 2020
##
## Compute change due given a number of cents. 
##
## Programmer: Benjamin Carlson
## Date: April 18th, 2020
##
## Register use table:
##
##    $s0 -- amount in cents
##    $s1 -- number of quarters
##    $s2 -- number of dimes
##    $s3 -- number of nickles
##    $s4 -- number of pennies


        .globl  main

        # Get amount
main:   li      $v0,4            # print prompt
        la      $a0,prompt   
        syscall
        li      $v0,5            # input amount
        syscall
        move    $s0,$v0          # save it in $s0

        # Calculations
        remu    $s2,$s0,25       # amount / 25 -> store remainder in $s2
        divu    $s1,$s0,25       # amount / 25 -> store quotient in $s1

        remu    $s3,$s2,10       # amount / 10 -> store remainder in $s3
        divu    $s2,$s2,10       # amount / 10 -> store quotient in $s2

        remu    $s4,$s3,5        # amount / 5-> store remainder in $s4
        divu    $s3,$s3,5        # amount / 5 -> store quotient in $s3
        

        # Output
        li      $v0,4            # print string
        la      $a0,head1        # "number of quarters:"
        syscall

        move    $a0,$s1          # get num quarters
        li      $v0,1            # print integer
        syscall                   

        li      $v0,4            # print string
        la      $a0,head2        # "Number of dimes"
        syscall

        move    $a0,$s2          # get total
        li      $v0,1            # print integer
        syscall                  

        li      $v0,4            # print string
        la      $a0,head3        # "Number of nickles"
        syscall

        move    $a0,$s3          # get total
        li      $v0,1            # print integer
        syscall                  

        li      $v0,4            # print string
        la      $a0,head4        # "Number of pennies"
        syscall

        move    $a0,$s4          # get total
        li      $v0,1            # print integer
        syscall                  

        li      $v0,10           # exit
        syscall

        .data

prompt: .asciiz "Enter number of cents: "
head1 : .asciiz "Number of quarters: "
head2 : .asciiz "\nNumber of dimes: "
head3 : .asciiz "\nNumber of nickles: "
head4 : .asciiz "\nNumber of pennies: "