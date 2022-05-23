
public class BinarySearchPractice
	{
		

		public static void main(String[] args)
			{
				int [] Fred = {1, 6, 8, 12, 16, 21, 23, 38, 42, 45, 49};
				System.out.println(binarySearch(Fred, 38));
			}
		
		//it is an int because I am RETURNING (not syso) an int
		//the elements array is basically reassigning Fred so I can use it in my method
		public static int binarySearch (int[] elements, int target)
		{
			int left = 0;
			int right = elements.length - 1;
			
			while(left <= right)
				{
					int mid = (left + right) / 2;
					if(target == elements[mid])
						{
							//this returns the INDEX of the number wanted 
							return mid;
						}
					else if(target < elements[mid])
						{
							right = mid - 1;
						}
					else if(target > elements[mid])
						{
							left = mid + 1;
						}
						
				}
			return - 1;
			
		}

	}
