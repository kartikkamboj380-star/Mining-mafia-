package p253z2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f50967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f50968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f50969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f50970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Long f50971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f50972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f50973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String[] f50974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f50975i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f50976j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f50977k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f50978l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Long f50979m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f50980n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f50981o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f50982p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Integer f50983q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Integer f50984r;

    public h(k infra) {
        Intrinsics.checkNotNullParameter(infra, "infra");
        this.f50967a = infra;
        this.f50968b = new ArrayList();
    }

    public final String a() {
        return this.f50972f;
    }

    public final String b() {
        return this.f50976j;
    }

    public final String[] c() {
        return this.f50974h;
    }

    public final String d() {
        return this.f50975i;
    }

    public final Integer e() {
        return this.f50984r;
    }

    public final Long f() {
        return this.f50970d;
    }

    public final Integer g() {
        return this.f50983q;
    }

    public final String h() {
        return this.f50981o;
    }

    public final String i() {
        return this.f50982p;
    }

    public final k j() {
        return this.f50967a;
    }

    public final List k() {
        return this.f50968b;
    }

    public final Long l() {
        return this.f50979m;
    }

    public final boolean m() {
        return this.f50969c;
    }

    public final Long n() {
        return this.f50971e;
    }

    public final String o() {
        return this.f50973g;
    }

    public final String p() {
        return this.f50980n;
    }

    public final String q() {
        return this.f50978l;
    }

    public final String r() {
        return this.f50977k;
    }

    public final void s() {
        this.f50968b.clear();
        this.f50969c = false;
        this.f50970d = null;
        this.f50971e = null;
        this.f50972f = null;
        this.f50973g = null;
        this.f50974h = null;
        this.f50975i = null;
        this.f50976j = null;
        this.f50977k = null;
        this.f50978l = null;
        this.f50979m = null;
        this.f50980n = null;
        this.f50981o = null;
        this.f50982p = null;
        this.f50983q = null;
        this.f50984r = null;
    }

    public final void t(Long l10) {
        this.f50970d = l10;
    }

    public final void u(boolean z9) {
        this.f50969c = z9;
    }

    public final void v(Long l10) {
        this.f50971e = l10;
    }
}
