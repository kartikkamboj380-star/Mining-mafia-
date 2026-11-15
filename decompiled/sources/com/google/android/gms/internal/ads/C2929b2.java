package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2929b2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f26701c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26702a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26703b = -1;

    private final boolean c(String str) {
        Matcher matcher = f26701c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = AbstractC4634ob0.f32117a;
            int i10 = Integer.parseInt(strGroup, 16);
            int i11 = Integer.parseInt(matcher.group(2), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.f26702a = i10;
            this.f26703b = i11;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean a(V6 v10) {
        AbstractC5931yu0 abstractC5931yu0E = v10.e(C5824y3.class, C2803a2.f26390a);
        int size = abstractC5931yu0E.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zC = c(((C5824y3) abstractC5931yu0E.get(i10)).f35236d);
            i10++;
            if (zC) {
                return true;
            }
        }
        AbstractC5931yu0 abstractC5931yu0E2 = v10.e(G3.class, Z1.f26071a);
        int size2 = abstractC5931yu0E2.size();
        int i11 = 0;
        while (i11 < size2) {
            boolean zC2 = c(((G3) abstractC5931yu0E2.get(i11)).f18903d);
            i11++;
            if (zC2) {
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        return (this.f26702a == -1 || this.f26703b == -1) ? false : true;
    }
}
