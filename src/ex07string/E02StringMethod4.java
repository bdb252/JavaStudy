package ex07string;

public class E02StringMethod4 {

	public static void main(String[] args) {

		/*
		시나리오1] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		*/
		String str1 = "190419-1000000";
		if(str1.charAt(7) == '1' || str1.charAt(7) == '3') {
			System.out.println(str1+" => 남자");
		}
		else if(str1.charAt(7) == '2' || str1.charAt(7) == '4'){
			System.out.println(str1+" => 여자");
		}

		/*
		시나리오2] 해당 문자열이 이메일 형식인지 검사하는
		프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net => 이메일형식임
		not@naver => 이메일형식이아님
		*/
		String str3 = "hong@daum.net";
		if(str3.contains("@")==true && str3.contains(".")==true) {
			System.out.println(str3+" => 이메일형식임");
		}
		else
			System.out.println(str3+" => 이메일형식이아님");

		/*
		시나리오3]주민등록번호로 성별을 구분하는 프로그램을 indexOf()와 charAt()을 
		이용해서 작성하시오.
		*/	
		String str5 = "190419-2000000";
		if(str5.charAt(str5.indexOf("-")+1) == '1' || str5.charAt(str5.indexOf("-")+1) == '3') {
			System.out.println(str5+" => 남자");
		}
		else if(str5.charAt(str5.indexOf("-")+1) == '2' || str5.charAt(str5.indexOf("-")+1) == '4') {
			System.out.println(str5+" => 여자");
		}

		/*
		시나리오4] 다음 파일명에서 확장자를 잘라내는 프로그램을
		작성하시오. 
		파일명 : my.file.images.jpg
		*/
		String str6 = "my.file.images.jpg";
		System.out.println(str6.substring(str6.lastIndexOf(".")+1));
	}

}
