package com.google.android.material.datepicker;

import androidx.fragment.app.ComponentCallbacksC1144o;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
abstract class q extends ComponentCallbacksC1144o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final LinkedHashSet f39176a = new LinkedHashSet();

    q() {
    }

    boolean t(p pVar) {
        return this.f39176a.add(pVar);
    }

    void u() {
        this.f39176a.clear();
    }
}
