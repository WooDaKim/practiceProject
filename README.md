# MeStory(나의 이야기 => 일기 사이트 먼저 구축하고 나머지 추가)

# 프로젝트 설명서
##스펙
### JAVA11, SpringBoot, JPA
### Thymeleaf, BootStrap
### InteliJ
### MYSQL

---------------------------------------------
#구현
##로그인
1. 아이디
2. 비밀번호
3. API이용(카카오, 구글, 네이버)
4. 리다이렉션으로 어떤 메인메뉴를 선택하든지 먼저 로그인창으로 이동하게 만들기

##회원가입
1. 아이디 (형식을 폰번호로 할지 미정)
   1. 중복 확인
   2. 영어 형식
2. 비밀번호
   1. 영어+숫자+특수문자 형식
3. 이름
   1. 15자 까지
4. 전화번호
   1. 휴대전화
5. 이메일
   1. @adsfadsf형식
6. 생일
   1. 년도도 받을 것

##건강 => 건강일기
1. 병원이름
   1. 기입
   2. 주소
2. 증상
   1. 내가 느끼는 증상
   2. 병원에서 말해주는 이유
3. 처방전 
   1. 업로드 or 스캔
4. 약봉투 
   1. 업로드 or 스캔
5. 몸무게 기록
   1. 기입
6. 혈압 기록
   1. 기입

##공부
1. To-Do
   1. 무조건 하루에 3가지만 하자!
2. 성적표, 상장
   1. 사진업로드
   2. 기입


##일기
1. 사진 업로드 16:9
2. 글자 최대 1000자
3. 날씨 선택
4. 날자 지정?(생각해봐야할듯)

##책 => 나의 서점
1. 책추천
   1. 특정 알고리즘이 필요할듯(찾아 봐야함)
   2. 누적된다면 이 시기에 많이 읽었던 주제들의 책들을 추천해준다.
2. 독서록
   1. 어떤주제인가요?
      1. 예시 문장 몇개 만들기
   2. 잘 읽히나요?
      1. 별점 최대 5점
   3. 어떤 문구가 가장 좋았나요?(최대 1000자)
   4. 문구가 좋았던 이유는 무엇인가요?? 자유롭게 적어주세요.(최대 2000자)
   5. 

##메모장
최대 3000자

##도장
1. 일기 개수📒
   1. 1일 완성
   2. 10일 완성
   3. 100일 완성
   4. 1000일 완성
2. 독서록 개수 📚
   1. 1일 완성
   2. 10일 완성
   3. 100일 완성
   4. 1000일 완성
3. 학교생활 🏫
   1. O학년 O학기 등록 완료
   
---------------------------------------------

#이동화면

로그인 - (회원가입) - 캘린더 - 각 메뉴 선택( 토글 or 메뉴바 )

1. 메인 화면 에서 각섹션 메인화면으로 이동까지는 하고 무언가 클릭시 리다이렉션으로 로그인페이지로 이동


         사진 첨부할것중


가장 신경써야할것 보안관련

