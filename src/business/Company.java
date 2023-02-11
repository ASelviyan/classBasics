package business;
//DEFINITION'S
//#1: ClassNames
    //Conventionally the first letter in a class name need to be capitalized but don't make the whole word capitalized
    //Class names can start with an underscore but is not recommended
    //Class names cannot start with numbers or symbols other than underscores
    //Class names can have numbers in the middle and at the end of class names, but it's rare that you'll even need to do that
//#2: Fields
    //A field is a variable of any type that is declared directly in a class
//#3: Access Modifiers
    // are keywords that can be used to control the visibility of fields, methods, and constructors in a class. The four access modifiers in Java are public, protected, default, and private.
//#4: Public Class
    //public is a Java keyword which declares a member's access as public. Public members are visible to all other classes. This means that any other class can access a public field or method.

//THE ANATOMY OF THE CLASS
    //Bellow is generally how you're supposed to structure a class
    //The first bit is the access modifier of the class(#3)
    //The next keyword class, which indicates that we're creating a class
    //The last bit is the name of the class so that we can reference it when we need to call on it later(#1)

//Unlike FactoryWorker I do want the NewsAgency to be able to access the Company class to do this ill have to make the Company class a public class(#2) (you can see this in the Company class tab)(#4)
public class Company {
    //you can create a relationship between the company and the factory worker by creating a "field"(#2)
//ANATOMY OF A FIELD
    //the first but in the field is the variable (which in this case is a class)
    //the last bit is the name so that you can reference the data
    FactoryWorker worker;

}

//You can also write a class like this as well(this is the more minimal way to write it
class CompanyMinimal {

}
