
This refactoring is used when you have a larger switch statement that continually changes because of new conditions being added.
In these cases it’s often better to introduce the strategy pattern 
and encapsulate each condition in it’s own class. 
The strategy refactoring I’m showing here is refactoring towards 
a dictionary strategy. There is several ways to implement the strategy 
pattern, the benefit of using this method is that consumers needn’t
 change after applying this refactoring.