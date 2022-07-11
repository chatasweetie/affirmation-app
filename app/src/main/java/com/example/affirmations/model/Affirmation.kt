package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


// Resource annotations; Annotations are useful because they add additional info to
// classes, methods, or parameters. Annotations are always declared with an @ symbol.
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
){

}