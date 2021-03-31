#Coding Solution

##*Explaining My Thought Process

###Big Picture

1. Understand the problem space, note ideas for solving
2. Pseudocode
3. Implementation
4. Error Catching
5. Extension of functionality i.e. what ifs

####Step One + Two

Trying to make rough pseudo code of how this should work:

    given k and array of numbers
    
    ? make a copy of array (actual copy not reference copy)
    - make an output array

    - for each array element x in numbers
        -define temporary count
        -count ++ for array element : 1
        -for each array element y in numbers 
            -if y == x:
                count ++
                ? array.pop y? -> might confuse the loop
            -else:
                continue;
        
        -now you have a count of the number of times element 0 appears:
        if count == k & if output ! contain x
            output array . append x

    return output

? loops or mapping with a dictionary / hashmap

####How can I Improve this?

When choosing a solution I try to weigh up what is most important:
- Functional/quickest for me to write
- Most Readable / Easier for colleagues to maintain the code
- Quickest / Least runtime, least memory, most efficent

I will also think about how I can use what already exists. 
I had a uni lecturer who was always keen to remind us that we don't always need to revinvent the wheel,
and in many cases it makes more sense to use what is already in the world instead of starting from scratch,
provided of course that I understand how the code works.

- Research How Other People Have Approached this
    https://www.geeksforgeeks.org/first-element-occurring-k-times-array/
- Research the Java documentation in case there's an inbuilt function or functions which might make sense to use.
    https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/HashMap.html
    https://www.w3schools.com/java/java_hashmap.asp - W3Schools sometimes simpler to navigate for simple things


###Step Three

    
    given k and array of numbers
    
    - make an output array
    - make hashmap Key: number Value: frequency : hashmap has unique keys

    - for each array element x in numbers

        if x in hashmap keys:
            key.value + 1
        
        else:
            add to hashmap with value 1

        OR
        
        if x in hashmap keys:
            continue;
        
        else:
            add key to hashmap
            valuecount = 1
            for element y from x+1 -> numbers.length:
                if y == x:
                    value++

        
    -now return keys where value = k
    for each key:
        if hashmap.containsvalue(k):
            output.add(key)

    return output

    Now I'm going to implement this ^^ in Java and see if it works like I think :)