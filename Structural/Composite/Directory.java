package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    List<FileSystem> fileSystemList;
    String directoryName;

    public Directory(String directoryName){
        this.directoryName = directoryName;
        fileSystemList = new ArrayList<>();
    }

    public void add(FileSystem fileSystem){
        fileSystemList.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("Directory: " + directoryName);

        for(FileSystem obj: fileSystemList){
            obj.ls();
        }
    }
    
}
