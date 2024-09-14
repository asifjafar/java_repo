package upwork.portolio;

import static com.fasterxml.jackson.databind.SerializationFeature.INDENT_OUTPUT;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import lombok.extern.slf4j.Slf4j;
import upwork.portolio.pojo.Customer;

@Slf4j
public class PdfUtil {

  public static void main(String[] args) throws JsonProcessingException {
    XmlMapper mapper = new XmlMapper();

    mapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
    mapper.enable(INDENT_OUTPUT);
    var value = mapper.writeValueAsString(Customer.DEFAULT_CUSTOMER);
    log.info(value);
  }
}
