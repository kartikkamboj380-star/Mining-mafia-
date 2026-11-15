package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import p176r5.AbstractC7096m;
import p176r5.InterfaceC7093j;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6709x implements InterfaceC6689c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J f39893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P f39894b;

    C6709x(J j10, P p10) {
        this.f39893a = j10;
        this.f39894b = p10;
    }

    @Override // com.google.android.play.core.integrity.InterfaceC6689c
    public final Task a(final InterfaceC6689c.a aVar) {
        long jB = aVar.b();
        aVar.a();
        return this.f39893a.d(jB, 0).p(new InterfaceC7093j() { // from class: com.google.android.play.core.integrity.w
            @Override // p176r5.InterfaceC7093j
            public final Task then(Object obj) {
                return this.f39891a.b(aVar, (Long) obj);
            }
        });
    }

    final /* synthetic */ Task b(InterfaceC6689c.a aVar, Long l10) {
        final long jB = aVar.b();
        final long jLongValue = l10.longValue();
        aVar.a();
        final P p10 = this.f39894b;
        final int i10 = 0;
        return AbstractC7096m.f(new InterfaceC6689c.InterfaceC0366c(jB, jLongValue, i10) { // from class: com.google.android.play.core.integrity.O

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f39822b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f39823c;

            @Override // com.google.android.play.core.integrity.InterfaceC6689c.InterfaceC0366c
            public final Task a(InterfaceC6689c.d dVar) {
                return this.f39821a.a(this.f39822b, this.f39823c, 0, dVar);
            }
        });
    }
}
