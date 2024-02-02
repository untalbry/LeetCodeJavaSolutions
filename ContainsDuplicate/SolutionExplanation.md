# Contains Duplicate Solution 

For this exercise we need to know about HashSet, and 
how it works.

### Hash

In Java `HashSet` is a collection from the Collection Framework, that it does not allow duplicate elements. 
<br>

Each element in the `HashSet`  is stored based a `hash code`. A `Hash code` is a numerical representation of an object. 
The hash code is used to determine the index in the underlying array where the element should be stored. 

```Java
    HashSet<Integer> numbers = new HashSet<>();
```

>[!NOTE]
>Java's `Object` class provides actualy a method called `hashCode()` that returns an integer representating the object's hash code. 

Now, the `HashSet` class provides methods for adding a new object, but if the hash of the object that you whant to add is already in the collection, it returns `false` and it does not add's it to the same. 

So we can create a `foreach` to traverse the entire array and adding all his elements to the `hashmap`, but if we can't add an element it means that the element it's already added , so we return `true` because it contains duplicate elements 

```Java 
  for(int num: nums){
           if(!numbers.add(num)){
               System.gc(); 
               return true; 
           }
```

>[!NOTE]
> The `System.gc()` is for calling the garbage collector to collect the space of memory that we use. 