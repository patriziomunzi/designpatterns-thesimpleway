package hcom.hpay.pattern.structural.proxy.protection;

import java.util.Scanner;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class ProtectedClientImpl implements Client {
    private String password;  //password to get secret
    private Client client;
    private Scanner scanner = new Scanner(System.in);

    public ProtectedClientImpl(String pwd) {
        password = pwd;
        client = new RealClientImpl();
    }

    @Override
    public String getAccountNO() {
        String tmpPwd = scanner.nextLine();

        if (password == null || password.equals(tmpPwd)) {
            return client.getAccountNO();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
