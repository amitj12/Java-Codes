import java.util.*;

class LinkedListExample
{
		public static void main(String ar[])
		{
				LinkedList<Integer> x = new LinkedList<Integer>();

				int i,no,ch,pos,c;
				Scanner sc = new Scanner(System.in);
				
				while(true)			
				{

						System.out.println("1.Add Element");
						System.out.println("2.Add First Element");
						System.out.println("3.Insert By Position Element");
						System.out.println("4.Search Element");
						System.out.println("5.Update Element");
						System.out.println("6.Delete First Element");
						System.out.println("7.Delete Last Element");
						System.out.println("8.Delete By Position Element");
						System.out.println("9.Sort Element");
						System.out.println("10.Reverse Element");
						System.out.println("11.Total Element");
						System.out.println("12.Display All Element");
						System.out.println("13.Exit");
						System.out.println("enter choice");
						ch = sc.nextInt();
						switch(ch)
						{
								case 1:
											System.out.println("enter no");
											no = sc.nextInt();
											x.add(no);
											System.out.println(x);
											break;
								case 2:
											System.out.println("enter no");
											no = sc.nextInt();
											x.addFirst(no);
											System.out.println(x);
											break;
								case 3:
											
											System.out.println("enter no");
											no = sc.nextInt();
											System.out.println("enter Position");
											pos = sc.nextInt();
											x.add(pos,no);
											System.out.println(x);
											break;
								case 4:
											System.out.println("enter no");
											no = sc.nextInt();
											if(x.contains(no))
											{
												System.out.println(no + "  is exists");
											}
											else
											{
												System.out.println(no + "  is not exists");
											}
											break;
								case 5:
											System.out.println("enter no");
											no = sc.nextInt();
											System.out.println("enter Position");
											pos = sc.nextInt();
											x.set(pos,no);
											System.out.println(x);
											break;
								case 6:
											x.removeFirst();
											System.out.println(x);	
											break;
								case 7:
											x.removeLast();
											System.out.println(x);	
											break;
								case 8:
											System.out.println("enter Position");
											pos = sc.nextInt();
											x.remove(pos);
											System.out.println(x);	
											break;
								case 9:
											Collections.sort(x);
											System.out.println("After Sort : " + x);
											break;
								case 10:
											Collections.reverse(x);
											System.out.println("After Reverse : " + x);
											break;
								case 11:
											c = x.size();
											System.out.println("Total elements = " + c);
											break;
								case 12:
											System.out.println(x);	
											break;
								case 13:
											System.exit(0);
								
						}

				}

		}
}
	