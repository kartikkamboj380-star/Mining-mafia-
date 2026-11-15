package d9;

import c9.C;
import c9.D;
import c9.E;
import c9.InterfaceC1217e;
import c9.r;
import c9.t;
import c9.u;
import c9.z;
import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.AbstractC7024j;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.AbstractC7033c;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import r9.C7105h;
import r9.C7108k;
import r9.InterfaceC7106i;
import r9.InterfaceC7107j;
import r9.P;
import r9.a0;
import r9.c0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f43186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f43187b = t.f12239b.i(new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E f43188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C f43189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final P f43190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final TimeZone f43191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Regex f43192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f43193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f43194i;

    static {
        byte[] bArr = new byte[0];
        f43186a = bArr;
        f43188c = E.a.d(E.f11957a, bArr, null, 1, null);
        f43189d = C.a.j(C.f11923a, bArr, null, 0, 0, 7, null);
        P.a aVar = P.f48386d;
        C7108k.a aVar2 = C7108k.f48467d;
        f43190e = aVar.d(aVar2.e("efbbbf"), aVar2.e("feff"), aVar2.e("fffe"), aVar2.e("0000ffff"), aVar2.e("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.c(timeZone);
        f43191f = timeZone;
        f43192g = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f43193h = false;
        String name = z.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OkHttpClient::class.java.name");
        f43194i = StringsKt.t0(StringsKt.s0(name, "okhttp3."), "Client");
    }

    public static /* synthetic */ int A(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return z(str, i10, i11);
    }

    public static final int B(String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char cCharAt = str.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 != i10) {
                    i12--;
                }
            }
        }
        return i10;
    }

    public static /* synthetic */ int C(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return B(str, i10, i11);
    }

    public static final int D(String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public static final String[] E(String[] strArr, String[] other, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : other) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean F(l9.a aVar, File file) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(file, "file");
        a0 a0VarF = aVar.f(file);
        try {
            try {
                aVar.h(file);
                p229w8.c.a(a0VarF, null);
                return true;
            } catch (IOException unused) {
                Unit unit = Unit.f45918a;
                p229w8.c.a(a0VarF, null);
                aVar.h(file);
                return false;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p229w8.c.a(a0VarF, th);
                throw th2;
            }
        }
    }

    public static final boolean G(Socket socket, InterfaceC7107j source) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.x0();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean H(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return StringsKt.y(name, "Authorization", true) || StringsKt.y(name, "Cookie", true) || StringsKt.y(name, "Proxy-Authorization", true) || StringsKt.y(name, "Set-Cookie", true);
    }

    public static final int I(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }

    public static final Charset J(InterfaceC7107j interfaceC7107j, Charset charset) {
        Intrinsics.checkNotNullParameter(interfaceC7107j, "<this>");
        Intrinsics.checkNotNullParameter(charset, "default");
        int iC0 = interfaceC7107j.c0(f43190e);
        if (iC0 == -1) {
            return charset;
        }
        if (iC0 == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iC0 == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            Intrinsics.checkNotNullExpressionValue(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iC0 == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            Intrinsics.checkNotNullExpressionValue(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iC0 == 3) {
            return Charsets.f46003a.a();
        }
        if (iC0 == 4) {
            return Charsets.f46003a.b();
        }
        throw new AssertionError();
    }

    public static final int K(InterfaceC7107j interfaceC7107j) {
        Intrinsics.checkNotNullParameter(interfaceC7107j, "<this>");
        return d(interfaceC7107j.readByte(), 255) | (d(interfaceC7107j.readByte(), 255) << 16) | (d(interfaceC7107j.readByte(), 255) << 8);
    }

    public static final int L(C7105h c7105h, byte b10) throws EOFException {
        Intrinsics.checkNotNullParameter(c7105h, "<this>");
        int i10 = 0;
        while (!c7105h.x0() && c7105h.V(0L) == b10) {
            i10++;
            c7105h.readByte();
        }
        return i10;
    }

    public static final boolean M(c0 c0Var, int i10, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = c0Var.i().e() ? c0Var.i().c() - jNanoTime : Long.MAX_VALUE;
        c0Var.i().d(Math.min(jC, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            C7105h c7105h = new C7105h();
            while (c0Var.s(c7105h, 8192L) != -1) {
                c7105h.h();
            }
            if (jC == Long.MAX_VALUE) {
                c0Var.i().a();
                return true;
            }
            c0Var.i().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                c0Var.i().a();
                return false;
            }
            c0Var.i().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                c0Var.i().a();
            } else {
                c0Var.i().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final ThreadFactory N(final String name, final boolean z9) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ThreadFactory() { // from class: d9.d
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return e.O(name, z9, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread O(String name, boolean z9, Runnable runnable) {
        Intrinsics.checkNotNullParameter(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z9);
        return thread;
    }

    public static final List P(t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        IntRange intRangeN = kotlin.ranges.b.n(0, tVar.size());
        ArrayList arrayList = new ArrayList(CollectionsKt.s(intRangeN, 10));
        Iterator it = intRangeN.iterator();
        while (it.hasNext()) {
            int iNextInt = ((kotlin.collections.C) it).nextInt();
            arrayList.add(new k9.c(tVar.e(iNextInt), tVar.k(iNextInt)));
        }
        return arrayList;
    }

    public static final t Q(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        t.a aVar = new t.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k9.c cVar = (k9.c) it.next();
            aVar.c(cVar.a().K(), cVar.b().K());
        }
        return aVar.e();
    }

    public static final String R(int i10) {
        String hexString = Integer.toHexString(i10);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String S(long j10) {
        String hexString = Long.toHexString(j10);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String T(u uVar, boolean z9) {
        String strH;
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        if (StringsKt.P(uVar.h(), ":", false, 2, null)) {
            strH = '[' + uVar.h() + ']';
        } else {
            strH = uVar.h();
        }
        if (!z9 && uVar.m() == u.f12242k.c(uVar.q())) {
            return strH;
        }
        return strH + ':' + uVar.m();
    }

    public static /* synthetic */ String U(u uVar, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        return T(uVar, z9);
    }

    public static final List V(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.y0(list));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final Map W(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map.isEmpty()) {
            return kotlin.collections.E.g();
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return mapUnmodifiableMap;
    }

    public static final long X(String str, long j10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final int Y(String str, int i10) {
        if (str != null) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 > 2147483647L) {
                    return Api.BaseClientBuilder.API_PRIORITY_OTHER;
                }
                if (j10 < 0) {
                    return 0;
                }
                return (int) j10;
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public static final String Z(String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iZ = z(str, i10, i11);
        String strSubstring = str.substring(iZ, B(str, iZ, i11));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String a0(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return Z(str, i10, i11);
    }

    public static final Throwable b0(Exception exc, List suppressed) {
        Intrinsics.checkNotNullParameter(exc, "<this>");
        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            p129m8.a.a(exc, (Exception) it.next());
        }
        return exc;
    }

    public static final void c(List list, Object obj) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.contains(obj)) {
            return;
        }
        list.add(obj);
    }

    public static final void c0(InterfaceC7106i interfaceC7106i, int i10) {
        Intrinsics.checkNotNullParameter(interfaceC7106i, "<this>");
        interfaceC7106i.writeByte((i10 >>> 16) & 255);
        interfaceC7106i.writeByte((i10 >>> 8) & 255);
        interfaceC7106i.writeByte(i10 & 255);
    }

    public static final int d(byte b10, int i10) {
        return b10 & i10;
    }

    public static final int e(short s10, int i10) {
        return s10 & i10;
    }

    public static final long f(int i10, long j10) {
        return ((long) i10) & j10;
    }

    public static final r.c g(final r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        return new r.c() { // from class: d9.c
            @Override // c9.r.c
            public final r a(InterfaceC1217e interfaceC1217e) {
                return e.h(rVar, interfaceC1217e);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r h(r this_asFactory, InterfaceC1217e it) {
        Intrinsics.checkNotNullParameter(this_asFactory, "$this_asFactory");
        Intrinsics.checkNotNullParameter(it, "it");
        return this_asFactory;
    }

    public static final boolean i(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return f43192g.b(str);
    }

    public static final boolean j(u uVar, u other) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.b(uVar.h(), other.h()) && uVar.m() == other.m() && Intrinsics.b(uVar.q(), other.q());
    }

    public static final int k(String name, long j10, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (j10 < 0) {
            throw new IllegalStateException((name + " < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j10);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException((name + " too large.").toString());
        }
        if (millis != 0 || j10 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((name + " too small.").toString());
    }

    public static final void l(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void m(Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void n(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!Intrinsics.b(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final String[] o(String[] strArr, String value) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[AbstractC7024j.B(strArr2)] = value;
        return strArr2;
    }

    public static final int p(String str, char c10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int q(String str, String delimiters, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i10 < i11) {
            if (StringsKt.O(delimiters, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int r(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return p(str, c10, i10, i11);
    }

    public static final boolean s(c0 c0Var, int i10, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return M(c0Var, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String t(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        H h10 = H.f45976a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        return str;
    }

    public static final boolean u(String[] strArr, String[] strArr2, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator itA = AbstractC7033c.a(strArr2);
                while (itA.hasNext()) {
                    if (comparator.compare(str, (String) itA.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long v(D d10) {
        Intrinsics.checkNotNullParameter(d10, "<this>");
        String strB = d10.S().b("Content-Length");
        if (strB != null) {
            return X(strB, -1L);
        }
        return -1L;
    }

    public static final List w(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.l(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int x(String[] strArr, String value, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], value) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int y(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Intrinsics.e(cCharAt, 31) <= 0 || Intrinsics.e(cCharAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int z(String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }
}
