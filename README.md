
<br />
<p align='center'>
🥄나에게 딱 맞는 맞춤 정책찾기🥄
 </p>

 
<p align='center'>
<img width="800" alt="01" src="https://user-images.githubusercontent.com/84564695/180598164-f600814c-1820-43b1-afc8-6062b51060fb.png">
 </p>
 
 <p align='center'>
 <a href='https://play.google.com/store/apps/details?id=com.fork.spoonfeed'><img height="60px" src='https://play.google.com/intl/en/badges/images/generic/ko_badge_web_generic.png'/></a>
 </p>
 
<p align='center'>
    <img src="https://img.shields.io/badge/kotlin-v1.6.21-blue?logo=kotlin"/>
    <img src="https://img.shields.io/badge/Retrofit2-v2.9.0-green?logo=Retrofit2"/>
    <img src="https://img.shields.io/badge/Hilt-v2.40.5-yellow?logo=Hilt"/>
 </p>
<p align='center'>
    <img src="https://img.shields.io/badge/Moshi-v1.12.0-brightgreen?logo=Moshi"/>
    <img src="https://img.shields.io/badge/Lifecycle-v2.4.1-blue?logo=Lifecycle"/>
    <img src="https://img.shields.io/badge/OkHttp-v4.9.2-orange?logo=OkHttp"/>
    <img src="https://img.shields.io/badge/Timber-v5.0.1-blue?logo=Ttimber">
</p>

<br>

# 📌목차

- [프로젝트 동기](#reason)
- [아이디어/개요](#outline)
- [아키텍처](#structure)
- [사용한 기술에 대한 근거](#why)
- [결과물](#outputs)
- [회고 및 배운점](#learn)
- [프로젝트 이후 리팩토링](#update)


# 📌Documents
- [API문서](https://www.spoonfeed.kr/api-docs/)  
- [IA](https://www.figma.com/file/p7g2MUXTPQI099H5AhXclZ/DnD?node-id=268%3A431)
- [디자인](https://www.figma.com/file/p7g2MUXTPQI099H5AhXclZ/DnD?node-id=1030%3A12107)  
- [기획서](https://www.notion.so/21b083c5d23c41debb77ad698aaa7e65)
- [백로그](https://www.notion.so/60d9b1efc7d246b5842e1798ff1ed458?v=970b9be635df4dd985141c846728209e)



# 📌함께하는 사람들

| [김다빈](https://github.com/dabinKim-0318)                | [임도연](https://github.com/dddooo9)                |          
| ------------------------------------------------------- | -------------------------------------------------------- | 
| <img src="https://user-images.githubusercontent.com/84564695/190450439-e798897d-8049-421e-b54c-919a582a6c5d.png" width="100"> | <img src="https://user-images.githubusercontent.com/64943924/150619859-8b5f6706-3627-4b7c-a1b8-7b06a633af64.png" width="100"> | 

  <br>
  
***

<br />

✔ 본 README는 [dabinKim-0318(김다빈)](https://github.com/dabinKim-0318)이 프로젝트를 회고하며,      
공부하고 배운점을 기록하기 위해 작성된 README입니다.    
upstream repository는 [이곳](https://github.com/dnd-side-project/dnd-6th-5-android)을 참고해주세요😊      
  
  
  <br>
  
# 0️⃣ 프로젝트 동기 <a name = "reason"></a>

<details>
   <summary> Click 🙋‍♀️</summary>
<br />

- 첫 번째 대외활동이 끝난 후 팀프로젝트에 대한 아쉬움과 재미를 느꼈습니다. 그래서 현업 개발자, 디자이너분들과 함께 하나의 프로젝트를 완성해볼 수 있는 DND에서 안드로이드 개발자로 참여했습니다. 
- 프로젝트를 통해 더 성장하고 싶었고, 현업에서 활동하고 계신 개발자분, 디자이너분들과의 협업을 통해 타 분야 분들과 커뮤니케이션하는 역량도 키우고 싶어서 프로젝트를 진행했습니다
- 8주간 기획부터 개발, 릴리즈까지 경험해볼 수 있었습니다.
- 개발자로서의 마인드셋, 더 좋은 코드를 짜기 위한 방법 등 프로젝트를 시작하기 전보다 훨씬 많이 배우고 좋은 사람들도 알아갈 수 있었던 소중한 시간이었습니다.

</details>

<br>


# 1️⃣ 아이디어/개요 <a name = "outline"></a>

<details>
   <summary> Click 🙋‍♀️</summary>
<br />



  <img width="800" src = "https://user-images.githubusercontent.com/84564695/188052319-cb84d408-84d7-4c52-bf15-d4162fa9080a.png" />   

<br><br />
 
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

- MVVM 아키텍쳐 설계를 통해 각 계층을 분리해 관심사를 나누고 의존성 규칙을 정한 구조로 설계했습니다.
- data / domain / presentation 로 layer를 나누고 패키징을 통해 관심사를 분리했습니다.  
- 특히 권장 아키텍쳐에서 강조하는 2가지 원칙인 "UI 기반 클래스를 가볍게 하기",  "UI와 Model(모델)을 분리하기" 규칙을 잘 지키고 있는가?를 생각하며 설계하기 위해 노력했습니다. 
- 프로젝트 설계 당시, 계층별 모듈을 나눈 멀티모듈 구조를 고민했습니다. 하지만 해당 앱이 다른 앱에 이용될 수 있는 가능성이 있다고 판단하지 않았고, 하나의 앱만 있는데, 모듈을 여러개로 나눠놓으면 코드량이 더 많게 느껴지며 유지보수 비용이 증가할 것이라 생각해 단일모듈로 설계했습니다.
- 디자인 패턴으로는, Repository Pattern 을 사용해 DataSource 캡슐화했습니다. ViewModel, LiveData 등의 Jetpack Component를 활용해 UI Controller의 과도한 책임을 막고 역할을 분리했습니다.

 
<p align='center'>
 <img width="900" src = "https://user-images.githubusercontent.com/84564695/187017988-ac6d085d-e9b9-4ffd-81f5-f4d64f44fade.png" />
 </p>
 
- 프로젝트에서는 단순히 MVVM을 "사용"했다는 것에 그쳤던 것 같았습니다. 그래서 프로젝트 이후 안드로이드 공식문서를 보고 제 나름의 언어로 해석하고 이해하며 세부적인 항목까지 공부해보고 싶다는 생각이 들었고, 아키텍쳐의 중요 개념들을 조직화하고 정리해봤습니다. 
- 특히 UI Layer 구조, UI Layer에서 사용되는 단어의 개념을 깊게 고찰하고 고민했던 부분이 가장 기억에 남습니다. "stateHolders"는 UI State를 생성하는 역할을 하며 공식문서에서 ViewModel을 예로 들고 있습니다. 
- "ViewModel은 StateHolders이다" 와 같은 단어의 개념을 아는게 사소한 일이라고 생각했습니다. 하지만 ViewModel안에서 정의될 UI state 개념과도 관련이 있어 전체적인 구조를 이해하는 데 매우 중요하고 개발자들 사이에서의 커뮤니케이션을 위해서도 반드시 숙지하고 있어야 하는 부분이라는 걸 깨달았습니다. 

#### 👉공부하며 작성했던 블로그 포스팅입니다!
| Bolg Link | 
| ------ |
| [[안드로이드 공식문서 파헤치기] 클린 아키텍쳐의 모든 것!](https://url.kr/8m15qg) | 
| [[안드로이드] 멀티모듈](https://url.kr/8m15qg) | 

</details>

<br>

# 3️⃣ 사용한 기술에 대한 근거  <a name = "why"></a>

<details>
   <summary> Click 🙋‍♀️</summary>
<br />

- 각 Stack의 링크를 클릭하시면 공부하며 작성했던 포스팅으로 이동합니다!

| Category | Stack  | Reason |
|:---|:---|:---|
| Jetpack Components | [Room](https://velog.io/@dabin/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9CSQLite) | 유저가 신고한 사용자의 id를 저장 후 컨텐츠를 필터링하기 위해 Room을 사용했습니다. 신고한 유저가 없을 경우 반드시 서버에서 데이터를 요청할 필요가 없기 때문에 local에 데이터를 저장해 사용하기로 결정했습니다. 신고 횟수에 제한이 없고 저장해야할 id의 수가 많아질 수 있다는 점을 고려해 sharedPreferences 대신 Room을 선택했습니다. |
| |[LiveData](https://velog.io/@dabin/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-%EA%B3%B5%EC%8B%9D%EB%AC%B8%EC%84%9C-%ED%8C%8C%ED%97%A4%EC%B9%98%EA%B8%B0-LiveData%EC%9D%98-%EB%AA%A8%EB%93%A0-%EA%B2%83) | 최신 data가 생명주기에 따라 자동으로 업데이트 되도록하기 위해 LiveData를 사용했습니다  |
| |[ViewModel](https://velog.io/@dabin/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9CviewModel-%EC%83%9D%EC%84%B1%EC%97%90-%EB%8C%80%ED%95%9C-%EA%B3%A0%EC%B0%B0) | 인스턴스가 소멸된 후 다시 onCreate 가 호출되며 인스턴스로 새로 생성되어도 데이터가 초기화되지 않도록 ViewModel을 사용했습니다. onSaveInstanceState()로 UI Data를 저장할 수도 있었겠지만, 대량의 UI Data를 복원하기에 적합하지 않다고 판단했습니다. 또한 서버, 데이터베이스에 접근하는 코드를 UI Controller와 분리하기 위해 ViewModel을 사용했습니다.
| |[DataBinding](https://velog.io/@dabin/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9CDataBinding) | findViewById 메서드에 비해, null safety, type safety 부분에서 장점이 있는 DataBinding을 사용했습니다. ViewBinding이 DataBinding보다 퍼포먼스 효율, 용량 측면에서 장점이 있지만 DataBinding은 ViewBinding역할을 할 수 있을 뿐더러, 레이아웃에서 데이터 연결 작업을 통한 역할 분리를 위해 DataBinding을 선택했습니다. |
| Dependency Injection | Hilt | 클래스간 결합도를 낮추고 원활한 리팩토링을 위해 DI를 적용했습니다. ViewModel에 대한 의존성 주입을 구현하기 편리하고 각 컴포넌트의 라이프 사이클을 자동으로 관리해주는 Hilt를 DI Framework로 활용했습니다. Hilt가 Dagger2를 기반으로 만들어졌기 때문에 Hilt에 대한 이해를 높이기 위해 Dagger2도 함께 공부할 계획입니다 |
| Network | Retrofit | 안드로이드 통신 라이브러리의 역사를 공부하면서 Deprecated된 라이브러리들과(HttpClient 등) Volley, OkHttp, Retrofit의 장단점을 비교하며 공부했습니다. 그 결과 개인적으로는 Annotation으로 HTTP 메소드를 정의해서 사용하는 Retrofit이 전체 구조를 파악하기 더 좋은 것 같아 Retrofit을 선택했습니다. JSON을 파싱해주는 Converter 연동을 지원해주기 때문에 Gson 라이브러리와 함께 사용하기 위해 선택했습니다.    |
|  |[OkHttp3](https://velog.io/@dabin/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-Android-%ED%86%B5%EC%8B%A0-%EB%9D%BC%EC%9D%B4%EB%B8%8C%EB%9F%AC%EB%A6%AC%EC%9D%98-%EC%97%AD%EC%82%AC#android-%ED%86%B5%EC%8B%A0-%EB%9D%BC%EC%9D%B4%EB%B8%8C%EB%9F%AC%EB%A6%AC%EC%9D%98-%EC%97%AD%EC%82%AC) |  Intercepter를 통해 API가 통신되는 모든 활동을 모니터링하고, 서버 통신 시간을 조절하기 위해 사용했습니다.  |
| Asynchronous Processing | [Coroutine](https://velog.io/@dabin/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-%EC%BD%94%EB%A3%A8%ED%8B%B4-%EC%8B%A4%EC%8A%B5) | api요청 시 callback을 사용하지 않고 비동기 처리를 하기 위해 Coroutine을 사용했습니다.  직관적인 함수 사용을 통해 코드의 가독성도 높일 수 있었습니다 |
| Third Party Library | Social Login | 사용자의 회원가입 과정의 번거로움을 피하기 위해 네이버, 카카오 SDK를 사용해 소셜 로그인을 구현했습니다. |
|  | Lottie | 스플래시 화면에서 애니메이션 처리가 필요했고, 고품질 애니메이션을 처리할 때 발생할 수 있는 OOM을 피하기 위해 애니메이션 라이브러리를 사용하기로 결정했습니다. 그중 백터 기반이라 용량이 적고 적용이 간단한 Lottie라이브러리를 활용했습니다. |
|  |Timber | 릴리즈 버전에서 로그를 출력하지 않고, 태그를 별도로 입력하지 않아도 되는 Timber을 사용해 Log를 남겼습니다 |
|  |Gson | Json형식인 응답 데이터를 java로 파싱하기 위해 Gson라이브러리를 사용했습니다.  |
| Strategy | Git Flow |   </li> <li><a href="https://github.com/dnd-side-project/dnd-6th-5-android/wiki/%EB%B8%8C%EB%9E%9C%EC%B9%98-%EC%A0%84%EB%9E%B5">브랜치 전략</a></li> <li><a href="https://github.com/dnd-side-project/dnd-6th-5-android/wiki/%EC%BD%94%EB%93%9C-%EC%BB%A8%EB%B2%A4%EC%85%98">코드 컨벤션</a></li>  <li><a href="https://github.com/dnd-side-project/dnd-6th-5-android/wiki/%EC%BB%A4%EB%B0%8B-%EC%BB%A8%EB%B2%A4%EC%85%98">커밋 컨벤션</a> |
| CI/CD | GitHub Action| Github Action으로 Build 과정을 검사했습니다. develop 브랜치로 병합 이후 발생한 손상을 즉시 해결 함으로 추후 손상을 해결하는 시간을 줄였습니다. |
| Other Tool | Slack, Notion, Figma, Postman | 팀원간 이슈 알림을 위해 Slack을 사용했고, 작업 진행상황공유와 디자인 작업, 백엔드 파트원과의 커뮤니케이션 등을 위해 해당 Tool들을 사용했습니다 |

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


https://user-images.githubusercontent.com/84564695/184608951-3c1b241b-7309-47f0-a319-a1e1acfa6d84.mp4



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
### ◼ 전면 온라인 회의
당시 코로나19가 매우 심각한 상황이었기에 프로젝트는 100% 온라인 회의로 진행되었습니다. 전면 온라인 회의로 진행한 프로젝트는 처음이었기에 다른 안드로이드 파트원뿐만 아니라 디자인, 백엔드 개발자 분들과의 원활한 소통을 위해 노력했습니다. 슬랙, 노션, 디스코드를 활용해 팀원들과 소통하였고 각 파트별 이슈관리 보드를 통해 작업 내역을 실시간으로 공유했습니다. 특히 클라이언트의 개발 진행상황을 표시하기 위해 [백로그](https://www.notion.so/60d9b1efc7d246b5842e1798ff1ed458?v=970b9be635df4dd985141c846728209e)를 작성하고 담당자, 구현여부를 작성했습니다. 클라이언트와 백엔드 개발자들이 개발과 관련된 부분에서 빠르게 소통할 수 있도록 개발자 단톡방을 따로 만들어 기술적인 문제에 신속하고 피드백할 수 있었습니다.

<br />

## ✔ 기술적인 부분
### ◼ Github Action Build Check CI 작성
반복되는 병합 과정에서 기존 Application을 손상시키지 않도록 확인하기 위해 Github Action을 이용했습니다. 중간, 최종 발표등의 데드라인이 정해진 프로젝트였기 때문에 Develop Branch에 급하게 들어오는 병합 내용에 다양한 Build 에러가 많았습니다. 이를 통한 손상을 줄이고자 Github Action으로 Build 과정을 검사했습니다. 병합 이후 발생한 손상을 즉시 해결 함으로 추후 손상을 해결하는 시간을 줄이고 개발에 집중할 수 있었습니다.

<br />

### ◼ 사용자 관점에서 코드 작성하기

 <img width="300" src = "https://user-images.githubusercontent.com/84564695/201474918-979a624b-deb3-4035-91bd-c97d0c53b01e.png" />



```
//BottomDialogMyPageFragment
    private fun setHandler() {
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({ dialog?.dismiss() }, 140)
    }
```
개발을 하면서 단순히 기능구현에만 목적을 두고 코드를 작성하기 보다 '내가 사용자라면 이부분이 불편하지 않을까?', '여기를 개선하면 조금 더 편리하게 사용할 수 있지 않을까?'같은 생각을 하면서 개발에 임했습니다. 아이템을 정렬하는 BottomSheetDialog에서 항목 선택을 마친 후 X를 누를 때 딜레이되는 순간이 없어서 마지막에 어떤 항목을 선택했는 지 확인하기 힘들었습니다. 그래서 BottomSheetDialog가 dismiss될 때 약간의 딜레이가 되는 기능을 추가하는 등 사소한 부분이라도 사용자 관점에서 고민하며 더 나은 방법을 고민했습니다.

<br />

### ◼ 아쉬운 점- 성능 개선에 대한 고민
프로젝트에서 RecyclerView를 사용하는 화면이 많았습니다. 정책 리스트를 불러오는 화면에서 버벅이는 현상을 발견하였고, 프로젝트 이후 NestedScrollView안에 RecyclerView를 사용한 해 RecyclerView의 재활용 매커니즘이 동작하지 않아 생긴 문제라는 것을 알게됐습니다. 이를 계기로 지금까지 "동작하는 코드"에만 집중하고, "성능 최적화"에 대한 고민은 하지 않았다는 걸 깨닫게 되었습니다. 그래서 사용하는 기술의 동작방식을 깊게 공부하며 성능을 개선시킬 수 있는 부분을 고민하고 적용하기 위해 노력하게 되었습니다.

#### 👉공부하며 작성했던 블로그 포스팅입니다!
| Bolg Link | 
| ------ | 
| [[안드로이드 공식문서 파헤치기] ScrollView, NestedScrollView, ConcatAdapter의 모든 것!](https://velog.io/@dabin/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-%EA%B3%B5%EC%8B%9D%EB%AC%B8%EC%84%9C-%ED%8C%8C%ED%97%A4%EC%B9%98%EA%B8%B0-ScrollView-NestedScrollView%EC%9D%98-%EB%AA%A8%EB%93%A0-%EA%B2%83) | 

<br />

## ✔ 개인적인 성장
### ◼ 기획 경험
 
  <img width="540" src = "https://user-images.githubusercontent.com/84564695/201475079-27aeed79-2a14-4732-9233-e68f8b7c164f.png" />
<img width="200" src = "https://user-images.githubusercontent.com/84564695/201475153-31e22f3f-b0e9-4796-bb57-4418d6c3e6d0.png" />

DND는 프론트, 백엔드, 디자이너 포지션으로 이루어져있기 때문에 PM없이 하나의 서비스를 만들어야했습니다.
개발자와 디자이너 모두 기획에 참여하기 때문에 기획단계에서 저절로 기능구현의 난도와, 기간 내에 구현할 수 있는지와 같은 가능성을 고려하며 프로젝트에 임했습니다. 이전에는 어느정도 완성된 와이어프레임, IA를 보면서 더 '나은' 기획 방향을 고민하는 철저한 개발자 포지션이었다면, 이번 프로젝트에서는 아이디어 도출 즉, 맨바닥부터 '함께' 기획해야했기 때문에 기획, UI&UX에 대한 지식이 필요하다고 생각했습니다. 개발만 했다면 몰랐을 '사용자 편의성', '유저이탈을 방지하는 디자인' 등을 고민. 기획자의 눈으로 프로젝트를 바라볼 수 있는 눈이 생긴 것 같은 느낌이었고, 개발자도 유저 플로우를 함께 고민하며 더 좋은 사용자 경험을 제공하기 위해 노력해야겠다고 생각했습니다.

<br />

### ◼ 팀원으로부터의 배움
DND를 하면서 저보다 실력있고 경험이 많은 팀원분과 함께 프로젝트를 진행하는 경험을 했습니다. 매번 그 분의 코드에 감탄하고, 나라면 이 기능을 어떻게 구현했을까? 생각하고 비교도 해보면서 스스로 공부할 수 있는 기회가 많았습니다. 특히 SOPT29기 APPJAM에서 공식 프로젝트 기간 동안은 MVC패턴으로 프로젝트를 완성했었기 때문에 해당 프로젝트에서 MVVM아키텍쳐를 처음 적용해봤습니다. 팀원분과 아키텍쳐를 어떻게 적용할 지, 폴더링 및 Util 관리는 어떻게 할지 등 많은 논의를 하면서 MVVM에 대한 이해도 깊어지고 아키텍쳐에 대해 많은 지식을 쌓을 수 있던 경험이었습니다. 실력있고 열정있는 팀원과 함께 프로젝트를 한다는 건 다른 팀원의 성장에도 큰 도움이 된다는 걸 알았고, 저 역시 제가 아는 지식을 다른 팀원들에게 더 많이 나눠주고 공유해야겠다고 다짐한 계기였습니다.


## 👉프로젝트 이후 공부한 내용
앞서 "기술적인 부분"에서 아쉬웠던 내용을 프로젝트가 끝난 이후에 공부하고 포스팅했습니다.
| Problem |
| ------ | 
| [안드로이드 권장 아키텍쳐](https://velog.io/@dabin/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-94xy7yo3) |
| [RecyclerView 중첩 스크롤](https://velog.io/@dabin/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9CRecycle-View) |
| [Fragment 1편 - 사용이유/장점](https://velog.io/@dabin/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C%ED%94%84%EB%9E%98%EA%B7%B8%EB%A8%BC%ED%8A%B81) |
| [Fragment 2편 - FramgmentTransaction](https://velog.io/@dabin/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9CFragment-2%ED%8E%B8FragmentR) |

</details>

<br>


# 6️⃣ 프로젝트 이후 리팩토링 <a name = "update"></a>

<details>
   <summary> Click 🙋‍♀️</summary>
<br />


## ✔ RecycledPool 공유를 통한 성능 최적화
- 여러 RecyclerView들이 동일한 ViewHolder를 사용하고 있었기 때문에(ViewType이 같은) Pool을 공유해서 ViewHolder를 함께 재사용하여 불필요한 ViewHolder생성을 줄이고 성능을 최적화했습니다.

- RecyclerView의 내부 class인 RecycledViewPool의 객체를 생성하여 RecyclerView들이 공유할 수 있는 pool을 생성한 후 RecyclerView가 가진 메서드인 setRecycledViewPool()의 파라미터로 생성했던 RecycledViewPool객체를 전달했습니다.

```kotlin
//MainAdapter
class MainAdapter(
    private val context: Context,
    private val homeViewModel: HomeViewModel,
    private val viewLifecycleOwner: LifecycleOwner,
    private val clickListener: (ResponseUserLikePolicyData.Data.Policy) -> Unit
) :
    ListAdapter<ResponseUserLikePolicyData.Data.Policy, RecyclerView.ViewHolder>(
        SimpleDiffUtil()
    ) {

    private val viewPool: RecyclerView.RecycledViewPool = RecyclerView.RecycledViewPool()
 
 ...
 
 class LikeViewHolder(
     ...
) : RecyclerView.ViewHolder(
    itemView.root
) {
    private val subRv = itemView.subRv
    private val adapter = MyLikePolicyAdapter(clickListener)

    init {
        subRv.adapter = adapter
        val layoutManager = LinearLayoutManager(context)
        layoutManager.recycleChildrenOnDetach = true
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        subRv.layoutManager = layoutManager
        subRv.setRecycledViewPool(viewPool)
        homeViewModel.myLikePolicyList.observe(viewLifecycleOwner) { myLikePolicyList ->
            adapter.submitList(myLikePolicyList)
        }
    }
}
    ...
```
![image (1)](https://user-images.githubusercontent.com/84564695/201341798-06ca859e-9815-4a3a-b803-c5db5e8bbc2b.jpg)


- bind될 때마다 pool의 참조값을 로그로 확인해봤더니, 두 adapter가 같은 Pool을 사용하고 있음을 알 수 있었습니다.
- 자세한 내용은 [포스팅](https://velog.io/@dabin/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-RecyclerView-%EC%84%B1%EB%8A%A5-%EA%B0%9C%EC%84%A0)을 참고해주세요!
<br/>  

**👉RecyclerView를 잘 사용하기 위해 공부하며 정리한 내용입니다!**
| RecyclerView 파헤치기 |
| ------ |
| [RecyclerView - 1편(구조, 탄생배경)](https://velog.io/@dabin/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9CRecycle-View) | 
| [RecyclerView - 2편(ViewHolder수명주기)](https://velog.io/@dabin/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-%EA%B3%B5%EC%8B%9D%EB%AC%B8%EC%84%9C-%ED%8C%8C%ED%97%A4%EC%B9%98%EA%B8%B0-RecyclerView%EC%9D%98-%EB%AA%A8%EB%93%A0-%EA%B2%83-2%ED%83%84ViewHolder%EC%88%98%EB%AA%85%EC%A3%BC%EA%B8%B0)  |
| [RecyclerView - 3편(RecyclerdViewPool)](https://velog.io/@dabin/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-RecyclerView-%EC%84%B1%EB%8A%A5-%EA%B0%9C%EC%84%A0) | 
| [RecyclerView- 4편(notifyDataSetChanged의 문제점)](https://velog.io/@dabin/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-%EA%B3%B5%EC%8B%9D%EB%AC%B8%EC%84%9C-%ED%8C%8C%ED%97%A4%EC%B9%98%EA%B8%B0-RecyclerView%EC%9D%98-%EB%AA%A8%EB%93%A0-%EA%B2%83-4%ED%8E%B8notifyDataSetChanged%EC%9D%98-%EB%AC%B8%EC%A0%9C%EC%A0%90)  |


  <br/><br/>  


## ✔  RecyclerView ViewHolder inner class 변경
```kotlin
  inner class MyLikePolicyHomeViewHolder(private val binding: ItemInterastedPolicyBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(data: ResponseUserLikePolicyData.Data.Policy) {
           ...
        }
```
- 메모리 누수에 대해 공부하던 중 inner class 사용 시 불필요한 outer class 참조로 메모리 누수가 발생할 수 있다는 것을 알게되었습니다

```kotlin
   class MyLikePolicyHomeViewHolder(private val binding: ItemInterastedPolicyBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(data: ResponseUserLikePolicyData.Data.Policy) {
           ...
        }
```
- RecyclerView의 ViewHolder를 inner class로 정의하고 있었는데 반드시 inner class로 사용할 이유가 없었기 때문에 nested class로 변경했습니다
  <br/><br/>  

## ✔  UI Controller에서 UI State를 조작하는 코드 수정
```kotlin
     private fun setObserver() {
        communityPostViewModel.postDetailData.observe(this) {
            setCategoryBackground(it.category)
            if (it.author == communityPostViewModel.getUserData()?.nickname) setPostEditWriterClickListener()
            else setPostEditUserClickListener()
        }
     ...
  }
```
  - 게시글의 작성자 닉네임과와 유저의 닉네임 여부 일치로 게시글 더보기 버튼을 클릭했을 때 이벤트 로직 분기 처리가 필요했습니다
  - 안드로이드 권장 아키텍쳐를 다시 공부한 이후, 해당 코드는 UI Controller가 Data를 직접 가공하고 있어 "관심사 분리"에서 벗어난 코드임을 알게됐습니다
```kotlin
      private fun setObserver() {
       communityPostViewModel.isWriter.observe(this) { writer ->
            if (writer) setPostEditWriterClickListener()
            else setPostEditUserClickListener()
        }
```
  - CommunityPostViewModel에서 게시글 작성자 여부를 Boolean형 데이터로 저장하는 LiveData를 선언한 후, 작성자 여부 분기처리 비즈니스 로직을 작성했습니다
  - UI Controller인 CommunityPostActivity에서는 isWriter 의 true/false에 따라 클릭 이벤트를 수동적으로 업데이트하는 역할만을 담당합니다.
  
  <br/><br/>  
  
## ✔  경계 조건 캡슐화
  ```kotlin
     private fun setRegisterForActivityResult() {
        registerForActivity =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { activityResult ->
              
              ...
  
              //변경전
              if (activityResult.data?.getStringExtra(CommunityPostInfoUpdateActivity.INFO_NOT_UPDATE_RESULT_KEY) == null) {
                   ...
                } else Toast.makeText(this, "상세정보를 확인해주세요", Toast.LENGTH_SHORT).show()
  
             //변경후
              if (checkFromInfo(activityResult)) {
                   ...
                } else Toast.makeText(this, "상세정보를 확인해주세요", Toast.LENGTH_SHORT).show()
            }
    }
  ```
-  if문의 조건으로 사용되는 코드가 복잡한 경우 함수로 만들어 가독성 좋게 수정하였습니다.
  
  <br/><br/>  

## ✔  intent를 보내는 보일러 플레이트 코드 개선
```kotlin
private fun initClick() {
        with(binding) {
            ivHomeAllBackground.setOnClickListener {
                val intent = Intent(requireContext(), PolicyListActivity::class.java).let {
                    it.putExtra(CATEGORY, ALL)
                }
                startActivity(intent)
            }
            ivHomeDwellingBackground.setOnClickListener {
                val intent = Intent(requireContext(), PolicyListActivity::class.java).let {
                    it.putExtra(CATEGORY, DWELLING)
                }
                startActivity(intent)
            }
            ivHomeFinanceBackground.setOnClickListener {
                val intent = Intent(requireContext(), PolicyListActivity::class.java).let {
                    it.putExtra(CATEGORY, FINANCE)
                }
                startActivity(intent)
            }
          ...
        }
    }

```
- Home 화면에서 전체/주거/금융 카테고리 클릭시 정책 리스트 화면으로 이동되는 플로우에서, intent를 보내는 보일러 플레이트 코드를 개선할 수 있겠다는 생각이 들었습니다
  <br/><br/>  
```kotlin
//PolicyListActivity
class PolicyListActivity :
    BaseViewUtil.BaseAppCompatActivity<ActivityPolicyListBinding>(R.layout.activity_policy_list) {
    
      ...
    companion object {
        const val CATEGORY = "CATEGORY"

        fun start(context: Context, category: String) {
            val intent = Intent(context, PolicyListActivity::class.java).putExtra(CATEGORY, category)
            context.startActivity(intent)
        }
      }
    }
    
//HomeFragment
private fun initClick() {
        with(binding) {
            ivHomeAllBackground.setOnClickListener { PolicyListActivity.start(requireContext(), ALL) }
            ivHomeDwellingBackground.setOnClickListener { PolicyListActivity.start(requireContext(), DWELLING) }
            ivHomeFinanceBackground.setOnClickListener { PolicyListActivity.start(requireContext(), FINANCE) }
   }
```
- intent를 받는 PolicyListActivity 에서 companion oboject 블럭 안에 `start(context: Context, category: String)` 메서드를 선언했습니다
- 외부에서 `start(context: Context, category: String)` 메서드를 여러번 호출해야 하고 인스턴스 생성 없이 사용하기 위해 companion oboject 블럭 안에서 사용했습니다.
- start라는 메서드 네이밍을 통해 클릭 이벤트 발생 시 PolicyListActivity로 이동된다는 것을 직관적으로 알 수 있도록 코드를 작성했습니다.
  <br/><br/>  
 
## ✔  inflater 중복 생성 방지
```kotlin
   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyLikePolicyAdapter.MyLikePolicyHomeViewHolder {
        val binding = ItemInterastedPolicyBinding.inflate(LayoutInflater.from(parent.context), parent, false)
      
        return MyLikePolicyHomeViewHolder(binding)
    }

```
- RecyclerView를 사용하던 중 ViewHolder가 Create될 때 마다 inflater가 매번 생성되는 것을 개선할 수 있겠다고 생각했습니다

```kotlin
 private lateinit var inflater: LayoutInflater //전역 변수로 선언

   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyLikePolicyAdapter.MyLikePolicyHomeViewHolder {
          if (!::inflater.isInitialized) //변수를 객체로 엑세스하여 객체에 대한 속성 참조
            inflater = LayoutInflater.from(parent.context)
            
        val binding = ItemInterastedPolicyBinding.inflate(inflater, parent, false)
      
        return MyLikePolicyHomeViewHolder(binding)
    }

```
- 코틀린 표준 라이브러리에서 제공하는 함수인 isInitialized을 사용해 지연 초기화 속성이 초기화되었는지 검사했습니다.
- inflater의 할당 여부를 확인하고, 중복 생성을 방지했습니다.

  <br/><br/>  

</details>

