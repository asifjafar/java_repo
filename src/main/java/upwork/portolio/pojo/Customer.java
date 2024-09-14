package upwork.portolio.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.Date;
import java.util.List;
import lombok.*;

@Getter
@Setter
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

  public static Customer DEFAULT_CUSTOMER =
      Customer.builder()
          .customerId(012345)
          .customerName("Rahul Kumar Jain")
          .phoneNumber(9876543210L)
          .items(List.of(Item.DEFAULT_ITEM))
          .customerAddress("EJ123, Block 91A, Bangalore-678807")
          .orderId("A1234DF34")
          .invoiceDate(new Date(System.currentTimeMillis()).toString())
          .currency("Rupees")
          .build();
}
