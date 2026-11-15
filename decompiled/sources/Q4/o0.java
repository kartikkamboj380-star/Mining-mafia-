package Q4;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class o0 extends LinkedHashMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ r0 f4966a;

    o0(r0 r0Var) {
        Objects.requireNonNull(r0Var);
        this.f4966a = r0Var;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        r0 r0Var = this.f4966a;
        synchronized (r0Var) {
            try {
                if (size() <= r0Var.g()) {
                    return false;
                }
                r0Var.h().add(new Pair((String) entry.getKey(), ((p0) entry.getValue()).f4969b));
                return size() > r0Var.g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
