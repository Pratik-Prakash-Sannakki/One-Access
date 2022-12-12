##                          ✨ONE ACCESS APPLICATION✨

# Problem Statement:

With the current healthcare system being manual/semi automated and advancement in technology and virtualisation, lack of an automated system becomes a boon if not necessity for ease and a seamless experience. 

# Proposal:

Our application intends to offer a methodical administration system that will enable users to access all medical amenities from a single platform.
This application provides users a platform where they may buy the essential goods and services, simplifying their lives without exposing them to the continued spread of diseases and saving them a significant amount of time.



# Eco System Architecture:
![EcoSystem](https://user-images.githubusercontent.com/71171604/206942183-1cf79907-a4ba-41da-a20c-8fac21db6a23.PNG)


# Class Diagram:
![AED_FINAL_PROJECT_UML](https://user-images.githubusercontent.com/114355226/206935286-d6205488-014f-4cfb-9b8c-bf6b4ed69e7a.png)



# Key functionalities: 

**Users can login to the application and access the following:**

- **Medical Facilities Enterprise:** This Enterprise includes organizations like Hospital, Lab and Pharmacy. Patients can make use of various healthcare resources in Hospital such as scheduling appointments and receiving treatment or other medical services. Lab Organization provides lab facilities where patients can get their necessary tests done those recommended by doctors. Pharmacy organization provide patients with the appropriate drugs

- 	**Supply Chain Enterprise:** This Enterprise plays important role in delivering necessary supplies and services to customers/users. Here users can be patients, and all entities of Medical Facilities Enterprise

- **Contact Tracing Enterprise:** Users can access help 24/7. An emergency service button activates a call for help through a medical alert system and provides necessary services to user

- 	**Recovery Enterprise:** Consists of Insurance companies that offer risk management in the form of medical insurance plans to Patients. Patients can buy necessary plans according to their medical history

# User entities:

- 	**Admin (application creator and owner):** Will be able to maintain and track the data regarding Hospitals,Doctors,Labs,Patients,Pharmacy,Insurance,Emergency,
Deliveryman (All CRUD operations)
 -	**Patient:**  Using this application patients can  book appointments, lab tests, check doctor prescription, order medicines based on doctors prescriptions, book medical Insurance Plans, look for emergency help and submit feedback about the application
- **Doctor:** He/She manages the appointments scheduled by the patients and perform actions such as create and update the prescriptions.
-	**Hospital Admin:** Hospital Admin is able to add doctors and patients (All CRUD operations) Also they can order necessary supplies like test tubes and gloves.
 
 - 	**Pharmacist:** Able to CRUD medicines to Pharmacy organization and manage the orders placed and assigns the delivery man for the delivery.
 -	**Lab Assistant:**  He/She is able to add all kind of medical tests and also manages test bookings from patients. Also can CRUD on Lab tests.
- **Insurance Manager:** Insurance Manager is able to CRUD new plans in his organization and manage the order placed by patients.
- 	**Emergency Service Provider:** Complete the emergency request from patients
-	**Supplier:** Supplier is able to CRUD the manufacturers and products. Also manage the orders from different organizations like Hospitals and Labs.
 -	**Delivery Man:** Accept the orders from Hospitals and Patients and complete the delivery request successfully.
 
 # Steps to Access Application:
 
 1.	System Admin will login in with his/her credentials on login screen. Admin dashboard consists of all entities of the ecosystem. He first creates Hospital Admin,Pharmacy Admin and Delivery Man
2.	Hospital Admin will login with his/her credentials and adds Doctors and Patients. Also an email is sent to the patients successfully to access all the features of our Application.
3.	Patient will book an appointment with desired hospital and doctor and submit Book Appointment 
4.	Doctor creates prescription for the patients who have booked appointment under him by clicking create prescription button
5.	Patient can view the prescription when he clicks on check prescription button
6.	Pharmacy Admin add medicines to his pharmacy by clicking add Medicines with their prices
7.	Patient can order medicines by selecting the pharmacy name and medicines available in that pharmacy. He can pay and confirm the order for the same
8.	Pharmacy admin can view the orders placed by clicking manage orders button in his dashboard. He now accepts the order and assign the delivery man for the order placed. 
9.	Delivery man accepts the orders by selecting each order in his dashboard and assign to himself. Now the status of the order changes to pending. Later he selects the order and click on Delivered Button
10.	Patient can view the status of the ordered medicines. The status now will be changed to delivered 
11.	System Admin will login to add Lab Admin
12.	Lab Admin can Add the medical tests along with the price of the tests by clicking Add/Update Tests button in his dashboard
13.	Patient can click on Book Tests to undergo medical tests. He can select the Lab, Test name and Test date. Now he can confirm the Test by paying the total amount displayed and click on confirm
14.	Lab Admin will complete the test process of the respective patient. He can also publish results by clicking on submit button 
15.	System Admin will login to create the Insurance Admin 
16.	Insurance Admin can now add Insurance Plans. He can add the plan details such as total years of duration, Monthly premium amount and Total premium amount of the plan. He can also manage the plans created by updating or deleting plans by clicking on Manage Plans in his dashboard
17.	Patient will book the Insurance by clicking on check insurance plans in his dashboard. He can view the plans available and confirm the purchase by clicking on Pay
18.	Insurance Admin will check the orders placed by clicking on manage orders in his dashboard. He can view the order details and confirm/decline the purchase 
19.	System Admin will login in to create Supplier Admin
20.	Supplier Admin will add inventory items with all the details of products .He can also update and delete the products
21.	Hospital Admin will be able  to order inventory items to his organization and confirms the order by selecting the supplier name and products 
22.	Supplier Admin can check the orders placed and can confirm the order. He also assign deliveryman to deliver the products
23.	Delivery man now can check the assigned orders. He will assign to himself and click on Delivered. The status gets updated to delivered 
24.	System Admin will login to create Emergency Admin
25.	Patient clicks on Help button in his dashboard during emergency
26.	Emergency Admin will receive the request for help for respective patient and completes the help
27.	System Admin can do All CRUD operations on All organizations



 

## CONTRIBUTERS:

- ADITYA ILLUR - `002776756` <br>
<img src="https://res.cloudinary.com/dj98golzx/image/upload/v1670628560/adi_profile_pic_vwj4gp.jpg" width="10%" height="10%"> <br>
- PRATIK SANNAKKI - `002780000` <br>
<img src="https://media-exp1.licdn.com/dms/image/D5603AQGYqYHDaGGnDw/profile-displayphoto-shrink_400_400/0/1663108903217?e=1676505600&v=beta&t=w4FfBpV_gF14PTo1tPYdMWTT3nHE94O0Typvc7PBbMw" width="10%" height="10%"> <br>
- AKSHATHA PATIL - `002657158`<br>
<img src="https://media-exp1.licdn.com/dms/image/D4E03AQH0uLKvNgadsw/profile-displayphoto-shrink_400_400/0/1664753097808?e=1676505600&v=beta&t=J1HgxqKNQaBI2SXizq44rB_YZPktMA8VVZcQBGDrmGk" width="10%" height="10%"> <br>
