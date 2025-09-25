package com.study.todolistproduct

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

@RequiresApi(Build.VERSION_CODES.O)
class Task {
    /*
    * taskName : 할일 목록
    * taskCategory : 할일 분류(기본은 미설정)
    * isComplete : 할일 완료 여부
    * taskDate : 할일 생성 날짜
    * */

    var taskName:String = ""
    var taskCategory:String = ""
    var isComplete:Boolean = false
    var taskDate : LocalDate = LocalDate.now()


    constructor()

    constructor(name: String, complete:Boolean){
        this.taskName = name
        this.isComplete = complete
    }


}