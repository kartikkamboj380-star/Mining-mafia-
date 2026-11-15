package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2652Xf0 implements InterfaceC5326u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f25360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25362d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    public C2652Xf0(String str, byte[] bArr, int i10, int i11) {
        byte b10;
        byte b11;
        boolean z9 = true;
        switch (str) {
            case "com.android.capture.fps":
                b10 = 0;
                break;
            case "auxiliary.tracks.interleaved":
                b10 = 4;
                break;
            case "auxiliary.tracks.length":
                b10 = 2;
                break;
            case "auxiliary.tracks.offset":
                b10 = 1;
                break;
            case "auxiliary.tracks.map":
                b10 = 3;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0) {
            if (i11 != 23) {
                z9 = false;
            } else if (bArr.length == 4) {
                i11 = 23;
            } else {
                i11 = 23;
                z9 = false;
            }
            AbstractC2418Ss0.a(z9);
        } else if (b10 == 1 || b10 == 2) {
            if (i11 != 78) {
                z9 = false;
            } else if (bArr.length == 8) {
                i11 = 78;
            } else {
                i11 = 78;
                z9 = false;
            }
            AbstractC2418Ss0.a(z9);
        } else if (b10 == 3) {
            AbstractC2418Ss0.a(i11 == 0);
        } else if (b10 == 4) {
            if (i11 != 75) {
                z9 = false;
            } else if (bArr.length == 1 && ((b11 = bArr[0]) == 0 || b11 == 1)) {
                i11 = 75;
            } else {
                i11 = 75;
                z9 = false;
            }
            AbstractC2418Ss0.a(z9);
        }
        this.f25359a = str;
        this.f25360b = bArr;
        this.f25361c = i10;
        this.f25362d = i11;
    }

    public final List b() {
        AbstractC2418Ss0.j(this.f25359a.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte[] bArr = this.f25360b;
        byte b10 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b10; i10++) {
            arrayList.add(Integer.valueOf(bArr[i10 + 2]));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2652Xf0.class == obj.getClass()) {
            C2652Xf0 c2652Xf0 = (C2652Xf0) obj;
            if (this.f25359a.equals(c2652Xf0.f25359a) && Arrays.equals(this.f25360b, c2652Xf0.f25360b) && this.f25361c == c2652Xf0.f25361c && this.f25362d == c2652Xf0.f25362d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f25359a.hashCode() + 527) * 31) + Arrays.hashCode(this.f25360b)) * 31) + this.f25361c) * 31) + this.f25362d;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0089 A[LOOP:0: B:24:0x0086->B:26:0x0089, LOOP_END] */
    public final String toString() {
        String string;
        byte[] bArr;
        StringBuilder sb;
        int i10 = this.f25362d;
        if (i10 != 0) {
            if (i10 == 1) {
                string = AbstractC4634ob0.E(this.f25360b);
            } else if (i10 == 23) {
                string = String.valueOf(Float.intBitsToFloat(AbstractC5305tw0.d(this.f25360b)));
            } else if (i10 == 67) {
                string = String.valueOf(AbstractC5305tw0.d(this.f25360b));
            } else if (i10 == 75) {
                string = String.valueOf(O10.a(this.f25360b[0]));
            } else if (i10 != 78) {
                bArr = this.f25360b;
                String str = AbstractC4634ob0.f32117a;
                int length = bArr.length;
                sb = new StringBuilder(length + length);
                for (int i11 = 0; i11 < bArr.length; i11++) {
                    sb.append(Character.forDigit((bArr[i11] >> 4) & 15, 16));
                    sb.append(Character.forDigit(bArr[i11] & 15, 16));
                }
                string = sb.toString();
            } else {
                string = String.valueOf(new P10(this.f25360b).j());
            }
        } else if (this.f25359a.equals("auxiliary.tracks.map")) {
            List listB = b();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("track types = ");
            AbstractC2054Ls0.b(sb2, listB, ",");
            string = sb2.toString();
        } else {
            bArr = this.f25360b;
            String str2 = AbstractC4634ob0.f32117a;
            int length2 = bArr.length;
            sb = new StringBuilder(length2 + length2);
            while (i11 < bArr.length) {
                sb.append(Character.forDigit((bArr[i11] >> 4) & 15, 16));
                sb.append(Character.forDigit(bArr[i11] & 15, 16));
            }
            string = sb.toString();
        }
        String str3 = this.f25359a;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 18 + String.valueOf(string).length());
        sb3.append("mdta: key=");
        sb3.append(str3);
        sb3.append(", value=");
        sb3.append(string);
        return sb3.toString();
    }
}
