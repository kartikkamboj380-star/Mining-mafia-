package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5305tw0 extends AbstractC5557vw0 {
    public static int a(long j10) {
        int i10 = (int) j10;
        AbstractC2418Ss0.e(((long) i10) == j10, "Out of range: %s", j10);
        return i10;
    }

    public static int b(long j10) {
        if (j10 > 2147483647L) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return j10 < -2147483648L ? LinearLayoutManager.INVALID_OFFSET : (int) j10;
    }

    public static int c(int i10, int i11, int i12) {
        AbstractC2418Ss0.g(true, "min (%s) must be less than or equal to max (%s)", i11, 1073741823);
        return Math.min(Math.max(i10, i11), 1073741823);
    }

    public static int d(byte[] bArr) {
        int length = bArr.length;
        AbstractC2418Ss0.g(length >= 4, "array too small: %s < %s", length, 4);
        return e(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int e(byte b10, byte b11, byte b12, byte b13) {
        return (b10 << 24) | ((b11 & 255) << 16) | ((b12 & 255) << 8) | (b13 & 255);
    }

    public static int[] f(Collection collection) {
        if (collection instanceof C5179sw0) {
            C5179sw0 c5179sw0 = (C5179sw0) collection;
            return Arrays.copyOfRange(c5179sw0.f33274a, c5179sw0.f33275b, c5179sw0.f33276c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = array[i10];
            obj.getClass();
            iArr[i10] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static List g(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new C5179sw0(iArr, 0, length);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    public static Integer h(String str, int i10) {
        Long lValueOf;
        str.getClass();
        if (!str.isEmpty()) {
            char cCharAt = str.charAt(0);
            int i11 = cCharAt == '-' ? 1 : 0;
            if (i11 != str.length()) {
                int i12 = i11 + 1;
                int iA = AbstractC5683ww0.a(str.charAt(i11));
                if (iA >= 0 && iA < 10) {
                    long j10 = -iA;
                    while (true) {
                        if (i12 >= str.length()) {
                            if (cCharAt != '-') {
                                if (j10 != Long.MIN_VALUE) {
                                    lValueOf = Long.valueOf(-j10);
                                    break;
                                }
                                break;
                            }
                            lValueOf = Long.valueOf(j10);
                            break;
                        }
                        int i13 = i12 + 1;
                        int iA2 = AbstractC5683ww0.a(str.charAt(i12));
                        if (iA2 >= 0 && iA2 < 10 && j10 >= -922337203685477580L) {
                            long j11 = j10 * 10;
                            long j12 = iA2;
                            if (j11 >= Long.MIN_VALUE + j12) {
                                j10 = j11 - j12;
                                i12 = i13;
                            }
                        }
                        lValueOf = null;
                        break;
                    }
                }
                lValueOf = null;
                break;
            }
            lValueOf = null;
            break;
        }
        lValueOf = null;
        break;
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(lValueOf.intValue());
    }

    static /* synthetic */ int i(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }
}
