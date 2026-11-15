package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1776Gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f19097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f19103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f19104h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AbstractC5931yu0 f19105i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AbstractC5931yu0 f19106j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private AbstractC5931yu0 f19107k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AbstractC5931yu0 f19108l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private AbstractC5931yu0 f19109m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f19110n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f19111o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AbstractC5931yu0 f19112p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private C3517fj f19113q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AbstractC5931yu0 f19114r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f19115s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private AbstractC5931yu0 f19116t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private HashMap f19117u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private HashSet f19118v;

    public C1776Gj() {
        this.f19097a = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f19098b = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f19099c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f19100d = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f19101e = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f19102f = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f19103g = true;
        this.f19104h = true;
        this.f19105i = AbstractC5931yu0.l();
        this.f19106j = AbstractC5931yu0.l();
        this.f19107k = AbstractC5931yu0.l();
        this.f19108l = AbstractC5931yu0.l();
        this.f19109m = AbstractC5931yu0.l();
        this.f19110n = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f19111o = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f19112p = AbstractC5931yu0.l();
        this.f19113q = C3517fj.f28461b;
        this.f19114r = AbstractC5931yu0.l();
        this.f19115s = true;
        this.f19116t = AbstractC5931yu0.l();
        this.f19117u = new HashMap();
        this.f19118v = new HashSet();
    }

    private final void x(C3771hk c3771hk) {
        this.f19097a = c3771hk.f29078a;
        this.f19098b = c3771hk.f29079b;
        this.f19099c = c3771hk.f29080c;
        this.f19100d = c3771hk.f29081d;
        this.f19101e = c3771hk.f29086i;
        this.f19102f = c3771hk.f29087j;
        this.f19103g = c3771hk.f29088k;
        this.f19104h = c3771hk.f29089l;
        this.f19106j = c3771hk.f29091n;
        this.f19105i = c3771hk.f29090m;
        this.f19107k = c3771hk.f29092o;
        this.f19108l = c3771hk.f29094q;
        this.f19109m = c3771hk.f29095r;
        this.f19110n = c3771hk.f29097t;
        this.f19111o = c3771hk.f29098u;
        this.f19112p = c3771hk.f29099v;
        this.f19113q = c3771hk.f29100w;
        this.f19114r = c3771hk.f29102y;
        this.f19115s = c3771hk.f29070B;
        this.f19116t = c3771hk.f29103z;
        this.f19118v = new HashSet(c3771hk.f29077I);
        this.f19117u = new HashMap(c3771hk.f29076H);
    }

    protected final C1776Gj a(C3771hk c3771hk) {
        x(c3771hk);
        return this;
    }

    final /* synthetic */ int b() {
        return this.f19097a;
    }

    final /* synthetic */ int c() {
        return this.f19098b;
    }

    final /* synthetic */ int d() {
        return this.f19099c;
    }

    final /* synthetic */ int e() {
        return this.f19100d;
    }

    final /* synthetic */ int f() {
        return this.f19101e;
    }

    final /* synthetic */ int g() {
        return this.f19102f;
    }

    final /* synthetic */ boolean h() {
        return this.f19103g;
    }

    final /* synthetic */ boolean i() {
        return this.f19104h;
    }

    final /* synthetic */ AbstractC5931yu0 j() {
        return this.f19105i;
    }

    final /* synthetic */ AbstractC5931yu0 k() {
        return this.f19106j;
    }

    final /* synthetic */ AbstractC5931yu0 l() {
        return this.f19107k;
    }

    final /* synthetic */ AbstractC5931yu0 m() {
        return this.f19108l;
    }

    final /* synthetic */ AbstractC5931yu0 n() {
        return this.f19109m;
    }

    final /* synthetic */ int o() {
        return this.f19110n;
    }

    final /* synthetic */ int p() {
        return this.f19111o;
    }

    final /* synthetic */ AbstractC5931yu0 q() {
        return this.f19112p;
    }

    final /* synthetic */ C3517fj r() {
        return this.f19113q;
    }

    final /* synthetic */ AbstractC5931yu0 s() {
        return this.f19114r;
    }

    final /* synthetic */ boolean t() {
        return this.f19115s;
    }

    final /* synthetic */ AbstractC5931yu0 u() {
        return this.f19116t;
    }

    final /* synthetic */ HashMap v() {
        return this.f19117u;
    }

    final /* synthetic */ HashSet w() {
        return this.f19118v;
    }

    protected C1776Gj(C3771hk c3771hk) {
        x(c3771hk);
    }
}
