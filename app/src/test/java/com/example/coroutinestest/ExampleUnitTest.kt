package com.example.coroutinestest

import com.example.lib.OtherModuleInterface
import kotlinx.coroutines.experimental.runBlocking
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        //this one always fails
        val myOtherModuleObject : OtherModuleInterface = OtherModuleImpl()
        runBlocking { myOtherModuleObject.test() }

        //this one is fine
        val mySameModuleObject : SameModuleInterface = SameModuleImpl()
        runBlocking { mySameModuleObject.test() }
    }
}
