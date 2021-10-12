## Comment on the advantages and disadvantages of the 3 approaches.

Each of these 3 approaches has their own advantages and disadvantages. 

The first approach (being the basic MVC pattern approach) is obviously the most accessable approach
as it requires no knowledge of specific design patterns and its implementations and is fairly 
straight forward. However, this also heavily limits it's adaptability as the dependency between the 
model and the view remains the same.

The interface approach alleviates this issue as it allows the display and ticketprinter classes to
directly handle their own update methods without forcing them to share a common class hierarchy.
The only real disadvantage of this method is that it is slightly more tedious to implement and that 
it does not make much of a difference unless the display and ticketprinter are being used multiple 
times.

The observer approach further builds upon the interface approach by allowing data to be collected
at the time they occur without needing to call other classes. This promotes the principle of loose
coupling as the observer classes are much less dependent on the observable class than in the previous
approaches and can be added and removed at any time. However, the disadvantage of this approach is that
if it is implemented incorrectly it can lead to performance issues.
