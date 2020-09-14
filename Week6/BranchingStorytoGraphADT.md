**Branching Story to Graph ADT**

> Suppose we wanted to generalize the BranchingStory class from the interactive story example to be an abstract data type (ADT) that supported representing a directed graph with connections between any object.

> - How would you go about making this change? What operations would your ADT support?
> - What is an advantage of using an ADT in this context?

> Keep in mind that your new ADT could be used in many contexts requiring a graph, including to store information about a branching story.

To change the BranchingStory class into an ADT I would use something a Map where each _key_ would be a "Scene" or more generally a "Node", and the _value_ of the key would be an ArrayList that would hold all the "choices" or "branches" each node points to. I would use a Map instead of something like a LinkedList because each node could possibly connect to more than two Nodes.

Some of the operations this ADT would support would be:

- Adding and removing Nodes. 
- Getting the list of Branches a specific Node points to. 
- Adding and removing Branches to/from a Node.
- Retrieving a Node from the list of available Branches of another specific Node.
- Indicate if we've reached a "dead end" when the current Node does not have any available Branches.

The advantage of using an ADT like this would be that it could be used for cases other than just a branching story with little or no modification. For example you could use something like this for a survey program that asks different questions depending on the answers provided, or in a troubleshooting program that displays different directions based on the specifics provided with each step. 

