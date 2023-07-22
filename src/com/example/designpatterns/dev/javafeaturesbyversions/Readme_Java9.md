#2017

#1. Private methods in interfaces
     private void foo() {}
     N/A
#2. Enhanced try-with-resources
     try (resource) {}
     try {} finally {}
#3. Factory methods for ImmutableList, etc.
     List.of(1, 2, 3)
     Arrays.asList(1, 2, 3)
#4. Collection.toArray(IntFunction)
     list.toArray(String[]::new)
     list.toArray(new String[list.size()])
#5. jshell – The Java Shell
     jshell
     N/A
#6.  HTTP/2 Client
     HttpClient client = HttpClient.newHttpClient();
     N/A