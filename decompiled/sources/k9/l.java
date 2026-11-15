package k9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import r9.InterfaceC7107j;

/* JADX INFO: loaded from: classes3.dex */
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f45909a = a.f45911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f45910b = new a.C0462a();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f45911a = new a();

        /* JADX INFO: renamed from: k9.l$a$a, reason: collision with other inner class name */
        private static final class C0462a implements l {
            @Override // k9.l
            public boolean a(int i10, InterfaceC7107j source, int i11, boolean z9) {
                Intrinsics.checkNotNullParameter(source, "source");
                source.skip(i11);
                return true;
            }

            @Override // k9.l
            public boolean b(int i10, List requestHeaders) {
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // k9.l
            public boolean c(int i10, List responseHeaders, boolean z9) {
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // k9.l
            public void d(int i10, b errorCode) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            }
        }

        private a() {
        }
    }

    boolean a(int i10, InterfaceC7107j interfaceC7107j, int i11, boolean z9);

    boolean b(int i10, List list);

    boolean c(int i10, List list, boolean z9);

    void d(int i10, b bVar);
}
