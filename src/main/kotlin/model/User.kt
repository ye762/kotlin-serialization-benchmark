package org.ye.serializtion.benchmark.model

import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
data class User(val id: Int, val name: String, val email: String)