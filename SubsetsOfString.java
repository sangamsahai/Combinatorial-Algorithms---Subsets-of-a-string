
public class SubsetsOfString {

	/**
	 * @param args
	 */

	public static  String testString=null;
	//this will be an array of 0/1 and will have all the combinations of 0 and 1 for the length of the string
	public static int[]booleanArray=null;	

	//this will fill the booleanArray in all possible combinations of 0 and 1
	public static void subset(int n )
	{
		if(n==0)
		{
			print();
			return;
		}
		booleanArray[n-1]=0;
		subset(n-1);

		booleanArray[n-1]=1;
		subset(n-1);
	}

	//this will print the test
	public static void print()
	{
		String local_testString="";
		int length=testString.length();

		for(int i=0;i<length;i++)
		{
			if(booleanArray[i]==1)
			{
				local_testString=local_testString+testString.charAt(i);

			}
		}
		System.out.println(local_testString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testString="XYZ";
		booleanArray=new int[testString.length()];


		subset(testString.length());		
	}//end of main

}
