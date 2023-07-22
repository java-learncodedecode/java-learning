#2018

#1. Local-variable type inference
    var num = 10;

    int num = (int) 10;
#2. var in lambda expressions
    (var x, var y) -> x + y	

    (Integer x, Integer y) -> x + y
#3. HTTP Client
    var client = HttpClient.newHttpClient();
    
    HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();