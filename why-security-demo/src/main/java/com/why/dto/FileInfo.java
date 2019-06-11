package com.why.dto;

/**
 * ClassName: FileInfo
 * Description: TODO
 * Date: 2019-06-10 23:27
 *
 * @author Wang, Haoyue
 * @version V1.0
 * @since JDK 1.8
 */
public class FileInfo {

    private String path;

    public FileInfo(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
