package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class P7 extends AbstractC6235j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f36463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f36464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Q7 f36465e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P7(Q7 q10, boolean z9, boolean z10) {
        super("log");
        Objects.requireNonNull(q10);
        this.f36465e = q10;
        this.f36463c = z9;
        this.f36464d = z10;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0080  */
    /* JADX WARN: Code duplicated, block: B:25:0x008f A[LOOP:0: B:23:0x0085->B:25:0x008f, LOOP_END] */
    @Override // com.google.android.gms.internal.measurement.AbstractC6235j
    public final InterfaceC6289p c(C6157a2 c6157a2, List list) {
        int i10;
        int i11;
        String strZzc;
        ArrayList arrayList;
        B2.b("log", 1, list);
        if (list.size() == 1) {
            Q7 q10 = this.f36465e;
            q10.h().a(3, c6157a2.a((InterfaceC6289p) list.get(0)).zzc(), Collections.EMPTY_LIST, this.f36463c, this.f36464d);
            return InterfaceC6289p.f36808x;
        }
        int iG = B2.g(c6157a2.a((InterfaceC6289p) list.get(0)).zzd().doubleValue());
        if (iG != 2) {
            i10 = 3;
            if (iG == 3) {
                i11 = 1;
            } else if (iG == 5) {
                i11 = 5;
            } else if (iG == 6) {
                i11 = 2;
            }
            strZzc = c6157a2.a((InterfaceC6289p) list.get(1)).zzc();
            if (list.size() == 2) {
                Q7 q11 = this.f36465e;
                q11.h().a(i11, strZzc, Collections.EMPTY_LIST, this.f36463c, this.f36464d);
                return InterfaceC6289p.f36808x;
            }
            arrayList = new ArrayList();
            for (int i12 = 2; i12 < Math.min(list.size(), 5); i12++) {
                arrayList.add(c6157a2.a((InterfaceC6289p) list.get(i12)).zzc());
            }
            this.f36465e.h().a(i11, strZzc, arrayList, this.f36463c, this.f36464d);
            return InterfaceC6289p.f36808x;
        }
        i10 = 4;
        i11 = i10;
        strZzc = c6157a2.a((InterfaceC6289p) list.get(1)).zzc();
        if (list.size() == 2) {
            Q7 q12 = this.f36465e;
            q12.h().a(i11, strZzc, Collections.EMPTY_LIST, this.f36463c, this.f36464d);
            return InterfaceC6289p.f36808x;
        }
        arrayList = new ArrayList();
        while (i12 < Math.min(list.size(), 5)) {
            arrayList.add(c6157a2.a((InterfaceC6289p) list.get(i12)).zzc());
        }
        this.f36465e.h().a(i11, strZzc, arrayList, this.f36463c, this.f36464d);
        return InterfaceC6289p.f36808x;
    }
}
