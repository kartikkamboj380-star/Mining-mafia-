package r9;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: r9.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7099b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C7099b f48425a = new C7099b();

    private C7099b() {
    }

    public final InterfaceC7106i a(a0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return L.c(sink);
    }

    public final InterfaceC7107j b(c0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return L.d(source);
    }

    public final a0 c(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return M.g(file, false, 1, null);
    }

    public final a0 d(OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        return L.h(outputStream);
    }

    public final c0 e(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        return L.l(inputStream);
    }
}
