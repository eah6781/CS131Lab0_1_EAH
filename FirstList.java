/**Author: Elizabeth Hayes*/
public class FirstList<E> {
	private final int DEFAULT_SIZE=10;
   	private int currentItem=0;
   	private E ar[];
    private int i;
	@SuppressWarnings("unchecked")
	public FirstList()
	{        
	// arList=new E[DEFAULT_SIZE];   //causes a compile error                                        				   		// because T is cast to object                                        				  	 // later if we cast object to whatever T is,
			   // say a string,
                                                                	    	// we have a runtime error                                        				 		 // We could use a java collection like ArrayList for this.                                                                                             		
	ar=(E[]) new Object[DEFAULT_SIZE]; //Do it this way. Cast Object to type T[]
      	  } 

  @SuppressWarnings("unchecked")
    public FirstList(int length)
    {
	       // ar=new E[length]; //causes a compile error
	       ar=(E[]) new Object[length];
                  }

//Students complete the class. Start with a setter called addItem    //Write code to add an item to the end of the array   
//New Methods Follow

public void doubleListSize(){
    E[] arDoubleSize =(E[]) new Object[ar.length * 2];

    for(i=0;i< ar.length;++i){
        arDoubleSize[i] = ar[i];
    }
    ar = arDoubleSize;
}
public void addItem(E item){
    if(currentItem == ar.length){
        doubleListSize();
    }
    ar[currentItem]= item;
    currentItem++;
}
public void addItem(E item, int index){
    if(index < 0 || index > currentItem){
        System.out.println("Invalid index.");
    }
    if(currentItem == ar.length){
        doubleListSize();
    }
    for(i = currentItem; i > index; --i){
    ar[i] = ar[i-1]; 
    }
    ar[index] = item;
    currentItem ++;
}
public void deleteItem(int index){
    for(i = index; i < currentItem-1; ++i){
        ar[i] = ar[i+1];
    }
    currentItem --;
}
public int getLength(){
    return ar.length;
}
public E getItem(int index){
    if(index < 0 || index >= currentItem){
        System.out.println("Invalid index.");
    }
    return ar[index];
}
  /*** The FirstList class implements a generic array.
  *@param  Item to add to the end of the list
  *
  */
}
