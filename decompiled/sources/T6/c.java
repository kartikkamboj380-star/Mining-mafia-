package T6;

import X6.m;
import Y6.h;
import android.content.Context;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.URI;

/* JADX INFO: loaded from: classes3.dex */
final class c extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final R6.a f5781d = R6.a.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f5782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f5783c;

    c(h hVar, Context context) {
        this.f5783c = context;
        this.f5782b = hVar;
    }

    private URI g(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e10) {
            f5781d.k("getResultUrl throws exception %s", e10.getMessage());
            return null;
        }
    }

    private boolean h(URI uri, Context context) {
        if (uri == null) {
            return false;
        }
        return m.a(uri, context);
    }

    private boolean i(String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }

    private boolean j(String str) {
        return i(str);
    }

    private boolean k(String str) {
        return (str == null || i(str) || str.length() > 255) ? false : true;
    }

    private boolean m(int i10) {
        return i10 > 0;
    }

    private boolean n(long j10) {
        return j10 >= 0;
    }

    private boolean o(int i10) {
        return i10 == -1 || i10 > 0;
    }

    private boolean p(String str) {
        if (str == null) {
            return false;
        }
        return "http".equalsIgnoreCase(str) || HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(str);
    }

    private boolean q(long j10) {
        return j10 >= 0;
    }

    private boolean r(String str) {
        return str == null;
    }

    @Override // T6.e
    public boolean c() {
        if (j(this.f5782b.getUrl())) {
            f5781d.j("URL is missing:" + this.f5782b.getUrl());
            return false;
        }
        URI uriG = g(this.f5782b.getUrl());
        if (uriG == null) {
            f5781d.j("URL cannot be parsed");
            return false;
        }
        if (!h(uriG, this.f5783c)) {
            f5781d.j("URL fails allowlist rule: " + uriG);
            return false;
        }
        if (!k(uriG.getHost())) {
            f5781d.j("URL host is null or invalid");
            return false;
        }
        if (!p(uriG.getScheme())) {
            f5781d.j("URL scheme is null or invalid");
            return false;
        }
        if (!r(uriG.getUserInfo())) {
            f5781d.j("URL user info is null");
            return false;
        }
        if (!o(uriG.getPort())) {
            f5781d.j("URL port is less than or equal to 0");
            return false;
        }
        if (!l(this.f5782b.L() ? this.f5782b.A() : null)) {
            f5781d.j("HTTP Method is null or invalid: " + this.f5782b.A());
            return false;
        }
        if (this.f5782b.M() && !m(this.f5782b.B())) {
            f5781d.j("HTTP ResponseCode is a negative value:" + this.f5782b.B());
            return false;
        }
        if (this.f5782b.N() && !n(this.f5782b.E())) {
            f5781d.j("Request Payload is a negative value:" + this.f5782b.E());
            return false;
        }
        if (this.f5782b.O() && !n(this.f5782b.G())) {
            f5781d.j("Response Payload is a negative value:" + this.f5782b.G());
            return false;
        }
        if (!this.f5782b.K() || this.f5782b.y() <= 0) {
            f5781d.j("Start time of the request is null, or zero, or a negative value:" + this.f5782b.y());
            return false;
        }
        if (this.f5782b.P() && !q(this.f5782b.H())) {
            f5781d.j("Time to complete the request is a negative value:" + this.f5782b.H());
            return false;
        }
        if (this.f5782b.R() && !q(this.f5782b.J())) {
            f5781d.j("Time from the start of the request to the start of the response is null or a negative value:" + this.f5782b.J());
            return false;
        }
        if (this.f5782b.Q() && this.f5782b.I() > 0) {
            if (this.f5782b.M()) {
                return true;
            }
            f5781d.j("Did not receive a HTTP Response Code");
            return false;
        }
        f5781d.j("Time from the start of the request to the end of the response is null, negative or zero:" + this.f5782b.I());
        return false;
    }

    boolean l(h.d dVar) {
        return (dVar == null || dVar == h.d.HTTP_METHOD_UNKNOWN) ? false : true;
    }
}
