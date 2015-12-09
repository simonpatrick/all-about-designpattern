/**
 * Created by patrick on 15/12/9.
 */

/*
 <p>Where the behavior of arrays is largely defined by using contiguous blocks of memory,
 link lists are defined by the opposite: their ability to use non-contiguous memory.
 How do linked lists represent a cohesive collection of items then?
 In its simplest implementation, each node of a linked lists is a combination of the value and a
 reference to the next item in the list. Therefore, instead of relying on
 absolute position from a starting point, as array do, linked lists require each node to
 know the location of its sibling.</p>

 <p>It is also common for each node to have a reference to the previous node.
 This is known as a doubly-linked list. This doubles the memory overhead
 as well as making manipulation more complicated (two references must
 be maintained rather than just one). However, it does make insertion and deletions
 within the list simpler.</p>

 <p>Link lists' memory friendliness isn't the great benefit it once was. Dynamic arrays,
 with spare space to grow, are generally a better fit for today's programs. However,
 linked lists are still a solid implementation for collections which provide sequential access,
 like queues and stacks.</p>

 */

function LinkedList(){
    this.head=null;
    this.tail=null;

    this.add =function(value){
        var node= new Node(value);
        if(this.head==null){
            this.head=node;
        }
        if(this.tail!=null){
            this.tail.next=node;
        }

        this.tail=node;
    };

    this.removeAt=function(index){
        var prev=null;
        var node = this.head;
        var i=0;
        while(node!=null&&i++<index){
            prev=node;
            node=node.next
        };
        if(prev==null){
            this.head=node.next;
        }else{
            prev.next=node.next;
        }
    };

    function Node(value){
        this.value=value;
        this.next=null;
    }
}

var list = new LinkedList();
list.add(1);
list.add(2);
list.add(3);
console.log(list);