# Frontend

| Author    | Created on   | Version      | Last updated by | Last edited on | GitHub ID                               |
|-----------|--------------|--------------:|:-----------------:|:----------------|-----------------------------------------|
| Dev       | 05-06-2024  | version 3    |    Dev             |  05-06-2024  | [dev0046](https://github.com/mygurkulam-p9/documentation/tree/main/OT-Microservices/Frontend/POC |

## :book: Description

The Frontend Web is a ReactJS-based application that serves as the main user interface for the OT-Microservices stack. It is designed to be highly versatile, supporting cross-platform functionality seamlessly. The only prerequisite for running this application is a JavaScript runtime environment.

## :books:Table of Contents

| No. |  Index                                                                                                                                                     |
|-----|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 1.  | [Key Features](#key-1-key-features)                   |
| 2.  |  [Pre-Requisites](#closed_book-2-pre-requisites)         |
| 3.  |  [Installation steps](#blue_book-3-installation-steps) |
| 4.  | [Configuration](#book-4-configuration)               |
| 5.  | [Start/Build Application](#notebook-5-startbuild-application) |
| 6.  |  [Troubleshooting](#question-6-troubleshooting)         |
| 7.  |  [Final Output](#green_book-9-final-output)           |
| 8.  |  [Conclusion](#bookmark_tabs-10-conclusion)           |
| 9.  | [Contact Information](#phone-11-contact-information) |
| 10. |  [Reference Links](#clipboard-12-reference-links)     |



## :key: 1) Key Features

| No. | Feature Description   | Description                                                                                                     |
|-----|-----------------------|-----------------------------------------------------------------------------------------------------------------|
| 1.  | ReactJS Framework     | Utilizes the powerful ReactJS framework to handle all frontend web page operations efficiently.                 |
| 2.  | Test Case Integration | Includes integrated test cases to verify the functionality of the application, ensuring robustness and reliability.|





## :closed_book: 2) Pre-Requisites
   
| No. | Software/Concept         |
|-----|--------------------------|
| 1.  | Node.js (V16)            | 
| 2.  | npm (Node Package Manager) |
| 3.  | React Default Port (3000) |

 
## :blue_book: 3) Installation steps

  - **Node Js**

        sudo apt update
    
**Updates the package index of the local APT package repository, ensuring that the latest versions of packages are available for installation.**
    
        curl -s https://deb.nodesource.com/setup_16.x | sudo bash
    
**This command adds the Node.js repository (NodeSource) to the system's package sources and configures it for Node.js version 16.x.**

![alt text](1.png)

      sudo apt install nodejs -y

   ![alt text](2.png)     
**Installs Node.js on the system. The '-y' flag automatically confirms any prompts during the installation process, allowing it to proceed without user intervention.**

        node -v
        
   **Checks the installed version of Node.js and prints it to the console.**

![alt text](3.png)


- **Install npm**

        sudo apt update
    
        sudo apt install npm -y
  
  **Installs npm (Node Package Manager) on the system. npm is used to manage packages and dependencies for Node.js projects. Similar to the previous command, '-y' flag automatically confirms prompts.**
    
  **Note** : If we install node js it will automatically install npm setup. No need to install again


## :book: 4) Configuration

  - Clone the repository

     git clone https://github.com/OT-MICROSERVICES/frontend.git

**This Clones the repository located at the specified URL in the local machine.**

![alt text](4.png)


    
**Create folder in cloned repository with a name "public"**

        mkdir public

![alt text](5.png)

    
**Under the public folder create [index.html](https://github.com/react-cosmos/create-react-app-example/blob/master/public/index.html)**

        cd public

        touch index.html
    
**Add default content of index.html to it**

        vim index.html


![alt text](6.png)

**Open TCP port 3000 in security group**
![alt text](6.1.png)



## :notebook: 5) Start/Build Application

        npm install
        
**Installs project dependencies listed in the package.json file. It creates a 'node_modules' directory and downloads the required packages into it.**

![alt text](7.png)



        npm start

**Executes the "start" script defined in the package.json file. This typically starts the development server or runs the application in a development environment.**


![alt text](8.png)


        serve -s build


**The command serve -s build serves the contents of the build directory as a static web server using the serve package. It serves the files in the build directory on a local server, making them accessible through a web browser.**

![alt text](9.png)



## :question: 6) Troubleshooting


In the **OT-MIcroservicres/frontend** directory, there are several files available but the public folder and index.html is missing so that is showing error for fixing this i search for the default index.html file and put it in the public folder then the application is easily accesible and up and Running.

For further details, please refer to the screenshots.

 - ### **Errors**

![alt text](error.png)
