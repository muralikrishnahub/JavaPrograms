package com.learn.basicprograms.Stringprograms;

public class CountNumberOfOccuranceOfWord {

	public static void main(String[] args) {
		String searchStr="m";
		String actualStr="Hello murali, How are you? murali you are so good in helping. murali is fantastic";
		
		countNumberOfOccurance(actualStr,searchStr);

	}

	private static void countNumberOfOccurance(String actualStr, String searchStr) {
		int count=0;
		int pos=0;
		int idx;
		
		while((idx=actualStr.indexOf(searchStr, pos))!=-1){
			++count;
			pos=idx+searchStr.length();
		}
		
		System.out.println("No of occurance of a search string is:"+count);
		
	}

}
