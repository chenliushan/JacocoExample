 An example of using Jacoco 
---
This project is an example of generating detailed line coverage report with the 
[JACOCO](https://www.jacoco.org/jacoco/trunk/index.html) library.

The detailed line coverage report is the test execution coverage with detailed information about specific executed lines
(lines hit information during test execution),
which is a richer information than the general percentage coverage of classes/methods/lines.

The detailed report [example](target/coverage-report/html/jacoco-multi/lab/Rectangle.java.html)

Requirements
---
* Maven3.5
* JDK 1.8

[Install JDK1.8 and Maven on Ubuntu](./install_mvn.md)

Steps
---
There are three steps to generate the detailed coverage report:

* Configure the project with maven (create/config the 'pom.xml' as [this example](pom.xml))

* Test the project with Jacoco agent (run the test with Java VM argument -javaagent:path/to/jacocoagent.jar)
    ```
    mvn -Dtest=lab.RectangleTest#rotate test
    ```
* Generate the coverage report with Jacoco ant

    ```
    mvn antrun:run@generate-report -Dskip.int.tests.report=false
    ```

The generated report is under dir`target/coverage-report/html/jacoco-multi`
    
---

Note that, you can generate the detailed test execution coverage report for each test 
by running the test and generating report (step 2 and 3) repeatedly with following command.
```
mvn -Dtest=lab.RectangleTest#rotate test
```
PS: the source code under `src` and `test` is just a small demo for test execution

Acknowledgement and references
---
[JACOCO](https://www.jacoco.org/jacoco/trunk/index.html)
https://github.com/pszeliga/jacoco-e2e-coverage/blob/master/pom.xml