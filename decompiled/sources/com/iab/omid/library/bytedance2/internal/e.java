package com.iab.omid.library.bytedance2.internal;

import android.view.View;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.weakreference.a f41775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f41776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f41777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f41778d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f41775a = new com.iab.omid.library.bytedance2.weakreference.a(view);
        this.f41776b = view.getClass().getCanonicalName();
        this.f41777c = friendlyObstructionPurpose;
        this.f41778d = str;
    }

    public String a() {
        return this.f41778d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f41777c;
    }

    public com.iab.omid.library.bytedance2.weakreference.a c() {
        return this.f41775a;
    }

    public String d() {
        return this.f41776b;
    }
}
