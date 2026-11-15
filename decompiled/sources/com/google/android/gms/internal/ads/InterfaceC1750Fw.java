package com.google.android.gms.internal.ads;

import H4.InterfaceC0580a;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.util.Predicate;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1750Fw extends InterfaceC0580a, InterfaceC4599oK, InterfaceC5682ww, InterfaceC3274dn, InterfaceC4551nx, InterfaceC5180sx, InterfaceC4783pn, InterfaceC5520ve, InterfaceC6062zx, G4.n, InterfaceC1596Cx, InterfaceC1648Dx, InterfaceC2265Pu, InterfaceC1700Ex {
    WebView A();

    @Override // com.google.android.gms.internal.ads.InterfaceC1700Ex
    View B();

    Context C();

    void C0(J4.z zVar);

    void D();

    @Override // com.google.android.gms.internal.ads.InterfaceC1544Bx
    C2479Tx E();

    void E0(boolean z9);

    void F();

    boolean G();

    boolean H();

    void I();

    J4.z J();

    boolean J0(boolean z9, int i10);

    void K0(String str, Predicate predicate);

    InterfaceC1856Hx L();

    @Override // com.google.android.gms.internal.ads.InterfaceC4551nx
    C3880ib0 M();

    void M0(boolean z9);

    void O();

    void O0(boolean z9);

    void Q();

    C3369eY R();

    void R0(int i10);

    C3747hY S();

    void S0(C2479Tx c2479Tx);

    void T();

    void T0(C3747hY c3747hY);

    J4.z U();

    void V();

    void V0(boolean z9);

    C1605Db0 W();

    boolean X();

    InterfaceC2087Mj Y();

    void Y0(String str, String str2, String str3);

    WebViewClient Z();

    @Override // com.google.android.gms.internal.ads.InterfaceC2265Pu
    C5528vi a();

    String a0();

    boolean b0();

    @Override // com.google.android.gms.internal.ads.InterfaceC2265Pu
    BinderC4425mx c();

    void c0(String str, InterfaceC2091Ml interfaceC2091Ml);

    boolean canGoBack();

    @Override // com.google.android.gms.internal.ads.InterfaceC5180sx, com.google.android.gms.internal.ads.InterfaceC2265Pu
    Activity d();

    boolean d1();

    void destroy();

    @Override // com.google.android.gms.internal.ads.InterfaceC1648Dx, com.google.android.gms.internal.ads.InterfaceC2265Pu
    L4.a f();

    void f0(InterfaceC2087Mj interfaceC2087Mj);

    void f1(J4.z zVar);

    @Override // com.google.android.gms.internal.ads.InterfaceC5180sx, com.google.android.gms.internal.ads.InterfaceC2265Pu
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    InterfaceC4137kf h0();

    void h1(String str, InterfaceC2091Ml interfaceC2091Ml);

    void i1(boolean z9);

    boolean isAttachedToWindow();

    com.google.common.util.concurrent.p j0();

    void k0(C3502fb0 c3502fb0, C3880ib0 c3880ib0);

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void m0(Context context);

    void measure(int i10, int i11);

    @Override // com.google.android.gms.internal.ads.InterfaceC1596Cx
    C5138sc n();

    void o0(C3369eY c3369eY);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.InterfaceC2265Pu
    void q(BinderC4425mx binderC4425mx);

    void q0(boolean z9);

    boolean r();

    @Override // com.google.android.gms.internal.ads.InterfaceC2265Pu
    void s(String str, AbstractC1956Jv abstractC1956Jv);

    @Override // com.google.android.gms.internal.ads.InterfaceC2265Pu
    void setBackgroundColor(int i10);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    List t();

    void u0(InterfaceC1932Jj interfaceC1932Jj);

    void x();

    void x0(InterfaceC4137kf interfaceC4137kf);

    void y0(boolean z9);

    @Override // com.google.android.gms.internal.ads.InterfaceC5682ww
    C3502fb0 z();

    void z0(int i10);

    @Override // com.google.android.gms.internal.ads.InterfaceC2265Pu
    G4.a zzk();
}
