package V2;

import android.os.Trace;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b.c {
    @Override // V2.b.c
    public void a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (isTracing()) {
            Trace.beginSection(name);
        }
    }

    @Override // V2.b.c
    public void b() {
        if (isTracing()) {
            Trace.endSection();
        }
    }

    @Override // V2.b.c
    public boolean isTracing() {
        return false;
    }
}
