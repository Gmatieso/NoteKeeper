package com.example.notekeeperapplication

class DataManager {
    val courses = HashMap<String,CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses ()
    }

    private fun initializeCourses () {
        var course = CourseInfo("android_intents","android programming with intents")
        courses.set(course.courseid,course)

        course = CourseInfo("android_async","Android Async programming and services")
        courses.set(course.courseid,course)

        course = CourseInfo("java_lang","Java Fundamentals:The Java language")
        courses.set(course.courseid,course)

        course = CourseInfo("java_core","Java Fundamentals:The core Plartform")
        courses.set(course.courseid,course)

    }
}