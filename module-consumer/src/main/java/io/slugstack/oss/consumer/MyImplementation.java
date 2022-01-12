package io.slugstack.oss.consumer;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import io.slugstack.oss.library.MyClassToExtend;
import io.slugstack.oss.library.MyInterface;

public class MyImplementation extends MyClassToExtend implements MyInterface {
    Logger logger = LogManager.getLogger(MyImplementation.class);

    public void someInterfaceMethod() {
        // not used
    }

    @Override
    public void doWork() {
        // not used
    }

}
