package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class Student{
	private String name;
	private int age;
	private String year;
	public Student(String name, int age, String year) {
		this.name = name;
		this.age = age;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getYear() {
		return year;
	}
	@Override
	public String toString() {
		return "이름:" + name + ", 나이:" + age + ", 학번" + year;
	}
	
	
}

public class QuArrayList {

	public static void main(String[] args) {

//		ArrayList<Student> list = new ArrayList<Student>();
		LinkedList<Student> list = new LinkedList<Student>();
		
		//저장할 객체 생성
		Student st1 = new Student("가길동", 10, "2018");
		Student st2 = new Student("나길동", 20, "2017");
		Student st3 = new Student("다길동", 30, "2016");
		Student st4 = new Student("마길동", 40, "2015");
		
		//객체 추가(컬렉션에 저장)
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
			
		//1.검색할 이름을 입력받음
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요:");
		String scName = sc.nextLine();
				
		//2.확장for문으로 컬렉션 전체를 접근
		boolean flag = false;
		for(Student obj : list) {
			if(scName.equals(obj.getName())) {
				list.remove(obj);
				System.out.println("[검색되었습니다]");
				flag = true;
				break;
			}
		} 
		//3.검색결과 유/무에 따라 
		//검색결과 있을때…검색된 데이터 삭제
		//검색결과 없을때...검색결과가 없다고 출력
		if(flag) {
			System.out.println("[삭제 후 정보출력]");		
		}
		else {
			System.out.println("[검색 결과가 없습니다]");
		}

		//4.전체정보 출력
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
