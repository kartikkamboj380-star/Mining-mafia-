package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4948r6 implements InterfaceC5828y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P10 f32783a = new P10();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3817i6 f32784b = new C3817i6();

    @Override // com.google.android.gms.internal.ads.InterfaceC5828y5
    public final void a(byte[] bArr, int i10, int i11, C5702x5 c5702x5, InterfaceC3977jO interfaceC3977jO) {
        P10 p10 = this.f32783a;
        p10.A(bArr, i11 + i10);
        p10.G(i10);
        ArrayList arrayList = new ArrayList();
        try {
            int iF = p10.F();
            Charset charset = StandardCharsets.UTF_8;
            String strN = p10.n(charset);
            if (strN == null || !strN.startsWith("WEBVTT")) {
                p10.G(iF);
                throw C2817a9.b("Expected WEBVTT. Got ".concat(String.valueOf(p10.n(charset))), null);
            }
            while (!TextUtils.isEmpty(p10.n(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                byte b10 = -1;
                int iF2 = 0;
                while (b10 == -1) {
                    iF2 = p10.F();
                    String strN2 = p10.n(StandardCharsets.UTF_8);
                    if (strN2 == null) {
                        b10 = 0;
                    } else if ("STYLE".equals(strN2)) {
                        b10 = 2;
                    } else {
                        b10 = strN2.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                    }
                }
                p10.G(iF2);
                if (b10 == 0) {
                    AbstractC4946r5.a(new C5452v6(arrayList2), c5702x5, interfaceC3977jO);
                    return;
                }
                if (b10 == 1) {
                    while (!TextUtils.isEmpty(p10.n(StandardCharsets.UTF_8))) {
                    }
                } else if (b10 != 2) {
                    C4067k6 c4067k6A = AbstractC4823q6.a(p10, arrayList);
                    if (c4067k6A != null) {
                        arrayList2.add(c4067k6A);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    p10.n(StandardCharsets.UTF_8);
                    arrayList.addAll(this.f32784b.a(p10));
                }
            }
        } catch (C2817a9 e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
