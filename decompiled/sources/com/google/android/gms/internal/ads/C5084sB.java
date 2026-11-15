package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5084sB implements InterfaceC2091Ml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5210tB f33115a;

    C5084sB(C5210tB c5210tB) {
        Objects.requireNonNull(c5210tB);
        this.f33115a = c5210tB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2091Ml
    public final void a(Object obj, Map map) {
        C5210tB c5210tB = this.f33115a;
        if (c5210tB.e(map)) {
            c5210tB.f().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.rB
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f32849a.f33115a.g().g();
                }
            });
        }
    }
}
