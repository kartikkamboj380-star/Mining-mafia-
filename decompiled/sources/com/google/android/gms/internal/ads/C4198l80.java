package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4198l80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5420ur f31206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f31207b;

    public C4198l80(C5420ur c5420ur, int i10) {
        this.f31206a = c5420ur;
        this.f31207b = i10;
    }

    public final String a() {
        return this.f31206a.f33911d;
    }

    public final String b() {
        return AbstractC4040jt0.a(this.f31206a.f33908a.getString("ms"));
    }

    public final PackageInfo c() {
        return this.f31206a.f33913f;
    }

    public final List d() {
        return this.f31206a.f33912e;
    }

    public final String e() {
        return this.f31206a.f33915h;
    }

    public final int f() {
        return this.f31207b;
    }

    final boolean g() {
        return this.f31206a.f33918k;
    }

    final boolean h() {
        return this.f31206a.f33919l;
    }

    final int i() {
        Bundle bundle = this.f31206a.f33908a.getBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS);
        if (bundle != null && !bundle.isEmpty()) {
            switch (bundle.getString("query_info_type", "")) {
                case "requester_type_0":
                    return 0;
                case "requester_type_1":
                    return 1;
                case "requester_type_2":
                    return 2;
                case "requester_type_3":
                    return 3;
                case "requester_type_4":
                    return 4;
                case "requester_type_5":
                    return 5;
                case "requester_type_6":
                    return 6;
                case "requester_type_7":
                    return 7;
                case "requester_type_8":
                    return 8;
            }
        }
        return -1;
    }

    final int j() {
        return this.f31206a.f33922w;
    }
}
