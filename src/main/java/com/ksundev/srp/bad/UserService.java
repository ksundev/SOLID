package com.ksundev.srp.bad;

import com.ksundev.srp.User;

public class UserService {
  void saveUser(User user) {
    // DB에 사용자 정보 저장
    // Repository 호출
  }

  void deleteUser(User user) {
    // 사용자 정보 삭제
    // Repository 호출
  }

  void sendWelcomeEmail(User user) {
    // 이메일 서버 설정
    // 템플릿 설정
    // 이메일 발송
  }

  void sendPasswordResetEmail(User user) {
    // 이메일 서버 설정
    // 템플릿 로딩
    // 이메일 발송
  }

  void resetPassword(User user, String newPassword) {
    // 비밀번호 유효성 검증
    // 비밀번호 암호화
    // DB 업데이트
  }

  // 여러 책임이 한 클래스에 모여있다!
}
