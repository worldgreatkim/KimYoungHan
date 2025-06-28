package nested.inner.ex1;

public class Car {
    private int chargeLevel;
    private String model;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.chargeLevel = chargeLevel;
        this.model = model;
        this.engine = new Engine(this);
    }

    //Engine에서만 사용하는 메서드
    public int getChargeLevel(){
        return chargeLevel;
    }
    //Engine에서만 사용하는 메서드
    public String getModel(){
        return model;
    }

    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");

    }

}
