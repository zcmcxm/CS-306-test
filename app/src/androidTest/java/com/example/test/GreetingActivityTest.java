package com.example.test;

import android.app.Activity;
import android.content.Intent;
import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class GreetingActivityTest {
    private static String greeting_prefix = "Bonjour! ";
    private static String testKey = "mainName";
    private static String testInput = "Test";

    @Test
    public void greetingTest() {
        // create intent
        Intent testIntent = new Intent(ApplicationProvider.getApplicationContext(), GreetingActivity.class);
        testIntent.putExtra(testKey, testInput);

        // launch intent
        ActivityScenario<Activity> launch = ActivityScenario.launch(testIntent);

        // assert
        onView(withId(R.id.greetingMessage)).check(matches(withText(greeting_prefix + testInput)));

        // close
        launch.close();
    }
}
