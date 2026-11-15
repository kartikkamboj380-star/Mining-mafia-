package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f10201a = new LinkedHashMap();

    public final void a() {
        Iterator it = this.f10201a.values().iterator();
        while (it.hasNext()) {
            ((T) it.next()).b();
        }
        this.f10201a.clear();
    }

    public final T b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) this.f10201a.get(key);
    }

    public final Set c() {
        return new HashSet(this.f10201a.keySet());
    }

    public final void d(String key, T viewModel) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        T t10 = (T) this.f10201a.put(key, viewModel);
        if (t10 != null) {
            t10.b();
        }
    }
}
