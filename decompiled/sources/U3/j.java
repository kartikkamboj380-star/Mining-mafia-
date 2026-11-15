package U3;

import com.facebook.react.uimanager.C1356f0;
import com.facebook.react.uimanager.L;
import com.facebook.react.uimanager.W;
import com.facebook.react.uimanager.X;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC7024j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f5950a = new j();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5951a;

        static {
            int[] iArr = new int[X.values().length];
            try {
                iArr[X.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[X.PERCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f5951a = iArr;
        }
    }

    private j() {
    }

    /* JADX WARN: Code duplicated, block: B:18:0x007e A[PHI: r6
      0x007e: PHI (r6v2 int) = (r6v1 int), (r6v1 int), (r6v1 int), (r6v1 int), (r6v1 int), (r6v1 int), (r6v1 int), (r6v5 int) binds: [B:5:0x0013, B:8:0x0018, B:11:0x003d, B:12:0x003f, B:13:0x0041, B:24:0x0099, B:21:0x0089, B:17:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    private final List b(r[] rVarArr) {
        int i10;
        int i11;
        r[] rVarArr2 = rVarArr;
        List listZ = AbstractC7024j.Z(rVarArr2);
        int i12 = 1;
        int length = rVarArr2.length - 1;
        int i13 = 1;
        int i14 = 0;
        while (i13 < length) {
            if (rVarArr2[i13].a() == null && (i11 = i13 + i14) >= i12) {
                int i15 = i11 - 1;
                Float fB = ((r) listZ.get(i15)).b();
                int i16 = i11 + 1;
                Float fB2 = ((r) listZ.get(i16)).b();
                Float fB3 = ((r) listZ.get(i11)).b();
                if (fB == null || fB2 == null || fB3 == null) {
                    i10 = length;
                } else {
                    float fFloatValue = fB3.floatValue() - fB.floatValue();
                    float fFloatValue2 = fB2.floatValue() - fB3.floatValue();
                    float fFloatValue3 = fB2.floatValue() - fB.floatValue();
                    Integer numA = ((r) listZ.get(i15)).a();
                    Integer numA2 = ((r) listZ.get(i16)).a();
                    if (L.a(fFloatValue, fFloatValue2)) {
                        listZ.remove(i11);
                        i14--;
                    } else if (L.a(fFloatValue, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                        ((r) listZ.get(i11)).c(numA2);
                    } else if (L.a(fFloatValue2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                        ((r) listZ.get(i11)).c(numA);
                    } else {
                        ArrayList arrayList = new ArrayList(9);
                        if (fFloatValue > fFloatValue2) {
                            int i17 = 0;
                            while (i17 < 7) {
                                arrayList.add(new r(null, Float.valueOf(fB.floatValue() + (((i17 + 7.0f) / 13.0f) * fFloatValue))));
                                i17++;
                                length = length;
                            }
                            i10 = length;
                            arrayList.add(new r(null, Float.valueOf(fB3.floatValue() + (0.33333334f * fFloatValue2))));
                            arrayList.add(new r(null, Float.valueOf(fB3.floatValue() + (fFloatValue2 * 0.6666667f))));
                        } else {
                            i10 = length;
                            arrayList.add(new r(null, Float.valueOf(fB.floatValue() + (0.33333334f * fFloatValue))));
                            arrayList.add(new r(null, Float.valueOf(fB.floatValue() + (0.6666667f * fFloatValue))));
                            for (int i18 = 0; i18 < 7; i18++) {
                                arrayList.add(new r(null, Float.valueOf(fB3.floatValue() + ((i18 / 13.0f) * fFloatValue2))));
                            }
                        }
                        double dLog = Math.log(0.5d) / ((double) ((float) Math.log(fFloatValue / fFloatValue3)));
                        Iterator it = arrayList.iterator();
                        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                        while (it.hasNext()) {
                            Object next = it.next();
                            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                            r rVar = (r) next;
                            if (rVar.b() != null) {
                                float fPow = (float) Math.pow((rVar.b().floatValue() - fB.floatValue()) / fFloatValue3, dLog);
                                if (Math.abs(fPow) <= Float.MAX_VALUE && !Float.isNaN(fPow) && numA != null) {
                                    int iIntValue = numA.intValue();
                                    if (numA2 != null) {
                                        rVar.c(Integer.valueOf(F.a.c(iIntValue, numA2.intValue(), fPow)));
                                    }
                                }
                            }
                        }
                        listZ.remove(i11);
                        listZ.addAll(i11, arrayList);
                        i14 += 8;
                    }
                    i10 = length;
                }
            } else {
                i10 = length;
            }
            i13++;
            rVarArr2 = rVarArr;
            length = i10;
            i12 = 1;
        }
        return listZ;
    }

    private final Float c(W w10, float f10) {
        if (w10 == null) {
            return null;
        }
        int i10 = a.f5951a[w10.a().ordinal()];
        if (i10 == 1) {
            return Float.valueOf(C1356f0.i(w10.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) / f10);
        }
        if (i10 == 2) {
            return Float.valueOf(w10.b(1.0f));
        }
        throw new p129m8.k();
    }

    public final List a(List colorStops, float f10) {
        Intrinsics.checkNotNullParameter(colorStops, "colorStops");
        int size = colorStops.size();
        r[] rVarArr = new r[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            rVarArr[i11] = new r(null, null, 3, null);
        }
        Float fC = c(((i) colorStops.get(0)).b(), f10);
        float fFloatValue = fC != null ? fC.floatValue() : 0.0f;
        int size2 = colorStops.size();
        int i12 = 0;
        boolean z9 = false;
        while (i12 < size2) {
            i iVar = (i) colorStops.get(i12);
            Float fC2 = c(iVar.b(), f10);
            if (fC2 == null) {
                fC2 = i12 == 0 ? Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : i12 == colorStops.size() - 1 ? Float.valueOf(1.0f) : null;
            }
            if (fC2 != null) {
                fFloatValue = Math.max(fC2.floatValue(), fFloatValue);
                rVarArr[i12] = new r(iVar.a(), Float.valueOf(fFloatValue));
            } else {
                z9 = true;
            }
            i12++;
        }
        if (z9) {
            for (int i13 = 1; i13 < size; i13++) {
                Float fB = rVarArr[i13].b();
                Float fB2 = rVarArr[i10].b();
                int i14 = i13 - i10;
                int i15 = i14 - 1;
                if (fB != null && fB2 != null && i15 > 0) {
                    float fFloatValue2 = (fB.floatValue() - fB2.floatValue()) / i14;
                    if (1 <= i15) {
                        int i16 = 1;
                        while (true) {
                            int i17 = i10 + i16;
                            rVarArr[i17] = new r(((i) colorStops.get(i17)).a(), Float.valueOf(fB2.floatValue() + (i16 * fFloatValue2)));
                            if (i16 == i15) {
                                break;
                            }
                            i16++;
                        }
                    }
                    i10 = i13;
                }
            }
        }
        return b(rVarArr);
    }
}
