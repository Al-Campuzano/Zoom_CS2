Outfit Generator Readme File

I set up a *Clothing* class that is the superclass of *Accessory, Outerwear, Pants, Shirt,* and *Shoe*. The superclass has String attributes for *Name, Color,* and *Season* which describe the name of the article of Clothing, its color, and the season it is good to wear it on. Options for *Season* that I used are "Summer", "Winter", "not summer", and "All". More on how that was used further in this document. The Clothing superclass also has two Boolean attributes *isFancy* and *isPlain* to indicate if the garment is fancy or not (which would make it casual), and if it is plain or not (the opposite of plain being colorful). Clothing has getters and setters methods for all those 5 attributes, and an abstract toString() method that is meant to be overwritten by all the subclasses.

The subclasses of Clothing all have a default constructor that would instantiate an object with some default parameters, as well as a toString() method that returns a formatted string detailing what the object's attributes are.

I found this to be the most logical way to set up the hierarchy for these items, since all the garments would have similar attributes to describe them, and all the attributes in each subclass would need to be accessed and/or modified at some point. I practice I found that I did not actually use the setters in Clothing.

I also did not put the rules used to determine if an outfit was a good one in these subclasses, but put them in the OutfitGenerator class instead.

The whole thing is split up into "data" and "ui" packages, where the TestOutfit class is in the ui package and the rest is in the "data" package.

The other classes I used are:

**TestOutfit**

This is a very simple class that just instantiates an OutfitGenerator object and calls its *getNewOutfit()* method to generate a 5-piece outfit with random items. Then we change the name of the outfit and the number of items to generate a second outfit with only 3 pieces.

**Outfit**

This is the class that holds the pieces of Clothing that make up the outfit to be returned to the OutfitGenerator. The Outfit class has the same attributes as Clothing to indicate a name, color, season, if it is fancy or casual, and if it is plain or colorful. There are also two boolean attributes to indicate if the outfit has a green or blue garment. These are used to make sure the outfit does not have a blue and green article of clothing together. I kept the articles of Clothing for the outfit in a HashMap which uses the article's type as the Key and the actual Clothing object reference as the Value. This was done so I could check if a type of Clothing was already added to the outfit or not, which allowed me to use only one list of Clothing items instead of having one list each of Shirts, Shoes, Pants, etc.

Outfit has an *add()* method that adds an article of Clothing to the HashMap with the Object name as the Key and the reference to the Clothing article as the Value; a *hasType()* method that checks if a type of Clothing is already in the HashMap; an *updateOutfit()* method that updates the *season, isPlain, hasBlue,* and *hasGreen* parameters as needed; and a *print()* method that loops through the values in the outfit and calls its corresponding toString method to print each out in turn.

**SampleWardrobe**

This class only has a constructor that sets up an ArrayList of Clothing objects and one *getSampleWardrobe()* method that instantiates a bunch of Clothing articles, adds them to the ArrayList and returns it. I set this up this way because it seem cleaner to have all the code to add all these sample garments in a separate place instead of cluttering up the OutfitGenerator

**OutfitGenerator**

This is where most of the "magic" happens :) The attributes here are "name" which gets passed on to the Outfit class to give the outfit a name; "numPieces" which lets us know how many pieces this new outfit is made out of (so you can make a 3-piece outfit for example); "wardrobe" which is an ArrayList of Clothing articles that keeps everything together in one place; and "MAX_TRIES" which is a constant number, currently set at 1000, that is used to prevent an infinite loop in the case that no matching garments can be found for that particular outfit.

This class uses the *getNewOutfit()* method to grab an item at random (using a helper method) then adding it to the Outfit, then using a while loop until the outfit is complete (using "numPieces") or we hit the MAX_TRIES value. In the loop we grab a random Clothing item from "wardrobe" and check if the type (Shirt, Shoe, etc) is not already in the Outfit, as well as if the item "matches" the rest of the items in the Outfit. That match check is done with a few helper methods using the following logic:

- Only accept items that are the same "fancy" or "casual" type as the Outfit using the "isFancy" attribute.
- Same with the "plain" or "colorful" type using the "isPlain" attribute. The Outfit class' *updateOutfit()* method will change the outfit's "plain" type after two items are added to the outfit to prevent all the pieces from being "plain" or "colorful".
- If the outfit *hasGreen* reject blue items, or if the outfit *hasBlue* reject green items.
- To match seasons we check the outfit's *season* attribute and match as follows: "all" season items go with anything; items with the same season type go together; "winter" and "not summer" items go together as well. Outfit's *updateOutfit()* method will change the outfit's *season* attribute from "all" to the one from the item being added, in order to prevent mixing garments from seasons that are incompatible.
