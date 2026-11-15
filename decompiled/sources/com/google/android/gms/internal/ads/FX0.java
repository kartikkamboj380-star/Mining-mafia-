package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class FX0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5637wZ0 f18782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList f18783c;

    private FX0(CopyOnWriteArrayList copyOnWriteArrayList, int i10, C5637wZ0 c5637wZ0) {
        this.f18783c = copyOnWriteArrayList;
        this.f18781a = 0;
        this.f18782b = c5637wZ0;
    }

    public final FX0 a(int i10, C5637wZ0 c5637wZ0) {
        return new FX0(this.f18783c, 0, c5637wZ0);
    }

    public final void b(Handler handler, GX0 gx0) {
        this.f18783c.add(new EX0(handler, gx0));
    }

    public final void c(GX0 gx0) {
        CopyOnWriteArrayList<EX0> copyOnWriteArrayList = this.f18783c;
        for (EX0 ex0 : copyOnWriteArrayList) {
            if (ex0.f18517a == gx0) {
                copyOnWriteArrayList.remove(ex0);
            }
        }
    }

    public FX0() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
