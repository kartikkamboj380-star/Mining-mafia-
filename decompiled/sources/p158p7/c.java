package p158p7;

import org.json.JSONObject;
import p208u7.g;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f47907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f47908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f47909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f47910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h f47911e;

    private c(f fVar, h hVar, j jVar, j jVar2, boolean z9) {
        this.f47910d = fVar;
        this.f47911e = hVar;
        this.f47907a = jVar;
        if (jVar2 == null) {
            this.f47908b = j.NONE;
        } else {
            this.f47908b = jVar2;
        }
        this.f47909c = z9;
    }

    public static c a(f fVar, h hVar, j jVar, j jVar2, boolean z9) {
        g.b(fVar, "CreativeType is null");
        g.b(hVar, "ImpressionType is null");
        g.b(jVar, "Impression owner is null");
        g.e(jVar, fVar, hVar);
        return new c(fVar, hVar, jVar, jVar2, z9);
    }

    public boolean b() {
        return j.NATIVE == this.f47907a;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        p208u7.c.g(jSONObject, "impressionOwner", this.f47907a);
        p208u7.c.g(jSONObject, "mediaEventsOwner", this.f47908b);
        p208u7.c.g(jSONObject, "creativeType", this.f47910d);
        p208u7.c.g(jSONObject, "impressionType", this.f47911e);
        p208u7.c.g(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f47909c));
        return jSONObject;
    }
}
