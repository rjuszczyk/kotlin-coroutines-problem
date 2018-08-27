package com.example.coroutinestest

import com.example.lib.OtherModuleInterface
import kotlinx.coroutines.experimental.delay

class OtherModuleImpl : OtherModuleInterface {
    override suspend fun test() {
        delay(1000)
    }
}