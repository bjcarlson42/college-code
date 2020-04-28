## CS 254 Program 11 Spring 2020
##
## Celsius to fahrenheit
##
## Programmer: Benjamin Carlson
## Date: April 28th, 2020
##
## Register use table:
##
## $f1 -- celsius input
## $f2 -- temp

    .globl  main

main:   li      $v0,4
        la      $a0,prompt      # prompt for celsius input float
        syscall
  
        li      $v0,6
        syscall                 # ask user input
        mov.s   $f1,$f0         # load input to $f1
  
        l.s     $f2,nine        # load 9.0 to $f2
        mul.s   $f1,$f1,$f2     # C * 9
        l.s     $f2,five        # load 5.o to $f2
        div.s   $f1,$f1,$f2     # C * 9/5
        l.s     $f2,thirtytwo   # load 32.0 to $f2
        add.s   $f1,$f1,$f2     # C * 9/5 + 32
  
        li      $v0, 4          # print string
        la      $a0, output     # "Fahrenheit: "
        syscall
  
        mov.s   $f12, $f1       # get sum
        li      $v0, 2          # print float
        
        syscall

        bc1t      end           # end
  
end:
        li        $v0, 10       # end
        syscall

    .data
prompt:    .asciiz "Enter Celsius: "
output:    .asciiz "Fahrenheit: "
nine:      .float 9.0
five:      .float 5.0
thirtytwo: .float 32.0