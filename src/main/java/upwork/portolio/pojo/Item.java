package upwork.portolio.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JacksonXmlRootElement(localName = "item")
public class Item {
  private double price;
  private String itemName;
  private String description;

  public static final Item DEFAULT_ITEM =
      Item.builder().itemName("Camera").description("DSLR Camera").price(1023.44).build();
}
