package junit.basicproblems.performancetests;


import static org.junit.jupiter.api.Assertions.*;

import junit.basicproblem.performancetests.TaskProcessor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class TaskProcessorTest {

    TaskProcessor taskProcessor = new TaskProcessor();

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    public void testLongRunningTask() throws InterruptedException {
        taskProcessor.longRunningTask();
    }
    @Test
    @Timeout(value = 3, unit = TimeUnit.SECONDS)
    public void testLongRunningTask1() throws InterruptedException {
        taskProcessor.longRunningTask();
    }

}
