# Lab-A11
This repository contains three programs: Person, Grocery, Checker

The Person program creates two new classes, Teacher and CollegeStudent, using inheritance. A Teacher will be like Person but will have additional properties such as salary (the amount the teacher earns) and subject (e.g. "Computer Science", "Chemistry", "English", and "Other"). TheCollegeStudent class will extend the Student class by adding a year (current level in college) and major (e.g. "Electrical Engineering", "Communications", and "Undeclared").

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

The Grocery program contains four classes:
Item class simulates items at a grocery store. It has the following fields and methods
name - String is the name of the item
price - double is the price of the item in dollars
discount - double is the discount on the item in dollars
Constructor that initializes an Item object with the given name, price and discount
Getter methods to return the name, price, and discount
String valueToString (double) that converts the passed in value to a number shortened to two decimal places and returns it as a String
String toString() returns the item name and its price and discount as shown in the example


Ice Breaker $1.05 (-$0.50)

One item would be printed per line, so don't forget to include a line break. In this example the item name is Ice Breaker, its price is $1.05 and there is a discount of $0.50 on it.
Employee class simulates a grocery store employee. This class has the following fields and methods:
name - String is the name of the employee
Constructor that initializes the name to a given name
Getter method to get the name of the employee
GroceryReceipt class keeps track of a list of items being purchased at a market. It has the following fields and methods:
clerk - Employee is the employee generating the receipt
receipt - String is the list of items
total - double is the total price of all the items in the list
Constructor that initializes the clerk to the given Employee object, receipt to an empty string, and total to 0.
Getter methods to get the total price of the items, receipt, and clerk
void add(Item) adds the item to the receipt and adds the price to the total.
String valueToString (double) that converts the passed in value to a number shortened to two decimal places and returns it as a String
String toString() returns the list of items and the total price as shown below: 

Coke 6 pack $3.99 (-$0.00)
Lays Regular $4.34 (-$0.25)
Total: $8.33 

DiscountReceipt class that extends the GroceryReceipt class to compute the discounts for preferred customers. It has the following fields and methods:
preferred - boolean is true if the receipt is for a preferred customer and false otherwise
discountCount - int is the total number of discounted items in the receipt
discountAmount - double is the total total discount on all the items in the receipt
Constructor that initializes the clerk to the given Employee object and preferred to the given boolean value. It also initializes the receipt to an empty string, the total, discount count, and discount amount to 0.
Getter methods to get the discount count and the discount amount.
void add(Item) - This method overrides the method of the GroceryReceipt class. It updates the discount count and the total discount if the receipt is for a preferred customer and the item discount is nonzero. Lastly, it adds the item to the receipt and adds the price to the total.
double getTotal() returns the total amount after discount.
double getDiscountPercent() returns the total percent discount received. This is computed by dividing the discount by the total undiscounted price.
String toString() returns the list of items, the total price, discount, number of discounted items, discount percent and the total price after discount

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

The Checker program contains  two classes that implement the Checker interface. You will then create a Checker object that checks for a particular acceptance criterion.

A SubstringChecker accepts any string that contains a particular substring. For example, the following SubstringChecker object broccoliChecker accepts all strings containing the substring "broccoli". 

Checker broccoliChecker = new SubstringChecker("broccoli");

The following table illustrates the results of several calls to the broccoliChecker accept method.

Method Call	Result
broccoliChecker.accept("broccoli")	true
broccoliChecker.accept("I like broccoli")	true
broccoliChecker.accept("carrots are great")	false
broccoliChecker.accept("Broccoli Bonanza")	false
Write the SubstringChecker class that implements the Checker interface. The constructor should take a single String parameter that represents the particular substring to be matched.

Checkers can be created to check for multiple acceptance criteria by combining other checker objects. For example, an AndChecker is a Checker that is constructed with two objects of classes that implement the Checker interface (such as SubstringChecker or AndChecker objects). The AndChecker accept method returns true if and only if the string is accepted by both of the Checker objects with which it was constructed.

In the code segment below, the bothChecker object accepts all strings containing both "beets" and "carrots". The code segment also shows how the veggies object can be constructed to accept all strings containing the three substrings "beets", "carrots", and "artichokes".


Checker bChecker = new SubstringChecker("beets");
Checker cChecker = new SubstringChecker("carrots");
Checker bothChecker = new AndChecker(bChecker, cChecker);
Checker aChecker = new SubstringChecker("artichokes");
Checker veggies = new AndChecker(bothChecker, aChecker);

The following table illustrates the results of several calls to the bothChecker accept method and the veggies accept method.
Method Call	Result
bothChecker.accept("I love beets and carrots")	true
bothChecker.accept("beets are great")	false
veggies.accept("artichokes, beets, and carrots")	true
Write the AndChecker class that implements the Checker interface. The constructor should take two Checker parameters.

Another implementation of the Checker interface is the NotChecker, which contains the following:
A one-parameter constructor that takes one Checker object
An accept method that returns true if and only if its Checker object does NOT accept the string
Using any of the classes SubstringChecker, AndChecker, and NotChecker, construct a Checker that accepts a string if and only if it contains neither the substring "artichokes" nor the substring "kale". Assign the constructed Checker to yummyChecker. Consider the following incomplete code segment.


Checker aChecker = new SubstringChecker("artichokes");
Checker kChecker = new SubstringChecker("kale");
Checker yummyChecker;
/* code to construct and assign to yummyChecker */

The following table illustrates the results of several calls to the yummyChecker accept method.
Method Call	Result
yummyChecker.accept("chocolate truffles")	true
yummyChecker.accept("kale is great")	false
yummyChecker.accept("Yuck: artichokes & kale")	false
 
