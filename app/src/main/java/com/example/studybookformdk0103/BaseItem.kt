package com.example.studybookformdk0103

public class BaseItem {
    var imageIndex = 0
    var textContent = ""
    constructor(imageIndex:Int,textContent:String){
        this.imageIndex = imageIndex
        this.textContent = textContent
    }
    fun getImage():Int{
        return imageIndex
    }
    fun getText():String{
        return textContent
    }

}