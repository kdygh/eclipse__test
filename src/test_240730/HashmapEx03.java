package test_240730;

import java.util.*;

public class HashmapEx03 {

	static HashMap phoneBook = new HashMap();
	
	//그룹에 전번 추가
	static void addPhoneNum(String groupName, String name, String tel)
	{
		addGroup(groupName);
		
		HashMap group = (HashMap)phoneBook.get(groupName);
		group.put(tel, name);
	}
	
	//그룹을 추가하는 메서드
	static void addGroup(String groupName)
	{
		if(phoneBook.containsKey(groupName) == false)
		{
			phoneBook.put(groupName, new HashMap());
		}
	}
	
	static void addPhoneNum(String name, String tel)
	{
		addPhoneNum("Etc", name, tel);
	}
	
	static void printList()
	{
		Set set = phoneBook.entrySet();
		
		Iterator iter = set.iterator();
		
		while(iter.hasNext())
		{
			Map.Entry e = (Map.Entry)iter.next();
			
			Set subSet = ((HashMap)e.getValue()).entrySet(); 
			
			Iterator subIter = subSet.iterator();
			
			System.out.printf(" * %s [%d]\n", e.getKey(), subSet.size());
			
			while(subIter.hasNext())
			{
				Map.Entry subE = (Map.Entry)subIter.next();
				String telNo = (String)subE.getKey();
				String name = (String)subE.getValue();
				System.out.printf("%s %s ", telNo, name);
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		addPhoneNum("Friend", "John", "000-0000-0000");
		addPhoneNum("Friend", "Cena", "000-1111-1111");
		
		addPhoneNum("Enemy", "Undertaker", "000-2222-1111");
		addPhoneNum("Enemy", "The Rock", "000-1111-1111");
		
		addPhoneNum("Boss", "Undertaker", "000-2222-1111");
		addPhoneNum("Boss", "The Rock", "000-1111-1111");
		addPhoneNum("Boss", "The Roc", "000-1111-3333");
		addPhoneNum("Boss", "The Rok", "000-1111-4444");
		
		printList();
	}

}
