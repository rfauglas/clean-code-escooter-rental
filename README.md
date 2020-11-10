
## Refactoring steps
### Analysis
What do you think of the test?
What can you say about test coverage?
Which refactorings can you identify?
Can you identify all refactorings?

### Refactorings
To see step 1 refactoring: git show step-1
To go to step 1 refactoring: git checkout step-1

Step|Intent|How
---|---|---
0|Initial project setup|git setup
1|Lower complexity into statement function|Refactoring: Extract Function/Move Statements into Function
2|"Bad smell: Demeter's law| move amountFor to Rental"|Move Method
3|Rename amountFor into getCharge|rename method
4|Remove variable thisAmount to increase readability|Replace Derived Variable with Query / Inline variable
5|"Correct getTool to getEscooter|Replace totalAmount variable getTotalCharge "|"Replace Temp with Query totalAmount| split loop"
6|Replace frequentRenterPoints variable with a getTotalFrequentRenterPoints|"Replace Temp with Query frequentRenterPoints| split loop"
7|Respect naming conventions: fields should not have an _ prefix|Stick with name conventions:Rename Field
8|"Implement a new HTML output| implement a test for it"|htmlStatement introduced
9|"Improve readability| evolutivity: Replace PriceType by a Price enumeration holding the tarification logic."|Replace Conditional with Polymorphism- Move Field- Replace Constructor with Factory Function- Extract Class%  

### Conclusion

MF: "Before you start refactoring, check you have a solid suite of tests. These tests
must be self-checking."
But indeed it might be handy to scope complexity before writing tests... Writing tests is also a question of knowledge, undestanding, and design complexity.
What shoud guide you in the end is the risk: you have to lower the regression risk path during the whole refactoring  process.
- Reduce complexity using safe refactorings (using IDE, or really simple...).
- Write tests and perform unsafe refactorings 
