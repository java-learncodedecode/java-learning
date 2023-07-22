#2011
#Feature	                Java 7	              Prior to Java 7 --- 2011

Binary literals	            int binary = 0b10101010;	        Not supported

Improved type inference	    Map<String, List<Integer>> map = new HashMap<>();  	                 																							  				Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();

MultipleEexceptionHandling	  try{…}catch (IOException |SQLException ex) {…}`	 NA

Automatic resource 
management	            try (BufferedReader br = new BufferedReader(new 						FileReader("file.txt"))) {...} catch (IOException ex) {...}	

		BufferedReader br = new BufferedReader(new FileReader("file.txt")); 
        try {...} finally {br.close();}		
