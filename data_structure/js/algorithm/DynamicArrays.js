/**
 * Created by patrick on 15/12/9.
 */
/*
 <p>In the traditional definition of an array, the key concept is that elements of
 an array occupy a contiguous block of memory. This has a couple important consequences.
  First, once created, an array cannot grow (because the adjacent memory might already be taken).
  Secondly, arrays can be randomly accessed. When you use square brackets to
  access an array element <code>[X]</code>), you are actually saying
  <em>move forward within the memory from the start of the allocation by X</em>.
   That explains why indexes start at 0, because the first item is retrieved by moving forward by 0.</p>
 */

function ArrayList(initialLength){
    this.length=0;
    this.array=new Array(initialLength);

    this.grow = function () {
        var original=this.array;
        this.array=new Array(this.length*2);
        for(var i=0;i<this.length;i++){
            this.array[i]=original[i];
        }
    };
    this.add=function(value){
        if(this.length=this.array.length){
            this.grow();
        }
        this.array[this.length++]=value;
    }
}

