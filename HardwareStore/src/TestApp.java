import com.hardwareStore.Invoice;

public class TestApp {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.setItems(4);
        invoice.setPrice_item(12.56);
        System.out.println(invoice.getInvoiceAmount());

    }
}
