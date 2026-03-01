# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## 언어
- 항상 한국어로 응답한다.

## 모델
- 기본 모델: claude-haiku-4-5

## 프로젝트 개요

알고리즘 풀이 및 Java 학습을 위한 개인 스터디 저장소입니다.

- **백준(BaekJoon)**: https://www.acmicpc.net/ 문제 풀이
- **프로그래머스(Programmers)**: https://programmers.co.kr/ 문제 풀이
- **Study**: 책 예제 및 개념 코드 학습

## 빌드 및 실행

이 프로젝트는 **IntelliJ IDEA** 기반의 Java 프로젝트입니다 (JDK 24, OpenJDK).

```bash
# 단일 Java 파일 컴파일 및 실행 (src 디렉토리에서)
javac -d out src/BaekJoon/BaekJoon1234.java
java -cp out BaekJoon.BaekJoon1234

# 패키지가 있는 경우
javac -sourcepath src -d out src/Programmers/Solution_12345.java
java -cp out Programmers.Solution_12345
```

빌드 출력 디렉토리: `out/` (`.gitignore`에 포함)

## 코드 구조

```
src/
├── BaekJoon/          # 백준 문제 풀이
│   ├── sol_1000/      # 1000번대 문제
│   ├── sol_2000/      # 2000번대 문제
│   ├── sol_3000/      # 3000번대 문제
│   ├── sol_10000/     # 10000번대 문제
│   ├── sol_11000/     # 11000번대 문제
│   └── BaekJoon*.java # 번호대 미분류 문제
├── Programmers/       # 프로그래머스 문제 풀이 (Solution_{문제번호}.java)
├── Study/             # 개념 학습 코드
│   ├── coding_test/   # 이것이 코딩테스트다 책 예제
│   ├── graph/         # 그래프 알고리즘
│   ├── jvm_deep_dive/ # JVM 내부 동작 (StaticDispatch, DynamicDispatch, FinalizeEscapeGC)
│   ├── refactoring/   # 리팩토링 책 예제 (chapter01: 비디오 대여점)
│   ├── sort/          # 정렬 알고리즘 구현
│   ├── stream_api/    # Java Stream API 예제
│   └── technique/     # DFS, BFS, KMP, N-Queen 등 알고리즘 기법
└── turnover/          # 면접 질문 정리 (면접질문정리.md)
```

## 파일 명명 규칙

- **백준**: `BaekJoon{문제번호}.java` — 패키지: `BaekJoon` 또는 `BaekJoon.sol_{번호대}`
- **프로그래머스**: `Solution_{문제번호}.java` — 패키지: `Programmers`
- **Study**: 주제별 디렉토리에 개념을 설명하는 이름으로 작성

## 알고리즘 풀이 패턴

백준/프로그래머스 파일은 보통 단일 `public class`에 `main` 메서드를 포함합니다. 입출력은 `BufferedReader` / `Scanner`를 주로 사용합니다.