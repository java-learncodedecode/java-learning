# Sep 2018

#1. No need to compile java files
      $ java HelloWorld.java
       Hello Java 11!
      
      $ javac HelloWorld.java
      $ java HelloWorld 
       Hello Java 8!
#2. Local variable type	
    var list = new ArrayList<String>();

    ArrayList<String> list = new ArrayList<String>();
#3. New String Methods
Java 11 adds a few new methods to the String class: isBlank, lines, strip, stripLeading, stripTrailing, and repeat.
Let's see how we can make use of the new methods to extract non-blank, stripped lines from a multi-line string:

	 String multilineString = "Baeldung helps \n \n developers \n explore  Java.";
	 List<String> lines = multilineString.lines()
      .filter(line -> !line.isBlank())
      .map(String::strip)
      .collect(Collectors.toList());
	 assertThat(lines).containsExactly("Baeldung helps", "developers", "explore Java.");

#4. Collection to an Array
The java.util.Collection interface contains a new default toArray method which takes an IntFunction argument.
This makes it easier to create an array of the right type from a collection:

     List sampleList = Arrays.asList("Java", "Kotlin");
     String[] sampleArray = sampleList.toArray(String[]::new);
     assertThat(sampleArray).containsExactly("Java", "Kotlin");

#5. HTTP Client
The new HTTP client from the java.net.http package was introduced in Java 9. It has now become a standard feature in Java 11.
The new HTTP API improves overall performance and provides support for both HTTP/1.1 and HTTP/2:

     HttpClient httpClient = HttpClient.newBuilder()
     .version(HttpClient.Version.HTTP_2)
     .connectTimeout(Duration.ofSeconds(20))
      .build();
     HttpRequest httpRequest = HttpRequest.newBuilder()
       .GET()
       .uri(URI.create("http://localhost:" + port))
       .build();
     HttpResponse httpResponse = httpClient.send(httpRequest,HttpResponse.BodyHandlers.ofString());
    assertThat(httpResponse.body()).isEqualTo("Hello from the server!");

     //before
	  URL url = new URL(“http://example.com&#8221;);
	  HttpURLConnection con = (HttpURLConnection) url.openConnection();
#6. File Handling
	String content = Files.readString(Paths.get(“file.txt”));

	BufferedReader reader = new BufferedReader(new FileReader(“file.txt”)); 
	String line; while ((line = reader.readLine()) != null) { … }reader.close();
#7. Single-line if
	if (bool) foo(); 
	  else bar();

	if (bool) { foo(); }
	  else { bar(); }
#8. Single-line for
	for (int i : List.of(1, 2, 3)) 
	  foo(i);

	for (int i : new int[] {1, 2, 3}) { 
	  foo(i); }
#9. Local-Variable Syntax for Lambda
Support for using the local variable syntax (var keyword) in lambda parameters was added in Java 11.
We can make use of this feature to apply modifiers to our local variables, like defining a type annotation:

	List<String> sampleList = Arrays.asList("Java", "Kotlin");
	String resultString = sampleList.stream().map((@Nonnull var x) -> x.toUpperCase()).collect(Collectors.joining(", "));
	assertThat(resultString).isEqualTo("JAVA, KOTLIN");
#10. The Not Predicate Method
A static not method has been added to the Predicate interface. We can use it to negate an existing predicate, much like the negate method:

     List<String> sampleList=Arrays.asList("Java","\n \n", "Kotlin"," ");
     List withoutBlanks = sampleList.stream()
      .filter(Predicate.not(String::isBlank))
      .collect(Collectors.toList());
	 assertThat(withoutBlanks).containsExactly("Java", "Kotlin");
