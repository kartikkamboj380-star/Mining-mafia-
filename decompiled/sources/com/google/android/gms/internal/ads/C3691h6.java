package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.h6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3691h6 implements InterfaceC5828y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P10 f28843a = new P10();

    @Override // com.google.android.gms.internal.ads.InterfaceC5828y5
    public final void a(byte[] bArr, int i10, int i11, C5702x5 c5702x5, InterfaceC3977jO interfaceC3977jO) {
        KD kdR;
        P10 p10 = this.f28843a;
        p10.A(bArr, i11 + i10);
        p10.G(i10);
        ArrayList arrayList = new ArrayList();
        while (p10.C() > 0) {
            AbstractC2418Ss0.b(p10.C() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iB = p10.b() - 8;
            if (p10.b() == 1987343459) {
                CharSequence charSequenceC = null;
                C3955jD c3955jDB = null;
                while (iB > 0) {
                    AbstractC2418Ss0.b(iB >= 8, "Incomplete vtt cue box header found.");
                    int iB2 = p10.b();
                    int iB3 = p10.b();
                    int i12 = iB - 8;
                    int i13 = iB2 - 8;
                    String strF = AbstractC4634ob0.F(p10.H(), p10.F(), i13);
                    p10.J(i13);
                    if (iB3 == 1937011815) {
                        c3955jDB = AbstractC4823q6.b(strF);
                    } else if (iB3 == 1885436268) {
                        charSequenceC = AbstractC4823q6.c(null, strF.trim(), Collections.EMPTY_LIST);
                    }
                    iB = i12 - i13;
                }
                if (charSequenceC == null) {
                    charSequenceC = "";
                }
                if (c3955jDB != null) {
                    c3955jDB.a(charSequenceC);
                    kdR = c3955jDB.r();
                } else {
                    Pattern pattern = AbstractC4823q6.f32566a;
                    C4697p6 c4697p6 = new C4697p6();
                    c4697p6.f32292c = charSequenceC;
                    kdR = c4697p6.a().r();
                }
                arrayList.add(kdR);
            } else {
                p10.J(iB);
            }
        }
        interfaceC3977jO.zza(new C4695p5(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
