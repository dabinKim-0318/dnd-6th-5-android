# SpoonFeed
<a href='https://play.google.com/store/apps/details?id=com.fork.spoonfeed'><img height="60px" src='https://play.google.com/intl/en/badges/images/generic/ko_badge_web_generic.png'/></a>

# 📌 [목차](#index) <a name = "index"></a>

- [개요](#outline)
- [아키텍처](#structure)
- [이 기술을 사용한 이유](#why)
- [결과물](#outputs)
- [회고 및 배운점](#learn)
- [프로젝트 이후 리팩토링](#update)

### 맞닥뜨린 문제들을 고민하고 해결했던 과정
| Problem | Blog Link |
| ------ | ------ |
| NestedScrollView안의 RecyclerView ViewHolder 재활용 | [https://url.kr/wjem9r] |
| Fragment를 add() 할때 하단 Fragment가 클릭되는 문제 | [https://url.kr/wjem9r] |
| Fragment의 기본 생성자 호출 | [https://url.kr/wjem9r] |

<br>

# 1️⃣ 개요 <a name = "outline"></a>

<details>
   <summary> Click 🙋‍♀️</summary>
<br />
"사회초년생을 위한 사회생활
가이드가 있었으면 좋겠다!"


돈을 이제 갓 벌기 시작하면서 돈 관리를 해야하고,  
독립을 하기 위해서 집도 알아봐야하고, 
금융 관련된 정보는 왜 이렇게 많은지😂
대체 어떤 정보가 맞지?

스푼피드는,
수많은 정책들 사이에서 혼란스러운 사회초년생들에게   
맞춤 정책 정보를 쉽고 편리하게 제공할 수 없을까? 라는 생각에서 시작되었습니다.   

</details>

<br>

# 2️⃣ 아키텍처  <a name = "structure"></a>

<details>
   <summary> Click 🙋‍♀️</summary>
<br />

</details>

<br>

# 3️⃣ 이 기술을 사용한 이유  <a name = "why"></a>

<details>
   <summary> Click 🙋‍♀️</summary>
<br />

</details>


<br>

# 4️⃣ 결과물  <a name = "outputs"></a>

<details>
   <summary> Click 🙋‍♀️</summary>
<br />

</details>


<br>

# 5️⃣ 회고 및 배운 점 <a name = "learn"></a>
<details>
   <summary> Click 🙋‍♀️</summary>
<br />

</details>

<br>

# 6️⃣ 프로젝트 이후 리팩토링 <a name = "update"></a>

<details>
   <summary> Click 🙋‍♀️</summary>
<br />


## RecyclerView 성능 최적화

- NestedScrollView에 RecyclerView를 중첩해서 사용할 경우  ViewHolder가 전혀 재활용되지 않는다는 것을 알게 되었고, 
[해당 문제의 원인과 해결 방법에대해 고민](https://velog.io/@dabin/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-%EA%B3%B5%EC%8B%9D%EB%AC%B8%EC%84%9C-%ED%8C%8C%ED%97%A4%EC%B9%98%EA%B8%B0-ScrollView-NestedScrollView%EC%9D%98-%EB%AA%A8%EB%93%A0-%EA%B2%83)하였습니다. 
- 처음엔 ViewType을 나눠 ViewHolder를 여러개 사용하려 했지만, 상단 Layout이 다른 화면에도 계속 재사용되기 때문에 재사용성이 좋고 객체지향 원칙에 맞게 한 클래스가 하나의 역할을 할 수 있는 `ConcatAdapter`로 구현했습니다. 
- PolicyMenuAdapter는 item의 data가 변경되지 않기때문에 ListAdapter가 아닌 RecyclerView.Adapter를 사용하여 Adapter를 혼용할 수 있는 ConcatAdapter의 장점을 최대한 활용하기 위해 노력했습니다.
```kotlin
        with(binding) {
            concatAdapter = ConcatAdapter(policyMenuAdapter, policyListAdapter)
            rvPolicylist.adapter = concatAdapter
            rvPolicylist.layoutManager = LinearLayoutManager(this@PolicyListActivity)
        }
```

| 개선 전 | 개선 후 | 
|--------|--------------|
| <img src="https://user-images.githubusercontent.com/84564695/183429903-7d5be5eb-f32b-4dce-9e79-ef5cc544d412.gif" width="200" height="380"/> |  <img src="https://user-images.githubusercontent.com/84564695/183429926-58c485b6-ac0a-4c85-b7a6-e159a24612c4.gif" width="200" height="380"/>

- RecyclerView의 ViewHolder가 재활용되어 item 로딩 속도가 매우 빨라짐을 확인할 수 있었습니다.

## LifeCycle의 상태를 알 수 있는 함수를 protected 함수로 만들어 생명주기 디버깅

</details>

