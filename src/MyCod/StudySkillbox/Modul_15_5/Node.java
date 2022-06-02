package MyCod.StudySkillbox.Modul_15_5;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class Node {

    private File folder;
    private ArrayList<Node> children;
    private long size;
    private int level;
    private long limit;

    public Node(File folder, long limit) {
        this.folder = folder;
        children = new ArrayList<>();
        this.limit = limit;
    }

    public long getLimit() {
        return limit;
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
        String size = SizeCalculator.getHumanReadableSize(getSize());
        builder.append(folder.getName() + " - " + size + "\n");
        for (Node child : children) {
            if (child.getSize() < limit) {
                continue;
            }
            builder.append(" ".repeat(this.level) + child.toString());
        }
        return builder.toString();
    }
}
