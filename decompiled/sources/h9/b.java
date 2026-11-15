package h9;

import c9.l;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f44873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f44874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f44875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f44876d;

    public b(List connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.f44873a = connectionSpecs;
    }

    private final boolean c(SSLSocket sSLSocket) {
        int size = this.f44873a.size();
        for (int i10 = this.f44874b; i10 < size; i10++) {
            if (((l) this.f44873a.get(i10)).e(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public final l a(SSLSocket sslSocket) throws UnknownServiceException {
        l lVar;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i10 = this.f44874b;
        int size = this.f44873a.size();
        while (true) {
            if (i10 >= size) {
                lVar = null;
                break;
            }
            lVar = (l) this.f44873a.get(i10);
            if (lVar.e(sslSocket)) {
                this.f44874b = i10 + 1;
                break;
            }
            i10++;
        }
        if (lVar != null) {
            this.f44875c = c(sslSocket);
            lVar.c(sslSocket, this.f44876d);
            return lVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f44876d);
        sb.append(", modes=");
        sb.append(this.f44873a);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        Intrinsics.c(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    public final boolean b(IOException e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        this.f44876d = true;
        if (!this.f44875c || (e10 instanceof ProtocolException) || (e10 instanceof InterruptedIOException)) {
            return false;
        }
        return (((e10 instanceof SSLHandshakeException) && (e10.getCause() instanceof CertificateException)) || (e10 instanceof SSLPeerUnverifiedException) || !(e10 instanceof SSLException)) ? false : true;
    }
}
