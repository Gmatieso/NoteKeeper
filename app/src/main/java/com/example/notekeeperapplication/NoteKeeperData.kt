package com.example.notekeeperapplication

class CourseInfo(val courseid:String, val title:String) {
    override fun toString(): String {
        return title
    }
}

class NoteInfo(var course:CourseInfo, var title: String, var text:String)


