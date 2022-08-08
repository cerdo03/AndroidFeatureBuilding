package com.example.project

class Users {
    //userid
    var userid: String? = null
    //username
    var username: String? = null
    constructor() {}
    constructor(userid: String, username: String) {
        this.userid = userid
        this.username = username
    }
}