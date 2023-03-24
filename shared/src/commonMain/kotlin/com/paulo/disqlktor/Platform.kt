package com.paulo.disqlktor

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform