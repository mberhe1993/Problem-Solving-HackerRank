

public class MyBST {
public BinaryNode root;
public MyBST() {
root = null;
}
public void printTree( ) {
if( root == null )
System.out.println( "Empty tree" );
else
printTree( root );
}
private void printTree( BinaryNode t ){
if( t != null ){
printTree( t.left );
System.out.println( t.element );
printTree( t.right );
}
}
public void insert(Integer x) {
if (root == null) {
root = new BinaryNode(x, null, null);
return;
}
BinaryNode n = root;
boolean inserted = false;
while(!inserted){
if(x.compareTo(n.element) < 0) {
//available spot found on the left
if(n.left == null){
n.left = new BinaryNode(x, null, null);
inserted = true;
}
//keep looking
else {
n = n.left;
}
}
else if(x.compareTo(n.element) > 0){
//available spot found on the right if(n.right == null){
n.right = new BinaryNode(x, null, null);
inserted = true;
}
//keep looking
else {
n = n.right;
}
} //case x.compareTo(n.element) == 0 not handled – no duplicates allowed
}
}
 class BinaryNode {
// Constructors
BinaryNode(Integer theElement) {
this(theElement, null, null);
}
BinaryNode(Integer Element, BinaryNode Left,BinaryNode Right){
element = Element;
left = Left;
right = Right;
}
public Integer element; // The data in the node
public BinaryNode left;
public BinaryNode right; 
}
