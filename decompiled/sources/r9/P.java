package r9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.AbstractC7018d;
import kotlin.collections.AbstractC7024j;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class P extends AbstractC7018d implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f48386d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C7108k[] f48387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f48388c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(long j10, C7105h c7105h, int i10, List list, int i11, int i12, List list2) {
            int i13;
            int i14;
            int i15;
            long j11;
            int i16 = i10;
            if (i11 >= i12) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i17 = i11; i17 < i12; i17++) {
                if (((C7108k) list.get(i17)).E() < i16) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            C7108k c7108k = (C7108k) list.get(i11);
            C7108k c7108k2 = (C7108k) list.get(i12 - 1);
            if (i16 == c7108k.E()) {
                int iIntValue = ((Number) list2.get(i11)).intValue();
                int i18 = i11 + 1;
                C7108k c7108k3 = (C7108k) list.get(i18);
                i13 = i18;
                i14 = iIntValue;
                c7108k = c7108k3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (c7108k.i(i16) == c7108k2.i(i16)) {
                int iMin = Math.min(c7108k.E(), c7108k2.E());
                int i19 = 0;
                for (int i20 = i16; i20 < iMin && c7108k.i(i20) == c7108k2.i(i20); i20++) {
                    i19++;
                }
                long jC = j10 + c(c7105h) + ((long) 2) + ((long) i19) + 1;
                c7105h.writeInt(-i19);
                c7105h.writeInt(i14);
                int i21 = i16 + i19;
                while (i16 < i21) {
                    c7105h.writeInt(c7108k.i(i16) & 255);
                    i16++;
                }
                if (i13 + 1 == i12) {
                    if (i21 != ((C7108k) list.get(i13)).E()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    c7105h.writeInt(((Number) list2.get(i13)).intValue());
                    return;
                } else {
                    C7105h c7105h2 = new C7105h();
                    c7105h.writeInt(((int) (c(c7105h2) + jC)) * (-1));
                    a(jC, c7105h2, i21, list, i13, i12, list2);
                    c7105h.w0(c7105h2);
                    return;
                }
            }
            int i22 = 1;
            for (int i23 = i13 + 1; i23 < i12; i23++) {
                if (((C7108k) list.get(i23 - 1)).i(i16) != ((C7108k) list.get(i23)).i(i16)) {
                    i22++;
                }
            }
            long jC2 = j10 + c(c7105h) + ((long) 2) + ((long) (i22 * 2));
            c7105h.writeInt(i22);
            c7105h.writeInt(i14);
            for (int i24 = i13; i24 < i12; i24++) {
                byte bI = ((C7108k) list.get(i24)).i(i16);
                if (i24 == i13 || bI != ((C7108k) list.get(i24 - 1)).i(i16)) {
                    c7105h.writeInt(bI & 255);
                }
            }
            C7105h c7105h3 = new C7105h();
            while (i13 < i12) {
                byte bI2 = ((C7108k) list.get(i13)).i(i16);
                int i25 = i13 + 1;
                int i26 = i25;
                while (true) {
                    if (i26 >= i12) {
                        i15 = i12;
                        break;
                    } else {
                        if (bI2 != ((C7108k) list.get(i26)).i(i16)) {
                            i15 = i26;
                            break;
                        }
                        i26++;
                    }
                }
                if (i25 == i15 && i16 + 1 == ((C7108k) list.get(i13)).E()) {
                    c7105h.writeInt(((Number) list2.get(i13)).intValue());
                    j11 = jC2;
                } else {
                    c7105h.writeInt(((int) (c(c7105h3) + jC2)) * (-1));
                    j11 = jC2;
                    a(j11, c7105h3, i16 + 1, list, i13, i15, list2);
                }
                jC2 = j11;
                i13 = i15;
            }
            c7105h.w0(c7105h3);
        }

        static /* synthetic */ void b(a aVar, long j10, C7105h c7105h, int i10, List list, int i11, int i12, List list2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                j10 = 0;
            }
            aVar.a(j10, c7105h, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        private final long c(C7105h c7105h) {
            return c7105h.size() / ((long) 4);
        }

        public final P d(C7108k... byteStrings) {
            Intrinsics.checkNotNullParameter(byteStrings, "byteStrings");
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (byteStrings.length == 0) {
                return new P(new C7108k[0], new int[]{0, -1}, defaultConstructorMarker);
            }
            List listZ = AbstractC7024j.Z(byteStrings);
            CollectionsKt.u(listZ);
            int size = listZ.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(-1);
            }
            int length = byteStrings.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                arrayList.set(CollectionsKt.h(listZ, byteStrings[i11], 0, 0, 6, null), Integer.valueOf(i12));
                i11++;
                i12++;
            }
            if (((C7108k) listZ.get(0)).E() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i13 = 0;
            while (i13 < listZ.size()) {
                C7108k c7108k = (C7108k) listZ.get(i13);
                int i14 = i13 + 1;
                int i15 = i14;
                while (i15 < listZ.size()) {
                    C7108k c7108k2 = (C7108k) listZ.get(i15);
                    if (!c7108k2.F(c7108k)) {
                        break;
                    }
                    if (c7108k2.E() == c7108k.E()) {
                        throw new IllegalArgumentException(("duplicate option: " + c7108k2).toString());
                    }
                    if (((Number) arrayList.get(i15)).intValue() > ((Number) arrayList.get(i13)).intValue()) {
                        listZ.remove(i15);
                        arrayList.remove(i15);
                    } else {
                        i15++;
                    }
                }
                i13 = i14;
            }
            C7105h c7105h = new C7105h();
            b(this, 0L, c7105h, 0, listZ, 0, 0, arrayList, 53, null);
            int iC = (int) c(c7105h);
            int[] iArr = new int[iC];
            for (int i16 = 0; i16 < iC; i16++) {
                iArr[i16] = c7105h.readInt();
            }
            Object[] objArrCopyOf = Arrays.copyOf(byteStrings, byteStrings.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            return new P((C7108k[]) objArrCopyOf, iArr, defaultConstructorMarker);
        }

        private a() {
        }
    }

    public /* synthetic */ P(C7108k[] c7108kArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(c7108kArr, iArr);
    }

    @Override // kotlin.collections.AbstractC7016b
    public int b() {
        return this.f48387b.length;
    }

    @Override // kotlin.collections.AbstractC7016b, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C7108k) {
            return g((C7108k) obj);
        }
        return false;
    }

    public /* bridge */ boolean g(C7108k c7108k) {
        return super.contains(c7108k);
    }

    @Override // kotlin.collections.AbstractC7018d, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C7108k get(int i10) {
        return this.f48387b[i10];
    }

    @Override // kotlin.collections.AbstractC7018d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C7108k) {
            return l((C7108k) obj);
        }
        return -1;
    }

    public final C7108k[] j() {
        return this.f48387b;
    }

    public final int[] k() {
        return this.f48388c;
    }

    public /* bridge */ int l(C7108k c7108k) {
        return super.indexOf(c7108k);
    }

    @Override // kotlin.collections.AbstractC7018d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C7108k) {
            return m((C7108k) obj);
        }
        return -1;
    }

    public /* bridge */ int m(C7108k c7108k) {
        return super.lastIndexOf(c7108k);
    }

    private P(C7108k[] c7108kArr, int[] iArr) {
        this.f48387b = c7108kArr;
        this.f48388c = iArr;
    }
}
