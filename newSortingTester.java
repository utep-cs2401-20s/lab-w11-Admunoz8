import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class newSortingTester extends newSorting{

    @Test
    public void NewSorting1(){
        //this test case is just to see if quick sort is working.
        int[] test = {5,6,7};
        int[] expected = {5,7,6};
        newSorting ns = new newSorting();
        ns.newSorting(test,2);//basic size to see if it works
        assertArrayEquals(expected, test);
        //test passed
    }
    @Test
    public void NewSorting2(){
        //this test case is just to see if quick sort can deal with same numbers.
        int[] test = {5,5,6};
        int[] expected = {5,5,6};
        newSorting ns = new newSorting();
        ns.newSorting(test,2); //basic size to see if it still works
        assertArrayEquals(expected, test);
        //test passed
    }
    @Test
    public void NewSorting3(){
        //this test case is just to see if quick sort to see if big lenght will effect it.
        int[] test = {1,2,3,4,5,6,7,8,9,10,11,12};
        int[] expected = {1,3,2,4,6,5,7,9,8,10,12,11};
        newSorting ns = new newSorting();
        ns.newSorting(test,3);//up the size to see if it still works
        assertArrayEquals(expected, test);
        //test passed
    }
    @Test
    public void NewSorting4(){
        //this test case is just to see if quick sort can do if small lenght will effect it.
        int[] test = {1};
        int[] expected = {1};
        newSorting ns = new newSorting();
        ns.newSorting(test,1);//small size to see if it effects
        assertArrayEquals(expected, test);
        //test passed
    }
    @Test
    public void NewSorting5(){
        //this test case is just to see if quick sort can do repeated numbers,large array and also out of order.
        int[] test = {9,4,5,3,2,3,4,5,6,7,8,1,2,2,3,4,5,6,7,9,10};
        int[] expected = {1,2,2,3,4,4,5,5,5,3,2,6,6,7,7,3,8,9,9,10,4};
        newSorting ns = new newSorting();
        ns.newSorting(test,10);//big size to see if it effects.
        assertArrayEquals(expected, test);
        //test passed
    }

}
//donee