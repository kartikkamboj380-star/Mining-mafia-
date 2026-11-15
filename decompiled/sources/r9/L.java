package r9;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: loaded from: classes3.dex */
public abstract class L {
    public static final a0 a(File file) {
        return M.b(file);
    }

    public static final a0 b() {
        return N.a();
    }

    public static final InterfaceC7106i c(a0 a0Var) {
        return N.b(a0Var);
    }

    public static final InterfaceC7107j d(c0 c0Var) {
        return N.c(c0Var);
    }

    public static final boolean e(AssertionError assertionError) {
        return M.c(assertionError);
    }

    public static final AbstractC7112o f(AbstractC7112o abstractC7112o, T t10) {
        return O.a(abstractC7112o, t10);
    }

    public static final a0 g(File file, boolean z9) {
        return M.d(file, z9);
    }

    public static final a0 h(OutputStream outputStream) {
        return M.e(outputStream);
    }

    public static final a0 i(Socket socket) {
        return M.f(socket);
    }

    public static final c0 k(File file) {
        return M.h(file);
    }

    public static final c0 l(InputStream inputStream) {
        return M.i(inputStream);
    }

    public static final c0 m(Socket socket) {
        return M.j(socket);
    }
}
