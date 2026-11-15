package K0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f2510a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f2511b = new LinkedHashMap();

    public final boolean a(S0.m id) {
        boolean zContainsKey;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.f2510a) {
            zContainsKey = this.f2511b.containsKey(id);
        }
        return zContainsKey;
    }

    public final v b(S0.m id) {
        v vVar;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.f2510a) {
            vVar = (v) this.f2511b.remove(id);
        }
        return vVar;
    }

    public final List c(String workSpecId) {
        List listW0;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.f2510a) {
            try {
                Map map = this.f2511b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (Intrinsics.b(((S0.m) entry.getKey()).b(), workSpecId)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap.keySet().iterator();
                while (it.hasNext()) {
                    this.f2511b.remove((S0.m) it.next());
                }
                listW0 = CollectionsKt.w0(linkedHashMap.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return listW0;
    }

    public final v d(S0.m id) {
        v vVar;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.f2510a) {
            try {
                Map map = this.f2511b;
                Object vVar2 = map.get(id);
                if (vVar2 == null) {
                    vVar2 = new v(id);
                    map.put(id, vVar2);
                }
                vVar = (v) vVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVar;
    }

    public final v e(S0.u spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        return d(S0.x.a(spec));
    }
}
