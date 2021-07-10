package com.example.notekeeperapplication

class CourseInfo(val courseid:String, val title:String)
class NoteInfo(var course:CourseInfo, var title: String, var text:String)


