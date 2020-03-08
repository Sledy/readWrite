package pjatk.homework.utils;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileNotFoundException;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.file.Path;


@Slf4j
public class ReaderWriter {

    private Path targetFilePath;

    public ReaderWriter(Path targetFilePath){
        this.targetFilePath = targetFilePath;
    }

    public void readAndWriteToTargetFile(Path filePath) throws FileNotFoundException {
        File file = new File(filePath.getFileName().toAbsolutePath().toString());
        RandomAccessFile reader = new RandomAccessFile(file, "r");
        FileChannel channel = reader.getChannel();



    }



}
