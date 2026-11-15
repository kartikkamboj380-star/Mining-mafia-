package V5;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n {
    public static void a(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
