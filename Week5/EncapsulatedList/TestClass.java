public class TestClass
{
    public static void main(String[] args)
    {
        // Here are some objects we can store in our lists...

        ReadThis r1 = new ReadThis("http://www.bustle.com/articles/" +
                                   "63466-im-brianna-wu-and-im-risking-" +
                                   "my-life-standing-up-to-gamergate");

        ReadThis r2 = new ReadThis("http://i.imgur.com/4NjBQzn.jpg");

        ReadThis r3 = new ReadThis("http://imgur.com/zhppgSx");

        ReadThis r4 = new ReadThis("http://gnuu.org/2009/09/18/writing-" +
                                   "your-own-toy-compiler/all/1/");

        ReadThis r5 = new ReadThis("https://gigaom.com/2015/02/10/samsung-" +
                                   "tvs-start-inserting-ads-into-your-movies/");


        LinkedList list = new LinkedList();
        ////

        ListNode listHead = new ListNode(r1);
        list.addURLToBeginning(listHead);
        list.addURLToBeginning(new ListNode(r2));
        list.addURLToEnd(new ListNode(r3));
        list.addURLToBeginning(new ListNode(r4));
        list.addURLToBeginning(new ListNode(r5));


        ListNode.printNumNodes(); // <- best way to call a static method
        listHead.printNumNodes(); // <- prints the same thing, but should avoid
        listHead.next.printNumNodes(); // <- prints the same thing, but should avoid

        list.printListFrom();


        ////
        // Now we can add nodes to the beginning, end, and middle:

        //listHead = listHead.addNodeToBeginning(new ListNode(r3));

        // listHead.addNodeToEnd(new ListNode(r4));
        //
        // listHead.addNodeAfterNode(new ListNode(r5), listHead);
        //
        // ListNode.printNumNodes();
        // listHead.printListFromHere();


        ////
        // Let's test removing nodes from the beginning, middle, and end:

        // listHead = listHead.removeFirstNode();
        // listHead.printListFromHere();
        //
        // listHead = listHead.removeLastNode();
        // listHead.printListFromHere();
        //
        // listHead = listHead.removeNode(listHead.next);
        // listHead.printListFromHere();
        //
        // listHead = listHead.removeNode(listHead);
        // listHead.printListFromHere();
        //
        // listHead = listHead.removeNode(listHead);
        // System.out.println(listHead); // <- should be null!
    }



}
