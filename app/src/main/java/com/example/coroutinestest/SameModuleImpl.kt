package com.example.coroutinestest

import kotlinx.coroutines.experimental.delay

class SameModuleImpl : SameModuleInterface {
    override suspend fun test() {
        delay(1000)
    }
}