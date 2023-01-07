package GeneralHeirarchy;

import java.util.ArrayList;
import java.util.List;

public abstract class Node {
    private Node parent;
    private List<Node> children;

    public Node() {
        this.parent = null;
        this.children = new ArrayList<>();
    }

    public Node getParent() {
        return this.parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public List<Node> getChildren() {
        return this.children;
    }

    public void addChild(Node child) {
        this.children.add(child);
        child.setParent(this);
    }

    public void removeChild(Node child) {
        this.children.remove(child);
        child.setParent(null);
    }
}
