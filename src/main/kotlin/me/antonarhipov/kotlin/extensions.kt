package me.antonarhipov.kotlin

import java.util.*

fun String.uuid(): String = UUID.nameUUIDFromBytes(this.encodeToByteArray()).toString()

