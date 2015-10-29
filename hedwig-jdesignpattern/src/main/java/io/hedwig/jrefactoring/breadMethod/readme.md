Today’s refactoring didn’t really come from any one source. It just named it although someone else may have something similar that’s named differently. If you know of anyone that has a name for this other than Break Method, please let me know.
This refactoring is kind of a meta-refactoring in the fact that it’s just extract method applied over and over until you decompose one large method into several smaller methods. This example here is a tad contrived because the AcceptPayment method isn’t doing as much as I wanted. Imagine that there is much more supporting code around each action that the one method is doing. That would match a real world scenario 
if you can picture it that way.

Below we have the AcceptPayment method that can be decomposed multiple times into distinct methods.

As you can see the AcceptPayment method has a couple of things that can be decomposed into targeted methods. So we perform the Extract Method refactoring a number of times until we come up with the result: