# 내 맘대로 만들어보는 웹툰 플랫폼 툰툰해

## Release Note
| Version | Release Date | Changes | Detail |
|--------|--------------|---------|--------|
| v1.1.0  | 2021.03.29   | 더 다양한 공지사항 확인, 연락처 검색, MVVM 구조로 변환 / 버그 수정|[Blog](https://todaycode.tistory.com/37)
| v1.1.1  | 2021.08.03   | 연락처 무한 로딩 버그, 앱 강제 종료 버그 수정 |[Blog](https://todaycode.tistory.com/69)
| v1.2.0  | 2022.06.12   | 홈페이지 리뉴얼 대응, 스크롤 딜레이 제거, 리팩터링(Clean Architecture, Hilt 등) |[Blog](https://todaycode.tistory.com/169)
| v1.2.1  | 2022.06.16   | 공지사항 검색, 건의하기 구현 / 푸시 알림 버그 수정 |


# 📝 [목차](#index) <a name = "index"></a>

- [개요](#outline)
- [아키텍처](#structure)
- [결과물](#outputs)
- [왜 이 기술을 사용했는가?](#why)
- [맞닥뜨린 문제들을 고민하고 해결했던 과정](#problem)
- [성과 및 회고](#retrospection)
- [프로젝트 종료 이후 혼자서 진행한 리팩토링](#update)

<br>

# 📝 개요 <a name = "outline"></a>

<details>
   <summary> 본문 확인 (👈 Click)</summary>
<br />
취미 생활 및 자기계발 활동에 금전적으로 투자하는 사람들이 지속적으로 증가하고 있으며, 20 ~ 30대 대상 685명 설문조사 결과 사람들은 취미를 혼자보다 함께 즐기고 싶어할뿐만 아니라 전체의 75% 이상이
처음만나는 사람과도 함께 취미를 즐기고 싶다고 답변했습니다. 또한, 유료로 취미생활 및 자기계발 분야 참여시 전체의 63%가 오프라인 방식을 선호하였습니다.
저희는 취미 관련 오프라인 유료 클래스의 수요가 충분하다는 것을 파악하였고, 기존 업체들의 문제점들을 보완하여 오프라인 클래스 중개 플랫폼을 서비스하고자 합니다.

</details>

<br>

# 📈 아키텍처  <a name = "structure"></a>

<details>
   <summary> 본문 확인 (👈 Click)</summary>
<br />

</details>

<br>

# 🎁 결과물  <a name = "outputs"></a>

<details>
   <summary> 본문 확인 (👈 Click)</summary>
<br />

</details>


<br>

# 💎 왜 이 기술을 사용했는가? <a name = "why"></a>

<details>
   <summary> 본문 확인 (👈 Click)</summary>
<br />

</details>


<br>

# 🏃‍♂️ 맞닥뜨린 문제들을 고민하고 해결했던 과정 <a name = "problem"></a>

<details>
   <summary> 본문 확인 (👈 Click)</summary>
<br />

| Problem | Blog Link |
| ------ | ------ |
| RecyclerView 중첩 스크롤 문제 | [https://url.kr/wjem9r] |


</details>

<br>

# 📌 성과 및 회고 <a name = "retrospection"></a>

<details>
   <summary> 본문 확인 (👈 Click)</summary>
<br />

</details>

<br>

# 시연 영상

<details>
   <summary> 본문 확인 (👈 Click)</summary>
<br />


[시연 영상](https://www.youtube.com/watch?v=BDnmRlhpV-M)  
최종 발표 진행 중에 사용한 시연 영상입니다.

</details>

<br>

# ✍️ 프로젝트 종료 이후 혼자서 진행한 리팩토링 <a name = "update"></a>

<details>
   <summary> 본문 확인 (👈 Click)</summary>
<br />

## RecyclerView 성능 최적화

- NestedScrollView에 RecyclerView를 중첩해서 사용할 경우  ViewHolder가 전혀 재활용되지 않는다는 것을 알게 되었고, 
[해당 문제의 원인과 해결 방법에대해 고민](velog.io/@dabin/안드로이드-공식문서-파헤치기-ScrollView-NestedScrollView의-모든-것)하였습니다. 
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
</details>

