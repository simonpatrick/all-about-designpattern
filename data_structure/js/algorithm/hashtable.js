/**
 * Created by patrick on 15/12/9.
 */
/*
A hash table is a more advanced data structure which
typically makes use of one or more other data structure.
    The general idea is to store the value within a bucket based on the hashing of some key.
    The simplest example stores values within an array. By applying the hashing algorithm to our key,
    we get the index to store our value in.
Generally speaking, hash tables are used to store a key=&gt;value pair, though in our examples the key w
ill be the value - to keep things straightforward.
*/

function hashtable(size){
    this.size=size;
    this.buckets = new Array(size);
    this.add=function(value){
        var index = this.hash(value);
        this.buckets[index]=value
    };

    this.hash=function(value){
        var sum=0;
        for(var i=0;i<value.length;i++){
            sum+=value[i].charCodeAt()-97;
            return sum%this.size
        }
    };
}

/*
 Collisions
 Hash tables must deal with collisions -
 that is, two values returning the same bucket index.
 This is more common than you might think (<a href="http://en.wikipedia.org/wiki/Birthday_problem">
 see the birthday problem</a>). One approach is for each bucket be its own data structure - say,
 a <a href="/structures/linkedlists">linked list</a>.</p>
 todo try to learn to how to calculate hash value
 */

function HashTable(size){
    this.size=size;
    this.buckets=new Array[size];
    for(var i=0;i< size;i++){
        this.buckets[i]=new LinkList();
    }

    this.add=function(value){
      var index=this.hash(value);
      this.buckets[index].add(value);
    };

    this.hash=function(value){
        return value
    }
}