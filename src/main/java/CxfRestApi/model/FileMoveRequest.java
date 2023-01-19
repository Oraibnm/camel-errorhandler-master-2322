package CxfRestApi.model;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;


public class FileMoveRequest {
    @SerializedName("filesName")
    private String[] fileName;

    public FileMoveRequest() {
    }

    public FileMoveRequest(String[] fileName) {
        this.fileName = fileName;
    }

    public String[] getFileName() {
        return fileName;
    }

    public void setFileName(String[] fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "FileMoveRequest{" +
                "fileName='" + fileName + '\'' +
                '}';
    }
}
