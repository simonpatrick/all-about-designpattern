Today's refactoring is from Martin Fowler's refactoring catalog. 
You can find the original description here

This refactoring is used quite often when you have a number of methods that you want to “pull up” into a base class to allow other classes in the same hierarchy to use. Here is a class that uses two methods that we want to extract and make available to other classes.