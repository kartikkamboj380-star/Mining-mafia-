package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Eg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1667Eg0 extends C1823Hg0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C1667Eg0 f18541d = new C1667Eg0();

    private C1667Eg0() {
    }

    public static C1667Eg0 i() {
        return f18541d;
    }

    @Override // com.google.android.gms.internal.ads.C1823Hg0
    public final boolean b() {
        Iterator it = C1719Fg0.a().f().iterator();
        while (it.hasNext()) {
            View viewI = ((C4266lg0) it.next()).i();
            if (viewI != null && viewI.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.C1823Hg0
    public final void c(boolean z9) {
        Iterator it = C1719Fg0.a().e().iterator();
        while (it.hasNext()) {
            ((C4266lg0) it.next()).g().f(z9);
        }
    }
}
