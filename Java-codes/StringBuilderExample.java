class StringBuilderExample {
public static void main(String[] args) {

// Creates a StringBuilder object with initial value "Hello" 
StringBuilder sb = new StringBuilder("Hello");

// append() adds text at the end 
sb.append(" World");
System.out.println("append: " + sb);

// insert() inserts text at the specified position sb.insert(5, ",");
System.out.println("insert: " + sb);

// replace() replaces characters between given indexes sb.replace(6, 11, "Java");
System.out.println("replace: " + sb);

// delete() removes characters from the string
 sb.delete(5, 6);
System.out.println("delete: " + sb);

// reverse() reverses the string 
sb.reverse();
System.out.println("reverse: " + sb);

// length() gives total number of characters 
System.out.println("length: " + sb.length());

// capacity() shows the current storage capacity
 System.out.println("capacity: " + sb.capacity());

// charAt() fetches a character at given index 
System.out.println("charAt(2): " + sb.charAt(2));

// setCharAt() updates the character at a given index sb.setCharAt(2, 'X');
System.out.println("setCharAt: " + sb);

// substring() extracts a portion of the string
 System.out.println("substring: " + sb.substring(1, 4));
}
}