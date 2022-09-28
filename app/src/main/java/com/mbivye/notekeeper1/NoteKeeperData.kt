package com.mbivye.notekeeper1

data class CourseInfo(val courseID:String, val title:String) {
    override fun toString(): String {
        return title
    }
}
data class NoteInfo(var course:CourseInfo, var title: String, var text:String)
