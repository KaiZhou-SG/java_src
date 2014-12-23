public class apacheHttpClient{
  public void makeApacheHttpClientRequest() throws IOException {
    final CloseableClient client = HttpClients.createDefault();
    HttpGet get = new HttpGet("http://en.wikipedia.org/");
    final HttpResponse response = client.execute(get);
    final int responseCode = response.getStatusLine().getStatusCode();

    final HttpEntity entity = response.getEntity();
    final InputStream responseBody = entity.getContent();

    assertEquals(200, responseCode);
    System.out.printf("Response received: [%s]%n", IOUtils.toString(responseBody));
  }

  public static void main(String args []) {
    makeApacheHttpClientRequest();
    return;
  }
}
