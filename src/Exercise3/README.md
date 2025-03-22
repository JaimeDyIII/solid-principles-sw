### Exercise 3

The following design has the following problem:
- The **SmartPhone** interface defines methods for making calls, sending SMS, browsing the web, and taking pictures.
- While  smartphones (**Iphone** and **Samsung**) can utilize all functionalities, a basic phone (**BasicPhone**) only needs calling and SMS capabilities.
- Forcing the **BasicPhone** class to implement unused methods (**browseWeb** and **takePicture**) violates ISP. 

    ![alt text](image.png)

Show your solution in codes how to remove the **Interface Segregation** problem. 