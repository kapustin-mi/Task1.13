package cs.vsu.ru.kapustin;

public class Main {

    public static <E> void main(String[] args) {
        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        arrayStack.push(1);
        System.out.println(arrayStack);
        E element = (E) arrayStack.pop();
        System.out.println(element);
        arrayStack.push(32);
        arrayStack.push(3);
        arrayStack.push(1);
        arrayStack.push(2);
        int a = arrayStack.search(32);
        System.out.println(arrayStack);
        System.out.println(a);
        boolean b = arrayStack.empty();
        System.out.println(b);
        arrayStack.push(1);
        arrayStack.push(1);
        arrayStack.push(1);
        arrayStack.push(1);
        arrayStack.push(1);
        arrayStack.push(1);
        arrayStack.push(1);
        System.out.println(arrayStack);
    }
}
