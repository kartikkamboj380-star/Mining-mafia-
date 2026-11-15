package p048e7;

import G6.b;
import android.util.Log;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import p125m4.c;
import p125m4.d;
import p125m4.h;
import p125m4.j;

/* JADX INFO: renamed from: e7.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6961g implements InterfaceC6962h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f43481b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f43482a;

    /* JADX INFO: renamed from: e7.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C6961g(b transportFactoryProvider) {
        Intrinsics.checkNotNullParameter(transportFactoryProvider, "transportFactoryProvider");
        this.f43482a = transportFactoryProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] c(K k10) {
        String strB = L.f43324a.c().b(k10);
        Intrinsics.checkNotNullExpressionValue(strB, "encode(...)");
        Log.d("FirebaseSessions", "Session Event Type: " + k10.b().name());
        byte[] bytes = strB.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    @Override // p048e7.InterfaceC6962h
    public void a(K sessionEvent) {
        Intrinsics.checkNotNullParameter(sessionEvent, "sessionEvent");
        ((j) this.f43482a.get()).a("FIREBASE_APPQUALITY_SESSION", K.class, c.b("json"), new h() { // from class: e7.f
            @Override // p125m4.h
            public final Object apply(Object obj) {
                return this.f43480a.c((K) obj);
            }
        }).b(d.f(sessionEvent));
    }
}
