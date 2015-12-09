/**
 * Created by patrick on 15/12/9.
 */
/*
 <p>A linear search is the most basic of search algorithm you can have.
  A linear search sequentially moves through your collection (or data structure)
  looking for a matching value.</p>
 <p>Despite its less than stellar performance, linear searching is extremely common.
  Many of the built-in methods that you are familiar with,
  like ruby's <code>find_index</code>, or much of jQuery, rely on linear searches.
   When you are dealing with a relatively small set of data,
   it's often good enough (and for really small unordered data
   is can even be faster than alternatives).</p>

 <p>Beyond this though, the general concept of sequential/linear access is something
 that is often overlooked. The more abstract libraries get,
 the more risk you run of unknowingly doing something linearly. .NET's
 LINQ is a great example. Most of LINQ works against
 <code>IEnumerable<T></code> which only exposes a forward moving enumerator.
 So what do you think happens when you call the <code>Count()</code> method? Thankfully,
 LINQ is smart and, if possible, it'll rely on a fast
 <code>Count</code> or <code>Length</code> property. However,
 if the actual implementation doesn't have those, it'll loop through the enumerator.</p>
 <p>That doesn't make LINQ's <code>Any</code>, or Ruby's <code>include?</code> "evil".
 It's just good to know what these high level methods might be doing (and often,
  what they are doing, is a linear search).<p>

 */

function findIndex(values,target){
    for(var i =0;i<values.length;i++){
        if(values[i]==target) return i;
    }
}