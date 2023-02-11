//because the Company class is in a different package then the NewsAgency I have to refer to the company by telling java where the Company class is coming from
//by default Java will expect to find the Company class within the same package as this class but because it's not in the same package we have to import the Company class into this class so java knows that Company im talking about

//ANATOMY OF IMPORT
    //first the import keyword telling java that were importing something
    //the next bit is telling java what package to go too, to find the class we are looking for
    //the last bit is saying what class we want to access
import business.Company;

public class NewsAgency {
    Company company;




}
