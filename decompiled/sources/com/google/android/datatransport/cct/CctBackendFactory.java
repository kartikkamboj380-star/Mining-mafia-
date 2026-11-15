package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import p155p4.h;
import p155p4.m;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class CctBackendFactory implements p155p4.d {
    @Override // p155p4.d
    public m create(h hVar) {
        return new d(hVar.b(), hVar.e(), hVar.d());
    }
}
