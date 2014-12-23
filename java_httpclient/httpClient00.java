public class httpClient00{
  public void makeBareHttpRequest() throws IOException {
    final URL url = new URL("http", "en.wikipedia.org", "/");
    final HttpURLConnection connection = (HttpURLConnection)url.openConnection();
    connection.setRequestMethod("GET");

    final InputStream responseInputStream = connection.getInputStream();
    
    final int responseCode = connection.getResponseCode();
    final String response = IOUtils.toString(responseInputStream);

    responseInputStream.close();

    assertEquals(200, responseCode);
    System.out.printf("Response received: [%s] %n", response);
  }

  public static void main(String args[]) {
    makeBareHttpRequest();
    return;
  }
}

