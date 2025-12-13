public class Adapter {
  public static void main(String[] args) {
    XMLService xmlService = new XMLService();
    JSONService jsonService =new XMLtoJSONAdapter(xmlService);
  }
}


interface JSONService {
  String getJSONData();
}

class XMLService {
  public String getXMLData() {
    return "<data><item>Example</item></data>";
  }
}


class XMLtoJSONAdapter implements JSONService {
  private XMLService xmlService;

  public XMLtoJSONAdapter(XMLService xmlService){
    this.xmlService= xmlService;
  }

  @Override
  public String getJSONData() {
    String xmlData = xmlService.getXMLData();
    // Simple conversion logic for demonstration purposes
    String jsonData = "{\"data\": {\"item\": \"Example\"}}";
    return jsonData;
  }

}
