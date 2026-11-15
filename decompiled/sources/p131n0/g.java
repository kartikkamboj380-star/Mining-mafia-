package p131n0;

import F8.c;
import androidx.lifecycle.InterfaceC1162h;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f46537a = new g();

    public static final class a implements m0.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f46538a = new a();

        private a() {
        }
    }

    private g() {
    }

    public final p121m0.a a(W owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return owner instanceof InterfaceC1162h ? ((InterfaceC1162h) owner).getDefaultViewModelCreationExtras() : p121m0.a.C0470a.f46340b;
    }

    public final String b(c modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String strA = h.a(modelClass);
        if (strA == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + strA;
    }

    public final T c() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
