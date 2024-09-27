package upwork.portolio.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JacksonXmlRootElement(localName = "Customer")
public class Customer {
  private int customerId;
  private String customerName;
  private long phoneNumber;
  private String customerAddress;
  private String orderId;

  @JacksonXmlElementWrapper(localName = "items")
  @JacksonXmlProperty(localName = "item")
  private List<Item> items;

  private String invoiceDate;
  private String currency;
  private double total;

  public static Customer DEFAULT_CUSTOMER =
      Customer.builder()
          .customerId(012345)
          .customerName("John D.")
          .phoneNumber(9876543210L)
          .items(Item.ALL_ITEMS)
          .customerAddress("EJ123, Block 91A, Mumbai-678807")
          .orderId("A12341111")
          .invoiceDate(Customer.getDate())
          .total(Item.ALL_ITEMS.stream().mapToDouble(Item::getPrice).sum())
          .currency("₹")
          .build();

  public static String getDate() {
    // Current system time in milliseconds
    long millis = System.currentTimeMillis();

    // Convert milliseconds to ZonedDateTime
    ZonedDateTime dateTime = Instant.ofEpochMilli(millis).atZone(ZoneId.systemDefault());

    // Format date and time
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    return dateTime.format(formatter);
  }
}
