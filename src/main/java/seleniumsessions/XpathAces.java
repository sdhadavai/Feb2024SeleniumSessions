package seleniumsessions;

public class XpathAces {

	public static void main(String[] args) {

		//parent to child
		//direct child: /
		//direct + indirect child: //
		
		
		//div[@id='content']//form//input
		
		//div[@id='content']/div --1
		
		//div[@id='content']//div --7
		
		
		//select[@id='Form_getForm_Country']//option --233
		//select[@id='Form_getForm_Country']/option  --233
		
		// (//div[@class='form-group'])[1]/input
		// (//div[@class='form-group'])[2]/a
		
		//child to parent
		//input[@id='input-email']/../../../../../../../../../../..
		//input[@id='input-email']/..	immediate/direct parent
		//input[@id='input-email']/parent::div -- readable
		//option[@value='Albania']/parent::select/parent::div/parent::div
		//input[@id='input-email']/ancestor::form
		//input[@id='input-email']/ancestor::div
		
		//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input
		//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
		//a[text()='John.Smith']/parent::td/preceding-sibling::td/input[@type='checkbox']
		
		//a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']
		//a[text()='John.Smith']/ancestor::tr//input[@type='checkbox']
		//a[text()='Gunnet Dhahla']/parent::td/preceding-sibling::td/child::input[@type='checkbox']
		//a[text()='neha sharma']/parent::td/following-sibling::td/child::a[@context='company']
		//(//a[text()='Pooja Khatiyan']/parent::td/preceding-sibling::td/child::input[@type='checkbox'])[last()]
		
		

	}

}
