package exception.ex1;



public class NetworkServiceV1_3 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        String connectResult = client.connect();
        if(!connectResult.equals("success")) {
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + connectResult);

        }else {
            String sendResult = client.send(data);
            if(!sendResult.equals("success")) {
                System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);

            }
        }
        client.disconnect();

    }
}
