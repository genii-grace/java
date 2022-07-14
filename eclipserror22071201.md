# [이클립스] 이클립스 설치 후 초기 오류 해결(Eclipse : The selection cannot be launched and there are no recent launches)

> **첫 에러에 직면하다.**
> 

Java 공부를 위해 이클립스를 설치하고 첫 예제 소스코드를 Run 했더니

<aside>
🚫 “ *The selection cannot be launched and there are no recent launches.*”

</aside>

라는 문구와 함께 팝업상자가 나왔다.

난 오늘 처음인데 최근 실행된게 없다는 문구에 꽤나 당황스러웠다.

검색해보니 default 설정의 문제였던 것.

> **해결 방법**
> 

(Macbook 기준)

***Eclipse → Preferences → Run/Debug → Launching → Launch Operation*** 항목에서

***Launch the associated project*** 를 선택✅한다

![스크린샷 2022-07-14 오후 7.18.56.png](%5B%E1%84%8B%E1%85%B5%E1%84%8F%E1%85%B3%E1%86%AF%E1%84%85%E1%85%B5%E1%86%B8%E1%84%89%E1%85%B3%5D%20%E1%84%8B%E1%85%B5%E1%84%8F%E1%85%B3%E1%86%AF%E1%84%85%E1%85%B5%E1%86%B8%E1%84%89%E1%85%B3%20%E1%84%89%E1%85%A5%E1%86%AF%E1%84%8E%E1%85%B5%20%E1%84%92%E1%85%AE%20%E1%84%8E%E1%85%A9%E1%84%80%E1%85%B5%20%E1%84%8B%E1%85%A9%E1%84%85%E1%85%B2%20%E1%84%92%E1%85%A2%E1%84%80%E1%85%A7%E1%86%AF(E%20baa26fba88ab477c87ea06d057d05652/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7_2022-07-14_%EC%98%A4%ED%9B%84_7.18.56.png)

나처럼 처음 사용하는 사용자에게는 당연히 최근 실행한 파일이 없는데

이 설정이 기본으로 설정되어있다는게 조금은 당황스러웠다.