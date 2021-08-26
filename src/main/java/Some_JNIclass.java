public class Some_JNIclass {

    public Some_JNIclass() {
        System.loadLibrary("nativelib");
    }

    static {
        System.loadLibrary("nativelib");
    }

    public void invalidCallsInMethod() throws SecurityException, NoSuchMethodException {
        System.loadLibrary("nativelib");
    }
}