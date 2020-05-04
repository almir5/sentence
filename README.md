# Getting started
  - git clone git@github.com:almir5/sentence.git
  - ```cd sentence```

# Tests
  - To run tests: ```./gradlew test -i```
  
# Architecture

Programming language: **Java**

Entry point: **Sentence** class that has two methods:
  * getLongestWord(String sentence)
  * getShortestWord(String sentence)
  
# Assumptions and reasoning
  *  When sentence contains multiple longest or shortest words then return the first one.
  *  Due to lack of requirements and in spirit of YAGNI, no error handling was implemented. 
