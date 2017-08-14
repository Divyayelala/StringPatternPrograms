
public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space= 8;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			space = space-2;
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-------------");
		int space1= 0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space1;j++)
			{
				System.out.print(" ");
			}
			space1 = space1+2;
			for(int k=i;k<=5;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
