import java.util.logging.Logger;
import java.lang.String;
import java.lang.*;

public final class Main {
    protected static String headline = "This is main class";
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        honda honda = new honda(3, 100, 25);
        Delux$ delux$ = new Delux$(4, 120, 25);
        LOGGER.info(honda.toString());
        LOGGER.info(delux$.toString());

        mercedes mercedes = new mercedes(5, 200, 45);
        BMW bmw = new BMW(4, 180, 50);
        LOGGER.info(mercedes.toString());
        LOGGER.info(bmw.toString());

        Category category= new Category();
        category.setCategory("FourWheeler",1);
        boolean isSame = category.bar(5,5);
        while (isSame)
            LOGGER.info(String.valueOf(isSame));

        Some_JNIclass some_jnIclass=new Some_JNIclass();
    }

    protected void whichClass(){
        LOGGER.info(headline);
    }
}
