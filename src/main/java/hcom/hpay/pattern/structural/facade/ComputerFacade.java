package hcom.hpay.pattern.structural.facade;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class ComputerFacade {

    private static final int BOOT_ADDRESS = 0;
    private static final long BOOT_SECTOR = 0;
    private static final long SECTOR_SIZE = 0;

    private final CPU processor;
    private final Memory ram;
    private final HardDrive hd;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }

}
