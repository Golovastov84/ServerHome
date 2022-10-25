package MyCod.StudySkillbox.Modul_15_7;

import java.io.File;
import java.util.ArrayList;

public class Node {

    private File folder;
    private ArrayList<Node> children;
    private long size;
    private int level;

    public Node(File folder) {
        this.folder = folder;
        children = new ArrayList<>();
    }


    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public File getFolder() {
        return folder;
    }

    private void setLevel(int level) {
        this.level = level;
    }

    public void addChild(Node node) {
        node.setLevel(level + 1);
        children.add(node);
    }

    public ArrayList<Node> getChildren() {
        return children;
    }

    public static long getFolderSize(File folder) {
        if (folder.isFile()) {
            return folder.length();
        }
        long sum = 0;
        File[] files = folder.listFiles();
        for (File file : files) {
            sum += getFolderSize(file);
        }
        return sum;
    }

    public String toString() {
//        String size = SizeCalculator.getHumanReadableSize(getSize());
        StringBuilder builder = new StringBuilder();
        builder.append(folder.getName() + "\\n");
        for (Node child : children) {

            builder.append(" ".repeat(this.level) + child.toString());
        }
        return builder.toString();
    }
}
