package G4;

import H4.C0603h1;
import H4.C0631r0;
import H4.C0654z;
import H4.F;
import H4.I;
import H4.InterfaceC0582a1;
import H4.InterfaceC0584b0;
import H4.InterfaceC0591d1;
import H4.InterfaceC0620n0;
import H4.InterfaceC0640u0;
import H4.L;
import H4.S0;
import H4.V;
import H4.a2;
import H4.h2;
import H4.m2;
import H4.s2;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.AbstractC2553Vi;
import com.google.android.gms.internal.ads.InterfaceC1478Aq;
import com.google.android.gms.internal.ads.InterfaceC1618Di;
import com.google.android.gms.internal.ads.InterfaceC1634Dq;
import com.google.android.gms.internal.ads.InterfaceC2207Or;
import com.google.android.gms.internal.ads.InterfaceC5396uf;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L4.a f983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m2 f984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WebView f987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private I f988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AsyncTask f989g;

    public s(Context context, m2 m2Var, String str, L4.a aVar) {
        this.f985c = context;
        this.f983a = aVar;
        this.f984b = m2Var;
        this.f987e = new WebView(context);
        this.f986d = new r(context, str);
        z6(0);
        this.f987e.setVerticalScrollBarEnabled(false);
        this.f987e.getSettings().setJavaScriptEnabled(true);
        this.f987e.setWebViewClient(new o(this));
        this.f987e.setOnTouchListener(new p(this));
    }

    final String A6() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) AbstractC2553Vi.f24352d.e());
        r rVar = this.f986d;
        builder.appendQueryParameter("query", rVar.b());
        builder.appendQueryParameter("pubId", rVar.c());
        builder.appendQueryParameter("mappver", rVar.d());
        Map mapE = rVar.e();
        for (String str : mapE.keySet()) {
            builder.appendQueryParameter(str, (String) mapE.get(str));
        }
        Uri uriBuild = builder.build();
        String strB6 = B6();
        String encodedQuery = uriBuild.getEncodedQuery();
        StringBuilder sb = new StringBuilder(strB6.length() + 1 + String.valueOf(encodedQuery).length());
        sb.append(strB6);
        sb.append("#");
        sb.append(encodedQuery);
        return sb.toString();
    }

    @Override // H4.W
    public final void B3(m2 m2Var) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    final String B6() {
        String strA = this.f986d.a();
        if (true == TextUtils.isEmpty(strA)) {
            strA = "www.google.com";
        }
        String str = (String) AbstractC2553Vi.f24352d.e();
        StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 8 + String.valueOf(str).length());
        sb.append("https://");
        sb.append(strA);
        sb.append(str);
        return sb.toString();
    }

    final /* synthetic */ void C6(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.f985c.startActivity(intent);
    }

    @Override // H4.W
    public final void D4(InterfaceC5396uf interfaceC5396uf) {
        throw new IllegalStateException("Unused method");
    }

    final /* synthetic */ WebView D6() {
        return this.f987e;
    }

    final /* synthetic */ I E6() {
        return this.f988f;
    }

    @Override // H4.W
    public final void G5(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // H4.W
    public final void J4(I i10) {
        this.f988f = i10;
    }

    @Override // H4.W
    public final void O1(C0631r0 c0631r0) {
        throw new IllegalStateException("Unused method");
    }

    @Override // H4.W
    public final void O5(InterfaceC1618Di interfaceC1618Di) {
        throw new IllegalStateException("Unused method");
    }

    @Override // H4.W
    public final void P1(InterfaceC0584b0 interfaceC0584b0) {
        throw new IllegalStateException("Unused method");
    }

    @Override // H4.W
    public final long S() {
        return 0L;
    }

    @Override // H4.W
    public final void S1(C0603h1 c0603h1) {
        throw new IllegalStateException("Unused method");
    }

    @Override // H4.W
    public final void T2(s2 s2Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // H4.W
    public final void b() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    @Override // H4.W
    public final void e() {
        throw new IllegalStateException("Unused method");
    }

    @Override // H4.W
    public final void e5(F f10) {
        throw new IllegalStateException("Unused method");
    }

    @Override // H4.W
    public final String f() {
        return null;
    }

    @Override // H4.W
    public final InterfaceC0582a1 g() {
        return null;
    }

    @Override // H4.W
    public final void h3(InterfaceC0620n0 interfaceC0620n0) {
        throw new IllegalStateException("Unused method");
    }

    @Override // H4.W
    public final void j2(InterfaceC1634Dq interfaceC1634Dq, String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // H4.W
    public final String l() {
        return null;
    }

    @Override // H4.W
    public final void m5(InterfaceC1478Aq interfaceC1478Aq) {
        throw new IllegalStateException("Unused method");
    }

    @Override // H4.W
    public final void o5(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // H4.W
    public final I p() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // H4.W
    public final InterfaceC0620n0 q() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // H4.W
    public final boolean s() {
        return false;
    }

    @Override // H4.W
    public final InterfaceC0591d1 t() {
        return null;
    }

    @Override // H4.W
    public final void u1(InterfaceC2207Or interfaceC2207Or) {
        throw new IllegalStateException("Unused method");
    }

    @Override // H4.W
    public final void u6(a2 a2Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // H4.W
    public final boolean v0(h2 h2Var) {
        Preconditions.checkNotNull(this.f987e, "This Search Ad has already been torn down");
        this.f986d.f(h2Var, this.f983a);
        this.f989g = new q(this, null).execute(new Void[0]);
        return true;
    }

    @Override // H4.W
    public final boolean y() {
        return false;
    }

    final int y6(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            C0654z.a();
            return L4.g.c(this.f985c, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // H4.W
    public final void z0(boolean z9) {
        throw new IllegalStateException("Unused method");
    }

    final void z6(int i10) {
        if (this.f987e == null) {
            return;
        }
        this.f987e.setLayoutParams(new ViewGroup.LayoutParams(-1, i10));
    }

    @Override // H4.W
    public final com.google.android.gms.dynamic.a zzb() {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return com.google.android.gms.dynamic.b.N0(this.f987e);
    }

    @Override // H4.W
    public final void zzc() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.f989g.cancel(true);
        this.f987e.destroy();
        this.f987e = null;
    }

    @Override // H4.W
    public final boolean zzd() {
        return false;
    }

    @Override // H4.W
    public final void zzg() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // H4.W
    public final Bundle zzk() {
        throw new IllegalStateException("Unused method");
    }

    @Override // H4.W
    public final void zzl() {
        throw new IllegalStateException("Unused method");
    }

    @Override // H4.W
    public final m2 zzn() {
        return this.f984b;
    }

    @Override // H4.W
    public final String zzu() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // H4.W
    public final void C2(InterfaceC0640u0 interfaceC0640u0) {
    }

    @Override // H4.W
    public final void J2(boolean z9) {
    }

    @Override // H4.W
    public final void j1(long j10) {
    }

    @Override // H4.W
    public final void u3(com.google.android.gms.dynamic.a aVar) {
    }

    @Override // H4.W
    public final void u5(S0 s10) {
    }

    @Override // H4.W
    public final void r1(h2 h2Var, L l10) {
    }
}
