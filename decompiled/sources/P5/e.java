package P5;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    public static Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
