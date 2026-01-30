import java.io.File;

public class DeleteCppExeFiles {
    public static void main(String[] args) {
        File directory = new File("."); // current directory
        deleteExeFiles(directory);
    }

    private static void deleteExeFiles(File dir) {
        File[] files = dir.listFiles();
        if (files == null) return;

        for (File file : files) {
            if (file.isDirectory()) {
                // Recursively check subdirectories
                deleteExeFiles(file);
            } else if (file.isFile() && file.getName().endsWith(".class")) {
                boolean deleted = file.delete();
                if (deleted) {
                    System.out.println("Deleted: " + file.getAbsolutePath());
                } else {
                    System.out.println("Could not delete: " + file.getAbsolutePath());
                }
            }
        }
    }
}
