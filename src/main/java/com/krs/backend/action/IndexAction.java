package com.krs.backend.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.observables.AsyncOnSubscribe;


/**
 * Created by fanshuai on 17/1/20.
 */
@Controller
public class IndexAction {
    @RequestMapping(value = "/")
    public String index(){

        return "index";
    }


    public static void main(String[] args){
        Observable testObservable = Observable.create(new Observable.OnSubscribe<String>(){

            @Override
            public void call(Subscriber<? super String> subscriber) {
                System.out.println("begin netxt");
                subscriber.onNext("aaa");
                System.out.println("end netxt");
                System.out.println("begin completed");
                subscriber.onCompleted();
                System.out.println("end completed");
            }
        });
        Observer observer = new Observer() {
            @Override
            public void onCompleted() {
                try {
                    Thread.sleep(10000l);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("completed");
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("error");
            }

            @Override
            public void onNext(Object o) {
                try {
                    Thread.sleep(10000l);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("next");
            }
        };
        testObservable.subscribe(observer);
        System.out.println("over");
    }
}
