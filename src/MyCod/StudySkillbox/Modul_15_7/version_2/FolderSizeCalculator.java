package MyCod.StudySkillbox.Modul_15_7.version_2;


import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class FolderSizeCalculator {

    private Node node;

    public FolderSizeCalculator(Node node) {
        this.node = node;
    }


    public Node compute() {
        File folder = node.getFolder();

        List<FolderSizeCalculator> subTasks = new LinkedList<>();
        File[] files = folder.listFiles();
        for (File file : files) {
            Node child = new Node(file);
            FolderSizeCalculator task = new FolderSizeCalculator(child);
            subTasks.add(task);
            node.addChild(child);
            System.out.println(file);
        }
        return node;
    }

}

