# psmaster1

Test ground for Play 2.4 custom module inclusion

The first and only module to be included so far 
is: psmod1 ( https://github.com/refond/psmod1 )

## Running 

### Pre-requisites

 - A working JDK 1.8 (or later) installed on your machine:
   https://playframework.com/documentation/2.4.x/Installing#JDK-installation
 - Git open source program:
   https://help.github.com/articles/set-up-git/

### Installation steps

#### Deploy psmod1 dependency

     git clone https://github.com/refond/psmod1
     cd psmod1
     activator publish-local

#### Run current Play application

     git clone https://github.com/refond/psmaster1
     cd psmaster1
     activator run

#### Go to:

     http://localhost:9000/
