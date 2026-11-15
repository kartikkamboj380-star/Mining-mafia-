package androidx.work;

import android.net.Network;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private UUID f11185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f11186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set f11187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f11188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Executor f11190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private U0.b f11191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private D f11192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private w f11193i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private j f11194j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f11195k;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f11196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f11197b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Network f11198c;

        public a() {
            List list = Collections.EMPTY_LIST;
            this.f11196a = list;
            this.f11197b = list;
        }
    }

    public WorkerParameters(UUID uuid, e eVar, Collection collection, a aVar, int i10, int i11, Executor executor, U0.b bVar, D d10, w wVar, j jVar) {
        this.f11185a = uuid;
        this.f11186b = eVar;
        this.f11187c = new HashSet(collection);
        this.f11188d = aVar;
        this.f11189e = i10;
        this.f11195k = i11;
        this.f11190f = executor;
        this.f11191g = bVar;
        this.f11192h = d10;
        this.f11193i = wVar;
        this.f11194j = jVar;
    }

    public Executor a() {
        return this.f11190f;
    }

    public j b() {
        return this.f11194j;
    }

    public UUID c() {
        return this.f11185a;
    }

    public e d() {
        return this.f11186b;
    }

    public Network e() {
        return this.f11188d.f11198c;
    }

    public w f() {
        return this.f11193i;
    }

    public int g() {
        return this.f11189e;
    }

    public Set h() {
        return this.f11187c;
    }

    public U0.b i() {
        return this.f11191g;
    }

    public List j() {
        return this.f11188d.f11196a;
    }

    public List k() {
        return this.f11188d.f11197b;
    }

    public D l() {
        return this.f11192h;
    }
}
