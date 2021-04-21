package com.test.kotlin

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.test.kotlin")
		.start()
}

