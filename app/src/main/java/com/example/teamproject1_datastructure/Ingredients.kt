package com.example.teamproject1_datastructure
import java.text.SimpleDateFormat
import java.util.*

//재료 클래스
class Ingredients(name:String) {
    //변수
    var name : String = name            //재료 이름
    var picture : String = ""           //재료 사진
    var expirationDate : String = ""    //재료의 유통기한. 형식: 2022-10-10
    var expirationDDay : Int = 0        //재료의 남은 유통기한. 현재 날짜 기준.
    var inputDate : String = ""         //재료를 추가한 날짜. 형식: 2022-10-10
    var type : Int = 0                  //재료의 타입, 냉장=0, 냉동=1 (추후.실온=2)
    var storageMethod : String = ""     //재료 보관 방법

    //보조생성자
    constructor(name:String, expirationDate:String, inputDate:String, type:Int, storageMethod:String):this(name){
        this.expirationDate = expirationDate
        this.inputDate = inputDate
        this.type = type
        this.storageMethod = storageMethod
        this.expirationDDay = calculateDDay(expirationDate)
    }

    //남은 유통기한을 계산해주는 함수
    fun calculateDDay(expirationDate: String):Int{
        var today = Calendar.getInstance()
        var sf = SimpleDateFormat("yyyy-MM-dd")
        var date = sf.parse(expirationDate)
        var DDay = (date.time - today.time.time) / (60*60*24*1000)
        return DDay.toInt()
    }
}

//유통기한 순으로 정렬하는 함수 (합병정렬)
fun mergeSort(list:LinkedList<Ingredients>, start:Int, end:Int){
    if (start >= end) return
    val mid = (start + end) / 2  // 반으로 쪼갬
    mergeSort(list, start, mid)
    mergeSort(list, mid + 1, end)
    merge(list, start, mid, end)  // 분할된 두 리스트을 하나로 정렬하며 합침
}

fun merge(list:LinkedList<Ingredients>, start: Int, mid: Int, end: Int) {
    val sortedList:LinkedList<Ingredients> = LinkedList(listOf())  // 정렬된 새로운 리스트
    var indexA = start  // 왼쪽 배열 인덱스
    var indexB = mid + 1  // 오른쪽 배열 인덱스

    while (indexA <= mid && indexB <= end) {  // 두 리스트 중 하나라도 모두 소진되면 종료
        // 둘 중 최솟값을 새로운 리스트에 담아주는 작업
        if (list[indexA].expirationDDay <= list[indexB].expirationDDay) {
            sortedList.add(list[indexA])
            indexA++
        } else {
            sortedList.add(list[indexB])
            indexB++
        }
    }
    if (indexA > mid) {  // 오른쪽 배열 원소가 아직 남았다면
        for (i in indexB..end) {
            sortedList.add(list[i])
        }
    }
    if (indexB > end) {  // 왼쪽 배열 원소가 아직 남았다면
        for (i in indexA..mid) {
            sortedList.add(list[i])
        }
    }
    for (x in sortedList.indices) {  // 정렬된 부분 대입
        list[start + x] = sortedList[x]
    }
}

// 유통기한 임박 알림 함수
fun notifyExpirationDate(list:LinkedList<Ingredients>):Boolean{
    var needNotify : Boolean = false
    for(i in 0 until list.size){
        if(list[i].expirationDDay <= 3){
            needNotify = true
        }
    }
    return needNotify
}

fun main(){
//    val egg = Ingredients("달걀", 15, "2022-10-20", "2022-10-10", "냉장보관")
//    val potato = Ingredients("감자", 10, "2022-11-02", "2022-10-22", "실온보관")
//    val garlic = Ingredients("마늘", 8, "2022-11-15", "2022-10-25", "실온보관")
//    val onion = Ingredients("양파", 3, "2022-11-14", "2022-10-26", "냉장보관")
//    val leek = Ingredients("대파", 2, "2022-11-02", "2022-10-22", "냉장보관")
//
//    var ingredientsList :LinkedList<Ingredients> = LinkedList(listOf(egg,potato,garlic,onion,leek))
//
//    mergeSort(ingredientsList,0,ingredientsList.size-1)
//
//    for(i in ingredientsList.indices){
//        println(ingredientsList[i].name)
//    }
}
