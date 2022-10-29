package com.example.teamproject1_datastructure

import java.util.LinkedList

//레시피 클래스
class Recipe(name:String) {
    //변수
    var name : String = name         //레시피 이름
    var picture : Int = 0       //레시피 사진 url 스트링
    var desc : String = ""          //레시피 설명
    var youtubeLink : String = ""   //레시피 설명 유튜브 링크
    var category : String = ""      //레시피의 카테고리 ex)한식,중식,양식,,
    var essentialIngredients = Array<String>(10,{""}) //필수 재료
    var additionalIngredients = Array<String>(10,{""}) //부가적인 재료

    //보조 생성자
    constructor(name:String, desc:String, youtubeLink:String, category:String, essentialIngredients: Array<String>, additionalIngredients:Array<String>):this(name) {
        this.desc = desc
        this.youtubeLink = youtubeLink
        this.category = category
        this.essentialIngredients = essentialIngredients
        this.additionalIngredients = additionalIngredients
    }
}

//사용자가 원하는 카테고리를 입력받고 레시피 목록을 알려주는 함수 (ex. 한식, 중식, 양식, 분식 ..)
fun findCategory(recipeList:Array<Recipe>, category:String):Array<Recipe?>{
    var categoryList: Array<Recipe?> = arrayOfNulls<Recipe>(20)
    var categoryIndex:Int = 0
    //순차탐색
    for(index in 0 until recipeList.size){
        if(recipeList[index].category == category){
            categoryList[categoryIndex] = recipeList[index]
            categoryIndex++
        }
    }
    return categoryList
}

//레시피 검색 함수
fun findRecipe(recipeList:Array<Recipe>, ingredientList:LinkedList<Ingredients>):Array<Recipe?>{
    var possibleRecipe: Array<Recipe?> = arrayOfNulls<Recipe>(21) //가능한 레시피 목록
    var recipeIndex:Int = 0
    var possible:Boolean = false
    for(i in 0 until recipeList.size){
        possible = false
        for(j in 0 until recipeList[i].essentialIngredients.size){
            for(k in 0 until ingredientList.size){
                if(ingredientList[k].name == recipeList[i].essentialIngredients[j]){
                    //여기 들어오면 필수재료 찾은것.
                    possible = true
                    break
                }
            }
            if(possible == false){
                break
            }
        }
        if(possible == true){
            //여기서 가능한 레시피 배열에 추가해주면 된다.
            possibleRecipe[recipeIndex] = recipeList[i]
            recipeIndex++
        }
    }
    for(i in possibleRecipe.indices){
        println(possibleRecipe[i]?.name)
    }

    return possibleRecipe
}

fun main(){
    // 레시피 추가
    val kimchiBog = Recipe("김치볶음밥", "김치와 밥을 넣고 볶는다", "www.youtube.com", "한식", arrayOf("김치", "달걀"), arrayOf("대파", "양파", "마늘"))
    val gimbap = Recipe("김밥", "김에 재료를 넣고 말아준다", "www.youtube.com_gimbap", "한식", arrayOf("김","밥","단무지"),arrayOf("달걀","시금치"))
    val pasta = Recipe("파스타", "면을 삶는다", "www.파스타.com","양식", arrayOf("면","소스"), arrayOf("파슬리"))
    val simple = Recipe("기본", "ㅋㅋ", "www", "한식",  arrayOf("달걀","감자"), arrayOf("마늘"))

    var recipeList:Array<Recipe> = arrayOf(kimchiBog,gimbap,pasta,simple)

//    // 재료 추가
//    val egg = Ingredients("달걀", 15, "2022-10-20", "2022-10-10", "냉장보관" )
//    val potato = Ingredients("감자", 10, "2022-11-02", "2022-10-22", "실온보관")
//    val garlic = Ingredients("마늘", 8, "2022-11-15", "2022-10-25", "실온보관")
//    val onion = Ingredients("양파", 3, "2022-11-14", "2022-10-26", "냉장보관")
//    val leek = Ingredients("대파", 2, "2022-11-02", "2022-10-22", "냉장보관")
//    val kimchi = Ingredients("김치", 1, "2023-03-03", "2022-10-12", "냉장보관")
//
//    var ingredientsList :LinkedList<Ingredients> = LinkedList(listOf(egg,potato,garlic,onion,leek,kimchi))
//
//    println(findRecipe(recipeList,ingredientsList))
}