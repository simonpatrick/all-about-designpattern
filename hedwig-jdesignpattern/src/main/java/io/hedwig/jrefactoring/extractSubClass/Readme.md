Todays refactoring comes from Martin Fowlers catalog of patterns. You can find this refactoring in his
catalog here
This refactoring is useful when you have methods on a base class that are not shared amongst all classes and needs to be pushed down into it’s own class. The example I’m using here is pretty straightforward. We start out with a single class called Registration. This class handles all information related to a student registering for a course.


his refactoring is useful when you have methods on a base class that are not shared amongst all classes and needs to be pushed down into it’s own class. The example I’m using here is pretty straightforward. We start out with a single class called Registration. This class handles all information 
related to a student registering for a course.

There is something that we’ve realized after working with this class. We are using it in two different contexts. The properties NonRegistrationAction and Notes are only ever used when dealing with a NonRegistration which is used to track a portion of the system that is slightly different than a normal registration. Noticing this, we can extract a subclass and move those properties down into the NonRegistration class where they more appropriately fit.