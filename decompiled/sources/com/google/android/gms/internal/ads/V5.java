package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
final class V5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f24193d = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AbstractC1903Iu0 f24194e = AbstractC1903Iu0.m("auto", "none");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AbstractC1903Iu0 f24195f = AbstractC1903Iu0.o("dot", "sesame", "circle");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AbstractC1903Iu0 f24196g = AbstractC1903Iu0.m("filled", "open");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AbstractC1903Iu0 f24197h = AbstractC1903Iu0.o("after", "before", "outside");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24200c;

    private V5(int i10, int i11, int i12) {
        this.f24198a = i10;
        this.f24199b = i11;
        this.f24200c = i12;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    public static V5 a(String str) {
        byte b10;
        int i10;
        if (str == null) {
            return null;
        }
        String strA = AbstractC1483As0.a(str.trim());
        if (strA.isEmpty()) {
            return null;
        }
        AbstractC1903Iu0 abstractC1903Iu0T = AbstractC1903Iu0.t(TextUtils.split(strA, f24193d));
        String str2 = (String) AbstractC2110Mu0.b(AbstractC1905Iv0.a(f24197h, abstractC1903Iu0T), "outside");
        int iHashCode = str2.hashCode();
        int i11 = -1;
        int i12 = 0;
        if (iHashCode != -1106037339) {
            if (iHashCode == 92734940 && str2.equals("after")) {
                b10 = 0;
            } else {
                b10 = -1;
            }
        } else if (str2.equals("outside")) {
            b10 = 1;
        } else {
            b10 = -1;
        }
        if (b10 != 0) {
            i10 = b10 != 1 ? 1 : -2;
        } else {
            i10 = 2;
        }
        AbstractC1853Hv0 abstractC1853Hv0A = AbstractC1905Iv0.a(f24194e, abstractC1903Iu0T);
        if (abstractC1853Hv0A.isEmpty()) {
            AbstractC1853Hv0 abstractC1853Hv0A2 = AbstractC1905Iv0.a(f24196g, abstractC1903Iu0T);
            AbstractC1853Hv0 abstractC1853Hv0A3 = AbstractC1905Iv0.a(f24195f, abstractC1903Iu0T);
            if (!abstractC1853Hv0A2.isEmpty() || !abstractC1853Hv0A3.isEmpty()) {
                String str3 = (String) AbstractC2110Mu0.b(abstractC1853Hv0A2, "filled");
                int i13 = (str3.hashCode() == 3417674 && str3.equals("open")) ? 2 : 1;
                String str4 = (String) AbstractC2110Mu0.b(abstractC1853Hv0A3, "circle");
                int iHashCode2 = str4.hashCode();
                if (iHashCode2 != -905816648) {
                    if (iHashCode2 == 99657 && str4.equals("dot")) {
                        i11 = 0;
                    }
                } else if (str4.equals("sesame")) {
                    i11 = 1;
                }
                if (i11 == 0) {
                    i11 = 2;
                } else if (i11 != 1) {
                    i12 = i13;
                    i11 = 1;
                } else {
                    i11 = 3;
                }
                i12 = i13;
            }
        } else {
            String str5 = (String) abstractC1853Hv0A.iterator().next();
            if (str5.hashCode() == 3387192 && str5.equals("none")) {
                i11 = 0;
            }
        }
        return new V5(i11, i12, i10);
    }
}
