package com.min.spring.aop;
  
public class BraveKnight implements Knight {

  private Quest quest;

  public BraveKnight(Quest quest) {
    this.quest = quest;
  }

  public void embarkOnQuest() {
	//测试异常通知
//	int[] arr = {1,2,3,4,5};
//	System.out.println(arr[7]);
	
	System.out.println("embarkOnQuest()");
    quest.embark();
  }

}
