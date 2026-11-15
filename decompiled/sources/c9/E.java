package c9;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import r9.C7105h;
import r9.InterfaceC7107j;

/* JADX INFO: loaded from: classes3.dex */
public abstract class E implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f11957a = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: c9.E$a$a, reason: collision with other inner class name */
        public static final class C0198a extends E {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f11958b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f11959c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC7107j f11960d;

            C0198a(x xVar, long j10, InterfaceC7107j interfaceC7107j) {
                this.f11958b = xVar;
                this.f11959c = j10;
                this.f11960d = interfaceC7107j;
            }

            @Override // c9.E
            public InterfaceC7107j e1() {
                return this.f11960d;
            }

            @Override // c9.E
            public long j() {
                return this.f11959c;
            }

            @Override // c9.E
            public x n() {
                return this.f11958b;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ E d(a aVar, byte[] bArr, x xVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = null;
            }
            return aVar.c(bArr, xVar);
        }

        public final E a(x xVar, long j10, InterfaceC7107j content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return b(content, xVar, j10);
        }

        public final E b(InterfaceC7107j interfaceC7107j, x xVar, long j10) {
            Intrinsics.checkNotNullParameter(interfaceC7107j, "<this>");
            return new C0198a(xVar, j10, interfaceC7107j);
        }

        public final E c(byte[] bArr, x xVar) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return b(new C7105h().write(bArr), xVar, bArr.length);
        }

        private a() {
        }
    }

    private final Charset h() {
        Charset charsetC;
        x xVarN = n();
        return (xVarN == null || (charsetC = xVarN.c(Charsets.UTF_8)) == null) ? Charsets.UTF_8 : charsetC;
    }

    public final InputStream a() {
        return e1().k1();
    }

    public final byte[] c() throws IOException {
        long j10 = j();
        if (j10 > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + j10);
        }
        InterfaceC7107j interfaceC7107jE1 = e1();
        try {
            byte[] bArrU0 = interfaceC7107jE1.u0();
            p229w8.c.a(interfaceC7107jE1, null);
            int length = bArrU0.length;
            if (j10 == -1 || j10 == length) {
                return bArrU0;
            }
            throw new IOException("Content-Length (" + j10 + ") and stream length (" + length + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p229w8.c.a(interfaceC7107jE1, th);
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d9.e.m(e1());
    }

    public abstract InterfaceC7107j e1();

    public abstract long j();

    public abstract x n();

    public final String v() {
        InterfaceC7107j interfaceC7107jE1 = e1();
        try {
            String strL0 = interfaceC7107jE1.L0(d9.e.J(interfaceC7107jE1, h()));
            p229w8.c.a(interfaceC7107jE1, null);
            return strL0;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p229w8.c.a(interfaceC7107jE1, th);
                throw th2;
            }
        }
    }
}
