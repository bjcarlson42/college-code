## CS 254  Program 8  Spring 2020
##
##
## Set successive memory locations to 0, 1, 2, 3, 4 . 
## Use displacement(base register) addressing for this. 
##
## SPIM settings: Bare Machine, Branch Delays, Load Delays ON
##                MappedIO, Pseudo Instructions, Exception Handler OFF            
##
## Register use table:
##
##  $10 --  base register
##  $11 --  value to store, x
##  $12 --  temp
##
## Programmer: Benjamin Carlson
## Date: April 14th, 2020

        .text
        .globl  main
        
main:   
        lui     $10,0x1000      # base register == &array
        
        ## Initialize 5 cells of the array
        ori     $11,$0,0        # initiaize x = 0
        sw      $11,0($10)      # array[0] = 0
        
        addiu   $11,$11,1       # x = x+1
        sw      $11,4($10)      # array[1] = 1
        
        addiu   $11,$11,1       # x = x+1
        sw      $11,8($10)      # array[2] = 2
        
        addiu   $11,$11,1       # x = x+1
        sw      $11,12($10)     # array[3] = 3
        
        addiu   $11,$11,1       # x = x+1
        sw      $11,16($10)     # array[4] = 4    
        
        ## Add up the values in the 5 cells
        lw      $11,0($10)      # load array[0] to $11
        sll     $0,$0,0         # load delay slot
        lw      $12,4,($10)     # load array[1] to $12
        sll     $0,$0,0         # load delay slot
        add     $11,$11,$12     # $11 = array[0] + array[1]
        lw      $12,8($10)      # load array[2] to $12
        sll     $0,$0,0         # load delay slot
        add     $11,$11,$12     # $11 = array[0] + array[1] + array[2]
        lw      $12,12($10)     # load array[3] to $12
        sll     $0,$0,0         # load delay slot
        add     $11,$11,$12     # $11 = array[0] + array[1] + array[2] + array[3]
        lw      $12,16($10)     # load array[4] to $12
        sll     $0,$0,0         # load delay slot
        add     $11,$11,$12     # $11 = array[0] + array[1] + array[2] + array[3] + array[4]
            
        ## Store the sum to memory  
        sw      $11,20($10)     # store $11 in memory at sum (5 words or 20 bytes after the first value of array


done:   sll     $0,$0,0         # common end of program
 
        .data
array:  .space	20              # reserve 20 bytes == 5 fullwords  
sum:    .word   0               # variable "sum"
                
# end of program