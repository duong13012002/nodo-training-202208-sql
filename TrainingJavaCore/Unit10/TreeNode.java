import java.util.ArrayList;
import java.util.List;

public class TreeNode <T>{

    private T value;
    private TreeNode<T> nextSibling;
    private TreeNode<T> firstChild;
    private TreeNode<T> parent;
    public TreeNode(T v){
        value = v;
    }
    public TreeNode<T> getNextSibling(){return nextSibling;}
    public TreeNode<T> getParent(){return parent;}
    public TreeNode<T> getFirstChild(){return firstChild;}
    public T getValue(){return value;}

    TreeNode<T> addChild(T value){
        TreeNode node = new TreeNode<T>(value);
        addChild(node);
        return node;
    }
    public void addChild(TreeNode<T>child){
        if (child == null) return;
        child.parent = parent;
        if (firstChild == null){
            firstChild = child;
        }else {
            TreeNode<T> temp = firstChild;
            while (temp.nextSibling != null){
                temp = temp.nextSibling;
            }
            temp.nextSibling = child;
        }
    }

    public static void main(String[] args) {
        TreeNode<String> root = new TreeNode<>("0");

        TreeNode<String> node1 = new TreeNode<>("1.0");
        root.addChild(node1);
        TreeNode<String> node = new TreeNode<>("1.1");
        root.addChild(node);
        TreeNode<String> node3 = new TreeNode<>("1.2");
        root.addChild(node3);
        TreeNode<String> node4 = new TreeNode<>("1.3");
        root.addChild(node4);

        TreeNode<String> node2 = node1.nextSibling;
        node2.addChild("2.0.0");
        node2.addChild("2.1.0");
        node2.addChild("2.2.1");
        System.out.println("Next sibling of "+node1.value + " is "+ node2.value);
        node3 = node2.nextSibling;
        System.out.println("Next sibling of "+ node2.value+ " is "+node3.value);
        System.out.println("Check coitains 2.1.1 = "+TreeNodeUtils.contains(root,"2.1.1"));

        List list = new ArrayList<>();
        list = root.chonloc(value -> {
            return value.contains(".0");
        });
        System.out.println("Co tong so "+list.size() + " chua '.0'");
        list.forEach(value -> System.out.println("Phan tu loc =====> "+value));

    }
    public List<T> chonloc(TreeNodeFilter<T> filter){
        List<T> list = new ArrayList<T>();
        TreeNodeUtils.visit(this,filter,list);
        return list;
    }
}
