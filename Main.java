import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        BST<Integer, String> bst = new BST<>();

        // Insert key-value pairs into the binary search tree
        bst.put(5, "Apple");
        bst.put(3, "Banana");
        bst.put(7, "Orange");
        bst.put(2, "Mango");
        bst.put(4, "Pineapple");
        bst.put(6, "Grapes");
        bst.put(8, "Kiwi");

        // Print the size of the binary search tree
        System.out.println("Size: " + bst.size());

        // Get values by keys
        System.out.println("Value for key 4: " + bst.get(4));
        System.out.println("Value for key 7: " + bst.get(7));

        // Delete a key from the binary search tree
        bst.delete(3);

        // Print the size after deletion
        System.out.println("Size after deletion: " + bst.size());

        // Iterate over the binary search tree using the iterator
        System.out.println("Iterating over the binary search tree:");
        Iterator<BST<Integer, String>.KeyValuePair> iterator = bst.iterator();
        while (iterator.hasNext()) {
            BST.KeyValuePair pair = iterator.next();
            System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());
        }
    }
}

