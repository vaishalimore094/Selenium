package DataProvider;

import org.testng.annotations.DataProvider;

public class DataproviderMethod1 {
	@DataProvider(name="searchDataset")
	public Object[][] serchData()
	{
		Object[][]searchkeyword=new Object[3][2];
		searchkeyword[0][0]="India";
		searchkeyword[0][1]="Qutubminar";
		
		searchkeyword[1][0]="Agra";
		searchkeyword[1][1]="tajmahal";
		
		searchkeyword[2][0]="Hydrabad";
		searchkeyword[2][1]="Charminar";
		return searchkeyword;
				
		
	}

}
