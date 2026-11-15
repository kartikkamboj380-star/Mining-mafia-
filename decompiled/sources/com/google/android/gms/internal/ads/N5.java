package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
final class N5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21056f;

    private N5(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f21051a = i10;
        this.f21052b = i11;
        this.f21053c = i12;
        this.f21054d = i13;
        this.f21055e = i14;
        this.f21056f = i15;
    }

    public static N5 a(String str) {
        byte b10;
        AbstractC2418Ss0.a(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i10 >= length) {
                if (i12 == -1 || i13 == -1 || i15 == -1) {
                    return null;
                }
                return new N5(i11, i12, i13, i14, i15, length);
            }
            switch (AbstractC1483As0.a(strArrSplit[i10].trim())) {
                case "end":
                    b10 = 2;
                    break;
                case "text":
                    b10 = 4;
                    break;
                case "layer":
                    b10 = 0;
                    break;
                case "start":
                    b10 = 1;
                    break;
                case "style":
                    b10 = 3;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            if (b10 == 0) {
                i11 = i10;
            } else if (b10 == 1) {
                i12 = i10;
            } else if (b10 == 2) {
                i13 = i10;
            } else if (b10 == 3) {
                i14 = i10;
            } else if (b10 == 4) {
                i15 = i10;
            }
            i10++;
        }
    }
}
