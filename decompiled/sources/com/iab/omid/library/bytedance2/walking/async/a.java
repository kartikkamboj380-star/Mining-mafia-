package com.iab.omid.library.bytedance2.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f41847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f41848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f41849e;

    public a(b.InterfaceC0388b interfaceC0388b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0388b);
        this.f41847c = new HashSet<>(hashSet);
        this.f41848d = jSONObject;
        this.f41849e = j10;
    }
}
