Todays refactoring was first coined by the GangOfFour and has many resources on the web that have different usages of this pattern. Two different aims of the factory pattern can be found on the GoF website here and here.
Often in code some involved setup of objects is required in order to get them into a state where we can begin working with them. Uusally this setup is nothing more than creating a new instance of the object and working with it in whatever manner we need. Sometimes however the creation requirements of this object may grow and clouds the original code that was used to create the object. This is where a Factory class comes into play. For a full description of the factory pattern you can read more here. On the complex end of the factory pattern is for creating families of objects using Abstract Factory. Our usage is on the basic end where we have one factory class creating one specific instance for us.
 Take a look at the code before:
 
 
 As we can see, the new action is responsible 
 for creating a PoliceCar and then setting some initial 
 properties on the police car depending on some external input. 
 This works fine for simple setup, 
 but over time this can grow and the burden of 
 creating the police car is put on the controller 
 which isn’t really something that the controller 
 should be tasked with. 
 In this instance we can extract our creation code and
 place in a Factory class that has the distinct responsibility 
 of create instances of PoliceCar’s