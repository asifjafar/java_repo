<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" version="1.0">
    <xsl:output encoding="UTF-8" indent="yes" method="xml" standalone="no" omit-xml-declaration="no"/>

    <!-- Template to match the root element -->
    <xsl:template match="Customer">
        <fo:root language="EN">
            <fo:layout-master-set>
                <fo:simple-page-master master-name="A4-portrait" page-height="297mm" page-width="210mm" margin-top="5mm" margin-bottom="5mm" margin-left="5mm" margin-right="5mm">
                    <fo:region-body region-name="xsl-region-body" margin-top="20mm" margin-bottom="15mm"/>
                    <fo:region-before region-name="xsl-region-before" extent="10mm" display-align="before" precedence="true"/>
                </fo:simple-page-master>
            </fo:layout-master-set>

            <fo:page-sequence master-reference="A4-portrait">
                <!-- Static content for header -->
                <fo:static-content flow-name="xsl-region-before" font-family="NotoSans">
                    <fo:table>
                        <fo:table-body>
                            <fo:table-row>
                                <fo:table-cell text-align="right">
                                    <fo:block font-size="8pt">
                                        Page <fo:page-number/> of <fo:page-number-citation ref-id="end-of-document"/>
                                    </fo:block>
                                </fo:table-cell>
                            </fo:table-row>
                            <fo:table-row >
                                <fo:table-cell text-align="center">
                                    <fo:block >
                                        <!-- Adjusting the SVG size and viewBox for better alignment -->
                                        <fo:instream-foreign-object height="5mm">
                                            <svg viewBox="0 0 150 50" width="150" height="30" xmlns="http://www.w3.org/2000/svg">
                                                <style>
                                                    .dmart-logo { font-family: &apos;Arial&apos;, sans-serif; font-weight: bold; font-size: 40px; }
                                                    .dm { fill: #008CBA; } /* Blue for D- */
                                                    .art { fill: #333333; } /* Dark gray for Mart */
                                                </style>
                                                <text x="0" y="30" class="dmart-logo dm">D-</text>
                                                <text x="50" y="30" class="dmart-logo art">Mart</text>
                                            </svg>
                                        </fo:instream-foreign-object>
                                    </fo:block>
                                </fo:table-cell>
                            </fo:table-row>
                            <fo:table-row>
                                <fo:table-cell text-align="left">
                                    <fo:block font-size="8pt">
                                        Invoice No.: A123456
                                    </fo:block>
                                </fo:table-cell>
                            </fo:table-row>
                            <fo:table-row>
                                <fo:table-cell text-align="left">
                                    <fo:block font-size="8pt">
                                        Date: <xsl:value-of select="invoiceDate"/>
                                    </fo:block>
                                </fo:table-cell>
                            </fo:table-row>
                        </fo:table-body>
                    </fo:table>
                    <fo:table space-before="-3mm">
                        <fo:table-body>
                            <fo:table-row>
                                <fo:table-cell text-align="center">
                                    <fo:block>
                                        INVOICE REPORT
                                    </fo:block>
                                </fo:table-cell>
                            </fo:table-row>
                        </fo:table-body>
                    </fo:table>

                </fo:static-content>

                <!-- Flow for main content -->
                <fo:flow flow-name="xsl-region-body" border-collapse="collapse" reference-orientation="0" font-family="NotoSans">
                    <!-- Customer Information Table -->
                    <fo:table table-layout="fixed" width="100%" font-size="10pt" border-color="black" border-width="0.35mm" border-style="solid" text-align="left" display-align="center" space-after="4mm">
                        <fo:table-column column-width="proportional-column-width(20)"/>
                        <fo:table-column column-width="proportional-column-width(80)"/>
                        <fo:table-body>
                            <fo:table-row>
                                <fo:table-cell>
                                    <fo:block margin-left="2mm" text-align="left">Customer Id: </fo:block>
                                </fo:table-cell>
                                <fo:table-cell>
                                    <fo:block text-align="left">
                                        <xsl:value-of select="customerId"/>
                                    </fo:block>
                                </fo:table-cell>
                            </fo:table-row>
                            <fo:table-row>
                                <fo:table-cell>
                                    <fo:block margin-left="2mm" text-align="left">Customer Name: </fo:block>
                                </fo:table-cell>
                                <fo:table-cell>
                                    <fo:block text-align="left">
                                        <xsl:value-of select="customerName"/>
                                    </fo:block>
                                </fo:table-cell>
                            </fo:table-row>
                            <fo:table-row>
                                <fo:table-cell>
                                    <fo:block margin-left="2mm" text-align="left">Phone Number:</fo:block>
                                </fo:table-cell>
                                <fo:table-cell>
                                    <fo:block text-align="left">
                                        <xsl:value-of select="phoneNumber"/>
                                    </fo:block>
                                </fo:table-cell>
                            </fo:table-row>
                            <fo:table-row>
                                <fo:table-cell>
                                    <fo:block margin-left="2mm" text-align="left">Address:</fo:block>
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
                    <fo:table>
                        <fo:table-body font-size="95%">
                            <fo:table-row border="1px solid black">
                                <fo:table-cell text-align="center">
                                    <fo:block  font-size="15pt">
                                        Items
                                    </fo:block>
                                </fo:table-cell>
                            </fo:table-row>
                        </fo:table-body>
                    </fo:table>
                    <fo:table table-layout="fixed" width="100%" font-size="10pt" border-color="black" border-width="0.35mm" border-style="solid" text-align="center" display-align="center" space-after="5mm">
                        <fo:table-column column-width="proportional-column-width(10)"/> <!--serial no-->
                        <fo:table-column column-width="proportional-column-width(42)"/> <!--description-->
                        <fo:table-column column-width="proportional-column-width(8)"/> <!--quantity-->
                        <fo:table-column column-width="proportional-column-width(10)"/> <!--unit-->
                        <fo:table-column column-width="proportional-column-width(15)"/> <!--price-->
                        <fo:table-body font-size="95%">
                            <fo:table-row height="8mm">
                                <fo:table-cell>
                                    <fo:block>Serial No.</fo:block>
                                </fo:table-cell>
                                <fo:table-cell text-align="left">
                                    <fo:block>Description</fo:block>
                                </fo:table-cell>
                                <fo:table-cell text-align="left">
                                    <fo:block>Quantity</fo:block>
                                </fo:table-cell>
                                <fo:table-cell text-align="left">
                                    <fo:block>Price Per Unit</fo:block>
                                </fo:table-cell>
                                <fo:table-cell text-align="left">
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
                                    <fo:table-cell text-align="left">
                                        <fo:block>
                                            <xsl:value-of select="description"/>
                                        </fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell text-align="left">
                                        <fo:block><xsl:value-of select="quantity"/></fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell text-align="left">
                                        <fo:block>₹<xsl:value-of select="unitPrice"/></fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell text-align="left">
                                        <fo:block>
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
                                <fo:table-cell text-align="left">
                                    <fo:block font-weight="bold" font-size="10pt">
                                        Total:
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell text-align="left">
                                    <fo:block font-family="NotoSans" font-weight="bold" font-size="10pt">
                                        ₹<xsl:value-of select="total"/>
                                    </fo:block>
                                </fo:table-cell>
                            </fo:table-row>
                        </fo:table-body>
                    </fo:table>

                    <fo:block id="end-of-document" text-align="center" padding="0">
                    </fo:block>
                </fo:flow>
            </fo:page-sequence>
        </fo:root>
    </xsl:template>
</xsl:stylesheet>
