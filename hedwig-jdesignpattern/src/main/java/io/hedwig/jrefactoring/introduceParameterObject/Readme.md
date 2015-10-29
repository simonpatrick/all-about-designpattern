Sometimes when working with a method that needs several parameters it becomes difficult to read the
method signature because of five 
or more parameters being passed to the method like so:



In this instances it’s useful to create a class who’s only responsibility is to carry parameters into the method. This helps make the code more flexible because to add more parameters, you need only to add another field to the parameter object. Be careful to only use this refactoring when you find that you have a large number of parameters to pass to the method however as it does add several more classes to your codebase and should be kept to a minimum.