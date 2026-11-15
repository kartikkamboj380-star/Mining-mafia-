package N4;

import android.os.Bundle;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f3637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f3638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private E4.d f3639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f3640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f3641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Double f3642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f3643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f3644i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private B4.w f3645j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f3646k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f3647l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f3648m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Object f3649n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Bundle f3650o = new Bundle();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f3651p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f3652q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f3653r;

    public final void A(E4.d dVar) {
        this.f3639d = dVar;
    }

    public final void B(List list) {
        this.f3637b = list;
    }

    public void C(float f10) {
        this.f3653r = f10;
    }

    public void D(View view) {
        this.f3648m = view;
    }

    public final void E(boolean z9) {
        this.f3652q = z9;
    }

    public final void F(boolean z9) {
        this.f3651p = z9;
    }

    public final void G(String str) {
        this.f3644i = str;
    }

    public final void H(Double d10) {
        this.f3642g = d10;
    }

    public final void I(String str) {
        this.f3643h = str;
    }

    public final void L(B4.w wVar) {
        this.f3645j = wVar;
    }

    public final void M(Object obj) {
        this.f3649n = obj;
    }

    public final B4.w N() {
        return this.f3645j;
    }

    public final View O() {
        return this.f3648m;
    }

    public final Object P() {
        return this.f3649n;
    }

    public View b() {
        return this.f3647l;
    }

    public final String c() {
        return this.f3641f;
    }

    public final String d() {
        return this.f3638c;
    }

    public final String e() {
        return this.f3640e;
    }

    public float f() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float g() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final Bundle h() {
        return this.f3650o;
    }

    public final String i() {
        return this.f3636a;
    }

    public final E4.d j() {
        return this.f3639d;
    }

    public final List k() {
        return this.f3637b;
    }

    public float l() {
        return this.f3653r;
    }

    public final boolean m() {
        return this.f3652q;
    }

    public final boolean n() {
        return this.f3651p;
    }

    public final String o() {
        return this.f3644i;
    }

    public final Double p() {
        return this.f3642g;
    }

    public final String q() {
        return this.f3643h;
    }

    public boolean s() {
        return this.f3646k;
    }

    public void u(View view) {
        this.f3647l = view;
    }

    public final void v(String str) {
        this.f3641f = str;
    }

    public final void w(String str) {
        this.f3638c = str;
    }

    public final void x(String str) {
        this.f3640e = str;
    }

    public void y(boolean z9) {
        this.f3646k = z9;
    }

    public final void z(String str) {
        this.f3636a = str;
    }

    public void a() {
    }

    public void t() {
    }

    public void K(View view) {
    }

    public void r(View view) {
    }

    public void J(View view, Map map, Map map2) {
    }
}
