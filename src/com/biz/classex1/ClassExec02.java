package com.biz.classex1;

import java.util.ArrayList;
import java.util.List;

import com.biz.classex.children.BookVO;

public class ClassExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookVO vo = new BookVO();
		vo.setStrTitle("�����ڹ�");
		vo.setStrAuth("������");
		vo.setStrComp("�������̵��");
		
		System.out.println(vo);
		System.out.println(vo.toString());
		
		List<String> strList = new ArrayList();
		strList.add("korea");
		strList.add("���ѹα�");
		strList.add("�츮����");
		
		System.out.println(strList);
		System.out.println(strList.toString());
		
		
	}

}
