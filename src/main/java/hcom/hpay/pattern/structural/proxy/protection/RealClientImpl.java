package hcom.hpay.pattern.structural.proxy.protection;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class RealClientImpl implements Client {
    private String accountNo = "12345";

    @Override
    public String getAccountNO() {
        return accountNo;
    }
}
