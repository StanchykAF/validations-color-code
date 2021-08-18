# Validations. Color Code

Implement validation method in [`ColorCodeValidation`](src/main/java/com/epam/rd/autotasks/validations/ColorCodeValidation.java):
```java
public static boolean validateColorCode(String color)
```
This method checks the input string for compliance with the rules for writing [HTML Color Codes ](https://htmlcolorcodes.com/).

- Examples of valid hex codes:
```bash
#0B79E1 
#6A8DAF 
#002950 
```
- Examples of invalid hex codes:
```bash
123456
#afafah 
#-123 
```

While implementing the methods you might need to come up with *regular expressions*.
You may consider using [regex101.com](https://regex101.com/) to ease designing them.

You can and should use following methods\classes:
- [`matches`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#matches(java.lang.String))
- [`Pattern`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Pattern.html)
- [`Matcher`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Pattern.html#matcher(java.lang.CharSequence))

There are JUnit5 tests classes for making sure each method's behavior is correct.
You can use them yourself, for that you need to install Maven project manager and run the following command in the project folder:
```bash
mvn clean test
```