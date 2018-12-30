# Observer 패턴

> 객체들에게 연락망을 돌립시다!



## Observer 패턴 = 출판사 + 구독자

>출판사: subject, 구독자: observer
>
>one-to-many



### 출판사: subject

* 데이터를 관리한다.
* 데이터가 달라지면 observer한테 publish



### 구독자: observer

* subject 를 구독하고있다가
* subject 객체의 데이터가 바뀌면 갱신 내용을 전달받고, 자동으로 내용이 갱신된다.



## Observer 패턴 구현

대부분 subject 인터페이스, observer 인터페이스 클래스 디자인을 바탕으로 구현한다.

```java
public interface Subject {
    //methods to register and unregister observers
    public void register(Observer obj);
	public void unregister(Observer obj);
    
    //method to notify observers of change
    public void notifyObservers();
    
    //method to get updates from subject
    public Object getUpdate(Observer obj);
}

public interface Observer {
    //method to update the observer, used by subject
	public void update();
	
	//attach with subject to observe
	public void setSubject(Subject sub);
}
```

* observer 가 될 가능성이 있는 객체에서는 반드시 `Observer` 인터페이스를 구현해야한다.
* `Observer` 인터페이스만 구현하면 무엇이든 observer 클래스가 될 수 있다.



## Loose Coupling

> Subject, Observer: 인터페이스
>
> ConcreteSubject, ConcreteObserver: 인터페이스 구현체



subject, observer 가 느슨하게 결합되어있는 디자인이다. 

이렇게하면 뭐가 좋을까?



### 1. subject는 observer에 대해 자세히 알 필요가 없다.

subject가 observer에 대해 아는것은 observer가 `Observer` 인터페이스를 구현한다는것 뿐이다.

`Observer` 의 ConcreteObserver 가 누구든지, 무슨일을 하는지 등에 대해서는 알 필요가 없다.

### 2. observer는 언제든지 새로 추가/제거할 수 있다.

### 3. 새로운 형식의 observer를 추가하려고 해도 subject를 전혀 변경할 필요가 없다.

그냥 새로운 클래스에서 `Observer` 인터페이스를 구현하고 observer로 등록하기만 하면 된다.

### 4. subject, observer 는 서로 독립적으로 재사용 할 수 있다.

### 5. subject, observer 가 변경되더라도 서로한테 영향을 미치지 않는다.



## 자바 내장 Observer 패턴 

자바에서 Observer 패턴을 API로 제공한다.

```java
//subject: java.util.Obsavable
public class Observable {...}

//observer: java.util.Observer
public interface Observer {...}
```

>  자바 API에서는 Observable이 인터페이스가 아니고 클래스이므로 → extends 해야한다.



## 데이터를 갱신하는 방법: push방식, pull방식

