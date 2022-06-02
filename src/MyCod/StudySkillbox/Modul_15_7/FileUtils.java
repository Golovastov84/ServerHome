package MyCod.StudySkillbox.Modul_15_7;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.EnumSet;
import java.util.Objects;

public class FileUtils {
    private FileUtils() {
    }

    public static void copyFolder(String sourceDirectory, String destinationDirectory) throws IOException {
        // TODO: write code copy content of sourceDirectory to destinationDirectory
        {
            Path from = Path.of(sourceDirectory);
            Path to = Path.of(destinationDirectory);
            validate(from);
            Files.walkFileTree(from, EnumSet.of(FileVisitOption.FOLLOW_LINKS),
                    Integer.MAX_VALUE, new CopyDirVisitor(from, to));
        }
    }

    private static void validate(Path... paths) {
        for (Path path : paths) {
            Objects.requireNonNull(path);
            if (!Files.isDirectory(path)) {
                throw new IllegalArgumentException(String.format("%s is not a directory", path));
            }
        }
    }

}
