# SpoonFeed
<a href='https://play.google.com/store/apps/details?id=com.fork.spoonfeed'><img height="60px" src='https://play.google.com/intl/en/badges/images/generic/ko_badge_web_generic.png'/></a>

# 📌 [목차](#index) <a name = "index"></a>

- [개요](#outline)
- [아키텍처](#structure)
- [이 기술을 사용한 이유](#why)
- [결과물](#outputs)
- [회고 및 배운점](#learn)
- [프로젝트 이후 리팩토링](#update)

***

본 README는 [김다빈](https://github.com/dabinKim-0318)이 프로젝트를 회고하며,      
공부하고 배운점을 기록하기 위해 작성된 README입니다.    
upstream repository는 [이곳](https://github.com/dnd-side-project/dnd-6th-5-android)을 참고해주세요😊      
  
<br>

# 1️⃣ 개요 <a name = "outline"></a>

<details>
   <summary> Click 🙋‍♀️</summary>
<br />
스푼피드는, 수많은 정책들 사이에서 혼란스러운 사회초년생들에게  

***맞춤 정책 정보를 쉽고 편리하게 제공하는 서비스***입니다      

현재 제공 되는 3가지 핵심 기능은 다음과 같습니다.

✔ 연령, 소득 등의 필터링을 통해 자신이 신청할 수 있는 정책 찾기   
✔ 정책 상세 정보를 확인하고 바로 신청하러 가기  
✔ 비슷한 조건을 가진 다른 사용자의 후기를 확인하는 커뮤니티  


</details>

<br>

# 2️⃣ 아키텍처  <a name = "structure"></a>

<details>
   <summary> Click 🙋‍♀️</summary>
<br />

  <img width="300" src = "https://user-images.githubusercontent.com/84564695/184577351-59081ffd-2860-47b7-9da2-f093c633d71a.JPG" />
  <img width="400" src = "https://user-images.githubusercontent.com/84564695/184577995-8802595a-c1b9-40ec-8d6f-693666478756.png" />   


- 모바일 앱 사용자 환경을 올바르게 제공하기 위해 안드로이드 권장 아키텍쳐를 참고    
- data / domain / presentation 로 layer를 나누고 패키징을 통해 관심사 분리    
- Repository Pattern 을 사용해 DataSource 캡슐화
- ViewModel, LiveData 등의 Jetpack Component를 활용해 UI Controller의 과도한 책임을 막고 역할 분리

</details>

<br>

# 3️⃣ 이 기술을 사용한 이유  <a name = "why"></a>

<details>
   <summary> Click 🙋‍♀️</summary>
<br />

| Architecture | Clean Architecture, MVVM |Clean Architecture, MVVM |
|:---|:---|:---|
| Design Pattern | Repository Pattern, Adapter Pattern,  Delegation Pattern, Observer Pattern |처음으로 MVVM 아키텍쳐를 도입한 프로젝트였습니다. 프로젝트 이후 안드로이드 공식문서의 [앱 아키텍쳐 가이드 ](https://developer.android.com/jetpack/guide?hl=ko)를 다시 공부하면서 제가 작성한 코드는 UI controller에서 데이터를 직접 가공하는 역할을 하는 코드들이 있다는 걸 알게됐습니다. 프로젝트를 하면서 ViewModel, LiveData 등의 라이브러리를 사용한다는 것에만 의의를 두고 개발한 것이 아닌가? 하는 반성을 하게 되었고, 제대로된 공부의 필요성을 느꼈습니다. 이후 [아키텍쳐에 대해 다시 공부](https://velog.io/@dabin/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-94xy7yo3)하며 각 Layer의 관심사를 분리에 초점을 맞추며 리팩토링하고 있습니다|
| Jetpack Components | Room, encryptedsharedpreferences, LiveData, Lifecycle, ViewModel, DataBinding, NavigationComponent |
| Dependency Injection | Hilt |
| Network | Retrofit, OkHttp |
| Asynchronous Processing | Coroutine(+ Flow) |
| Third Party Library | Coil, Naver Map, Kakao Map, Social Login, Firebase, Lottie, Timber, kotlinSerialization |
| Strategy | Git Flow |
| CI/CD | GitHub Action(KtLint, AAB, APK, Complie Check) |
| Other Tool | Slack, Notion, Figma, Postman |

</details>


<br>

# 4️⃣ 결과물  <a name = "outputs"></a>

<details>
   <summary> Click 🙋‍♀️</summary>
<br />

### 홈, 맞춤 정책 찾기   

https://user-images.githubusercontent.com/84564695/180599170-e25d2752-1d93-4700-90eb-12dd085dfacd.mp4

- 홈
  - 맞춤 정책 찾으러가기     
  - 전체, 주거, 금융 카테고리 별 정책 리스트 보기 
  - 관심있는 정책 모아보기  
- 맞춤 정책 찾기
  - 나이, 혼인여부, 재직여부, 회사규모, 중위소득, 연소득, 순자산, 세대주 여부 등의 필터링    
  - 맞춤정책 찾기 완료 다이어로그


### 맞춤 정책 자세히보기
https://user-images.githubusercontent.com/84564695/180598776-b9f9fc54-3eaa-4cb7-adb0-f262de9e5bfe.mp4

- 리스트
  - 맞춤정책 리스트로 확인하기     
  - 카테고리변경Bottomsheet  
  - 관심있는 맞춤정책 찜하기

- 상세페이지
  - 정책 지원내용, 신청 방법 등 확인하기    
  - 관심있는 맞춤정책 찜하기      
  - 정책 사이트 바로가기



### 커뮤니티
https://user-images.githubusercontent.com/84564695/180598819-65abf15b-cb4d-4b55-a886-6f97edbfffcd.mp4

- 게시글
  - 게시글리스트로 확인하기
  - 게시글 작성하기
  - 댓글 기능
- 검색
  - 카테고리별 게시글 검색

### 마이페이지

- 개인정보 변경
- 관심정책 바로가기
- 작성한 게시글 바로가기
- 로그아웃
- 회원탈퇴
</details>


<br>

# 5️⃣ 회고 및 배운 점 <a name = "learn"></a>
<details>
   <summary> Click 🙋‍♀️</summary>
<br />

## ✔ 커뮤니케이션 부분
### 전면 온라인 회의
당시 코로나19가 매우 심각한 상황이었기에 프로젝트는 100% 온라인 회의로 진행되었습니다. 전면 온라인 회의로 진행한 프로젝트는 처음이었기에 다른 안드로이드 파트원뿐만 아니라 디자인, 백엔드 개발자 분들과의 원활한 소통을 위해 노력했습니다. 슬랙, 노션, 디스코드를 활용해 팀원들과 소통하였고 각 파트별 이슈관리 보드를 통해 작업 내역을 실시간으로 공유했습니다. 특히 클라이언트의 개발 진행상황을 표시하기 위해 [백로그](https://www.notion.so/60d9b1efc7d246b5842e1798ff1ed458?v=970b9be635df4dd985141c846728209e)를 작성하고 담당자, 구현여부를 작성했습니다. 클라이언트와 백엔드 개발자들이 개발과 관련된 부분에서 빠르게 소통할 수 있도록 개발자 단톡방을 따로 만들어 기술적인 문제에 신속하고 피드백할 수 있었습니다.

## ✔ 기술적인 부분
### Github Action Build Check CI 작성
반복되는 병합 과정에서 기존 Application을 손상시키지 않도록 확인하기 위해 Github Action을 이용했습니다. 중간, 최종 발표등의 데드라인이 정해진 프로젝트였기 때문에 Develop Branch에 급하게 들어오는 병합 내용에 다양한 Build 에러가 많았습니다. 이를 통한 손상을 줄이고자 Github Action으로 Build 과정을 검사했습니다. 병합 이후 발생한 손상을 즉시 해결 함으로 추후 손상을 해결하는 시간을 줄이고 개발에 집중할 수 있었습니다.

### 아쉬운 점- MVVM 도입에만 의의를 둔 점
처음으로 MVVM 아키텍쳐를 도입한 프로젝트였습니다. 프로젝트 이후 안드로이드 공식문서의 [앱 아키텍쳐 가이드 ](https://developer.android.com/jetpack/guide?hl=ko)를 다시 공부하면서 제가 작성한 코드는 UI controller에서 데이터를 직접 가공하는 역할을 하는 코드들이 있다는 걸 알게됐습니다. 프로젝트를 하면서 ViewModel, LiveData 등의 라이브러리를 사용한다는 것에만 의의를 두고 개발한 것이 아닌가? 하는 반성을 하게 되었고, 제대로된 공부의 필요성을 느꼈습니다. 이후 [아키텍쳐에 대해 다시 공부](https://velog.io/@dabin/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-94xy7yo3)하며 각 Layer의 관심사를 분리에 초점을 맞추며 리팩토링하고 있습니다. 

### 아쉬운 점- 성능 개선에 대한 고민
프로젝트에서 RecyclerView를 사용하는 화면이 많았습니다. 정책 리스트를 불러오는 화면에서 버벅이는 현상을 발견하였고, 프로젝트 이후 NestedScrollView안에 RecyclerView를 사용한 해 RecyclerView의 재활용 매커니즘이 동작하지 않아 생긴 문제라는 것을 알게됐습니다. 이를 계기로 지금까지 "동작하는 코드"에만 집중하고, "성능 최적화"에 대한 고민은 하지 않았다는 걸 깨닫게 되었습니다. 그래서 사용하는 기술의 동작방식을 깊게 공부하며 성능을 개선시킬 수 있는 부분을 고민하고 적용하기 위해 노력하게 되었습니다.

## ✔ 개인적인 성장
### 기획 경험
DND는 프론트, 백엔드, 디자이너 포지션으로 이루어져있기 때문에 PM없이 하나의 서비스를 만들어야했습니다.
개발자와 디자이너 모두 기획에 참여하기 때문에 기획단계에서 저절로 기능구현의 난도와, 기간 내에 구현할 수 있는지와 같은 가능성을 고려하며 프로젝트에 임했습니다. 이전에는 어느정도 완성된 와이어프레임, IA를 보면서 더 '나은' 기획 방향을 고민하는 철저한 개발자 포지션이었다면, 이번 프로젝트에서는 아이디어 도출 즉, 맨바닥부터 '함께' 기획해야했기 때문에 기획, UI&UX에 대한 지식이 필요하다고 생각했습니다. 개발만 했다면 몰랐을 '사용자 편의성', '유저이탈을 방지하는 디자인' 등을 고민하게 되면서 UI&UX에 대한 공부욕심이 생겨 틈틈히 개인공부를 진행했습니다. 기획자의 눈으로 프로젝트를 바라볼 수 있는 눈이 생긴 것 같은 느낌이었고, 개발자도 유저 플로우를 함께 고민하며 더 좋은 사용자 경험을 제공하기 위해 노력해야겠다고 생각했습니다.

### 팀원으로부터의 배움
DND를 하면서 저보다 실력있고 경험이 많은 팀원분과 함께, 프로젝트를 진행하는 경험을 했습니다. 제 첫번째 안드로이드 프로젝트였던 SOPT29기 APPJAM에서는 제가 안드로이드 파트 리더를 맡았었고, 제가 다른 팀원의 코드를 통해 배울 수 있는 기회보다는,  팀원들에게 제 지식을 공유해주는 역할을 했습니다. 물론 누군가에게 가르쳐주면서 제가 아는 내용을 한번 더 검토하고, 배우는 점도 많았지만 그 과정에서 제 실력이 크게 향상된다는 느낌은 받을 수 없어서 조금 아쉬웠었습니다. 하지만 DND에서는 저보다 훨씬 실력있는 안드로이드 팀원분과 함께 프로젝트를 진행하게 되어서 매번 그 분의 코드에 감탄하고, 나라면 이 기능을 어떻게 구현했을까? 생각하고 비교도 해보면서 스스로 공부할 수 있는 기회가 많았습니다. 

## 👉프로젝트 이후 공부한 내용
앞서 "기술적인 부분"에서 아쉬웠던 내용을 프로젝트가 끝난 이후에 공부하고 포스팅했습니다.
| Problem | Blog Link |
| ------ | ------ |
| 안드로이드 권장 아키텍쳐 | [https://velog.io/@dabin/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-94xy7yo3] |
| RecyclerView 중첩 스크롤  | [https://velog.io/@dabin/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9CRecycle-View] |


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

