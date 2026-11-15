package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5280tk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5154sk f33469a;

    public C5280tk(InterfaceC5154sk interfaceC5154sk) {
        Context context;
        this.f33469a = interfaceC5154sk;
        try {
            context = (Context) com.google.android.gms.dynamic.b.h0(interfaceC5154sk.e());
        } catch (RemoteException | NullPointerException e10) {
            L4.p.d("", e10);
            context = null;
        }
        if (context != null) {
            try {
                this.f33469a.R(com.google.android.gms.dynamic.b.N0(new E4.b(context)));
            } catch (RemoteException e11) {
                L4.p.d("", e11);
            }
        }
    }

    public final InterfaceC5154sk a() {
        return this.f33469a;
    }

    public final String b() {
        try {
            return this.f33469a.c();
        } catch (RemoteException e10) {
            L4.p.d("", e10);
            return null;
        }
    }
}
