package com.nygen.com

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var x=1

    while(x<3){
        print(if(x==1) "Yab" else "Dab")
        print("Ba")
        x=x+1
    }
    if(x==3) println("Do")
}