# Welcome to the Virtual House !

This project will be use as common code base to learn how to implement unit test using Junit5.

## Installation procedure

```bash
# First, download the project
$ git clone https://github.com/MaxAdau/isika_maven_junit.git

# Run the maven test goal
$ cd isika_maven_junit
$ mvn test

# Should build with something like
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running maven_junit.HelloWorldTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.019 s - in maven_junit.HelloWorldTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
```

Then, in Eclipse :
1. Go to File -> Import... -> Existing Maven Projects
1. Select the directory where you just downloaded this project
1. Select the pom/xml file
1. Click on Finish
1. Enjoy your fabulous empty wonderful java project ...