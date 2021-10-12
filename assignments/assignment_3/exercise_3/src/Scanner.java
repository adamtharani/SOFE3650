public class Scanner {
    public int scannedUPCCode(int UPCCode) {
        if (UPCCode >= 1003 || UPCCode < 1000) {
            return 0;
        }
        else {
            return UPCCode;
        }
    }
}
