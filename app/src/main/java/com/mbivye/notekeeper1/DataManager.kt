package com.mbivye.notekeeper1

object DataManager {
    val courses = HashMap<String,CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeCourses (){
        var course = CourseInfo("android_intents","Android Programming with intents")
        courses.set(course.courseID, course)

        course = CourseInfo("android_async","Android async Programming and services")
        courses.set(course.courseID, course)

        course = CourseInfo("Java_lang","Java Fundamentals:The java Language")
        courses.set(course.courseID, course)

        course = CourseInfo("android_intents","Android Programming with intents")
        courses.set(course.courseID, course)

        course = CourseInfo("java_core","Android Programming with intents")
        courses.set(course.courseID, course)

        course = CourseInfo("Describing types with Kotlin","Functions")
        courses.set(course.courseID, course)
    }
    private fun initializeNotes(){
        val note = notes
    }
}