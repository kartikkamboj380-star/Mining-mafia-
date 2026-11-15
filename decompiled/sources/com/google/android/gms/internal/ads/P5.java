package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
final class P5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f22022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f22023i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f22024j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f22025k;

    private P5(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
        this.f22015a = i10;
        this.f22016b = i11;
        this.f22017c = i12;
        this.f22018d = i13;
        this.f22019e = i14;
        this.f22020f = i15;
        this.f22021g = i16;
        this.f22022h = i17;
        this.f22023i = i18;
        this.f22024j = i19;
        this.f22025k = i20;
    }

    public static P5 a(String str) {
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        int i18 = -1;
        int i19 = -1;
        int i20 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i10 >= length) {
                if (i11 != -1) {
                    return new P5(i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, length);
                }
                return null;
            }
            switch (AbstractC1483As0.a(strArrSplit[i10].trim())) {
                case "name":
                    i11 = i10;
                    break;
                case "alignment":
                    i12 = i10;
                    break;
                case "primarycolour":
                    i13 = i10;
                    break;
                case "outlinecolour":
                    i14 = i10;
                    break;
                case "fontsize":
                    i15 = i10;
                    break;
                case "bold":
                    i16 = i10;
                    break;
                case "italic":
                    i17 = i10;
                    break;
                case "underline":
                    i18 = i10;
                    break;
                case "strikeout":
                    i19 = i10;
                    break;
                case "borderstyle":
                    i20 = i10;
                    break;
            }
            i10++;
        }
    }
}
