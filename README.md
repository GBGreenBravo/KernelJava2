# KernelJava2 / 박은종디렉터님 특강(2023/11/29) 과제2

### 문제 정의
아갤폰 고객 센터에는 엔지니어가 한 명 있습니다. 고객들은 핸드폰을 액정을 A/S 하러 왔습니다. 고객은 10시 부터 선착순 10명까지 입장하고 수리 서비스는 10시부터 바로 시작합니다. 이 때, 고객이 도착했을 때 다른 고객의 수리 서비스가 진행중이라면 서비스가 완료 될때까지 고객은 차례를 기다려야합니다. ((대기 손님이 없다고 하더라도, 뒤에 올 손님을 예측(?)하여 조건에 합당해야만 바로 서비스 가능.)) 도착한 고객은 선착순 대기열표를 가지고 기다리고 있습니다. 각 고객의 고객 센터에 도착한 시간, 수리에 소요되는 시간은 다음과 같습니다. A/S 처리 방식은 아래 두 가지 경우가 있습니다. 각 처리 방식에 대해 모든 고객의 수리가 끝난 뒤 수리 순서, 총 걸린 시간, 총 기다린 시간을 출력해 보세요 <br>

처리방식
First In First Out (FIFO) : 도착 시간이 빠른 고객부터 처리 (선착순)
Shortest Job First (SJF) : 수리 시간이 적게 걸리는 고객부터 처리 (단 수리 시간이 같은 경우는 먼저 온 고객을 먼저 처리)

먼저온 고객을 먼저 서비스 하려면 F, 수리시간이 짧은 고객을 먼저 서비스 하려면 S를 입력하세요.  <br>
끝내려면 Q를 입력하세요. <br>
f  <br>
이영주, 도착 시간: 0분, 소요시간: 1분, 서비스 시작시간: 0분, 기다린 시간: 0분  <br>
이종찬, 도착 시간: 2분, 소요시간: 12분, 서비스 시작시간: 2분, 기다린 시간: 0분 <br>
장호윤, 도착 시간: 5분, 소요시간: 5분, 서비스 시작시간: 14분, 기다린 시간: 9분 <br>
문찬욱, 도착 시간: 6분, 소요시간: 6분, 서비스 시작시간: 19분, 기다린 시간: 13분 <br>
김찬규, 도착 시간: 7분, 소요시간: 3분, 서비스 시작시간: 25분, 기다린 시간: 18분 <br>
손민우, 도착 시간: 9분, 소요시간: 1분, 서비스 시작시간: 28분, 기다린 시간: 19분  <br>
송예진, 도착 시간: 10분, 소요시간: 3분, 서비스 시작시간: 29분, 기다린 시간: 19분  <br>
총 기다린 시간:78분 <br>

먼저온 고객을 먼저 서비스 하려면 F, 수리시간이 짧은 고객을 먼저 서비스 하려면 S를 입력하세요.
끝내려면 Q를 입력하세요. <br>
s  <br>
이영주, 도착 시간: 0분, 소요시간: 1분, 서비스 시작시간: 0분, 기다린 시간: 0분  <br>
손민우, 도착 시간: 9분, 소요시간: 1분, 서비스 시작시간: 9분, 기다린 시간: 0분  <br>
김찬규, 도착 시간: 7분, 소요시간: 3분, 서비스 시작시간: 10분, 기다린 시간: 3분  <br>
송예진, 도착 시간: 10분, 소요시간: 3분, 서비스 시작시간: 13분, 기다린 시간: 3분  <br>
장호윤, 도착 시간: 5분, 소요시간: 5분, 서비스 시작시간: 16분, 기다린 시간: 11분  <br>
문찬욱, 도착 시간: 6분, 소요시간: 6분, 서비스 시작시간: 21분, 기다린 시간: 15분  <br>
이종찬, 도착 시간: 2분, 소요시간: 12분, 서비스 시작시간: 27분, 기다린 시간: 25분 <br>
총 기다린 시간:57분 <br>

먼저온 고객을 먼저 서비스 하려면 F, 수리시간이 짧은 고객을 먼저 서비스 하려면 S를 입력하세요. <br>
끝내려면 Q를 입력하세요.  <br>
q  <br>

### 추가로, PolicyFIFOButFiveAndUnderFirst(선착순으로 하되 수리시간이 5분이하인 손님들을 먼저 서비스 하고 수리시간이 5분초과인 손님들을 나중에 서비스 하는 정책)를 추가했습니다.
