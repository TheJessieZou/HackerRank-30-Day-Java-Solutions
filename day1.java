        /* Declare second integer, double, and String variables. */
        //Variable Declaration
	int j;
        double e;
        String dog;
    
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
	//Variable Initialization
	j = scan.nextInt();
        e = scan.nextDouble();
        scan.nextLine(); //required to scan the entire line
        dog = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + j);

        /* Print the sum of the double variables on a new line. */
		System.out.println(d + e);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + dog); 
