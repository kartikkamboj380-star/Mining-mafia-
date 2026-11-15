package androidx.work;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f11404a = q.i("InputMerger");

    public static k a(String str) {
        try {
            return (k) Class.forName(str).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception e10) {
            q.e().d(f11404a, "Trouble instantiating + " + str, e10);
            return null;
        }
    }

    public abstract e b(List list);
}
