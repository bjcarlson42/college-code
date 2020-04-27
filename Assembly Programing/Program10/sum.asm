## CS 254 Program 10 Spring 2020
##
## Sum of odd numbers
##
## Programmer: Benjamin Carlson
## Date: April 27th, 2020
##
## Register use table:
##
## $s0 -- num of odd numbers
## $s1 -- sum
## $t1 -- odd num to add
## $t2 -- counter

    .globl  main

main:   li      $v0, 4   
        la      $a0, prompt    #prompt for string
        syscall

        li      $v0,5
        syscall                #ask user input
        move    $s0,$v0        #load input to s0

        li      $s1,0          # zero the sum
        li      $t1,1          # init to 1
        li      $t2,0          # init loop counter

if:     bltz    $s0,end        # if num of odd numbers is negative (or not a number), skip to end and leave sum at 0   
for:    beq     $t2,$s0,end    # for (i = 0; i < num; i++)
        addu    $s1,$s1,$t1    # sum += $t1
        addi    $t1,$t1,2      # increment $t1 to next odd num
        addi    $t2,$t2,1      # increment counter
        b       for

end:
        sll     $0,$0,0        # nop to end program

        # Output
        li      $v0,4         # print string
        la      $a0,head1     # "The Sum:"
        syscall

        move    $a0,$s1       # get sum
        li      $v0,1         # print integer
        syscall       

        li      $v0,10        # exit
        syscall

        .data
prompt: .asciiz "How many odd numbers: "
head1 : .asciiz "The Sum: "