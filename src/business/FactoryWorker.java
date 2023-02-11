package business;
//DEFINITIONS
//#1: Package Protected
    //The protected modifier specifies that the member can only be accessed within its own package(so only Company and FactoryWorker classes can access each other)

//FACTORY WORKER CLASS
    //I don't want the NewsAgency to have full access to FactoryWorkers class, to do this I create a business package which I used to put the Company and FactoryWorkers class in. This creates a package protected visibility(#1)

    // Because Company and FactoryWorkers classes are in their own package, the NewsAgency cannot see or interact with those two classes because there package protected.(#1)
class FactoryWorker {
}
