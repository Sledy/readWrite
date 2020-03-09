package pjatk.homework.utils;

import lombok.extern.slf4j.Slf4j;

import java.io.*;

import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.util.Arrays;


@Slf4j
class ReaderWriter {

    private Path targetFilePath;

    ReaderWriter(Path targetFilePath) {
        this.targetFilePath = targetFilePath;
    }

    public void readAndWriteToTargetFile(Path filePath) {
        try (FileChannel sourceFile = new FileInputStream(filePath.toFile()).getChannel();
             FileChannel targetFile = new FileInputStream(targetFilePath.toFile()).getChannel()) {
            targetFile.position(targetFile.size());
            sourceFile.transferTo(0, sourceFile.size(), targetFile);
        } catch (IOException e) {
            log.error(Arrays.toString(e.getStackTrace()));
        }
    }
}
