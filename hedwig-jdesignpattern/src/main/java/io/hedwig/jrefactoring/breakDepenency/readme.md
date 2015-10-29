Today's refactoring is useful if you are trying to 
introduce unit tests into your code base as testing “seams” 
are needed to properly mock/isolate areas you don’t wish to test. 
In this example we have client code that is using a static class to
 accomplish some work. The problem with this when it comes to 
 unit testing because there is no way to mock 
 the static class from our unit test. 
 To work around this you can apply a wrapper interface 
 around the static to create a seam and break the dependency
 on the static.
 
 
 