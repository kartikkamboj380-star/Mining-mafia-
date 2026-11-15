package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5933yv0 extends AbstractC1539Bu0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final AbstractC1539Bu0 f35483g = new C5933yv0(null, new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object f35484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient Object[] f35485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f35486f;

    private C5933yv0(Object obj, Object[] objArr, int i10) {
        this.f35484d = obj;
        this.f35485e = objArr;
        this.f35486f = i10;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ce  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    static C5933yv0 l(int i10, Object[] objArr, C1487Au0 c1487Au0) {
        boolean z9;
        int i11;
        char c10;
        ?? r10;
        char c11;
        short[] sArr;
        boolean z10;
        int i12;
        ?? r16;
        boolean z11;
        ?? r11;
        Object[] objArr2;
        C6057zu0 c6057zu0;
        boolean z12;
        int i13 = i10;
        Object[] objArrCopyOf = objArr;
        if (i13 == 0) {
            return (C5933yv0) f35483g;
        }
        C6057zu0 c6057zu1 = null;
        ?? r12 = 0;
        C6057zu0 c6057zu2 = null;
        C6057zu0 c6057zu3 = null;
        boolean z13 = false;
        int i14 = 1;
        if (i13 == 1) {
            Object obj = objArrCopyOf[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArrCopyOf[1];
            Objects.requireNonNull(obj2);
            AbstractC2472Tt0.a(obj, obj2);
            return new C5933yv0(null, objArrCopyOf, 1);
        }
        AbstractC2418Ss0.n(i13, objArrCopyOf.length >> 1, "index");
        int iR = AbstractC1903Iu0.r(i13);
        char c12 = 2;
        if (i13 != 1) {
            int i15 = iR - 1;
            if (iR <= 128) {
                byte[] bArr = new byte[iR];
                Arrays.fill(bArr, (byte) -1);
                int i16 = 0;
                int i17 = 0;
                while (i16 < i13) {
                    int i18 = i17 + i17;
                    int i19 = i16 + i16;
                    Object obj3 = objArrCopyOf[i19];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArrCopyOf[i19 ^ i14];
                    Objects.requireNonNull(obj4);
                    AbstractC2472Tt0.a(obj3, obj4);
                    int iA = AbstractC4924qu0.a(obj3.hashCode());
                    while (true) {
                        int i20 = iA & i15;
                        z10 = z13;
                        i12 = i14;
                        int i21 = bArr[i20] & 255;
                        if (i21 == 255) {
                            bArr[i20] = (byte) i18;
                            if (i17 < i16) {
                                objArrCopyOf[i18] = obj3;
                                objArrCopyOf[i18 ^ 1] = obj4;
                            }
                            i17++;
                            break;
                        }
                        if (obj3.equals(objArrCopyOf[i21 == true ? 1 : 0])) {
                            int i22 = ~i21;
                            Object obj5 = objArrCopyOf[i22 == true ? 1 : 0];
                            Objects.requireNonNull(obj5);
                            C6057zu0 c6057zu4 = new C6057zu0(obj3, obj4, obj5);
                            objArrCopyOf[i22 == true ? 1 : 0] = obj4;
                            c6057zu2 = c6057zu4;
                            break;
                        }
                        iA = i20 + 1;
                        z13 = z10;
                        i14 = i12;
                    }
                    i16++;
                    z13 = z10;
                    i14 = i12;
                }
                z9 = z13;
                i11 = i14;
                if (i17 == i13) {
                    r12 = bArr;
                    z12 = z9;
                } else {
                    sArr = new Object[3];
                    sArr[z9 ? 1 : 0] = bArr;
                    sArr[i11] = Integer.valueOf(i17);
                    sArr[2] = c6057zu2;
                    r12 = sArr;
                    z12 = z9;
                }
            } else {
                z9 = false;
                i11 = 1;
                if (iR <= 32768) {
                    sArr = new short[iR];
                    Arrays.fill(sArr, (short) -1);
                    int i23 = 0;
                    for (int i24 = 0; i24 < i13; i24++) {
                        int i25 = i23 + i23;
                        int i26 = i24 + i24;
                        Object obj6 = objArrCopyOf[i26];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArrCopyOf[i26 ^ 1];
                        Objects.requireNonNull(obj7);
                        AbstractC2472Tt0.a(obj6, obj7);
                        int iA2 = AbstractC4924qu0.a(obj6.hashCode());
                        while (true) {
                            int i27 = iA2 & i15;
                            char c13 = (char) sArr[i27];
                            if (c13 == 65535) {
                                sArr[i27] = (short) i25;
                                if (i23 < i24) {
                                    objArrCopyOf[i25] = obj6;
                                    objArrCopyOf[i25 ^ 1] = obj7;
                                }
                                i23++;
                                break;
                            }
                            if (obj6.equals(objArrCopyOf[c13])) {
                                int i28 = c13 ^ 1;
                                Object obj8 = objArrCopyOf[i28 == true ? 1 : 0];
                                Objects.requireNonNull(obj8);
                                C6057zu0 c6057zu5 = new C6057zu0(obj6, obj7, obj8);
                                objArrCopyOf[i28 == true ? 1 : 0] = obj7;
                                c6057zu3 = c6057zu5;
                                break;
                            }
                            iA2 = i27 + 1;
                        }
                    }
                    if (i23 == i13) {
                        r12 = sArr;
                        z12 = z9;
                    } else {
                        r12 = new Object[]{sArr, Integer.valueOf(i23), c6057zu3};
                        z12 = z9;
                    }
                } else {
                    int[] iArr = new int[iR];
                    Arrays.fill(iArr, -1);
                    int i29 = 0;
                    int i30 = 0;
                    while (i29 < i13) {
                        int i31 = i30 + i30;
                        int i32 = i29 + i29;
                        Object obj9 = objArrCopyOf[i32];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArrCopyOf[i32 ^ 1];
                        Objects.requireNonNull(obj10);
                        AbstractC2472Tt0.a(obj9, obj10);
                        int iA3 = AbstractC4924qu0.a(obj9.hashCode());
                        while (true) {
                            int i33 = iA3 & i15;
                            int i34 = iArr[i33];
                            if (i34 == -1) {
                                iArr[i33] = i31;
                                if (i30 < i29) {
                                    objArrCopyOf[i31] = obj9;
                                    objArrCopyOf[i31 ^ 1] = obj10;
                                }
                                i30++;
                                c11 = c12;
                                break;
                            }
                            c11 = c12;
                            if (obj9.equals(objArrCopyOf[i34])) {
                                int i35 = i34 ^ 1;
                                Object obj11 = objArrCopyOf[i35];
                                Objects.requireNonNull(obj11);
                                C6057zu0 c6057zu6 = new C6057zu0(obj9, obj10, obj11);
                                objArrCopyOf[i35] = obj10;
                                c6057zu1 = c6057zu6;
                                break;
                            }
                            iA3 = i33 + 1;
                            c12 = c11;
                        }
                        i29++;
                        c12 = c11;
                    }
                    c10 = c12;
                    if (i30 == i13) {
                        r10 = iArr;
                        r16 = z9;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i30);
                        objArr3[c10] = c6057zu1;
                        r10 = objArr3;
                        r16 = z9;
                    }
                }
            }
            z11 = r10 instanceof Object[];
            r11 = r10;
            if (z11) {
                objArr2 = (Object[]) r10;
                c6057zu0 = (C6057zu0) objArr2[c10];
                if (c1487Au0 != null) {
                    throw c6057zu0.a();
                }
                c1487Au0.f17431c = c6057zu0;
                Object obj12 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i11]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r11 = obj12;
                i13 = iIntValue;
            }
            return new C5933yv0(r11, objArrCopyOf, i13);
        }
        Object obj13 = objArrCopyOf[0];
        Objects.requireNonNull(obj13);
        Object obj14 = objArrCopyOf[1];
        Objects.requireNonNull(obj14);
        AbstractC2472Tt0.a(obj13, obj14);
        z12 = false;
        i13 = 1;
        i11 = 1;
        c10 = 2;
        r10 = r12;
        r16 = z12;
        z11 = r10 instanceof Object[];
        r11 = r10;
        if (z11) {
            objArr2 = (Object[]) r10;
            c6057zu0 = (C6057zu0) objArr2[c10];
            if (c1487Au0 != null) {
                throw c6057zu0.a();
            }
            c1487Au0.f17431c = c6057zu0;
            Object obj15 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i11]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r11 = obj15;
            i13 = iIntValue2;
        }
        return new C5933yv0(r11, objArrCopyOf, i13);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1539Bu0
    final AbstractC1903Iu0 f() {
        return new C5555vv0(this, this.f35485e, 0, this.f35486f);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.ads.AbstractC1539Bu0, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i10 = this.f35486f;
            Object[] objArr = this.f35485e;
            if (i10 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f35484d;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iA = AbstractC4924qu0.a(obj.hashCode());
                    while (true) {
                        int i11 = iA & length;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i12])) {
                            obj2 = objArr[i12 ^ 1];
                        } else {
                            iA = i11 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iA2 = AbstractC4924qu0.a(obj.hashCode());
                    while (true) {
                        int i13 = iA2 & length2;
                        char c10 = (char) sArr[i13];
                        if (c10 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c10])) {
                            obj2 = objArr[c10 ^ 1];
                        } else {
                            iA2 = i13 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iA3 = AbstractC4924qu0.a(obj.hashCode());
                    while (true) {
                        int i14 = iA3 & length3;
                        int i15 = iArr[i14];
                        if (i15 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i15])) {
                            obj2 = objArr[i15 ^ 1];
                        } else {
                            iA3 = i14 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1539Bu0
    final AbstractC1903Iu0 h() {
        return new C5681wv0(this, new C5807xv0(this.f35485e, 0, this.f35486f));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1539Bu0
    final AbstractC5427uu0 j() {
        return new C5807xv0(this.f35485e, 1, this.f35486f);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1539Bu0
    final boolean k() {
        return false;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f35486f;
    }
}
