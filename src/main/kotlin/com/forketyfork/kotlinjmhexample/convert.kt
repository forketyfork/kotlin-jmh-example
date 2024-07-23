package com.forketyfork.kotlinjmhexample

private const val forbiddenString = "^/&=?<>\\:*|\"!"
private val forbiddenSet = forbiddenString.toSet()

// find all occurrences of characters in a string and replace them with another character:
// the characters are specified as a string
fun convertString(string: String) = string.map { if (it in forbiddenString) '-' else it }
// the characters are specified as a set
fun convertSet(string: String) = string.map { if (it in forbiddenSet) '-' else it }
