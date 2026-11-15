package c9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: c9.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1214b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f11983a = a.f11986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC1214b f11984b = new a.C0199a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InterfaceC1214b f11985c = new e9.a(null, 1, null);

    /* JADX INFO: renamed from: c9.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f11986a = new a();

        /* JADX INFO: renamed from: c9.b$a$a, reason: collision with other inner class name */
        private static final class C0199a implements InterfaceC1214b {
            @Override // c9.InterfaceC1214b
            public B a(F f10, D response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return null;
            }
        }

        private a() {
        }
    }

    B a(F f10, D d10);
}
