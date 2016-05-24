package hcom.hpay.pattern.structural.facade;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class YouWihoutFacade {
    private static final int BOOT_ADDRESS = 0;
    private static final long BOOT_SECTOR = 0;
    private static final long SECTOR_SIZE = 0;

    public static void main(String[] args) {
        CPU processor = new CPU();
        Memory ram = new Memory();
        HardDrive hd = new HardDrive();

        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
}
