package Study.jvm_deep_dive;

public class FinalizeEscapeGc {
    public static FinalizeEscapeGc Save_hook = null;

    public void isAlive() {
        System.out.println("Yes, I'm still alive :)");
    }

        @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method executed!");
        FinalizeEscapeGc.Save_hook = this;
    }

    public static void main(String[] args) {
        Save_hook = new FinalizeEscapeGc();
        Save_hook = null;
        System.gc();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (Save_hook != null) {
            Save_hook.isAlive();
        } else {
            System.out.println("No, I'm dead :(");
        }
        Save_hook = null;
        System.gc();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (Save_hook != null) {
            Save_hook.isAlive();
        } else {
            System.out.println("No, I'm dead :(");
        }
    }
}
