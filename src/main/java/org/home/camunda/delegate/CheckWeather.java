package org.home.camunda.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Random;

public class CheckWeather implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        var random = new Random();
        delegateExecution.setVariable("name", "Vlad");
        delegateExecution.setVariable("weatherOk", random.nextBoolean());
    }
}
