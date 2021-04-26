# Project Report

Alex Neher

## Markdown Tips

If you are unfamiliar with MarkDown, check out 
[the official documentation](https://guides.github.com/features/mastering-markdown/).

Note that IntelliJ IDEA has a Markdown preview that you can access in 
the upper-right of the editor. Also, since Markdown documents&mdash;like
source code&mdash;should be human-readable, make sure you keep your lines
short, as you can see I have done in my Markdown files.

Please remove this subsection before submitting your report. 

## Challenge #1 Complete

For this challenge I changed QueryEngine so that it uses WikipediaQueryEngine rather than FakeQueryEngine.
ALl I had to do was modify the QueryEngineModule by changing FakeQueryEngine to WikipediaQueryEngine.

## Challenge #2 Complete

To complete Challenge 2 I simply followed the instructions. I created a new interface, created a new module to inject the correct
dependency at runtime, and added that module to the guice injector. It took me a while to figure out how to do all of this, 
but I was able to get it working. I also changed the format so it was easier to read, in my opinion.

## Challenge #3 Complete

To complete Challenge 3 I used a stream and a map to help get rid of the for loop. I then used collect to take all of the strings
and display them on their own line.

## Reflection Question #1: Functional vs OO

(Write one or more paragraphs comparing and contrasting the iterative and functional  
approaches to string concatenation you explored in challenge #3. Which do you
prefer, and why?)


## Reflection Question #2: Polymorphism and Dependency Inversion

(Explain how polymorphism engendered dependency inversion in this little
application. Be clear and precise here, as this is, in part, an assessment of
your correct use of technical terminology.
Consider, for example, where exactly is polymorphism used?
Where exactly is a dependency inverted?)

