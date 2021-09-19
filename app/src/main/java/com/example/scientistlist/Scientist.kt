package com.example.scientistlist

class Scientist(name: String, imageId1: Int, imageId2: Int) {
    var name: String = name
    get() = field
    var imageId1: Int = imageId1
    get() = field
    var imageId2: Int = imageId2
    get() = field

    companion object {
        var scientistList = arrayOf(
            Scientist("Albert Einstein", R.drawable.alberteinstein1, R.drawable.alberteinstein2),
            Scientist("Marie Curie", R.drawable.mariecurie1, R.drawable.mariecurie2),
            Scientist("Richard Feynman", R.drawable.richardfeynman2, R.drawable.richardfeynman1)
        )
    }

    override fun toString(): String {
        return this.name;
    }
}