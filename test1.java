import java.util.Scanner;

public class ArraysTest
{
	public static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args)
	{		
		exercise3();
	}
	
	public static void exercise1()
	{
		int[] arr = new int[20];
		
		// ריצה על כל האיברים במערך (20 איברים) ובכל פעם נקלוט מהמשתמש מספר לתא הנוכחי
		for (int i = 0; i < 20; i++ )
		{
			System.out.println("הכנס מספר");
			arr[i] = reader.nextInt();
		}		
		
		// המונה שלנו, תפקידו למנות את מספר האיברים שגדולים מהאיבר שבא אחריהם
		int mone = 0;
		// רצים 19 פעמים מכיוון שלאיבר האחרון אין איבר שבא אחריו
		for (int j = 0 ; j < 19; j++)
		{
			if (arr[j] > arr[j+1])
			{
				mone ++;
			}
			
		}
		
		// מדפיסים את המונה
		System.out.println(mone);
	}
	
	public static void exercise2()
	{
		// מצהירים על משתנה עזר שבעזרתו נכניס למערך בקפיצות של 2
		int ezer = 0;
		// הצהרה על מערך בגודל 20
		int[] arr = new int[20];
		
		// רצים מ1 עד 10 כולל (בזכות הקטן שווה)ד
		for (int i = 1 ; i <= arr.length / 2; i++)
		{
			// מכניסים לאיבר הראשון את השלילי שלו
			arr[ezer] = i * -1;
			// מכניסים לאיבר הבא אחריו את הערך החיובי שלו
			arr[ezer + 1] = i;
			
			// קופצים ב2 כדי שבפעם הבאה לא נדרוס את האיבר ה + 1
			ezer += 2;		
		}			
	}
	public static void exercise3()
	{
		int ezer = 0;
		int[]	a = new int[40];
		int[]	b = new int[40];
	
		for (int i = 0; i < 40 ; i++)
		{
			if (a [i] % 2 ==0 && a [i] < 100)
			{
				b[ezer] = a[i];
				ezer++;
			}
		}			
	}
}
