package com.biz.classex1;

import com.biz.classex.children.CatClass;
import com.biz.classex.children.DogClass;
import com.biz.classex.parents.AnimalClass;

public class ClassExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogClass dog = new DogClass();
		CatClass cat = new CatClass();
		
		dog.strName = "������";
		dog.whatIsName();
		
		dog.strColor ="ȭ��Ʈ";
		dog.whatIsColor();
		
		cat.strName ="����";
		cat.whatIsName();
		
		AnimalClass animalClass = new AnimalClass();
		animalClass.strName ="������ ����";
		animalClass.whatIsName();

	}

}
