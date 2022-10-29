package com.example.teamproject1_datastructure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
fun main(){
    // 레시피 추가
    // 한식
    val kimchiFriedRice = Recipe("김치볶음밥", "1. 대파는 반으로 갈라 송송 썰고 소시지는 얇게 썰어 준비한다.\n" +
            "2. 김치는 가위를 이용하여 잘게 썰어 준비한다.\n" +
            "3. 팬에 식용유를 두르고 대파, 소시지를 넣어 노릇하게 볶는다.\n" +
            "4. 소시지가 노릇해지면 설탕을 넣어 눌어붙도록 볶아준다.\n" +
            "5. 설탕 향이 올라오면 간장을 넣어 볶는다.\n" +
            "6. 수분이 사라지면 김치를 넣고 약불에서 볶아준다.\n" +
            "   (양념장이 뭉쳐있을 경우 물을 넣어 볶아준다.)\n" +
            "7. 양념이 골고루 섞이면 즉석밥을 넣고 국자를 이용하여 풀어준다.\n" +
            "8. 밥알이 다 풀어지면 불에 올려 볶아준다.\n" +
            "9. 프라이팬에 식용유를 두르고 달걀프라이를 한다.\n" +
            "10. 완성 접시에 김치볶음밥, 달걀프라이를 올리고 깨소금과 김 가루를 곁들인다.\n", "https://youtu.be/eIo2BaE6LxI", "한식", arrayOf("김치", "대파"), arrayOf("소세지", "진간장", "달걀","김가루"))
    val eggFriedRice = Recipe("계란볶음밥", "1. 대파는 송송 썰어 준비한다.\n" +
            "2. 프라이팬에 식용유, 대파를 넣어 파 기름을 내고 노릇해지면 한쪽으로 몰아둔다.\n" +
            "3. 다른 한쪽에 달걀을 넣어 스크램블 한다.\n" +
            "4. 재료가 없는 쪽에 간장을 넣어 눌어붙도록 끓여주고 스크램블 한 달걀, 볶은 대파와 섞어준다.\n" +
            "5. 달걀, 대파가 골고루 섞이면 맛소금, 밥을 넣고 불을 끈 후 국자를 이용하여 섞어준다.\n" +
            "6. 밥이 골고루 섞이면 센 불에 올려 볶는다. \n" +
            "7. 기호에 따라 MSG를 넣어 볶은 후 완성한다.\n", "https://youtu.be/kR77WlHRZrs","한식", arrayOf("대파","달걀"), arrayOf("간장","맛소금"))
    val braisedMackerel = Recipe("고등어조림","1. 양파는 0.5cm 두께로 채 썰어 준비한다.\n" +
            "2. 대파는 반으로 갈라 송송 썰어준다.\n" +
            "3. 청양고추를 송송 썰어 준비한다.\n" +
            "4. 볼에 간생강,간마늘, 된장, 황설탕, 참기름, 고운고춧가루, 굵은고춧가루, 진간장, 통조림국물을 섞어 양념장을 만든다.\n" +
            "5. 김치는 꽁다리를 제거하고 냄비에 담는다.\n" +
            "6. 위에 통조림 고등어를 올리고 굵은가시를 제거하고 살 쪽이 바닥으로 가게 해준다.\n" +
            "7. 대파, 청양고추, 양파를 넣는다.\n" +
            "8. 물, 양념장을 넣어 끓인다.\n" +
            "9. 조림이 끓으면 중불로 줄여 10분 정도 끓인다.\n", "https://youtu.be/j9NXZh0gX3w", "한식", arrayOf("고등어","김치","양파"), arrayOf("청양고추","대파","고춧가루","다진마늘"))
    val bibimbap = Recipe("비빔밥", "1. 양파, 간장, 간마늘, 설탕, 소금, 고기, 물을 함께넣고 물기가 날라갈때까지 볶는다.\n" +
            "2. 준비된 밥위에 준비된 양념장과 기호에 맞는 나물, 계란등을 올린다.\n", "https://youtu.be/altBUluOKZg", "한식", arrayOf("양파", "돼지고기", "양파"), arrayOf("다진마늘","간장","설탕","소금"))
    val braisedPorkKimchi = Recipe("돼지김치찜","1. 설탕, 국간장, 된장, 간 마늘, 고춧가루를 섞어 양념장을 만든다.\n" +
            "2. 양파는 굵게 채 썰고 대파는 송송 썬다.\n" +
            "3. 청양고추는 두껍게 썰고 고기는 주먹 크기로 자른다.\n" +
            "4. 냄비에 김치를 깔고 고기를 올린 후 다시 김치로 덮어준다.\n" +
            "5. 그 위에 양파, 청양고추, 대파를 넣는다.\n" +
            "6. 물과 양념장을 잘 섞어 부어준다.\n" +
            "7. 센 불로 켜고 끓으면 중약불로 줄여 뚜껑 덮고 졸인다.\n" +
            "8. 김치와 고기가 물러지면 간을 본 후 기호에 맞게 식초를 넣는다.\n" +
            "9. 식초를 골고루 섞어 준 후 완성한다.\n", "https://youtu.be/RVfSeUZ8XkY","한식", arrayOf("돼지고기","김치"), arrayOf("양파","대파","청양고추","설탕","된장","간장","다진마늘","고춧가루"))
    val bulgogi = Recipe("불고기", "1. 깊은 볼에 한입 크기로 자른 소고기를 넣고 잘 풀어서 준비한다.\n" +
            "2. 소고기에 황설탕, 물엿, 간 마늘을 넣고 골고루 버무려 약 10~20분 정도 재운다. \n" +
            "  Tip: 설탕의 분자가 다른 양념류보다 크기 때문에 가장 먼저 넣어서 단맛을 배게 한다.\n" +
            "3. 표고버섯은 기둥을 제거하고 두께 0.3cm 정도로 얇게 썬다. \n" +
            "4. 대파, 홍고추는 두께 0.5cm 정도로 어슷썰어 준비한다.\n" +
            "5. 양파는 꼭지를 제거하고 두께 0.5cm 정도로 채썰어 준비한다. \n" +
            "6. 재워둔 소고기에 진간장을 넣고 고기가 부서지지 않도록 조심히 섞어준 후 양파, 대파, 홍고추, 표고버섯을 넣어 섞는다.\n" +
            "7. 채소 위에 후춧가루, 참기름을 넣고 섞는다. \n" +
            "  Tip: 다음날 사용한다면 대파만 넣어서 냉장 보관하여 사용 당일 나머지 채소를 넣어 조리한다. \n" +
            "8. 팬을 강 불에 올려 예열하고 소불고기를 올려 재료를 집게나 젓가락으로 잘 풀어주면서 볶는다.\n" +
            "  Tip: 기호에 따라 MSG 1/4큰술 정도를 넣어 볶는다.\n" +
            "9. 완전히 익은 소불고기를 접시에 담고 통깨를 뿌려 완성한다.\n", "https://youtu.be/nVzwOOJLt24","한식", arrayOf("소고기", "양파", "대파"),arrayOf("다진마늘","설탕","물엿","간장","후추","참기름","표고버섯","홍고추"))
    val grilledPork = Recipe("삼겹살구이", "1. 돼지고기 양면에 마이야르반응이 충분히 일어날때까지 굽는다.\n" +
            "* 여러번 뒤집어도 상관없음\n" +
            "2. 돼지고기를 먹기좋은 크기로 잘라준다.\n" +
            "3. 잘린면도 모두 익을때까지 준비된 채소, 마늘과 함께 구워준다. \n", "https://youtu.be/reflTfKONLY", "한식", arrayOf("돼지고기"), arrayOf("양파", "대파","마늘"))

    // 중식
    val dongpayuk = Recipe("동파육", "1. 돼지고기, 양파, 대파를 기름에 튀긴다.(같이 삶아주어도 됨) \n" +
            "2. 간장, 캐러멜시럽, 올리고당, 설탕, 굴소스, 생강, 튀겨둔(삶아둔) 돼지고기를 함께 삶아준다.\n", "https://youtu.be/XCv408bG9uQ", "중식", arrayOf("돼지고기", "양파","대파","간장"), arrayOf("카라멜시럽","올리고당","설탕","굴소스","생강"))
    val mapatopu = Recipe("마파두부","1. 두부는 사방 1.5cm 정도로 깍둑썰기하여 준비한다.\n" +
            "2. 쪽파, 대파는 송송 썰어 준비한다.\n" +
            "3. 프라이팬에 식용유를 두른 후 중불에서 파를 볶는다.\n" +
            "4. 파가 익기 시작하면 돼지고기를 넣고 풀어가면서 볶아준다.\n" +
            "5. 고기가 노릇하게 익으면 물, 만능양념장, 된장을 넣어 풀어준다.\n" +
            "6. 된장이 풀리면 잘라 둔 두부를 넣는다.\n" +
            "7. 전분가루에 물을 섞어 마파두부에 넣고 골고루 섞어준다.\n" +
            "8. 참기름을 두르고 쪽파를 뿌려 완성한다.\n","https://youtu.be/BqxpjY7TJ8g","중식", arrayOf("두부","돼지고기"),
        arrayOf("다진마늘","대파","전분가루","된장","참기름"))
    val tangsuyuk = Recipe("탕수육", "1. 돈등심은 두께 1cm 정도 스틱 모양으로 썰어 준비한다.\n" +
            "2. 마늘은 꼭지를 제거하고 굵게 다져 준비한다.\n" +
            "3. 돈등심에 다진마늘, 맛소금, 진간장, 후춧가루를 넣어 밑간한다.\n" +
            "4. 양념이 골고루 배이면 튀김가루, 물, 식용유를 넣어 반죽한다.\n" +
            "5. 튀김용으로 사용할 기름을 예열한다.\n" +
            "6. 기름이 예열되면 반죽해둔 고기를 하나씩 뜯어 넣어준다.\n" +
            "7. 탕수육은 3~5분 정도 노릇하게 1차튀김 해준다.\n" +
            "8. 튀겨진 탕수육을 건져내어 기름을 빼준다.\n" +
            "9. 기름의 온도를 올려 기름을 뺀 고기를 넣고 30초~1분 정도 더 튀겨 완성한다.\n","https://youtu.be/WneiVYnZgHo","중식", arrayOf("돼지고기"),
        arrayOf("튀김가루","마늘","진간장","후추","맛소금"))
    val jjambbong = Recipe("짬뽕","1. 대파 150g을 굵게 썰어 준비한다.\n" +
            "2. 양배추 250g을 1cm두께로 굵게 채썰어 준비한다.\n" +
            "3. 양파 250g을 0.2cm두께로 얇게 채썰어 준비한다.\n" +
            "4. 식용유 50g을 프라이팬에 넣어준다.\n" +
            "5. 불을 켜고 대패삼겹살 300g을 넣어준다.\n" +
            "6. 채 썬 양파 200g을 넣어준다.\n" +
            "7. 자른 대파 150g을 넣어준다.\n" +
            "8. 모든 재료가 노릇하게 볶아질 때까지 강불에서 볶아준다.\n" +
            "9. 채 썬 양배추 250g을 넣고 강불에서 볶아준다.\n" +
            "10. 진간장 50g을 프라이팬의 가장자리에 부어 기름에 튀기듯이 볶아준다.\n" +
            "11. 간장의 맛(불맛)이 모든 재료에 스며들 수 있도록 강불에서 골고루 볶아준다.\n" +
            "12. 고춧가루 50g을 넣고 볶아준다. (타지 않게 주의한다.)\n" +
            "13. 뜨거운 물 2500g(ml)를 넣어준다.\n" +
            "14. 건더기 스프 5개, 분말 스프 5개를 넣어준다.\n" +
            "15. 라면 5개를 넣고 잘 풀어주면서 끓여준다.\n" +
            "- 이때 끓이는 시간은 라면 면발의 익힘 정도(기호)에 따라 조절한다.\n" +
            "16. 완성 그릇에 담고 고명으로 송송 썬 대파를 곁들인다.\n", "https://youtu.be/YISYMu2Txp4","중식", arrayOf("돼지고기","양파","대파"),
        arrayOf("양배추","고춧가루","진간장"))

    //양식
    val steak = Recipe("스테이크", "1. 후추, 소금, 올리브유를 소고기 겉면에 발라 밑간을 해준다.\n" +
            "2. 팬에 올리브유를 넣고 충분히 달궈준다.\n" +
            "3. 고기의 겉면에 마이야르반응이 충분히 나오도록 구워준다.\n" +
            "* 여러번 뒤집어도 상관없음 \n", "https://youtu.be/thkD_x6_eaM", "양식", arrayOf("소고기"), arrayOf("올리브유","소금","호추","가니쉬용 채소"))
    val vongolePasta = Recipe("봉골레파스타","1. 올리브유, 간마늘, 페페론치노, 소금을 팬에 넣고 달궈준다.\n" +
            "2. 팬에 조개를 넣고 입이 벌어질때까지 볶는다.\n" +
            "3. 맛술을 넣어준다.\n" +
            "4. 파스타면을 넣고 면이 익을때까지 볶아준다.\n", "https://youtu.be/b4KtNiQBzU4", "양식", arrayOf("조개","파스타면"), arrayOf("올리브유","다진마늘","맛술","소금","페페론치노"))
    val creamPasta = Recipe("크림파스타", "*면 삶기\n" +
            "\n" +
            "1. 냄비에 정수물, 꽃소금, 올리브유를 넣고 스파게티면 삶을 물을 끓인다.\n" +
            "2. 물이 끓어오르면 면을 돌려서 펼쳐 넣고 붙지않도록 저어주면서 약 6분 정도 삶아 준비한다.\n" +
            "Tip: 크림파스타 농도 조절을 위해 면수는 버리지 않고 따로 보관해둔다. \n" +
            "3. 삶아진 스파게티면은 체에 밭쳐 건져낸다.\n" +
            "\n" +
            "1. 베이컨은 두께 1cm 정도로 자르고, 양파는 가로, 세로 0.5cm 정도로 다져 준비한다.\n" +
            "2. 양송이 한 개는 가로,세로 0.5cm 정도로 다지고, 반 개는 두께 0.5cm로 편 썰어 준비한다.\n" +
            "Tip: 슬라이스 4조각 정도만 보이게 편 썰어서 넣어준다.\n" +
            "3. 프라이팬에 베이컨, 다진양파, 다진 양송이 버섯, 올리브유를 넣고 중 불에 볶는다. \n" +
            "4. 양파가 노릇해 질 때까지 충분히 볶는다.\n" +
            "5. 양파에 색이 나면 버터를 넣어 볶고, 버터가 녹으면 우유, 편 썰은 양송이 버섯, 스파게티 면을 넣어 졸인다.\n" +
            "6. 밀가루를 넣고 잘 풀어 주어 농도 조절을 한다.\n" +
            "7. 불을 약 불로 줄인 후 꽃소금으로 간을 한다.\n" +
            "Tip: 소스 농도가 너무 되직하면 면수를 추가한다.\n" +
            "8. 불을 끄고 파르메산 치즈를 골고루 뿌려 섞는다.\n" +
            "9. 후춧가루를 뿌려준 후 접시에 담고 파슬리 가루를 뿌려 완성한다.\n" +
            "Tip: 기호에 따라 우유를 추가해 소스를 더 만들어 사용한다.\n", "https://youtu.be/0bnFoRQebq0", "양식", arrayOf("베이컨","양파","우유"),
        arrayOf("파스타면","올리브유","후추","치즈","파슬리","양송이 버섯","소금"))
    val gambas = Recipe("감바스","1. 바게트와 식빵을 먹기 좋은 크기로 자르고, 팬에 노릇하게 구워 준비한다.\n" +
            "2. 새우는 세척하고, 통마늘은 으깨주고, 양송이버섯은 4등분으로 썰어준다.\n" +
            "3. 방울토마토는 꼭지를 떼고 세척하여 2등분으로 썰어준다.\n" +
            "4. 팬에 올리브유를 넣어주고 으깬 통마늘, 부순 베트남 고추, 맛소금을 넣고 중약 불로 마늘 오일을 뽑아주며 노릇하게 색을 내준다.\n" +
            "5. 새우, 양송이버섯, 방울토마토를 넣고 새우가 익을 때까지 끓여준다.\n" +
            "6. 세팅 그릇에 담아 준 후, 후춧가루, 파슬리가루를 뿌려 완성해준다.\n" +
            "7. 바게트 or 식빵을 구워 함께 곁들어 먹는다.\n", "https://youtu.be/jBdQ65yHB_U","양식", arrayOf("새우","마늘"),
        arrayOf("양송이버섯","방울토마토","올리브유","후추","파슬리","빵","페페론치노"))

    //일식
    val ramen = Recipe("라멘","1. 대파를 얇게 썬다.\n" +
            "2. 냄비에 삼겹살을 넣고 볶는다.\n" +
            "3. 간장을 넣고 잠시 볶은후, 물을 넣는다.\n" +
            "4. 맛소금을 약간넣는다.\n" +
            "5. 물이 끓으면 라면을 넣는다. \n", "https://youtu.be/hM1Uns_o7HE", "일식", arrayOf("대파","삼겹살"), arrayOf("진간장","맛소금"))
    val friedUdong = Recipe("볶음우동","1. 양파, 당근은 채 썰고 대파, 쪽파는 송송 썰어 준비한다.\n" +
            "2. 양배추는 1cm 정도 두께로 먹기 좋게 썬다.\n" +
            "3. 훈연멸치는 내장을 제거하고 마른 팬에 볶아 믹서에 갈아준다.\n" +
            "4. 팬에 기름, 대파를 넣고 열이 오르면 고기를 넣어 볶아준다.\n" +
            "5. 고기가 노릇하게 익으면 양파, 당근, 양배추를 넣어 볶는다.\n" +
            "6. 진간장, 황설탕, 식초, 물을 섞어 양념장을 만든다.\n" +
            "7. 채소가 볶아지면 가운데에 면을 넣고 가장자리에 양념장을 둘러 중불에서 끓인다.\n" +
            "8. 면이 풀어지면 불을 세게 켜고 볶아준다.\n" +
            "9. 완성그릇에 볶음우동을 담고 마요네즈를 뿌려준다.\n" +
            "10. 훈연멸치가루, 쪽파를 올려 마무리한다.\n", "https://youtu.be/zRg4nxIv3j8", "일식", arrayOf("양배추","양파","돼지고기","대파"),
        arrayOf("우동면","멸치가루","쪽파","당근"))
    val porkCutlet = Recipe("돈까스","1. 등심에 꽃소금, 후춧가루를 앞뒤로 살짝 뿌려 밑간을 해준다.\n" +
            "2. 등심을 비닐팩에 넣고 밀대로 두드려주며 넓게 펼쳐준 후, 칼집을 넣어 힘줄을 끊어준다.\n" +
            "   *가장자리 힘줄을 끊어주면 뒤틀림과 수축을 방지할 수 있다.\n" +
            "3. 밀가루 - 달걀물 - 빵가루를 각각 다른 그릇에 담아 준비한다.\n" +
            "   *빵가루가 너무 말라있을 경우 스프레이를 이용하여 물을 뿌려 촉촉하게 만들어 준다.\n" +
            "4. 넓게 펴준 등심에 밀가루를 골고루 묻힌 후, 달걀물을 묻혀주고, 빵가루로 덮은 후 꾹꾹 눌러 준비한다.\n" +
            "5. 깊은 팬에 식용유를 붓고 센 불에서 160~170도까지 예열을 시켜 준비한다.\n" +
            "6. 튀김옷을 입힌 돈가스를 넣고 앞뒤로 노릇한 색이 나도록 약 3분 20~30초간 튀겨준다.\n" +
            "   *튀기는 중에 빵가루를 중간중간 걷어내 주어야 기름을 오래 사용할 수 있다.\n" +
            "7. 돈가스를 체에 세워 밭쳐 기름을 빼준다.\n","https://youtu.be/037o6vxm0es","일식", arrayOf("돼지고기","달걀"),
        arrayOf("빵가루","밀가루","후추","소금","식용유"))
    val porkRice = Recipe("돼지고기 덮밥", "1. 덮밥용 양파는 굵게 다져 준비한다.\n" +
            "2. 깻잎은 돌돌 말아 가늘게 채 썰어준다.\n" +
            "3. 뒷다리살은 작은크기로 썰어 준비한다.\n" +
            "4. 냄비에 뒷다리살,진간장,황설탕,다진양파,굴소스,노두유,물을 넣어 끓인다.\n" +
            "5. 끓으면 불을 중불로 줄여 3시간정도 졸여준다.\n" +
            "     ( 중간에 물이 부족할 때마다 물을 보충하여 준다. )\n" +
            "6. 양념장이 절반정도 졸아들면 삶은 달걀을 넣어 함께 졸인다.\n" +
            "7. 완성그릇에 밥을 담고 돼지고기조림, 깻잎을 올려 마무리한다.\n", "https://youtu.be/5iRPP3nqCJE","일식", arrayOf("돼지고기","달걀","양파"), arrayOf("굴소스","노두유","깻잎","진간장","설탕"))
    val curry = Recipe("카레", "1. 양파는 꼭지를 제거한 후 폭 1cm 길이 2cm 크기로 사각썰기하여 준비한다.\n" +
            "2. 당근은 사방 1cm정도 길이로 작게 깍둑썰기 하여 준비한다.\n" +
            "3.  돼지고기 뒷다리살은 사방 2cm 길이로 깍둑썰기 하여 준비한다.\n" +
            "    *이 때 돼지 비계 부분은 따로 잘게 잘라 준비한다.\n" +
            "4. 깊은 프라이팬을 강불에 올린 후 식용유를 두른다.\n" +
            "5. 잘게 잘라 둔 돼지 비계를 넣고 볶는다.\n" +
            "6. 돼지 비계가 노릇하게 튀겨지면 돼지고기 살코기를 넣고 튀기듯이 볶는다.\n" +
            "7. 고기가 전체적으로 노릇하게 튀겨지면 양파를 뚜껑 덮듯이 전체적으로 펼쳐 넣는다.\n" +
            "8. 가볍게 뒤적이며 양파가 갈색나게 볶는다.\n" +
            "9. 당근을 넣고 볶는다.\n" +
            "10. 프라이팬 가장자리 쪽으로 진간장을 둘러 넣고 케첩을 넣어 새콤한 맛을 날린다.\n" +
            "    *토마토나 토마토주스를 사용 할 경우 이때 함께 넣는다.\n" +
            "11. 양념장이 눋어 붙으려고 하면 물을 넣고 끓기 시작하면 약 15분 이상 강불에 끓인다.\n" +
            "    * 25~30분 정도 끓이면 맛이 더욱 좋다.\n" +
            "12. 카레가루를 잘 풀어가며 넣고 농도나게 끓인다. \n" +
            "13. 농도가 맞춰지면 불을 끄고 버터를 넣어 섞는다.\n" +
            "14. 그릇에 밥을 담고 카레를 얹어 완성한다.\n" +
            "   *버터를 카레에 안 넣었을 경우 완성 그릇에 1조각을 함께 올려도 좋다.\n", "https://youtu.be/LTVxirHWvh8", "일식",
        arrayOf("돼지고기","양파"), arrayOf("카레가루","당근","케첩","진간장","버터"))

    // 분식
    val tteokbokki = Recipe("떡볶이","1. 대파는 어슷 썰거나 반으로 갈라 길게 썰어 준비한다.\n" +
            "2. 양배추, 어묵은 먹기 좋은 크기로 썰어 준비한다.\n" +
            "3. 냄비에 물, 진간장, 황설탕, 고추장, 굵은고춧가루, 고운고춧가루, 대파, 양배추를 넣어 끓인다.\n" +
            "4. 떡볶이떡은 흐르는 물에 가볍게 세척한다.\n" +
            "5. 육수가 끓으면 삶은달걀, 떡을 넣고 함께 끓여준다.\n" +
            "6. 기호에 맞게 MSG를 넣는다.\n" +
            "7. 떡을 넣고 육수가 끓어오르면 어묵을 넣어준다.\n" +
            "8. 양념장이 걸쭉하게 졸아들 때까지 끓여 완성한다.\n","https://youtu.be/t4Es8mwdYlE","분식", arrayOf("달걀","양배추","대파","어묵","떡"),
        arrayOf("고추장","진간장","고춧가루","설탕"))
    val gimbap = Recipe("김밥","1. 시금치는 뿌리를 제거한 후 프라이팬에 식용유를 두르고 맛소금을 뿌려 볶는다.\n" +
            "2. 당근은 채칼을 이용하여 채 썬다.\n" +
            "3. 식용유를 두른 프라이팬에 당근을 넣고 맛소금을 뿌려 볶아준다.\n" +
            "4. 달걀은 맛소금, 황설탕을 넣어 풀어준 후 프라이팬에 식용유를 두르고 부친다.\n" +
            "5. 밥에 맛소금, 참기름을 넣고 주걱을 이용하여 골고루 섞어준다.\n" +
            "6. 단무지 절임용 황설탕, 양조식초, 정수물을 큰 볼에 담아 설탕이 녹을 정도 까지 섞어준다.\n" +
            "7. 통 단무지는 두껍게 썰어 준비한다.\n" +
            "8. 섞어둔 절임 양념장에 단무지를 넣고 섞어 재워둔다.\n" +
            "9. 김 위에 밥을 2/3 정도 얇게 깔아준다.\n" +
            "10. 밥 위에 시금치, 당근채, 달걀, 게맛살, 우엉조림, 단무지를 올리고 말아준다.\n" +
            "11. 말아진 김밥에 참기름을 바른 후 먹기 좋은 크기로 썰어 완성한다.\n", "https://youtu.be/10fl2mebYHs", "분식",
        arrayOf("김","달걀"), arrayOf("시금치","당근","단무지","참기름","게맛살","우엉","설탕"))
    val rabokki = Recipe("라볶이","1. 대파는 송송 썰어 준비한다.\n" +
            "2. 냄비에 물, 분말수프(1/2~2/3), 건더기수프, 설탕, 고추장을 넣고 풀어주며 끓인다.\n" +
            "   (분말수프의 양은 기호에 맞게 조절한다.)\n" +
            "3. 육수가 끓으면 면을 넣고 끓인다.\n" +
            "4. 면이 완전히 풀어지면 대파를 넣고 1분정도 더 끓인다.\n" +
            "5. 물이 졸아들고 면이 익으면 불을 끄고 그릇에 담아 완성한다.\n","https://youtu.be/6e-IbuuD6ZU","분식", arrayOf("대파"),
        arrayOf("라면","고추장","설탕"))

    // 기타
    val padthai = Recipe("팟타이","1. 부추는 5~7cm 길이로 잘라 준비한다.\n" +
            "2. 양파는 사방 0.5cm 길이로 잘게 썰어 준비한다.\n" +
            "3. 통마늘은 꼭지를 제거한 후 칼 옆날로 으깨고 홍고추, 청양고추는 반 갈라 굵게 다져서 준비한다.\n" +
            "   * 절구가 있으면 홍고추, 청양고추, 통마늘을 굵게 다져 사용해도 된다.\n" +
            "4. 건 새우는 잘게 다져 준비한다.\n" +
            "5. 물, 진간장, 식초, 멸치액젓, 황설탕을 섞어 소스를 만든다.\n" +
            "6. 프라이팬에 식용유, 마늘, 청양고추, 홍고추를 넣고 강 불에 볶는다.\n" +
            "7. 마늘과 고추향이 올라오면 양파, 건 새우를 넣고 튀기듯이 볶는다.\n" +
            "8. 칵테일 새우를 넣고 볶은 후 소스를 넣고 볶는다.\n" +
            "   * 담을 때 모양을 좋게 하기 위해 칵테일 새우 2~3개는 건져 둔다.\n" +
            "9. 불려 둔 쌀국수는 물기를 제거하고 프라이팬에 넣어 함께 볶는다.\n" +
            "10. 면이 부드러워 지면 한쪽으로 밀어 둔 후 재료가 없는 쪽에 달걀을 넣고 깨트려 익힌다.\n" +
            "11. 달걀이 익으면 모든 재료를 다같이 볶은 후 숙주를 넣고 볶는다.\n" +
            "12. 전체적으로 골고루 섞이면 불을 끄고 부추를 넣어 섞는다.\n" +
            "    * 숙주와 부추의 숨이 죽지 않게 주의한다.\n" +
            "13. 그릇에 옮겨 담은 후 빼두었던 새우를 위에 올리고 땅콩 분태를 뿌려 완성한다.\n","https://youtu.be/gJDxWPoMHgo","기타",
        arrayOf("숙주","양파","쌀국수","새우"), arrayOf("부추","멸치액젓","진간장","통마늘","달걀","식초"))
    val kebob = Recipe("케밥","1. 양상추, 양파는 가늘게 채 썰어 섞어둔다.\n" +
            "2. 바게트는 5등분 하여 반으로 가른다.\n" +
            "3. 고등어 통조림은 체에 밭쳐 물기를 제거하여 준비한다.\n" +
            "4. 밀가루를 넓은 쟁반에 펼친 후 수분기가 제거된 고등어에 골고루 묻혀준다.\n" +
            "5. 프라이팬에 기름을 두르고 밀가루 묻힌 고등어를 중불에서 노릇하게 튀겨낸다.\n" +
            "6. 바게트 안에 양상추, 양파를 넣고 튀긴 고등어를 넣은 후 소금을 뿌린다.\n" +
            "7. 기호에 따라 레몬즙이나 타르타르 소스를 곁들여 먹는다.\n","https://youtu.be/6jCf19GzNcY","기타", arrayOf("빵","양상추","양파","달걀"),
        arrayOf("마요네즈","단무지","설탕","식초","레몬즙","후추","소금","밀가루"))


    var recipeList:Array<Recipe> = arrayOf(kimchiFriedRice,eggFriedRice,braisedMackerel,braisedPorkKimchi,bibimbap,bulgogi,grilledPork,mapatopu,dongpayuk,tangsuyuk,jjambbong,steak,creamPasta,vongolePasta,gambas,ramen,porkRice,porkCutlet,friedUdong,tteokbokki,curry,gimbap,rabokki,padthai,kebob)

    // 재료 추가
    val kimchi = Ingredients("김치", "2024-03-03", "2022-03-03", 0, "냉장: 밀폐 용기에 배추 단면이 위로 오도록 담아 냉장 (0~5도) 보관한다.\n" +
            "*온도 변화가 많으면 김치가 빨리 익어 김치 전용 냉장고에 넣어 보관한다.\n" +
            "*김치가 발효되면서 가스가 발생해 국물이 넘칠 위험이 있어, 용기의 7~80% 정도만 담는다\n")
    val leek_0 = Ingredients("대파", "2022-11-12", "2022-10-29", 0, "냉장: \n" +
            "1.\t대파를 보관용기에 담기 쉽게 잘라준다.\n" +
            "2.\t흰대에서 나온 껍질과 대파잎은 육수용으로 골라내고, 나머지 껍질은 버린다. \n" +
            "3.\t씻지않고 보관한다.\n" +
            "4.\t사용시 씻어 사용한다. \n")
    val leek_1 = Ingredients("대파", "2023-10-29", "2022-10-29", 1, "냉동: \n" +
            "1.\t대파를 보관용기에 담기 쉽게 잘라준다.\n" +
            "2.\t흰대에서 나온 껍질과 대파잎은 육수용으로 골라내고, 나머지 껍질은 버린다. \n" +
            "3.\t씻지않고 보관한다.\n" +
            "4.\t사용시 씻어 사용한다. \n")
    val crab = Ingredients("꽃게","2023-10-28","2022-10-28",1,"냉동: 지퍼팩에 넣어서 보관한다")
    val radish_0 = Ingredients("무","2022-11-03","2022-10-27",0,"냉장: 무청(무 끝에 뾰족한 부분)을 제거하고, 비닐호일로 감싼뒤 보관한다.")
    val radish_1 = Ingredients("무","2023-11-03","2022-10-27",1,"냉동: 무청(무 끝에 뾰족한 부분)을 제거하고, 비닐호일로 감싼뒤 보관한다.")
    val soybeanPaste = Ingredients("된장","2023-08-03","2022-10-10",0,"냉장: 먹을 만큼의 된장을 따로 보관하여 오염되는 것을 방지한다. ")
    val onion = Ingredients("양파", "2022-10-31", "2022-10-24", 0, "냉장: 세척하지 않고, 각각 랩에 싸서 보관한다")
    val cheongyangRedPepper = Ingredients("청양고추","2022-11-01","2022-10-25",0,"냉장: 밀폐용기에 키친타월을 깔고, 고추, 키친타원 순으로 겹겹이 쌓아 보관한다.")
    val mackerel = Ingredients("고등어","2022-11-13","2022-10-13",1,"냉동: 고등어를 손질한뒤 식초물과, 소금을 뿌리고, 지퍼백에 넣어 보관한다. ")
    val groundPork = Ingredients("간 돼지고기","2023-10-13","2022-10-13",1,"냉동: 지퍼백에 담아 납작하게 해서 보관한다.")
    val pork = Ingredients("돼지고기","2022-11-06","2022-10-23",0,"냉장, 냉동:\n" +
            "1.\t바닥에 랩이나 종이호일을 깔고 삼겹살 한줄을 얹어준다.\n" +
            "2.\t얹어준 삼겹살 위로 랩을 자르지 말고 위치만 옮겨 삼겹살을 덮어준다.\n" +
            "3.\t랩으로 덮어진 삼겹살 한줄 위에 비스듬하게 다른 삼겹살을 한줄더 얹어준다.\n" +
            "4.\t새로 얹어둔 삼겹살을 2번과 동일한 방법으로 랩을 자르지 않고 다시 다른쪽으로 이동해서 덮어준다.\n" +
            "5.\t구매한 삼겹살을 모두 같은 방법으로 랩으로 포장해둔다.\n")
    val beef = Ingredients("소고기","2022-11-05","2022-10-29",0,"냉장, 냉동: 소분하여 비닐에 넣은 후에 용기에 담아 보관한다.")
    val maraSource = Ingredients("마라소스","2023-08-20","2022-09-01",0,"냉장보관")
    val beanSprouts = Ingredients("콩나물","2022-11-04","2022-10-30",0,"냉장: 용기에 키친타월을 깔고나서 물기를 제거한 콩나물을 넣고 보관한다.")
    val cabbage = Ingredients("배추","2022-11-05","2022-10-31",0,"냉장: 배추를 신문지로 감싼 후에 비닐봉지에 넣어서 보관한다.")
    val tofu = Ingredients("두부","2022-10-30","2022-10-27",0,"냉장: \n" +
            "1.\t밀폐용기에 담은 후에 두부가 물에 잠길 정도로 물을 붓는다. \n" +
            "2.\t소금을 한 꼬집 정도 넣고 보관한다.\n" +
            "*한번 개봉한 두부는 금방 상하기 때문에 빨리 먹는 것을 추천한다.\n")
    val shavedPork = Ingredients("대패삼겹살","2023-07-28","2022-08-30",1,"냉동: 비닐에 대패삼겹살을 펼치고 말아주고나서 지퍼팩에 담아 보관한다.")
    val chicken = Ingredients("닭고기","2022-11-03","2022-10-27",0,"냉장, 냉동: 밀폐용기에 담아 보관하다.")
    val bacon = Ingredients("베이컨","2023-10-02","2022-10-01",1,"냉동: 베이컨을 지퍼백에 소분하여 넣어준뒤 쌓아서 보관한다.")
    val milk = Ingredients("우유","2022-11-05","2022-10-29",0,"냉장보관")
    val lettuce = Ingredients("상추","2022-11-07","2022-10-31",0,"냉장: 밀폐용기 바닥에 키친타월과 상추를 번갈아가며 쌓아서 보관한다.")
    val cheeze = Ingredients("치즈","2022-10-31","2022-10-24",0,"냉장: 공기가 접촉하지 않게 해서 보관한다.")
    val sweetPotato = Ingredients("고구마","2022-11-31","2022-10-30",0,"냉장: 물기를 없앤 고구마를 신문지에 감싸서 보관한다.")
    val egg = Ingredients("달걀", "2022-11-03", "2022-10-20", 0, "냉장보관")
    val shrimp = Ingredients("새우","2023-07-20","2022-07-20",1,"냉동: 새우를 지퍼백에 소분해서 담아 보관한다.")
    val garlic = Ingredients("마늘", "2022-12-15", "2022-10-15", 0, "냉장:\n" +
            "1.\t밀폐용기에 설탕을 1cm두께로 깔아준다.\n" +
            "2.\t종이호일을 깔아주고 마늘을 넣어서 보관한다. \n")
    val crushedGarlic = Ingredients("다진마늘","2023-10-15","2022-10-15",1,"냉동:\n" +
            "1.\t얼음틀에 간마늘을 얼려준다.\n" +
            "2.\t얼린 간마늘을 지퍼백에 넣어서 보관한다. \n")
    val udonNoodles = Ingredients("우동면","2023-11-19","2022-10-01",1,"냉동보관")
    val anchovy = Ingredients("멸치","2023-09-09","2022-08-10",1,"밀폐용기에 담아 보관한다.")
    val riceCake = Ingredients("떡","2023-02-12","2022-07-21",1,"냉동: 소분한 떡을 랩을 씌우고 지퍼백에 담아 보관한다.")
    val fishCake = Ingredients("어묵","2022-10-31","2022-10-24",0,"냉장, 냉동: 지퍼백에 넣어 보관한다.")
    val spinach = Ingredients("시금치","2022-11-07","2022-10-31",0,"냉장: 물에 씻지 않은 시금치를 신문지나 키친타월에 감싸 지퍼백에 담아 보관한다.")
    val pickledRadish = Ingredients("단무지","2022-11-20","2022-10-20",0,"냉장: 밀폐용기에 물과 식초 그리고 설탕을 2:1:1의 비율로 섞은 후에 단무지를 넣어서 보관한다.")
    val carrot = Ingredients("당근","2022-11-04","2022-10-28",0,"냉장: 물에 씻지 않은 당근을 신문지나 키친타월에 감싸 지퍼백에 담아 보관한다.")
    val sukju = Ingredients("숙주","2022-11-03","2022-10-31",0,"냉장: 용기에 키친타월을 깐후 물기를 제거한 콩나물을 넣고 보관")
    val apple = Ingredients("사과","2022-11-05","2022-10-22",0,"랩으로 싸서 보관한다.")
    val paprika = Ingredients("파프리카","2022-11-03","2022-10-27",0,"냉장: 물기를 제거한 파프리카를 지퍼팩에 넣어서 보관한다.")
    val coke = Ingredients("콜라","2023-05-03","2022-08-23",0,"냉장보관")
    val cucumber = Ingredients("오이","2022-11-08","2022-10-25",0,"냉장: 물기를 제거한 오이를 랩이나 키친타월로 감싸서 보관한다.")
    val sausages = Ingredients("소세지","2023-10-23","2022-08-28",1,"냉동: 소시지를 소분해서 지퍼팩에 넣어서 보관한다.")
    val orange = Ingredients("오렌지","2022-11-07","2022-10-31",0,"냉장: 물기를 제거한 오렌지를 랩으로 감싸서 보관한다.")
    val salmon = Ingredients("연어","2022-11-02","2022-10-31",0,"냉장: 연어에 청주를 조금 발라준 뒤 랩으로 밀봉하여 용기에 넣어서 보관한다.")
    val sweetPumpkin = Ingredients("단호박","2022-11-06","2022-10-30",0,"냉장: 씨앗을 제거한 단호박을 먹기 좋은 크기로 잘라서 밀폐용기에 넣어서 보관한다.")
    val watermelon = Ingredients("수박","2022-11-07","2022-10-31",0,"냉장: 알맞은 크기로 자른 수박을 밀폐용기에 넣어서 보관한다.")

    var ingredientsList : LinkedList<Ingredients> = LinkedList(listOf(kimchi,leek_0,leek_1,crab,radish_0,radish_1,onion,cheongyangRedPepper,mackerel,groundPork,pork,beef,maraSource,beanSprouts,cabbage,tofu,shavedPork,chicken,milk,lettuce,cheeze,sweetPotato,egg,shrimp,garlic,crushedGarlic,udonNoodles,anchovy,riceCake,fishCake,spinach,carrot,pickledRadish,sukju,apple,paprika,coke,cucumber,sausages,orange,salmon,sweetPumpkin,watermelon,bacon,soybeanPaste))

    println(findRecipe(recipeList,ingredientsList))
}
