package r9;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class b0 extends C7103f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Socket f48426o;

    public b0(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f48426o = socket;
    }

    @Override // r9.C7103f
    protected void B() {
        try {
            this.f48426o.close();
        } catch (AssertionError e10) {
            if (!L.e(e10)) {
                throw e10;
            }
            M.f48385a.log(Level.WARNING, "Failed to close timed out socket " + this.f48426o, (Throwable) e10);
        } catch (Exception e11) {
            M.f48385a.log(Level.WARNING, "Failed to close timed out socket " + this.f48426o, (Throwable) e11);
        }
    }

    @Override // r9.C7103f
    protected IOException x(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
