
	public static void help()
	{
		clear();
		System.out.print("\n\n                              HELP");
		System.out.print("\n -------------------------------------------------------------------------");
		System.out.print("\n ......................... C program Quiz Game...........");
		System.out.print("\n >> There are two rounds in the game, WARMUP ROUND & CHALLANGE ROUND");
		System.out.print("\n >> In warmup round you will be asked a total of 3 questions to test your general");
		System.out.print("\n    knowledge. You will be eligible to play the game if you can give atleast 2");
		System.out.print("\n    right answers otherwise you can't play the Game...........");
		System.out.print("\n >> Your game starts with the CHALLANGE ROUND. In this round you will be asked");
		System.out.print("\n    total 10 questions each right answer will be awarded $100,000.");
		System.out.print("\n    By this way you can win upto ONE MILLION cash prize in USD...............");
		System.out.print("\n >> You will be given 4 options and you have to press A, B ,C or D for the");
		System.out.print("\n    right option");
		System.out.print("\n >> You will be asked questions continuously if you keep giving the right answers.");
		System.out.print("\n >> No negative marking for wrong answers");

		System.out.print("\n\n\t*********************BEST OF LUCK*********************************");
		System.out.print("\n\n\t*****C PROGRAM QUIZ GAME is developed by CODE WITH C TEAM********");
	}

	public static void edit_score(float score, String playernm[20])
	{
		clear();
		float sc;
		String nm = new String(new char[20]);
		FILE f;
		f = fopen("score.txt","r");
		fscanf(f, "%s%f", nm, sc);
		if (score >= sc)
		{
			  sc = score;
			fclose(f);
			f = fopen("score.txt","w");
			fprintf(f,"%s\n%.2f",playernm,sc);
			fclose(f);
		}
	}