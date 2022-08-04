package com.example.kotlin_chat_app

class Message {

    var message: String? = null
    var senderId: String? = null

    constructor() {}
    constructor(message : String?,sendId:String?) {
    this.message = message
    this.senderId = sendId


    }
}