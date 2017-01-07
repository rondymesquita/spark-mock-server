package br.com.example.model;

/**
 * Created by alvarosilva on 22/12/16.
 */
public class Response {

    private ResponseType type;
    private Object data;

    public void setType(ResponseType type) {
        this.type = type;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ResponseType getType() {
        return type;
    }

    public Object getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Response{" +
                "type='" + type + '\'' +
                ", data=" + data +
                '}';
    }
}
