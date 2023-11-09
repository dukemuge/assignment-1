# Banda Health Technical challenge 

basically involves developing a inventory tracker and analysis   Elves challenge



## Technologies Used


**Back-end:** Java 17,  Maven, Log4j

## Introduction

This project helps us to understand the basic working of Bank accounts. Some of the functionalities implemented are
- Getting the Elf with the highest aggregate sum of Calories
- Getting top three elves from elves List with the highest aggregate sum
- Get the value of the calorie of  Elf with the highest aggregate sum
- Get the sum of top 3 highest calories from elves list
## Prerequisites
- java 1.8.x
- maven 3.x
-

### Steps To Setup Backend

**1. Clone the repository**
```bash
    git clone https://github.com/AbhayKatharotiya/BankingSystem.git
```

**2. Move to root directory of backend**

**3. Build project**
```bash
    mvn clean install
``` 

**4. Run project** 
```bash
    java -jar target/backend-0.0.1-SNAPSHOT.jar
``` 

  #### Explore apis in backend

The app defines following the following methods. 
 
```   
    POST /api/signup   
    POST /api/user
    GET /api/user
    PUT /api/user
    GET /api/account
    POST /api/transfer
    GET /api/transaction  
