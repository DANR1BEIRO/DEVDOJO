`ProductTest02` demonstrates the difference between using a reference of the interface or superclass type (Product) 
and using a reference of the concrete class type (Tomato).

When you declare a variable as Product, you can only access the methods defined in the Product class or interface,
even if the actual object is a Computer or a Tomato. For example, with Product product2 = new Tomato("Sicilian", 10);
, you can call getName(), getPrice(), and calculateTaxValue(), but you cannot access methods specific to Tomato, such 
as setBestBefore() or getBestBefore().

When you declare a variable as Tomato, like Tomato tomato = new Tomato("Italian", 10);, you can access both the 
methods inherited from Product and the methods specific to Tomato, such as setBestBefore() and getBestBefore().

In summary, using a reference of the superclass or interface type promotes abstraction and flexibility, but 
limits access to only the common methods. Using a reference of the concrete class type allows access to all methods, 
including those unique to that class.