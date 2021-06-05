package com.sachin.learning;
import javafx.application.Application;
import javafx.stage.Stage;

public class RunningWithoutMain extends  Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("Hey");
    }

//    static{
//        System.out.println("class without a main method");
//        System.exit(0);
//    }
}
