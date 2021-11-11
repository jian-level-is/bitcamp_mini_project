package main;

import util.ScannerUtil;
import viewer.UserViewer;

public class BookMain {
	
	
	public static void main(String[] args) {
		
		UserViewer userViewer = new UserViewer();				
		
		
		while(true) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 프로그램 종료");
			
			System.out.println("번호를 입력해주세요.");
			
			int userChoice = ScannerUtil.scanInt();
			
			switch (userChoice) {
			case 1: 	// 로그인
				
				break;

			case 2:		// 회원가입
				userViewer.showJoinForm();		
				break;
				
			case 3:		// 종료
				break;
				
			default:
				break;
			}
			
		}
	}
	
}
