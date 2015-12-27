package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.test.InstrumentationTestCase;

import java.util.concurrent.CountDownLatch;

/**
 * Created by matt on 12/27/15.
 */
public class JokeEndpointAndroidTest extends InstrumentationTestCase {

    public void testFetchJoke () throws Throwable {

        final CountDownLatch fetchJokeLatch = new CountDownLatch(1);

        final OnTaskCompleteListener listener = new OnTaskCompleteListener() {
            @Override
            public void onTaskComplete(String result) {
                assertNotNull(result);
                fetchJokeLatch.countDown();
            }
        };

        runTestOnUiThread(new Runnable() {

            @Override
            public void run() {
                new FetchJokeTask(listener).execute();
            }
        });

        fetchJokeLatch.await();
    }
}
