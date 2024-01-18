package com.example.unscrumblegame

import android.view.View
import androidx.test.espresso.matcher.BoundedMatcher
import com.google.android.material.textfield.TextInputLayout
import org.hamcrest.Description

class InputErrorMatcher(private val error: String) :
    BoundedMatcher<View, TextInputLayout>(TextInputLayout::class.java) {

    override fun describeTo(description: Description) {
        description.appendText("InputLayoutError $error")
    }

    override fun matchesSafely(item: TextInputLayout): Boolean {
        return item.error.toString() == error
    }
}