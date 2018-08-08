
Install Java (OpenJDK-8)
---
The JDK8 can be installed with following commands (go to Maven installation if JDK is already installed).
```bash
sudo add-apt-repository ppa:openjdk-r/ppa
sudo apt-get update
sudo apt-get install openjdk-8-jdk
```
Note that if the bash shows `add-apt-repository: command not found`, install this package with
    ```bash
    sudo apt-get install software-properties-common
    ```
    .


Install Maven 3.5.4 in Ubuntu14.04
---


1. Download Maven 
    ```bash
    cd /usr/local
    sudo wget http://www-eu.apache.org/dist/maven/maven-3/3.5.4/binaries/apache-maven-3.5.4-bin.tar.gz
    ```
    Install wget by `sduo apt-get install wget` if `wget: command not found`.
    
2. Unzip the package
    ```bash
    sudo tar xzf apache-maven-3.5.4-bin.tar.gz
    ```

3. Create symbolic link
    ```bash
    sudo ln -s apache-maven-3.5.4 apache-maven
    ```

4. Create the file carries necessary environment variables
    ```bash
    sudo vim  /etc/profile.d/apache-maven.sh
    ```
    and write following lines in file

    ```bash
    export M2_HOME=/usr/local/apache-maven
    export MAVEN_HOME=/usr/local/apache-maven
    export PATH=${M2_HOME}/bin:${PATH}
    export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64
    ```
    save and quit
    
5. Apply the file
    ```bash
    source /etc/profile.d/apache-maven.sh
    ```
    
6. Delete the downloaded zip
    ```bash
    sudo rm -f apache-maven-3.5.4-bin.tar.gz
    ```