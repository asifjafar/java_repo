package upwork.portolio.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import upwork.portolio.constants.Units;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JacksonXmlRootElement(localName = "item")
public class Item {
  private double price;
  private String description;
  private int quantity;
  private int serialNumber;
  private String unitPrice;

  public static final Item DEFAULT_ITEM_1 =
          Item.builder()
                  .serialNumber(1)
                  .description("Basmati Rice")
                  .price(1023.44)
                  .quantity(10)
                  . unitPrice(Units.KILOGRAM)
                  .build();

  public static final Item DEFAULT_ITEM_2 =
          Item.builder()
                  .serialNumber(2)
                  .description("30W Led Bulb")
                  .price(768.99)
                  .quantity(2)
                  . unitPrice(Units.PIECE)
                  .build();

  public static final Item DEFAULT_ITEM_3 =
          Item.builder()
                  .serialNumber(3)
                  .description("10W LED Table Lamp")
                  .price(1499.50)
                  .quantity(1). unitPrice(Units.PIECE)
                  .build();

  public static final Item DEFAULT_ITEM_4 =
          Item.builder()
                  .serialNumber(4)
                  .description("42-inch Ceiling Fan with Remote")
                  .price(3250.75)
                  .quantity(1). unitPrice(Units.PIECE)
                  .build();

  public static final Item DEFAULT_ITEM_5 =
          Item.builder()
                  .serialNumber(5)
                  .description("1.5 Ton Split AC")
                  .price(45000.00)
                  .quantity(1). unitPrice(Units.PIECE)
                  .build();

  public static final Item DEFAULT_ITEM_6 =
          Item.builder()
                  .serialNumber(6)
                  .description("350L Double Door Refrigerator")
                  .price(28999.99)
                  .quantity(1). unitPrice(Units.PIECE)
                  .build();

  public static final Item DEFAULT_ITEM_7 =
          Item.builder()
                  .serialNumber(7)
                  .description("1000W Convection Microwave Oven")
                  .price(9999.00)
                  .quantity(1)
                  . unitPrice(Units.PIECE)
                  .build();

  public static List<Item> ALL_ITEMS = List.of(DEFAULT_ITEM_1, DEFAULT_ITEM_2, DEFAULT_ITEM_3, DEFAULT_ITEM_4
          , DEFAULT_ITEM_5, DEFAULT_ITEM_6, DEFAULT_ITEM_7);


}
