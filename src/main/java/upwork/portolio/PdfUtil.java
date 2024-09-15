package upwork.portolio;

import static com.fasterxml.jackson.databind.SerializationFeature.INDENT_OUTPUT;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;
import lombok.extern.slf4j.Slf4j;
import org.apache.fop.apps.*;
import org.apache.fop.configuration.ConfigurationException;
import org.apache.fop.configuration.DefaultConfigurationBuilder;
import org.apache.xmlgraphics.util.MimeConstants;
import org.xml.sax.SAXException;
import upwork.portolio.pojo.Customer;

@Slf4j
public class PdfUtil {
  public static final String RESOURCES_DIR;
  public static final String OUTPUT_DIR;

  static {
    RESOURCES_DIR = "src//main//resources//";
    OUTPUT_DIR = "src//main//resources//output//";
  }

  public static void main(String[] args) throws IOException, SAXException, ConfigurationException {
    XmlMapper mapper = new XmlMapper();

    mapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
    mapper.enable(INDENT_OUTPUT);
    var value = mapper.writeValueAsString(Customer.DEFAULT_CUSTOMER);
    log.info(value);
    convertToPdf();
  }

  private static void convertToPdf() throws IOException, SAXException, ConfigurationException {
    // the XSL FO file
    File xsltFile = new File("src/main/resources/template.xsl");
    // the XML file which provides the input
    StreamSource xmlSource = new StreamSource(new File("src/main/resources/data.xml"));
    // create an instance of fop factory

    URI configURI = new File("src/main/resources/fop.xml").toURI();
    FopFactoryBuilder builder = new FopFactoryBuilder(configURI);
    builder.setConfiguration(
        new DefaultConfigurationBuilder().build(configURI.toURL().openStream()));
    FopFactory fopFactory = builder.build();
    // a user agent is needed for transformation

    FOUserAgent foUserAgent = fopFactory.newFOUserAgent();
    // Setup output
    OutputStream out;
    out = new java.io.FileOutputStream("src/main/resources/output.pdf");

    try {
      // Construct fop with desired output format

      Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, foUserAgent, out);

      // Setup XSLT
      TransformerFactory factory = TransformerFactory.newInstance();
      Transformer transformer = factory.newTransformer(new StreamSource(xsltFile));

      // Resulting SAX events (the generated FO) must be piped through to
      // FOP
      Result res = new SAXResult(fop.getDefaultHandler());

      // Start XSLT transformation and FOP processing
      // That's where the XML is first transformed to XSL-FO and then
      // PDF is created
      transformer.transform(xmlSource, res);
    } catch (FOPException | TransformerException e) {
      log.error(e.getMessage());
      e.printStackTrace();
    } finally {
      out.close();
    }
  }
}
