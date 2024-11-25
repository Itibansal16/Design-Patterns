import model.CustomXml;
import model.XmlType;
import service.DisplayService;
import service.DisplayServiceImpl;

public class Main {
    public static void main(String[] args) {

        DisplayService service = new DisplayServiceImpl();

        CustomXml orderXml = new CustomXml(XmlType.ORDER, "Order has been received");
        service.display(orderXml);

        System.out.println();

        CustomXml feedbackXml = new CustomXml(XmlType.FEEDBACK, "Got new feedback");
        service.display(feedbackXml);

        System.out.println();

        CustomXml errorXml = new CustomXml(XmlType.ERROR, "error has been occured");
        service.display(errorXml);

        System.out.println();

        CustomXml responseXml = new CustomXml(XmlType.RESPONSE, "response received");
        service.display(responseXml);
    }
}