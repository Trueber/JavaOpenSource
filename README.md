# JavaOpenSource
This project is a school project as part of the "Java Software Development with Open Source Frameworks" module at the BFH

## Setup & Biuld Project
* Install IDE of choise
* Add Lombok plugin
* Install Java SDK 8 or newer
* Install & Setup Maven  if not delivered with IDE
* Import project using Maven pom
* Biuld using Maven

## Working Components
* Camp module
* Arena module
* Promoter module
* Registry module (Eureka)
* Frontend / Gateway (Zuul)
* The Hero Entities were extended with a morale attribute which will boost / lower their power if the previous battle rounds of their team are successful / unsucessful

## Not Implemented Components
* Creating Docker images

## Problems / Solutions during Implementation
* Steep Learning Curve
  *  -> Look up solution or documentaion
* A lot of incomprehensible behaviour (also called magic) in the application
  * Makes for fast implementation, but tracking errors is a real headache
  * -> Look up solution or documentaion
  * -> Try / Error
* Verbose / cryptic logs / error messages
  * -> Divide and Conquer!
