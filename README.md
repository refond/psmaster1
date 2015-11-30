

# psmaster1

Test ground for Play 2.4 custom module inclusion

The first and only module to be included so far 
is: psmod1 ( https://github.com/refond/psmod1 )


## Project layout

The current project follows the standard SBT Maven layout. 
This is achieved using the new _experimental_ PlayLayoutPlugin feature introduced in 2.4.x   
as disablePlugins(PlayLayoutPlugin) in build.sbt file.

Official reference: https://playframework.com/documentation/2.4.x/Anatomy


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


#### Get current project source and move in

     git clone https://github.com/refond/psmaster1
     cd psmaster1
     
     
#### Test current Play application and module

     activator test
     

#### Run current Play application

     activator run


#### Go to:

     http://localhost:9000/

