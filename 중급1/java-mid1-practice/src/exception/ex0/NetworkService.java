package exception.ex0;

public class NetworkService {
    public void sendMessage(String data) {
        String address = "http://naver.com";
        NetworkClient client = new NetworkClient(address);
        client.connect();
        client.send(data);
        client.disconnect();

    }
}
