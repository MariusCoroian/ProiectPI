   public class Programare{
        String data;
        String client;
        String status;

    public Programare() {
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Programare{" + "data=" + data + ", client=" + client + ", status=" + status + '}';
    }
        
        
    }