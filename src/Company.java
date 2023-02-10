//#1: ClassNames
    //Conventionally the first letter in a class name need to be capitalized but don't make the whole word capitalized
    //Class names can start with an underscore but is not recommended
    //Class names cannot start with numbers or symbols other than underscores
    //Class names can have numbers in the middle and at the end of class names, but it's rare that you'll even need to do that
//#2: Fields
    //A field is a variable of any type that is declared directly in a class

//THE ANATOMY OF THE CLASS
    //Bellow is generally how you're supposed to structure a class
    //The first bit is the visibly of the class
    //The next keyword class, which indicates that we're creating a class
    //The last bit is the name of the class so that we can reference it when we need to call on it later(#1)
public class Company {
    //you can create a relationship between the company and the factory worker by creating a "field"(#2)
    FactoryWorker worker;

}

//You can also write a class like this as well(this is the more minimal way to write it
class CompanyMinimal {

}
