package r9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f48385a = Logger.getLogger("okio.Okio");

    public static final a0 b(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return L.h(new FileOutputStream(file, true));
    }

    public static final boolean c(AssertionError assertionError) {
        Intrinsics.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? StringsKt.P(message, "getsockname failed", false, 2, null) : false) {
                return true;
            }
        }
        return false;
    }

    public static final a0 d(File file, boolean z9) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return L.h(new FileOutputStream(file, z9));
    }

    public static final a0 e(OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return new Q(outputStream, new d0());
    }

    public static final a0 f(Socket socket) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        b0 b0Var = new b0(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream(...)");
        return b0Var.z(new Q(outputStream, b0Var));
    }

    public static /* synthetic */ a0 g(File file, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        return L.g(file, z9);
    }

    public static final c0 h(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new C7118v(new FileInputStream(file), d0.f48431e);
    }

    public static final c0 i(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new C7118v(inputStream, new d0());
    }

    public static final c0 j(Socket socket) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        b0 b0Var = new b0(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        return b0Var.A(new C7118v(inputStream, b0Var));
    }
}
