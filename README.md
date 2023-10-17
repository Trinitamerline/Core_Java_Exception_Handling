
Objective: To implement the concept of exception handling in Java.

Pre-Lab Exercise:
Create three exception classes as detailed in the following class diagram:

In the main() method get input for two operands and one operator from the
user and check if the first operand is within the range 10,000 to 50,000 and
second operand is within the range 500 to 5000 and the operator is one of the
characters ‘+’, ‘-‘, ‘*’ or ‘/’. If the operand is not within the range then create
and throw an OperationFailedException with BadOperandException as its
root cause. If the operator is not one of the listed characters create and throw
an OperationFailedException with BadOperatorException as its root cause. If
exception is thrown, print the exception and its root cause; otherwise print the
result of the evaluated expression.

Lab Exercise:

Create a package named pkbanking. In that package define two sub packages
named pkinterface and pkexception. The package pkinterface contains an
interface named Transaction with a data member min_balance initialized to
500, two methods namely void withdraw(double) throws
InsufficientFundsException and void deposit(double) and another interface
named InterestRate with three data members sbrate with 4%, rdrate with 6%,
fdrate with 8.25%. The package pkexception contains a user defined
exception class named InsufficientFundsException which has a String type
member named description. Provide both default constructor that assigns
“Insufficient Funds” to description and a parameterized constructor that takes
one string argument and stores it in its member description. Override the
toString() method to return description.

Create another package named pkaccount. In that package create a class called
Account that has the protected data members accnumber of int type, balance
of double, constructors for initialization. Define two subpackages sb and fd in
pkaccount. In sb package derive a class called SBAccount from Account class
that implements both Transaction and InterestRate interfaces. Also it has
constructors for initialization using super class constructors, deposit(double),
withdraw(double), and calc_interest() methods. Provide a parameterized
constructor with two parameters account number, and init_balance and assign
these values to the appropriate data members of the class using super class
constructor. The deposit method should take one double type argument
amount and adds the amount to the balance if the amount is positive. If the
amount is negative, it should throw an IllegalArgumentException. The
withdraw method, should take one double type argument amount and checks
if balance - amount is greater than min_balance. If so, it should subtract the
amount from balance. Otherwise it should throw InsufficientFundsException.
The calc_interest() method should compute interest for the balance amount
available @ sbrate for one year and the interest amount should be credited to
the balance.

In fd package derive a class called FDAccount from Account class that
implements InterestRate interface. It has one data member period of int type.
Provide parameterized constructor with parameters for accno, period and
deposit amount for initializing them using super class constructor. Provide a
method called calc_interest() for calculating interest for the deposit amount
for the given period @ fdrate p.a. and returns the calculated interest, and
another method called close() which calls calc_interest() add it to the balance.

Create third package named pkcustomer which contains a class Customer.
The data members of the class are cust_id of int type, name, and address of
string type, and Array of objects of Account. Provide parameterized
constructor with cust_id, name and address as parameters for initializing.
Provide a method called createAccount(int type). Based on the value of type
(SB, or FD) create a new account of given type and store it in the
corresponding array. Provide a method transaction(int type) {type may be
withdraw, deposit or calc_interest on SBAccount, closing of FDAccount} to
perform the requested transaction on the requested account object.

To demonstrate all the functionalities of above classes, create a class called
BankDemo and declare a main method to create an array of 5 elements of
Customer objects, and perform manipulations on the objects by creating SB
and FD accounts, depositing and withdrawing amount from SB accounts, and
closing FD accounts. Provide exception handling mechanisms to handle the
exceptions.
