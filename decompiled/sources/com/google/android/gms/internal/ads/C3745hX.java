package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3745hX implements InterfaceC2180Od0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TW f29010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final XW f29011b;

    C3745hX(TW tw, XW xw) {
        this.f29010a = tw;
        this.f29011b = xw;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2180Od0
    public final void K(EnumC1817Hd0 enumC1817Hd0, String str) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29822f7)).booleanValue()) {
            if (EnumC1817Hd0.RENDERER == enumC1817Hd0) {
                this.f29010a.g(G4.t.o().elapsedRealtime());
                return;
            }
            if (EnumC1817Hd0.PRELOADED_LOADER == enumC1817Hd0 || EnumC1817Hd0.SERVER_TRANSACTION == enumC1817Hd0) {
                TW tw = this.f29010a;
                tw.a(G4.t.o().elapsedRealtime());
                final XW xw = this.f29011b;
                final long jB = tw.b();
                xw.f27795b.a(new InterfaceC4386md0() { // from class: com.google.android.gms.internal.ads.WW
                    @Override // com.google.android.gms.internal.ads.InterfaceC4386md0
                    public final /* synthetic */ Object zza(Object obj) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (xw.a()) {
                            return null;
                        }
                        long j10 = jB;
                        C5020rg c5020rgI0 = C4895qg.I0();
                        c5020rgI0.G(j10);
                        byte[] bArrI = ((C4895qg) c5020rgI0.w()).i();
                        AbstractC3619gX.f(sQLiteDatabase, false, false);
                        AbstractC3619gX.e(sQLiteDatabase, j10, bArrI);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2180Od0
    public final void N(EnumC1817Hd0 enumC1817Hd0, String str) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29822f7)).booleanValue() && EnumC1817Hd0.RENDERER == enumC1817Hd0) {
            TW tw = this.f29010a;
            if (tw.h() != 0) {
                tw.i(G4.t.o().elapsedRealtime() - tw.h());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2180Od0
    public final void j(EnumC1817Hd0 enumC1817Hd0, String str, Throwable th) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29822f7)).booleanValue() && EnumC1817Hd0.RENDERER == enumC1817Hd0) {
            TW tw = this.f29010a;
            if (tw.h() != 0) {
                tw.i(G4.t.o().elapsedRealtime() - tw.h());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2180Od0
    public final void u(EnumC1817Hd0 enumC1817Hd0, String str) {
    }
}
