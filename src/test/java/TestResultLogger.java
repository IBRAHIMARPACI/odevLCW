import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

public class TestResultLogger implements TestWatcher {
Log log= new Log();

    @Override
    public void testSuccessful(ExtensionContext context) {
        String testAdi=context.getDisplayName();
        log.info("basarli test ="+testAdi);
    }



    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        String testAdi=context.getDisplayName();
        log.error("basarisiz test ="+testAdi);
    }

}