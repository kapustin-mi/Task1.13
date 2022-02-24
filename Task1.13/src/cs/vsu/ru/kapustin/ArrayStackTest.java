package cs.vsu.ru.kapustin;

import org.junit.Assert;
import org.junit.Test;

public class ArrayStackTest {

    @Test
    public void checkAddingElements() {
        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        String expected = "[1, 2, 3]";

        Assert.assertEquals(arrayStack.toString(), expected);
    }

    @Test
    public void checkTakingElementWithRemoval() {
        ArrayStack<String> arrayStack = new ArrayStack<>();
        arrayStack.push("abcd");
        String expectedElement = "abcd";

        Assert.assertEquals(expectedElement, arrayStack.pop());
        Assert.assertTrue(arrayStack.empty());
    }

    @Test
    public void checkTakingElementWithoutRemoval() {
        ArrayStack<String> arrayStack = new ArrayStack<>();
        arrayStack.push("abcd");
        String expectedElement = "abcd";

        Assert.assertEquals(expectedElement, arrayStack.peek());
        Assert.assertFalse(arrayStack.empty());
    }

    @Test
    public void checkAddingElementToFullStack() {
        ArrayStack<Character> arrayStack = new ArrayStack<>(3);
        arrayStack.push('+');
        arrayStack.push('-');
        arrayStack.push('*');
        arrayStack.push('/');

        String expected = "[+, -, *, /]";
        Assert.assertEquals(expected, arrayStack.toString());
    }

    @Test
    public void checkElementSearch() {
        ArrayStack<Double> arrayStack = new ArrayStack<>();
        arrayStack.push(1.1);
        arrayStack.push(2.2);
        arrayStack.push(3.3);
        arrayStack.push(4.4);
        arrayStack.push(5.5);
        int expected = 3;

        Assert.assertEquals(expected, arrayStack.search(3.3));
    }
}