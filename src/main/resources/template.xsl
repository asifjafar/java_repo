<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" version="1.0">
    <xsl:output encoding="UTF-8" indent="yes" method="xml" standalone="no" omit-xml-declaration="no"/>

    <!-- Template to match the root element -->
    <xsl:template match="Customer">
        <fo:root language="EN">
            <fo:layout-master-set>
                <fo:simple-page-master master-name="A4-portrait" page-height="297mm" page-width="210mm" margin-top="5mm" margin-bottom="5mm" margin-left="5mm" margin-right="5mm">
                    <fo:region-body margin-top="25mm" margin-bottom="20mm"/>
                    <fo:region-before region-name="xsl-region-before" extent="25mm" display-align="before" precedence="true"/>
                </fo:simple-page-master>
            </fo:layout-master-set>

            <fo:page-sequence master-reference="A4-portrait">
                <!-- Static content for header -->
                <fo:static-content flow-name="xsl-region-before">
                    <fo:block display-align="after" text-align="right" space-before="6mm">
                        Page <fo:page-number/> of <fo:page-number-citation ref-id="end-of-document"/>
                    </fo:block>
                    <fo:block font-size="12pt" font-weight="bold">INVOICE REPORT</fo:block>
                    <fo:table table-layout="fixed" width="100%" font-size="10pt" border-color="black" border-width="0.4mm" border-style="solid">
                        <fo:table-column column-width="proportional-column-width(33)"/>
                        <fo:table-column column-width="proportional-column-width(34)"/>
                        <fo:table-column column-width="proportional-column-width(33)"/>
                        <fo:table-body>
                            <fo:table-row>
                                <fo:table-cell text-align="left" display-align="center" padding-left="2mm">
                                    <fo:block>
                                        Customer Id: <xsl:value-of select="customerId"/>
                                    </fo:block>
                                    <fo:block>
                                        Order Id: <xsl:value-of select="orderId"/>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell text-align="center" display-align="center" border-top="3pt" padding="2mm">
                                    <fo:block text-align="center" font-size="150%">
                                        <fo:basic-link external-destination="https://www.dmart.in/category/dmart-grocery-aesc-grocerycore2">DMART | Navi Mumbai</fo:basic-link>
                                    </fo:block>
                                    <fo:block space-before="3mm"/>
                                </fo:table-cell>
                                <fo:table-cell text-align="right" display-align="center" padding-right="2mm">
                                    <fo:block>
                                        Date: <xsl:value-of select="invoiceDate"/>
                                    </fo:block>
                                </fo:table-cell>
                            </fo:table-row>
                        </fo:table-body>
                    </fo:table>
                </fo:static-content>

                <!-- Flow for main content -->
                <fo:flow flow-name="xsl-region-body" border-collapse="collapse" reference-orientation="0">
                    <!-- Customer Information Table -->
                    <fo:table table-layout="fixed" width="100%" font-size="10pt" border-color="black" border-width="0.35mm" border-style="solid" text-align="left" display-align="center" space-after="5mm">
                        <fo:table-column column-width="proportional-column-width(30)"/>
                        <fo:table-column column-width="proportional-column-width(70)"/>
                        <fo:table-body font-size="95%">
                            <fo:table-row >
                                <fo:table-cell>
                                    <fo:block text-align="left">Customer Name: </fo:block>
                                </fo:table-cell>
                                <fo:table-cell>
                                    <fo:block text-align="left">
                                        <xsl:value-of select="customerName"/>
                                    </fo:block>
                                </fo:table-cell>
                            </fo:table-row>
                            <fo:table-row >
                                <fo:table-cell>
                                    <fo:block text-align="left">Phone Number:</fo:block>
                                </fo:table-cell>
                                <fo:table-cell>
                                    <fo:block text-align="left">
                                        <xsl:value-of select="phoneNumber"/>
                                    </fo:block>
                                </fo:table-cell>
                            </fo:table-row>
                            <fo:table-row >
                                <fo:table-cell>
                                    <fo:block text-align="left">Address:</fo:block>
                                </fo:table-cell>
                                <fo:table-cell>
                                    <fo:block text-align="left">
                                        <xsl:value-of select="customerAddress"/>
                                    </fo:block>
                                </fo:table-cell>
                            </fo:table-row>
                        </fo:table-body>
                    </fo:table>


                    <!-- Items Table -->
                    <fo:table table-layout="fixed" width="100%" font-size="10pt" border-color="black" border-width="0.35mm" border-style="solid" text-align="center" display-align="center" space-after="5mm">
                        <fo:table-column column-width="proportional-column-width(10)"/>
                        <fo:table-column column-width="proportional-column-width(20)"/>
                        <fo:table-column column-width="proportional-column-width(35)"/>
                        <fo:table-column column-width="proportional-column-width(15)"/>
                        <fo:table-column column-width="proportional-column-width(10)"/>
                        <fo:table-body font-size="95%">
                            <fo:table-row height="8mm">
                                <fo:table-cell>
                                    <fo:block>Serial No.</fo:block>
                                </fo:table-cell>
                                <fo:table-cell>
                                    <fo:block>Item Name</fo:block>
                                </fo:table-cell>
                                <fo:table-cell>
                                    <fo:block>Description</fo:block>
                                </fo:table-cell>
                                <fo:table-cell>
                                    <fo:block>Quantity</fo:block>
                                </fo:table-cell>
                                <fo:table-cell>
                                    <fo:block>Price</fo:block>
                                </fo:table-cell>
                            </fo:table-row>
                            <xsl:for-each select="items/item">
                                <fo:table-row>
                                    <fo:table-cell>
                                        <fo:block>
                                            <xsl:value-of select="serialNumber"/>
                                        </fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell>
                                        <fo:block>
                                            <xsl:value-of select="itemName"/>
                                        </fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell>
                                        <fo:block>
                                            <xsl:value-of select="description"/>
                                        </fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell>
                                        <fo:block><xsl:value-of select="quantity"/></fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell>
                                        <fo:block font-family="NotoSans" font-size="12pt">
                                            ₹<xsl:value-of select="price"/>
                                        </fo:block>
                                    </fo:table-cell>
                                </fo:table-row>
                            </xsl:for-each>
                            <!-- Horizontal Line Row -->
                            <fo:table-row>
                                <fo:table-cell border-top="1pt solid black" border-bottom="none">
                                    <fo:block/>
                                </fo:table-cell>
                                <fo:table-cell border-top="1pt solid black" border-bottom="none">
                                    <fo:block/>
                                </fo:table-cell>
                                <fo:table-cell border-top="1pt solid black" border-bottom="none">
                                    <fo:block/>
                                </fo:table-cell>
                                <fo:table-cell border-top="1pt solid black" border-bottom="none">
                                    <fo:block/>
                                </fo:table-cell>
                                <fo:table-cell border-top="1pt solid black" border-bottom="none">
                                    <fo:block/>
                                </fo:table-cell>
                            </fo:table-row>
                            <!-- Total Row -->
                            <fo:table-row>
                                <fo:table-cell>
                                    <fo:block> </fo:block>
                                </fo:table-cell>
                                <fo:table-cell>
                                    <fo:block> </fo:block>
                                </fo:table-cell>
                                <fo:table-cell>
                                    <fo:block> </fo:block>
                                </fo:table-cell>
                                <fo:table-cell>
                                    <fo:block font-weight="bold" font-size="12pt" text-align="right">
                                        Total:
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell>
                                    <fo:block font-family="NotoSans" font-weight="bold" font-size="12pt">
                                        ₹<xsl:value-of select="total"/>
                                    </fo:block>
                                </fo:table-cell>
                            </fo:table-row>
                        </fo:table-body>
                    </fo:table>
                </fo:flow>
            </fo:page-sequence>
        </fo:root>
    </xsl:template>
</xsl:stylesheet>
