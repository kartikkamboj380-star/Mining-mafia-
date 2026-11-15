package n9;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public class h implements m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f47077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final l.a f47078g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f47079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f47080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f47081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Method f47082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Method f47083e;

    public static final class a {

        /* JADX INFO: renamed from: n9.h$a$a, reason: collision with other inner class name */
        public static final class C0485a implements l.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f47084a;

            C0485a(String str) {
                this.f47084a = str;
            }

            @Override // n9.l.a
            public boolean a(SSLSocket sslSocket) {
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "sslSocket.javaClass.name");
                return StringsKt.J(name, this.f47084a + '.', false, 2, null);
            }

            @Override // n9.l.a
            public m b(SSLSocket sslSocket) {
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                return h.f47077f.b(sslSocket.getClass());
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final h b(Class cls) {
            Class superclass = cls;
            while (superclass != null && !Intrinsics.b(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            Intrinsics.c(superclass);
            return new h(superclass);
        }

        public final l.a c(String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            return new C0485a(packageName);
        }

        public final l.a d() {
            return h.f47078g;
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        f47077f = aVar;
        f47078g = aVar.c("com.google.android.gms.org.conscrypt");
    }

    public h(Class sslSocketClass) throws NoSuchMethodException {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.f47079a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f47080b = declaredMethod;
        this.f47081c = sslSocketClass.getMethod("setHostname", String.class);
        this.f47082d = sslSocketClass.getMethod("getAlpnSelectedProtocol", null);
        this.f47083e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // n9.m
    public boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f47079a.isInstance(sslSocket);
    }

    @Override // n9.m
    public String b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!a(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f47082d.invoke(sslSocket, null);
            if (bArr != null) {
                return new String(bArr, Charsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && Intrinsics.b(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    @Override // n9.m
    public void c(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            try {
                this.f47080b.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f47081c.invoke(sslSocket, str);
                }
                this.f47083e.invoke(sslSocket, m9.j.f46495a.c(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    @Override // n9.m
    public boolean isSupported() {
        return m9.b.f46468f.b();
    }
}
