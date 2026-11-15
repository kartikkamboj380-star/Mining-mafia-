package com.facebook.react.views.text;

import com.facebook.react.uimanager.C1383t0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends C1383t0 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f16207y;

    @Override // com.facebook.react.uimanager.C1383t0, com.facebook.react.uimanager.InterfaceC1381s0
    public boolean P() {
        return true;
    }

    @O3.a(name = "text")
    public final void setText(@Nullable String str) {
        this.f16207y = str;
        w0();
    }

    public final String t1() {
        return this.f16207y;
    }

    @Override // com.facebook.react.uimanager.C1383t0
    public String toString() {
        return w() + " [text: " + this.f16207y + "]";
    }
}
