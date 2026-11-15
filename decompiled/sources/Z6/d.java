package Z6;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile d f7166b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f7167a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar;
        d dVar2 = f7166b;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (d.class) {
            try {
                dVar = f7166b;
                if (dVar == null) {
                    dVar = new d();
                    f7166b = dVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    Set b() {
        Set setUnmodifiableSet;
        synchronized (this.f7167a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f7167a);
        }
        return setUnmodifiableSet;
    }
}
