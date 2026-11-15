package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3414eu0 extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Object f28088j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Object f28089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    transient int[] f28090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient Object[] f28091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient Object[] f28092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int f28093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient int f28094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient Set f28095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient Set f28096h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private transient Collection f28097i;

    C3414eu0() {
        e(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final int l() {
        return (1 << (this.f28093e & 31)) - 1;
    }

    private final int B(int i10, int i11, int i12, int i13) {
        int i14 = i11 - 1;
        Object objA = AbstractC3540fu0.a(i11);
        if (i13 != 0) {
            AbstractC3540fu0.c(objA, i12 & i14, i13 + 1);
        }
        Object obj = this.f28089a;
        Objects.requireNonNull(obj);
        int[] iArrP = p();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iB = AbstractC3540fu0.b(obj, i15);
            while (iB != 0) {
                int i16 = iB - 1;
                int i17 = iArrP[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iB2 = AbstractC3540fu0.b(objA, i19);
                AbstractC3540fu0.c(objA, i19, iB);
                iArrP[i16] = ((~i14) & i18) | (iB2 & i14);
                iB = i17 & i10;
            }
        }
        this.f28089a = objA;
        z(i14);
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final int m(Object obj) {
        if (f()) {
            return -1;
        }
        int iB = AbstractC4924qu0.b(obj);
        int iL = l();
        Object obj2 = this.f28089a;
        Objects.requireNonNull(obj2);
        int iB2 = AbstractC3540fu0.b(obj2, iB & iL);
        if (iB2 != 0) {
            int i10 = ~iL;
            int i11 = iB & i10;
            do {
                int i12 = iB2 - 1;
                int i13 = p()[i12];
                if ((i13 & i10) == i11 && Objects.equals(obj, q()[i12])) {
                    return i12;
                }
                iB2 = i13 & iL;
            } while (iB2 != 0);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final Object n(Object obj) {
        if (!f()) {
            int iL = l();
            Object obj2 = this.f28089a;
            Objects.requireNonNull(obj2);
            int iE = AbstractC3540fu0.e(obj, null, iL, obj2, p(), q(), null);
            if (iE != -1) {
                Object obj3 = r()[iE];
                i(iE, iL);
                this.f28094f--;
                h();
                return obj3;
            }
        }
        return f28088j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int[] p() {
        int[] iArr = this.f28090b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object[] q() {
        Object[] objArr = this.f28091c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object[] r() {
        Object[] objArr = this.f28092d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private final void z(int i10) {
        this.f28093e = ((32 - Integer.numberOfLeadingZeros(i10)) & 31) | (this.f28093e & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (f()) {
            return;
        }
        h();
        Map mapG = g();
        if (mapG != null) {
            this.f28093e = AbstractC5305tw0.c(size(), 3, 1073741823);
            mapG.clear();
            this.f28089a = null;
            this.f28094f = 0;
            return;
        }
        Arrays.fill(q(), 0, this.f28094f, (Object) null);
        Arrays.fill(r(), 0, this.f28094f, (Object) null);
        Object obj = this.f28089a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(p(), 0, this.f28094f, 0);
        this.f28094f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapG = g();
        if (mapG != null) {
            return mapG.containsKey(obj);
        }
        return m(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapG = g();
        if (mapG != null) {
            return mapG.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f28094f; i10++) {
            if (Objects.equals(obj, r()[i10])) {
                return true;
            }
        }
        return false;
    }

    final void e(int i10) {
        this.f28093e = AbstractC5305tw0.c(i10, 1, 1073741823);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f28096h;
        if (set != null) {
            return set;
        }
        C2784Zt0 c2784Zt0 = new C2784Zt0(this, null);
        this.f28096h = c2784Zt0;
        return c2784Zt0;
    }

    final boolean f() {
        return this.f28089a == null;
    }

    final Map g() {
        Object obj = this.f28089a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapG = g();
        if (mapG != null) {
            return mapG.get(obj);
        }
        int iM = m(obj);
        if (iM == -1) {
            return null;
        }
        return r()[iM];
    }

    final void h() {
        this.f28093e += 32;
    }

    final void i(int i10, int i11) {
        Object obj = this.f28089a;
        Objects.requireNonNull(obj);
        int[] iArrP = p();
        Object[] objArrQ = q();
        Object[] objArrR = r();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrQ[i10] = null;
            objArrR[i10] = null;
            iArrP[i10] = 0;
            return;
        }
        int i13 = i10 + 1;
        Object obj2 = objArrQ[i12];
        objArrQ[i10] = obj2;
        objArrR[i10] = objArrR[i12];
        objArrQ[i12] = null;
        objArrR[i12] = null;
        iArrP[i10] = iArrP[i12];
        iArrP[i12] = 0;
        int iB = AbstractC4924qu0.b(obj2) & i11;
        int iB2 = AbstractC3540fu0.b(obj, iB);
        if (iB2 == size) {
            AbstractC3540fu0.c(obj, iB, i13);
            return;
        }
        while (true) {
            int i14 = iB2 - 1;
            int i15 = iArrP[i14];
            int i16 = i15 & i11;
            if (i16 == size) {
                iArrP[i14] = (i15 & (~i11)) | (i11 & i13);
                return;
            }
            iB2 = i16;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    final int j() {
        return isEmpty() ? -1 : 0;
    }

    final int k(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f28094f) {
            return i11;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f28095g;
        if (set != null) {
            return set;
        }
        C3038bu0 c3038bu0 = new C3038bu0(this, null);
        this.f28095g = c3038bu0;
        return c3038bu0;
    }

    final /* synthetic */ Object o() {
        Object obj = this.f28089a;
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i10;
        if (f()) {
            AbstractC2418Ss0.j(f(), "Arrays already allocated");
            int i11 = this.f28093e;
            int iMax = Math.max(i11 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f28089a = AbstractC3540fu0.a(iMax2);
            z(iMax2 - 1);
            this.f28090b = new int[i11];
            this.f28091c = new Object[i11];
            this.f28092d = new Object[i11];
        }
        Map mapG = g();
        if (mapG != null) {
            return mapG.put(obj, obj2);
        }
        int[] iArrP = p();
        Object[] objArrQ = q();
        Object[] objArrR = r();
        int i12 = this.f28094f;
        int i13 = i12 + 1;
        int iB = AbstractC4924qu0.b(obj);
        int iL = l();
        int i14 = iB & iL;
        Object obj3 = this.f28089a;
        Objects.requireNonNull(obj3);
        int iB2 = AbstractC3540fu0.b(obj3, i14);
        if (iB2 == 0) {
            if (i13 > iL) {
                iL = B(iL, AbstractC3540fu0.d(iL), iB, i12);
            } else {
                Object obj4 = this.f28089a;
                Objects.requireNonNull(obj4);
                AbstractC3540fu0.c(obj4, i14, i13);
            }
            i10 = 1;
        } else {
            int i15 = ~iL;
            int i16 = iB & i15;
            int i17 = 0;
            while (true) {
                int i18 = iB2 - 1;
                int i19 = iArrP[i18];
                i10 = 1;
                int i20 = i19 & i15;
                if (i20 == i16 && Objects.equals(obj, objArrQ[i18])) {
                    Object obj5 = objArrR[i18];
                    objArrR[i18] = obj2;
                    return obj5;
                }
                int i21 = i19 & iL;
                i17++;
                if (i21 == 0) {
                    if (i17 < 9) {
                        if (i13 <= iL) {
                            iArrP[i18] = (i13 & iL) | i20;
                            break;
                        }
                        iL = B(iL, AbstractC3540fu0.d(iL), iB, i12);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(l() + 1, 1.0f);
                    int iJ = j();
                    while (iJ >= 0) {
                        linkedHashMap.put(q()[iJ], r()[iJ]);
                        iJ = k(iJ);
                    }
                    this.f28089a = linkedHashMap;
                    this.f28090b = null;
                    this.f28091c = null;
                    this.f28092d = null;
                    h();
                    return linkedHashMap.put(obj, obj2);
                }
                iB2 = i21;
            }
        }
        int length = p().length;
        if (i13 > length) {
            int i22 = i10;
            int iMin = Math.min(1073741823, (Math.max(i22, length >>> 1) + length) | i22);
            if (iMin != length) {
                this.f28090b = Arrays.copyOf(p(), iMin);
                this.f28091c = Arrays.copyOf(q(), iMin);
                this.f28092d = Arrays.copyOf(r(), iMin);
            }
        }
        p()[i12] = (~iL) & iB;
        q()[i12] = obj;
        r()[i12] = obj2;
        this.f28094f = i13;
        h();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapG = g();
        if (mapG != null) {
            return mapG.remove(obj);
        }
        Object objN = n(obj);
        if (objN == f28088j) {
            return null;
        }
        return objN;
    }

    final /* synthetic */ Object s(int i10) {
        return q()[i10];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapG = g();
        return mapG != null ? mapG.size() : this.f28094f;
    }

    final /* synthetic */ Object t(int i10) {
        return r()[i10];
    }

    final /* synthetic */ void u(int i10, Object obj) {
        r()[i10] = obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f28097i;
        if (collection != null) {
            return collection;
        }
        C3288du0 c3288du0 = new C3288du0(this, null);
        this.f28097i = c3288du0;
        return c3288du0;
    }

    final /* synthetic */ int w() {
        return this.f28093e;
    }

    final /* synthetic */ int x() {
        return this.f28094f;
    }

    final /* synthetic */ void y(int i10) {
        this.f28094f = i10;
    }

    C3414eu0(int i10) {
        e(8);
    }
}
