## Solid Principles

* First conceptualized by Robert C. Martin in 2000 paper - Design Principles and Design Patterns.   
* Michael Feathers later built upon these concepts and introduced the SOLID acronym.  
* These 5 principles have become fundamentals for how OO code is written 
As applications grow these principles reduce complexity making code more maintainable, readable and flexible!


### Single Responsibility

* Class should have one, and ONLY one responsibility
* Why?  Results in classes being loosely coupled, well organized and having fewer test cases
* Example: Book class that has properties/methods directly related to book; Logger that needs to output data to different locations


### Open to Extension, Closed for Modification

* Existing class should be open for extension but closed for modification (unless fixing bugs)
* Why?  Prevents developer from potentially creating new bugs from existing code
* Example: Guitar that needs new features added to it


### Liskov Substitution

* Extends Open Closed by focusing on the behavior of a superclass and its subtypes
* Polymorphism – dynamic method dispatch / upcasting; objects of parent class should be capable of being substituted with objects of subclass w/o breaking app; objects of subclasses should behave the same as objects of superclass
* An overridden method of a subclass needs to accept the same input parameter values as the method of the superclass. That means you can implement less restrictive validation rules, but you are not allowed to enforce stricter ones in your subclass. Otherwise, any code that calls this method on an object of the superclass might cause an exception, if it gets called with an object of the subclass.
* Similar rules apply to the return value of the method. The return value of a method of the subclass needs to comply with the same rules as the return value of the method of the superclass. You can only decide to apply even stricter rules by returning a specific subclass of the defined return value, or by returning a subset of the valid return values of the superclass.
* If you decide to apply this principle to your code, the behavior of your classes becomes more important than its structure. Unfortunately, there is no easy way to enforce this principle. The compiler only checks the structural rules defined by the Java language, but it can’t enforce a specific behavior.
* You need to implement your own checks to ensure that your code follows the Liskov Substitution Principle. In the best case, you do this via code reviews and test cases.
* Example: Electric car implementing Car that has method turnOnEngine
* [Excellent Detailed Example](https://stackify.com/solid-design-liskov-substitution-principle/)


### Interface Segregation

* Larger Interfaces should be refactored into smaller ones
* Why? Class should NOT implement an interface or method it doesn’t need
* Example: Animal interface with walkOnLand and swimInWater methods; Turtle needs both but a Fish only needs swim


### Dependency Inversion

* Classes should be loosely coupled depending on abstraction not concrete implementations
* Why? We gain ability to switch out dependencies instead of being tightly coupled
* Example: Computer workspace depends on a generic Keyboard and Monitor NOT specific kinds of keyboards/monitors


#### Helpful Sources
* [Baeldung - Solid Guide to Solid Principles](https://www.baeldung.com/solid-principles)
* [Solid Principles FreeCodeCamp](https://www.freecodecamp.org/news/solid-principles-explained-in-plain-english/)
