package com.example.affirmations

import android.content.Context
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.model.Affirmation
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

class AffirmationsAdapterTests {

    // In Android, Context is the context of the current state of the app, but remember that
    // unit tests run on the JVM and not on an actual device, so there is no Context. The mock
    // method allows us to create a "mocked" instance of a Context. It doesn't have any real
    // functionality, but it can be used to test methods that require a context.
    private val context = mock(Context::class.java)

    @Test
    fun adapter_size(){
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )
        val adapter = ItemAdapter(context, data)

        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)

    }

}