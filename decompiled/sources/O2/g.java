package O2;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends a {
    protected void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        Z1.a.K("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
