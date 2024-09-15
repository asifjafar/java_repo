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
  private String quantity;

  public static final Item DEFAULT_ITEM_1 =
      Item.builder()
          .itemName("Rice")
          .description("Basmati Rice")
          .price(1023.44)
          .quantity("10 Kg")
          .build();

  public static final Item DEFAULT_ITEM_2 =
      Item.builder()
          .itemName("LED Bulb")
          .description("30W Led Bulb")
          .price(768.99)
          .quantity("2 pc")
          .build();
}
