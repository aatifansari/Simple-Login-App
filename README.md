# Simple-Login-App
Simple Login Form for authenticating users using in-memory HashMap data structure.

1. Welcome Page

![Capture1](https://user-images.githubusercontent.com/44142827/168485255-7b87f712-9b84-41ff-8f40-d50bb11a526e.PNG)


2. Login Form

![image](https://user-images.githubusercontent.com/44142827/168485346-e23919fb-2205-4105-a36f-3a638195db58.png)


3. When valid username and password is entered user is direct to login success page.<br>
Test Case(1) - Username - salman, Password - any not null string<br>
Test Case(2) - Username - kavita, Password - any not null string<br>
Test Case(3) - Username - ankit, Password - any not null string


![image](https://user-images.githubusercontent.com/44142827/168485822-4e0eb12a-a664-4b2a-bdf6-2c050a41855f.png)


![image](https://user-images.githubusercontent.com/44142827/168485853-0157633f-d0c2-4816-974a-8929520c8722.png)


![image](https://user-images.githubusercontent.com/44142827/168485879-f4baf6bc-05e3-4b17-ab7b-66020ee2189a.png)


4. When invalid username and password is entered user is thrown back to the login page with message as "Enter correct Username and Password" <br>
Test Case(1) - Username - harshit, Password = 1234<br>
Test Case(1) - Username - "", Password = ""<br>
Test Case(1) - Username - harshit, Password = ""<br>
Test Case(1) - Username - "", Password = 1234


![Capture6](https://user-images.githubusercontent.com/44142827/168485936-93e6168d-1953-4ea7-acd1-7052a0d86af6.PNG)


## Generating dynamic web page

1. Response Attribute
success.jsp import data as response attribute

![image](https://user-images.githubusercontent.com/44142827/168486054-9a1adf4e-53f8-4f66-9fb0-324cfcf770a2.png)


2. Beans

successpassbybean.jsp import data as beans

![image](https://user-images.githubusercontent.com/44142827/168486139-994b040b-9b96-492b-ac11-a864720d3a8e.png)

Note: Data can be imported as response attribute or bean by changing the requestdispatcher parameter in if statement from success.jsp to successpassbybean or vice -versa.

![image](https://user-images.githubusercontent.com/44142827/168486598-d461d93d-be8d-440f-85dd-196373acd7d9.png)


## Technology Stack
- Java 18
- Servlet 3.1.0
- JSP 2.3.3
- JSTL 1.2
- Maven





