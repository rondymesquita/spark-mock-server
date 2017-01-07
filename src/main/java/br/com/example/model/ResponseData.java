package br.com.example.model;

/**
 * Created by alvarosilva on 23/12/16.
 */
public class ResponseData {

    public final static String SUCCESS = "success";
    public final static String ERROR = "error";

    private String status;
    private String message;

    public ResponseData(String message, String status){
        this.status = status;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ResponseData{" +
                "message='" + message + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
