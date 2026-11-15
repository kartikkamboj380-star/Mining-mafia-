package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p070h.w;

/* JADX INFO: loaded from: classes2.dex */
public final class l<S> extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.material.datepicker.a f39154c;

    class a extends p {
        a() {
        }
    }

    static l v(d dVar, int i10, com.google.android.material.datepicker.a aVar) {
        l lVar = new l();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        lVar.setArguments(bundle);
        return lVar;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1144o
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f39153b = bundle.getInt("THEME_RES_ID_KEY");
        w.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f39154c = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1144o
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f39153b));
        new a();
        throw null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1144o
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f39153b);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f39154c);
    }
}
