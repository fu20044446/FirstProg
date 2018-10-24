import java.util.Scanner;
public class LanguageBasic
{
    public static void main(String[] args) 
    {	
	//COMPLETE! 1
/*         int number=-9;
        if(number > 0)
        {
            System.out.println(number+" is a positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is a negative number");
        }
        else
        {
            System.out.println(number+" is neither positive nor negative");
        } */
    
	//COMPLETE! 2
/* 		int x;
		x=5;
		if((x%2)==0){
			System.out.println(x+" is Even Number");
		}

		else {System.out.println(x+" is an odd Number");} */
	
	//COMPLETE 3!	
/* 		if (args[2]==null){
			System.out.println(args[0]+"No Values Givem");}
		else {
			System.out.println(args[0]+" " +args[1]+" "+args[2]+" "+ args[3]);} */
			
	//COMPLETE?
		// System.out.println("Enter the first statement: ");
        // input.nextLine();
		// string1 = input.nextLine();
		// System.out.println("Enter the second statement: ");
		// string2 = input.nextLine();
		// System.out.println("Enter the third statement: ");
		// string3 = input.nextLine();
			// if(string1.compareToIgnoreCase(string2) < 0)	{
				// if(string2.compareToIgnoreCase(string3) < 0){
					// if(string3.compareToIgnoreCase(string1) < 0){
						// small = string1;
						// big = string2;
						// biggest = string3;}
				// }
			// }
			
	//COMPLETE4
/* 		char a='a';
		char b='e';
		if(a>b){
			System.out.print(b+" "+a);
		}
		else{
			System.out.print(a+" "+b);
		} */

		
	//Complete 12
/* 		int num = 0;
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {if(num % i == 0){
                flag = true;
                break;}
        }

        if (flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number."); */

		
		
	//COMPLETE! 12 While Loop
        // int num = 0, i = 2;
        // boolean flag = false;
        // while(i <= num/2)
        // {
            // if(num % i == 0)
            // {
                // flag = true;
                // break;
            // }

            // ++i;
        // }

        // if (!flag)
            // System.out.println(num + " is a prime number.");
        // else
            // System.out.println(num + " is not a prime number.");		
		
	//COMPLETE!11
/* 		int limit = 57;
		
		System.out.println("Printing Even numbers between 1 and " + limit);
		
		for(int i=23; i <= limit; i++){
			
			if the number is divisible by 2 then it is even
			if( i % 2 == 0){
				System.out.print(i + " ");
			}
		} */
		
	//COMPLETE 13
/* 		int i =0;
		int num =0;
		String  primeNumbers = "";

		for (i = 10; i <= 90; i++){ 		  	  
			int counter=0; 	  
			for(num =i; num>=1; num--)
			{
				if(i%num==0){
					counter = counter + 1;}
			}
				if (counter ==2){
					primeNumbers = primeNumbers + i + " ";}	
		}	
		System.out.println("Prime numbers from 10 to 100 are :"); */
		// System.out.println(primeNumbers);		
		
	// COMPLETE Q5
/* 		Scanner scanner=new Scanner(System.in);
		System.out.println("Input your characters: ");
        char char1 =scanner.next().charAt(0);
        if((char1>=48 && char1<=57) || char1 == 45)
        {
            System.out.print("char is Digit");

        }
        else if((char1>='a' && char1<='z')||(char1>='A' && char1<='Z'))
        {
            System.out.print("char is Alphabet");
        }
        else
        {
            System.out.print("char is special character");

        } */
	

	//Q7
/* 	    char a = 's';
        char b = 'E';
        
        if(Character.isLowerCase(a)){
            System.out.println(Character.toUpperCase(a));
        }
        else{
            System.out.println(Character.toLowerCase(a));
        }
        
        if(Character.isLowerCase(b)){
            System.out.println(Character.toUpperCase(b));
        }
        else{
            System.out.println(Character.toLowerCase(b));
        } */
		
	//Q6
/* 		Scanner sc=new Scanner(System.in);
		System.out.print("Input your Gender (male or female): ");	
		String gender=sc.nextLine();
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your AGe (1 - 120):");
		int age=scan.nextInt();
		System.out.println(age+gender);
		
		if (!gender.equals ("male")&&!gender.equals("female")){
			System.out.println("Gender is not correct!");
		}
		break;
		if ((gender.equals ("male"))&&(age<=60)){
			System.out.print("Interest for you is 9.2%");
		}
		else if((gender.equals("male"))&&((age > 60) && (age<=120))){
			System.out.print("Interest 8.3%");
		}
		if ((gender.equals ("female"))&&(age<=58)){
			System.out.print("Interest for you is 8.2%");
		}
		else if((gender.equals("female"))&&((age >= 59) && (age<=120))){
			System.out.print("Interest 7.3%");
		}
		else {
			System.out.println("You entered Age: "+age+" !");
			System.out.print("Age between 1-120!");
		} */
		
	//Q8
/* 	  char color = args[0].charAt(0);
      char color = 'B';

      switch(color) {
         case 'R' :
            System.out.println("Code: "+color+" is= Red"); 
            break;
         case 'B' :
             System.out.println("Code: "+color+" is= Blue");
             break;
         case 'G' :
            System.out.println("Code: "+color+" is= Green");
            break;
         case 'O' :
            System.out.println("Code: "+color+" is= Orange");
			break;
         case 'Y' :
            System.out.println("Code: "+color+" is= Yellow");
            break;
		case 'W' :
            System.out.println("Code: "+color+" is= White");
            break;
         default :
            System.out.println("Invalid Code");
      }
      //System.out.println("Your color is " + case); */
	
	//Q9
	
/* 		int n;
		n=Integer.parseInt(args[0]);
		//if (n==null){System.out.print("Please enter the month in numbers");}
		//else{
        switch(n) {
		 case 1 :
            System.out.println("January"); 
            break;
         case 2 :
             System.out.println("FEBRUARY");
             break;
         case 3 :
            System.out.println("MARCH");
            break;
         case 4 :
            System.out.println("APRIL");
			break;
         case 5  :
            System.out.println("MAY");
            break;
		case 6 :
            System.out.println("June");
            break;
         case 7 :
            System.out.println("July"); 
            break;
         case 8 :
             System.out.println("AUGUST");
             break;
         case 9 :
            System.out.println("SEPTEMBER");
            break;
         case 10 :
            System.out.println("OCTOBER");
			break;
         case 11 :
            System.out.println("NOVEMBER");
            break;
		case 12 :
            System.out.println("DECEMBER");
            break;
         default :
            System.out.println("Invalid month");
		} */
		
	//Q10
/* 		for (int i=1;i<=10;i++){
			System.out.printf(i+"\t");
		} */
		
	//14
/* 		int i=0;
		int num;
		num=Integer.parseInt(args[0]);
		for(i=0;i<num;i++){
			counter=i;
			i;
			if(i%num==0){
				System.out.println(num+" is Not Prime Number");}
			else{System.out.println(num+" is A prime Number");}	
		} */
		
	//15
/* 		int n;
		n = Integer.parseInt(args[0]);
		for (int i=1;i<=n;i++){
			System.out.print(i);
		} */
		
	//16
/* 		int n, i, j;
		n =Integer.parseInt(args[0]);
		//char star='*';
		for(i=1;i<=n;i++){
			for (j=1;j<=i;j++){
				System.out.print("* ");
				//n++;
			}
			System.out.println();
		}	 */
		
	//17
/* 		int num=0;
		int rnum =0;
		System.out.println("Enter any number: ");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		
		while( num != 0 ){
			rnum = rnum * 10;
			rnum = rnum + num%10;
			num = num/10;
			}

      System.out.println(rnum); */
	  
	//18
/* 		int r,n,i=0,j; 
		n=Integer.parseInt(args[0]);
		j=n;    
		while(n>0){    
			r=n%10; 
			i=(i*10)+r;    
			n=n/10;
		}    
		if(j==i)    
			System.out.println("palindrome number ");    
		else    
			System.out.println("not palindrome"); */
		
	//20
	  Scanner n=new Scanner(System.in);
	  boolean menu=true;
	  int choices;
	  while(true){
	  System.out.println("==========================");
	  System.out.println("\t Menu Option\t |");
	  System.out.println("==========================");  
	  System.out.print(" 1.) ADD. \t\t | \n");
	  System.out.print(" 2.) SUB. \t\t | \n");
	  System.out.print(" 3.) Exit \t\t | \n");
	  System.out.println("==========================");
	  System.out.print("\n Enter your Choice: ");
	  
	  choices=n.nextInt();

      switch(choices) {
         case 1 :
			int adNumf, adNuml, sum;
			System.out.print("\nEnter The First Number: ");
			adNumf = n.nextInt();
			System.out.print("\nEnter The Second Number: ");
			adNuml = n.nextInt();
			sum = adNumf + adNuml;
			System.out.println("The Sum Of Numbers: " +sum);
            break;
         case 2 :
			int subNum1, subNum2, sum2;
			System.out.println("\nEnter The First Number: ");
			subNum1 = n.nextInt();
			System.out.println("Enter The Second Number: ");
			subNum2 = n.nextInt();
			sum2 = subNum1 - subNum2;
			System.out.println("The Subs of Numbers: " +sum2);
            break;
		 case 3: 
			System.out.println("Exiting Program...");
			System.exit(0);
			break;
         default :
            System.out.println("Invalid Input");
      }
      //System.out.println("Your grade is " + case);
	 }
	}
	
}