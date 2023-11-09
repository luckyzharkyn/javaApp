package collection;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListMethods5 {
    private final static String XML_TEMPLATE = "<S:Envelope xmlns:env=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:S=\"http://schemas.xmlsoap.org/soap/envelope/\"><env:Header/><S:Body><ns1:SendMessage xmlns:ns1=\"http://bip.bee.kz/SyncChannel/v10/Types\"><request><requestInfo><messageId>f4e099ea-cbf7-4034-a5d0-0454816160ec</messageId><serviceId>EKyzmetUniversalService</serviceId><messageDate>2023-07-20</messageDate><sender><senderId>MGS_AP</senderId><password>mgs</password></sender></requestInfo><requestData><data><Request serviceName=\"PMKR_decisionInvitation\"><param><key>iin</key><values><value>910312400290</value></values></param><param><key>docUID</key><values><value>1014162.51511989</value></values></param><param><key>decision</key><values><value>1</value></values></param></Request></data></requestData></request></ns1:SendMessage></S:Body></S:Envelope>";

    public static void main(String[] args) throws Exception {
        String modifiedXml = modifyXmlData(XML_TEMPLATE, "новая дата", "новый messageId", "новый iin", "новый docUID", "новый decision");
        System.out.println("Измененный XML:");
        System.out.println(modifiedXml);
    }

    public static String modifyXmlData(String xmlInput, String newMessageDate, String newMessageId, String newIINValue, String newDocUIDValue, String newDecisionValue) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new InputSource(new StringReader(xmlInput)));

        // Изменение messageDate
        NodeList messageDateList = document.getElementsByTagName("messageDate");
        if (messageDateList.getLength() > 0) {
            Element messageDateElement = (Element) messageDateList.item(0);
            messageDateElement.setTextContent(newMessageDate);
        }

        // Изменение messageId
        NodeList messageIdList = document.getElementsByTagName("messageId");
        if (messageIdList.getLength() > 0) {
            Element messageIdElement = (Element) messageIdList.item(0);
            messageIdElement.setTextContent(newMessageId);
        }

        // Изменение значений внутри <param> с ключом "iin", "docUID" и "decision"
        NodeList paramList = document.getElementsByTagName("param");
        for (int i = 0; i < paramList.getLength(); i++) {
            Element paramElement = (Element) paramList.item(i);
            Element keyElement = (Element) paramElement.getElementsByTagName("key").item(0);
            String keyValue = keyElement.getTextContent();

            Element valuesElement = (Element) paramElement.getElementsByTagName("values").item(0);
            Element valueElement = (Element) valuesElement.getElementsByTagName("value").item(0);

            if (keyValue.equals("iin")) {
                valueElement.setTextContent(newIINValue);
            } else if (keyValue.equals("docUID")) {
                valueElement.setTextContent(newDocUIDValue);
            } else if (keyValue.equals("decision")) {
                valueElement.setTextContent(newDecisionValue);
            }
        }

        // Преобразование Document в строку
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(document);
        StringWriter writer = new StringWriter();
        transformer.transform(source, new StreamResult(writer));
        return writer.toString();
    }

}