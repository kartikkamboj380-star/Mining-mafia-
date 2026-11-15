package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface WM {
    void a();

    void b(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener);

    boolean c();

    void c0(Bundle bundle);

    void d(View view, Map map);

    void d0(String str);

    void e(View view);

    void f(InterfaceC2245Pk interfaceC2245Pk);

    void g();

    JSONObject h(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void i(H4.I0 i10);

    void j(View view, View view2, Map map, Map map2, boolean z9, ImageView.ScaleType scaleType, int i10);

    void k(Bundle bundle);

    boolean l(Bundle bundle);

    void m(View view, MotionEvent motionEvent, View view2);

    void n(H4.F0 f10);

    JSONObject o(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void p(View view, View view2, Map map, Map map2, boolean z9, ImageView.ScaleType scaleType);

    boolean q();

    void r(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void s();

    void t(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void u();

    void zzg();

    void zzn();

    int zzu();
}
