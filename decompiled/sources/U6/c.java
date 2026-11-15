package U6;

import S6.h;
import X6.l;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* JADX INFO: loaded from: classes3.dex */
public class c implements ResponseHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ResponseHandler f6055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f6056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f6057c;

    public c(ResponseHandler responseHandler, l lVar, h hVar) {
        this.f6055a = responseHandler;
        this.f6056b = lVar;
        this.f6057c = hVar;
    }

    @Override // org.apache.http.client.ResponseHandler
    public Object handleResponse(HttpResponse httpResponse) {
        this.f6057c.u(this.f6056b.c());
        this.f6057c.m(httpResponse.getStatusLine().getStatusCode());
        Long lA = d.a(httpResponse);
        if (lA != null) {
            this.f6057c.s(lA.longValue());
        }
        String strB = d.b(httpResponse);
        if (strB != null) {
            this.f6057c.r(strB);
        }
        this.f6057c.b();
        return this.f6055a.handleResponse(httpResponse);
    }
}
