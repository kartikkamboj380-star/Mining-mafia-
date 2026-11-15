package Q6;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p007a6.f f5060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H6.e f5061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G6.b f5062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final G6.b f5063d;

    public a(p007a6.f fVar, H6.e eVar, G6.b bVar, G6.b bVar2) {
        this.f5060a = fVar;
        this.f5061b = eVar;
        this.f5062c = bVar;
        this.f5063d = bVar2;
    }

    com.google.firebase.perf.config.a a() {
        return com.google.firebase.perf.config.a.g();
    }

    p007a6.f b() {
        return this.f5060a;
    }

    H6.e c() {
        return this.f5061b;
    }

    G6.b d() {
        return this.f5062c;
    }

    RemoteConfigManager e() {
        return RemoteConfigManager.getInstance();
    }

    SessionManager f() {
        return SessionManager.getInstance();
    }

    G6.b g() {
        return this.f5063d;
    }
}
