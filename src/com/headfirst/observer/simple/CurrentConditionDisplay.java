package com.headfirst.observer.simple;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private Subject weatherData;
    private float temp;
    private float pressure;

    /*
    * observer 생성자에 subject 가 전달되고
    * subject 에 this(observer)를 등록한다.
    * */
    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);

        /*
         * subject(weatherData)에 대한 레퍼런스를 저장하는 이유?
         * - 나중에 subject 에서 탈퇴하려면
         * - this.weatherData.removeObserver(this) 할 수 있다.
         * */
    }

    @Override
    public void update(float temp, float pressure) {
        this.temp = temp;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("============ Current Condition ============");
        System.out.println("temp: " + temp);
        System.out.println("pressure: " + pressure);
        System.out.println("=================== End ===================");
    }
}
