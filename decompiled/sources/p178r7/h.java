package p178r7;

import android.content.Context;
import android.os.Handler;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import p158p7.l;
import p168q7.b;
import p168q7.c;
import p168q7.d;
import p168q7.e;
import p218v7.a;

/* JADX INFO: loaded from: classes3.dex */
public class h implements d.a, c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static h f48368f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f48369a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f48370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f48371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f48372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f48373e;

    public h(e eVar, b bVar) {
        this.f48370b = eVar;
        this.f48371c = bVar;
    }

    private c a() {
        if (this.f48373e == null) {
            this.f48373e = c.e();
        }
        return this.f48373e;
    }

    public static h d() {
        if (f48368f == null) {
            f48368f = new h(new e(), new b());
        }
        return f48368f;
    }

    public void b(Context context) {
        this.f48372d = this.f48370b.a(new Handler(), context, this.f48371c.a(), this);
    }

    public float c() {
        return this.f48369a;
    }

    public void e() {
        b.k().b(this);
        b.k().i();
        a.p().q();
        this.f48372d.d();
    }

    public void f() {
        a.p().s();
        b.k().j();
        this.f48372d.e();
    }

    @Override // p168q7.c
    public void a(float f10) {
        this.f48369a = f10;
        Iterator it = a().a().iterator();
        while (it.hasNext()) {
            ((l) it.next()).p().b(f10);
        }
    }

    @Override // r7.d.a
    public void a(boolean z9) {
        if (z9) {
            a.p().q();
        } else {
            a.p().o();
        }
    }
}
