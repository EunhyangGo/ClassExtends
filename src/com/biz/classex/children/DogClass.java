package com.biz.classex.children;

import com.biz.classex.parents.AnimalClass;

/*
 * Ŭ������ ���(extends)
 *  ������ ���� �� ����ϴ� Ŭ������ �ִµ� ���ο� ����� �߰��ϰ� ������
 *  ������ Ŭ������ �������� �ʰ�, ����� �̾�ްų� �̾���� ����� ���(����),
 *  ������ ������ �߰� �ϴ� ��.
 */
public class DogClass extends AnimalClass {

	@Override
	public void whatIsName() {
		// TODO Auto-generated method stub
		// super.whatIsName();
		System.out.println("����" + strName + "�Դϴ�");
		
	}

	public void whatIsColor() {
		System.out.println(strColor);
	}
}
