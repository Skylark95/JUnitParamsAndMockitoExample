package com.skylark95.junitparams.runner;

import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;
import org.mockito.MockitoAnnotations;

import junitparams.JUnitParamsRunner;

public class JUnitParamsMockitoRunner extends JUnitParamsRunner {

    public JUnitParamsMockitoRunner(Class<?> klass) throws InitializationError {
        super(klass);
    }

    @Override
    protected Statement methodInvoker(FrameworkMethod method, Object test) {
        MockitoAnnotations.initMocks(test);
        return super.methodInvoker(method, test);
    }

}
