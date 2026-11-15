package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4001ja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f30486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f30487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f30488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private M9 f30489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f30490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC2871aa f30491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f30492g = 1;

    private C4001ja() {
    }

    public static C4001ja a(Object obj) {
        C4001ja c4001ja = new C4001ja();
        int[] iArr = {572660336, 1963204074, 810270723, 1168973800, 12304897, -1027511958, 1433925857, 2084420925, 1937477084};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
        c4001ja.r();
        c4001ja.f30492g = (i17 % 1937477084) ^ i18;
        c4001ja.f30486a = obj;
        return c4001ja;
    }

    public static C4001ja b(long j10) {
        C4001ja c4001ja = new C4001ja();
        int[] iArr = {269455306, 1628467785, 508432336, 1769894153, 149815616, -1737813993, 468055906, 524872353, 327254586};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
        c4001ja.r();
        c4001ja.f30492g = (i17 % 327254586) ^ i18;
        c4001ja.f30487b = j10;
        return c4001ja;
    }

    public static C4001ja c(double d10) {
        C4001ja c4001ja = new C4001ja();
        int[] iArr = {76065818, 1629326670, 912768099, 1092092300, 784816880, -1349977414, 434065736, 1884661237, 1605908235};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
        c4001ja.r();
        c4001ja.f30492g = (i17 % 1605908235) ^ i18;
        c4001ja.f30488c = d10;
        return c4001ja;
    }

    public static C4001ja d(M9 m10) {
        C4001ja c4001ja = new C4001ja();
        int[] iArr = {1143408282, 544368152, 1884037077, 79323401, 1472762119, -801477845, 201305624, 1470503465, 1402586708};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
        c4001ja.r();
        c4001ja.f30492g = (i17 % 1402586708) ^ i18;
        c4001ja.f30489d = m10;
        return c4001ja;
    }

    public static C4001ja e(List list) {
        C4001ja c4001ja = new C4001ja();
        int[] iArr = {231602422, 370241669, 619070592, 319896591, 694865338, 1425770340, 39950860, 555996658, 324763920};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
        c4001ja.r();
        c4001ja.f30492g = (i17 % 324763920) ^ i18;
        c4001ja.f30490e = list;
        return c4001ja;
    }

    public static C4001ja f(InterfaceC2871aa interfaceC2871aa) {
        C4001ja c4001ja = new C4001ja();
        int[] iArr = {1315209188, 67133601, 1612794668, 612376713, 2023183116, -774012042, 5007439, 661761152, 474613996};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
        c4001ja.r();
        c4001ja.f30492g = (i17 % 474613996) ^ i18;
        c4001ja.f30491f = interfaceC2871aa;
        return c4001ja;
    }

    public static C4001ja g(Object obj) {
        if (obj instanceof Long) {
            return b(((Long) obj).longValue());
        }
        if (obj instanceof Boolean) {
            return b(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Integer) {
            return b(((Integer) obj).intValue());
        }
        if (obj instanceof Double) {
            return c(((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            return c(((Float) obj).floatValue());
        }
        if (obj instanceof Short) {
            return b(((Short) obj).shortValue());
        }
        if (obj instanceof Byte) {
            return b(((Byte) obj).byteValue());
        }
        if (obj instanceof M9) {
            return d((M9) obj);
        }
        if (obj instanceof String) {
            return d(M9.f((String) obj));
        }
        if (!(obj instanceof ArrayList)) {
            return a(obj);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(g(arrayList2.get(i10)));
        }
        return e(arrayList);
    }

    public static C4001ja j(C4001ja c4001ja) {
        int[] iArr = {1154349542, 1365661854, 772762753, -35647458, -1399059520, 905919471, 65677639, 1759726503, 552812661};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
        int i19 = i17 % 552812661;
        try {
            int i20 = c4001ja.f30492g;
            int i21 = (i19 ^ i18) + i20;
            if (i20 == 0) {
                throw null;
            }
            switch (i21) {
                case 0:
                    return new C4001ja();
                case 1:
                    return a(c4001ja.l());
                case 2:
                    return b(c4001ja.m());
                case 3:
                    return d(c4001ja.n());
                case 4:
                    ArrayList arrayList = new ArrayList();
                    Iterator it = c4001ja.o().iterator();
                    while (it.hasNext()) {
                        arrayList.add(j((C4001ja) it.next()));
                    }
                    return e(arrayList);
                case 5:
                    return f(c4001ja.p());
                case 6:
                    return c(c4001ja.q());
                default:
                    throw new AssertionError(K9.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
            }
        } catch (C3625ga e10) {
            throw new AssertionError(K9.a("CEiv6BFfPnitUE+D"), e10);
        }
    }

    private final void r() {
        this.f30492g = 1;
        this.f30487b = 0L;
        this.f30486a = null;
        this.f30489d = null;
        this.f30490e = null;
        this.f30491f = null;
    }

    private final void s(int i10) throws C3625ga {
        if (i10 != this.f30492g) {
            throw new C3625ga();
        }
    }

    public final Object h() throws C3625ga {
        int[] iArr = {172154289, 1050326876, 843682288, -858640882, -228026365, 881347074, 13857144, 514820752, 473891334};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
        int i19 = this.f30492g;
        int i20 = ((i17 % 473891334) ^ i18) + i19;
        if (i19 == 0) {
            throw null;
        }
        switch (i20) {
            case 0:
            case 5:
                throw new C3625ga();
            case 1:
                return l();
            case 2:
                return Long.valueOf(m());
            case 3:
                return n().a();
            case 4:
                ArrayList arrayList = new ArrayList();
                Iterator it = o().iterator();
                while (it.hasNext()) {
                    arrayList.add(((C4001ja) it.next()).h());
                }
                return arrayList;
            case 6:
                return Double.valueOf(q());
            default:
                throw new AssertionError(K9.a("HkezqgQcPni/TE/NwjgYPC5H6Q2JRdEp275wOg=="));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0252, code lost:
    
        if (r19.equals(java.lang.Object.class) != false) goto L150;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.Class r19) throws com.google.android.gms.internal.ads.C3625ga {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4001ja.i(java.lang.Class):java.lang.Object");
    }

    public final void k(OutputStream outputStream) throws IOException, C3625ga {
        long[] jArr = {1269833163, 1628598594, 308676977, 1629286434, 15633520, 3337700125L, 1402923307, 613197917, 297598514};
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        long j18 = j16 + (((((~j10) & j11) | j12) + ((j10 & j13) | j14)) - j15);
        long j19 = j17 % 297598514;
        int i10 = ((((~136416008) & 1315652152) | 568681609) + ((136416008 & 1310591536) | 838183178)) - (-1654427070);
        int i11 = 1414460396 % 78756298;
        int i12 = ((((~1202640845) & 472047875) | 1135942642) + ((1202640845 & 1006822481) | 585369424)) - 1952913860;
        int i13 = 1225708428 % 987359759;
        int i14 = this.f30492g;
        int i15 = ((((((~1959970879) & 1489831444) | 1998984087) + ((1959970879 & (-1446423480)) | (-182037905))) - (-2117037800)) ^ (1544048623 % 665228399)) + i14;
        if (i14 == 0) {
            throw null;
        }
        switch (i15) {
            case 0:
            case 1:
            case 5:
                throw new C3625ga();
            case 2:
                I9.b(m(), new C3877ia(outputStream, 1), true);
                return;
            case 3:
                byte[] bArr = n().f20778a;
                I9.b(((long) bArr.length) * (j18 ^ j19), new C3877ia(outputStream, 0), true);
                outputStream.write(bArr);
                return;
            case 4:
                List listO = o();
                I9.b(listO.size(), new C3877ia(outputStream, i12 ^ i13), true);
                Iterator it = listO.iterator();
                while (it.hasNext()) {
                    ((C4001ja) it.next()).k(outputStream);
                }
                return;
            case 6:
                double dQ = q();
                C3877ia c3877ia = new C3877ia(outputStream, i10 ^ i11);
                long jDoubleToRawLongBits = Double.doubleToRawLongBits(dQ);
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate((((((~1470558289) & 1721781326) | 2037102441) + ((1470558289 & 109139991) | 560281113)) - (-1975232131)) ^ (1043353969 % 656635246));
                byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferAllocate.putLong(jDoubleToRawLongBits);
                for (byte b10 : byteBufferAllocate.array()) {
                    c3877ia.a(b10);
                }
                int length = byteBufferAllocate.array().length;
                return;
            default:
                return;
        }
    }

    public final Object l() throws C3625ga {
        int[] iArr = {427355115, 404248040, 1318670750, 874677346, 1819730563, -970011213, 126401947, 1858504292, 235745791};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        s((iArr[7] % 235745791) ^ (i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15)));
        return this.f30486a;
    }

    public final long m() throws C3625ga {
        int[] iArr = {1646478179, 763209928, 1529626135, 609321208, 1403807536, -1382063087, 25624641, 1388803074, 733327814};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        s((iArr[7] % 733327814) ^ (i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15)));
        return this.f30487b;
    }

    public final M9 n() throws C3625ga {
        int[] iArr = {2059344234, 1917530355, 739411611, 1399403104, 95815174, 2094390031, 51245830, 1312994984, 1140384172};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        s((iArr[7] % 1140384172) ^ (i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15)));
        return this.f30489d;
    }

    public final List o() throws C3625ga {
        int[] iArr = {1435218189, 1093276829, 949583962, 1092752517, 575966040, -2054938211, 262178224, 1891252715, 1250801052};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        s((iArr[7] % 1250801052) ^ (i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15)));
        return this.f30490e;
    }

    public final InterfaceC2871aa p() throws C3625ga {
        int[] iArr = {672139932, 1821026951, 1629321417, 214090246, 828986457, -1439766056, 580508860, 1579068977, 395191309};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        s((iArr[7] % 395191309) ^ (i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15)));
        return this.f30491f;
    }

    public final double q() throws C3625ga {
        int[] iArr = {1714636915, 1758565445, 174653454, 1653642817, 38095532, -1976041400, 596516649, 1804289383, 846930886};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        s((iArr[7] % 846930886) ^ (i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15)));
        return this.f30488c;
    }
}
